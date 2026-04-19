import tkinter as tk
from tkinter import ttk, messagebox
import random
import math
import importlib
import os
import sys

# generated code
import generated_flight_map
MAP_DATA = generated_flight_map.MAP_DATA

# ── Component lifespan thresholds ──────────────────────────────────────
COMPONENT_LIFESPAN_CAPACITY = {
    'engine':   50000.0,
    'fuselage': 30000.0,
    'gear':      5000.0,
}

HEALTH_WARNING  = 30.0
HEALTH_CRITICAL = 10.0

# ── Colour palette ─────────────────────────────────────────────────────
BG_DARK        = "#0d1017"
BG_PANEL       = "#161b26"
BG_CARD        = "#1e2433"
ACCENT_BLUE    = "#5baaef"
ACCENT_GREEN   = "#5ee6a0"
ACCENT_YELLOW  = "#ffd260"
ACCENT_RED     = "#ff6b6b"
ACCENT_CYAN    = "#56d4e0"
TEXT_PRIMARY    = "#e8eaed"
TEXT_SECONDARY  = "#8892a8"
TEXT_DIM        = "#4e5672"
BORDER_COLOR   = "#283044"
GROUNDED_COLOR = "#6b7280"
BTN_FG         = "#0d1017"

SEGMENT_COLORS = ["#4ea8de", "#f25c54", "#66d9a0", "#f4d35e", "#c084fc",
                   "#f4845f", "#5eead4", "#fca5a5", "#a78bfa", "#86efac",
                   "#fdba74", "#93c5fd"]

AIRPORT_RECT_FILL = "#b0b0b0"
WAYPOINT_FILL     = "#808080"

# Node shape sizes (world units)
AP_HW = 40   # airport half-width
AP_HH = 36   # airport half-height
WP_R  = 28   # waypoint radius

# ── Plane model ───────────────────────────────────────────────────────
class Plane:
    def __init__(self, plane_id, route_data, deploy_time=0, airport_indices=None):
        self.plane_id = plane_id
        self.route_data = route_data
        self.deploy_time = deploy_time
        self.airport_indices = airport_indices or {0, len(route_data["segments"])}
        self.total_distance = sum(seg["distance"] for seg in route_data["segments"])
        self.speed = random.uniform(self.total_distance / 800, self.total_distance / 500)
        self.route_wear = {
            'engine':   sum(s["wearEngine"]     for s in route_data["segments"]),
            'fuselage': sum(s["wearFuselage"]    for s in route_data["segments"]),
            'gear':     sum(s["wearLandingGear"] for s in route_data["segments"]),
        }
        self._grounding_time = None
        self._grounding_node = None
        self._precompute_grounding()
        self.maintenance_count = 0

    def _precompute_grounding(self):
        segments = self.route_data["segments"]
        num_nodes = len(segments) + 1
        w_eng = w_fus = w_gr = dist_so_far = 0.0
        lap = 0
        while lap < 500:
            direction = 1 if lap % 2 == 0 else -1
            ordered = list(range(len(segments))) if direction == 1 else list(reversed(range(len(segments))))
            for pos, seg_i in enumerate(ordered):
                seg = segments[seg_i]
                seg_dist = max(1.0, seg["distance"])
                new_eng = w_eng + seg["wearEngine"]
                new_fus = w_fus + seg["wearFuselage"]
                new_gr  = w_gr  + seg["wearLandingGear"]
                fails = (new_eng >= COMPONENT_LIFESPAN_CAPACITY['engine'] or
                         new_fus >= COMPONENT_LIFESPAN_CAPACITY['fuselage'] or
                         new_gr  >= COMPONENT_LIFESPAN_CAPACITY['gear'])
                if fails:
                    fracs = []
                    for wn, wa, cap in [
                        (w_eng, seg["wearEngine"],     COMPONENT_LIFESPAN_CAPACITY['engine']),
                        (w_fus, seg["wearFuselage"],    COMPONENT_LIFESPAN_CAPACITY['fuselage']),
                        (w_gr,  seg["wearLandingGear"], COMPONENT_LIFESPAN_CAPACITY['gear']),
                    ]:
                        if wa > 0 and wn < cap:
                            f = (cap - wn) / wa
                            if 0 <= f <= 1: fracs.append(f)
                    ff = min(fracs) if fracs else 0.0
                    fd = dist_so_far + seg_dist * ff
                    wd = seg_dist * (1.0 - ff)
                    target = (seg_i + 1) if direction == 1 else seg_i
                    if target in self.airport_indices:
                        self._grounding_time = (fd + wd) / self.speed + self.deploy_time
                        self._grounding_node = target; return
                    for nsi in ordered[pos + 1:]:
                        wd += max(1.0, segments[nsi]["distance"])
                        nt = (nsi + 1) if direction == 1 else nsi
                        if nt in self.airport_indices:
                            self._grounding_time = (fd + wd) / self.speed + self.deploy_time
                            self._grounding_node = nt; return
                    ep = num_nodes - 1 if direction == 1 else 0
                    self._grounding_time = (fd + wd) / self.speed + self.deploy_time
                    self._grounding_node = ep; return
                w_eng, w_fus, w_gr = new_eng, new_fus, new_gr
                dist_so_far += seg_dist
            lap += 1

    def get_state_at_time(self, t):
        if self._grounding_time is not None and t >= self._grounding_time:
            we, wf, wg = self._wear_at(self._grounding_time)
            return (0, 0.0, we, wf, wg, False, True, self._grounding_node)
        eff = max(0, t - self.deploy_time)
        d = eff * self.speed
        laps = int(d // self.total_distance)
        dil = d % self.total_distance
        dr = 1 if laps % 2 == 0 else -1
        we, wf, wg = self._wear_at(t)
        segs = self.route_data["segments"]
        ordered = segs if dr == 1 else list(reversed(segs))
        si = 0; prog = 0.0; rem = dil
        for i, s in enumerate(ordered):
            sd = max(1.0, s["distance"])
            if rem <= sd: si = i; prog = rem / sd; break
            rem -= sd
        ai = si if dr == 1 else (len(segs) - 1 - si)
        ap = prog if dr == 1 else (1.0 - prog)
        return (ai, ap, we, wf, wg, True, False, None)

    def _wear_at(self, t):
        eff = max(0, t - self.deploy_time)
        d = eff * self.speed
        laps = int(d // self.total_distance)
        dil = d % self.total_distance
        dr = 1 if laps % 2 == 0 else -1
        we = laps * self.route_wear['engine']
        wf = laps * self.route_wear['fuselage']
        wg = laps * self.route_wear['gear']
        segs = self.route_data["segments"]
        ordered = segs if dr == 1 else list(reversed(segs))
        rem = dil
        for s in ordered:
            sd = max(1.0, s["distance"])
            if rem <= sd:
                f = rem / sd
                we += s["wearEngine"] * f; wf += s["wearFuselage"] * f; wg += s["wearLandingGear"] * f
                break
            we += s["wearEngine"]; wf += s["wearFuselage"]; wg += s["wearLandingGear"]
            rem -= sd
        return we, wf, wg

    def health_pct(self, we, wf, wg):
        return (max(0, 100 - we / COMPONENT_LIFESPAN_CAPACITY['engine'] * 100),
                max(0, 100 - wf / COMPONENT_LIFESPAN_CAPACITY['fuselage'] * 100),
                max(0, 100 - wg / COMPONENT_LIFESPAN_CAPACITY['gear'] * 100))

    def laps_at(self, t):
        return int((max(0, t - self.deploy_time) * self.speed) // self.total_distance)

    def repair(self, t):
        self.deploy_time = t; self.maintenance_count += 1; self._precompute_grounding()


# ── Helpers ────────────────────────────────────────────────────────────
def _get_airport_indices(route):
    segs = route["segments"]; n = len(segs) + 1
    ap = {0, n - 1}
    if "airport" in segs[0].get("source_name", "").lower(): ap.add(0)
    for i, s in enumerate(segs):
        if "airport" in s.get("target_name", "").lower(): ap.add(i + 1)
    return ap

def _seg_emojis(seg):
    e = seg.get("seg_env", {})
    em = []
    if e.get("salinity", 0) > 0.5: em.append("🌊")
    if e.get("temp", 20) > 35: em.append("☀️")
    if e.get("temp", 20) < 0: em.append("❄️")
    if e.get("erosion", 0) > 0.5: em.append("💨")
    return " ".join(em)

def _node_emojis(env):
    em = []
    if env.get("salinity", 0) > 0.5: em.append("🌊")
    if env.get("temp", 20) > 35: em.append("☀️")
    if env.get("temp", 20) < 0: em.append("❄️")
    if env.get("erosion", 0) > 0.5: em.append("💨")
    return " ".join(em)

def _total_wear(seg):
    return seg.get("wearEngine", 0) + seg.get("wearFuselage", 0) + seg.get("wearLandingGear", 0)

def _shape_edge(cx, cy, tx, ty, is_airport):
    dx = tx - cx; dy = ty - cy
    dist = math.hypot(dx, dy)
    if dist < 0.01: return cx, cy
    nx, ny = dx / dist, dy / dist
    if is_airport:
        if abs(nx) < 0.001:
            return cx, cy + AP_HH * (1 if ny > 0 else -1)
        if abs(ny) < 0.001:
            return cx + AP_HW * (1 if nx > 0 else -1), cy
        tx_edge = AP_HW / abs(nx)
        ty_edge = AP_HH / abs(ny)
        t = min(tx_edge, ty_edge)
        return cx + nx * t, cy + ny * t
    else:
        return cx + nx * WP_R, cy + ny * WP_R


def _is_waypoint(name):
    return "WP" in name or "waypoint" in name.lower()


# ══════════════════════════════════════════════════════════════════════
class SimulationApp:
    def __init__(self, root):
        self.root = root
        self.root.title("Aerogility Variant 3 — Flight Wear Simulation")
        self.root.geometry("1500x900")
        self.root.configure(bg=BG_DARK)
        self.root.minsize(1100, 650)

        self._load_all_routes()
        self.is_paused = False
        self.planes: dict[str, Plane] = {}
        self.plane_routes: dict[str, dict] = {}       # plane_id → route dict
        self.plane_node_keys: dict[str, list] = {}     # plane_id → list of node keys for its route
        self.health_cards: dict[str, dict] = {}
        self.sim_time_var = tk.DoubleVar(value=0)
        self.next_id = 1

        # ── Zoom / Pan state ──
        self.zoom = 1.0
        self.pan_x = 0.0
        self.pan_y = 0.0
        self._drag_node = None
        self._pan_start = None

        self._build_styles()
        self._build_ui()
        self._init_node_positions()
        self._bind_canvas_events()
        self._tick()

    # ── Data loading ──────────────────────────────────────────────────
    def _load_all_routes(self):
        global MAP_DATA
        MAP_DATA = generated_flight_map.MAP_DATA
        self.routes = MAP_DATA["routes"]

        # Build global unique node set and per-route info
        # node_key = name string; positions stored in dict
        self.all_nodes: dict[str, dict] = {}   # name → {env, is_airport}
        self.route_edges = []                    # list of (route_idx, node_a, node_b, seg_data)

        # Collect all airports (endpoints of routes) for the deploy dialog
        self.airport_names = set()

        for ri, route in enumerate(self.routes):
            segs = route["segments"]
            prev_name = segs[0]["source_name"]
            src_env = segs[0].get("source_env", {})
            if prev_name not in self.all_nodes:
                self.all_nodes[prev_name] = {"env": src_env, "is_airport": not _is_waypoint(prev_name)}
            if not _is_waypoint(prev_name):
                self.airport_names.add(prev_name)

            for si, seg in enumerate(segs):
                tgt_name = seg["target_name"]
                tgt_env = seg.get("target_env", {})
                if tgt_name not in self.all_nodes:
                    self.all_nodes[tgt_name] = {"env": tgt_env, "is_airport": not _is_waypoint(tgt_name)}
                if not _is_waypoint(tgt_name):
                    self.airport_names.add(tgt_name)
                self.route_edges.append((ri, prev_name, tgt_name, seg))
                prev_name = tgt_name

        self.airport_names = sorted(self.airport_names)

        # Build lookup: (start_airport, end_airport) → list of route indices
        self.airport_route_map: dict[tuple, list] = {}
        for ri, route in enumerate(self.routes):
            segs = route["segments"]
            src = segs[0]["source_name"]
            dst = segs[-1]["target_name"]
            key = (src, dst)
            self.airport_route_map.setdefault(key, []).append(ri)
            # Also add reverse
            rkey = (dst, src)
            self.airport_route_map.setdefault(rkey, []).append(ri)

    def _get_route_node_names(self, route):
        segs = route["segments"]
        names = [segs[0]["source_name"]]
        for s in segs:
            names.append(s["target_name"])
        return names

    # ── Node positions ────────────────────────────────────────────────
    def _init_node_positions(self):
        """Translates real-world GPS coordinates into flat screen X/Y using a Mercator Projection."""
        self.node_positions: dict[str, list] = {}
        earth_radius = 150.0 # Scaling factor for the map size
        
        # We need to extract the coordinates from the segments
        for ri, route in enumerate(self.routes):
            for seg in route["segments"]:
                # Do Source Node
                src_name = seg["source_name"]
                if src_name not in self.node_positions:
                    coords = seg.get("source_coords", {"lat": 0.0, "lon": 0.0})
                    lat = coords.get("lat", 0.0)
                    lon = coords.get("lon", 0.0)
                    x = earth_radius * math.radians(lon)
                    lat_rad = math.radians(max(-85.0, min(85.0, lat)))
                    y = -earth_radius * math.log(math.tan((math.pi / 4.0) + (lat_rad / 2.0)))
                    self.node_positions[src_name] = [x, y]
                
                # Do Target Node
                tgt_name = seg["target_name"]
                if tgt_name not in self.node_positions:
                    coords = seg.get("target_coords", {"lat": 0.0, "lon": 0.0})
                    lat = coords.get("lat", 0.0)
                    lon = coords.get("lon", 0.0)
                    x = earth_radius * math.radians(lon)
                    lat_rad = math.radians(max(-85.0, min(85.0, lat)))
                    y = -earth_radius * math.log(math.tan((math.pi / 4.0) + (lat_rad / 2.0)))
                    self.node_positions[tgt_name] = [x, y]
                    
        self._fit_to_view()

    # ── Coordinate transforms ─────────────────────────────────────────
    def _w2s(self, wx, wy):
        return wx * self.zoom + self.pan_x, wy * self.zoom + self.pan_y

    def _s2w(self, sx, sy):
        return (sx - self.pan_x) / self.zoom, (sy - self.pan_y) / self.zoom

    # ── Styles ────────────────────────────────────────────────────────
    def _build_styles(self):
        s = ttk.Style(); s.theme_use("clam")
        for nm, col in [("Green.Horizontal.TProgressbar", ACCENT_GREEN),
                        ("Yellow.Horizontal.TProgressbar", ACCENT_YELLOW),
                        ("Red.Horizontal.TProgressbar",    ACCENT_RED)]:
            s.configure(nm, troughcolor="#1a1f2e", background=col, thickness=14, borderwidth=0)

    # ── UI layout ─────────────────────────────────────────────────────
    def _build_ui(self):
        # ── Bottom bar ──
        bot = tk.Frame(self.root, bg=BG_PANEL, padx=20, pady=12)
        bot.pack(side=tk.BOTTOM, fill=tk.X)

        self.timeline = tk.Scale(bot, from_=0, to=5000, orient=tk.HORIZONTAL,
            variable=self.sim_time_var, showvalue=False, bg=BG_PANEL, fg=ACCENT_BLUE,
            troughcolor=BORDER_COLOR, highlightthickness=0, sliderrelief=tk.FLAT,
            activebackground=ACCENT_CYAN, sliderlength=20, width=12)
        self.timeline.pack(fill=tk.X, pady=(0, 6))

        tr = tk.Frame(bot, bg=BG_PANEL); tr.pack(fill=tk.X, pady=(0, 6))
        self.time_lbl = tk.Label(tr, text="T = 0", fg=ACCENT_CYAN, bg=BG_PANEL,
                                  font=("Menlo", 11, "bold"))
        self.time_lbl.pack(side=tk.LEFT)
        self.summary_lbl = tk.Label(tr, text="", fg=TEXT_DIM, bg=BG_PANEL, font=("Arial", 10))
        self.summary_lbl.pack(side=tk.RIGHT)

        ctrl = tk.Frame(bot, bg=BG_PANEL); ctrl.pack(fill=tk.X)

        self.btn_pause = self._btn(ctrl, "Pause", self.toggle_pause, bg="#5a6280", fg=BTN_FG, w=10)
        self.btn_pause.pack(side=tk.LEFT, padx=(0, 12))

        tk.Label(ctrl, text="Flight ID:", bg=BG_PANEL, fg=TEXT_SECONDARY,
                 font=("Arial", 11)).pack(side=tk.LEFT, padx=(0, 6))
        self.id_var = tk.StringVar(value="Boeing-737")
        tk.Entry(ctrl, textvariable=self.id_var, width=16, bg="#1a1f2e", fg=TEXT_PRIMARY,
                 insertbackground=ACCENT_CYAN, relief=tk.FLAT, font=("Arial", 12),
                 highlightthickness=2, highlightcolor=ACCENT_BLUE,
                 highlightbackground=BORDER_COLOR).pack(side=tk.LEFT, padx=(0, 10), ipady=4)

        self._btn(ctrl, "✈ Deploy Flight", self._open_deploy_dialog,
                  bg=ACCENT_GREEN, fg=BTN_FG, w=16).pack(side=tk.LEFT, padx=(0, 8))
        self._btn(ctrl, "Clear All", self.clear_all, bg=ACCENT_RED, fg=BTN_FG, w=10).pack(side=tk.LEFT)

        sf = tk.Frame(ctrl, bg=BG_PANEL); sf.pack(side=tk.RIGHT)
        tk.Label(sf, text="Speed", bg=BG_PANEL, fg=TEXT_SECONDARY,
                 font=("Arial", 10)).pack(side=tk.LEFT, padx=(0, 6))
        self.spd = tk.Scale(sf, from_=0.5, to=10.0, resolution=0.5, orient=tk.HORIZONTAL,
            bg=BG_PANEL, fg=TEXT_SECONDARY, troughcolor=BORDER_COLOR, highlightthickness=0,
            showvalue=True, sliderlength=16, width=10, activebackground=ACCENT_CYAN, length=140)
        self.spd.set(2.0); self.spd.pack(side=tk.LEFT)

        # ── Main area ──
        main = tk.Frame(self.root, bg=BG_DARK)
        main.pack(side=tk.TOP, fill=tk.BOTH, expand=True)

        # ── Left: Map ──
        mf = tk.Frame(main, bg=BG_DARK)
        mf.pack(side=tk.LEFT, fill=tk.BOTH, expand=True, padx=(14, 6), pady=14)

        mh = tk.Frame(mf, bg=BG_PANEL, padx=14, pady=8)
        mh.pack(fill=tk.X)
        tk.Label(mh, text="GLOBAL ROUTE MAP", fg=TEXT_PRIMARY, bg=BG_PANEL,
                 font=("Arial", 12, "bold")).pack(side=tk.LEFT)
        route_count = len(self.routes)
        tk.Label(mh, text=f"{route_count} routes  |  {len(self.airport_names)} airports",
                 fg=ACCENT_CYAN, bg=BG_PANEL, font=("Arial", 11)).pack(side=tk.LEFT, padx=(14, 0))
        self.active_lbl = tk.Label(mh, text="", fg=TEXT_DIM, bg=BG_PANEL, font=("Arial", 10))
        self.active_lbl.pack(side=tk.RIGHT)

        zbtn = tk.Frame(mh, bg=BG_PANEL)
        zbtn.pack(side=tk.RIGHT, padx=(0, 14))
        self._btn(zbtn, "Fit", self._fit_to_view, bg="#3d4663", fg=BTN_FG).pack(side=tk.LEFT, padx=2)
        self._btn(zbtn, "+", lambda: self._zoom_by(1.25), bg="#3d4663", fg=BTN_FG).pack(side=tk.LEFT, padx=2)
        self._btn(zbtn, "−", lambda: self._zoom_by(0.8), bg="#3d4663", fg=BTN_FG).pack(side=tk.LEFT, padx=2)

        self.canvas = tk.Canvas(mf, bg=BG_PANEL, highlightthickness=0)
        self.canvas.pack(fill=tk.BOTH, expand=True)

        # Legend
        leg = tk.Frame(mf, bg=BG_PANEL, padx=14, pady=6); leg.pack(fill=tk.X)
        for shape, col, txt in [("rect", AIRPORT_RECT_FILL, "Airport ✈️"),
                                ("oval", WAYPOINT_FILL, "Waypoint 📍"),
                                ("oval", ACCENT_BLUE, "Flying"),
                                ("oval", GROUNDED_COLOR, "Grounded")]:
            c = tk.Canvas(leg, bg=BG_PANEL, width=12, height=12, highlightthickness=0)
            c.pack(side=tk.LEFT, padx=(0, 2))
            if shape == "rect":
                c.create_rectangle(1, 1, 11, 11, fill=col, outline="")
            else:
                c.create_oval(1, 1, 11, 11, fill=col, outline="")
            tk.Label(leg, text=txt, fg=TEXT_DIM, bg=BG_PANEL,
                     font=("Arial", 9)).pack(side=tk.LEFT, padx=(0, 14))

        # Env legend
        for icon, txt in [("🌊", "High Salinity"), ("☀️", "High Temp"), ("💨", "High Erosion")]:
            tk.Label(leg, text=f"{icon} {txt}", fg=TEXT_DIM, bg=BG_PANEL,
                     font=("Arial", 9)).pack(side=tk.LEFT, padx=(0, 10))

        # ── Right panel with tabs ──
        rp = tk.Frame(main, bg=BG_PANEL, width=380)
        rp.pack(side=tk.RIGHT, fill=tk.Y, padx=(6, 14), pady=14)
        rp.pack_propagate(False)

        tab_bar = tk.Frame(rp, bg=BG_PANEL)
        tab_bar.pack(fill=tk.X, padx=10, pady=(8, 0))
        self._tab_btns = {}
        self._tab_frames = {}
        for tab_name in ["Fleet Health", "Code Editor"]:
            b = tk.Button(tab_bar, text=tab_name, font=("Arial", 10, "bold"),
                          bg=BG_CARD, fg=TEXT_SECONDARY, relief=tk.FLAT, padx=12, pady=4,
                          cursor="hand2", borderwidth=0,
                          command=lambda tn=tab_name: self._switch_tab(tn))
            b.pack(side=tk.LEFT, padx=(0, 4))
            self._tab_btns[tab_name] = b

        tk.Frame(rp, bg=BORDER_COLOR, height=1).pack(fill=tk.X, padx=10, pady=(6, 0))

        # ── Tab: Fleet Health ──
        health_tab = tk.Frame(rp, bg=BG_PANEL)
        self._tab_frames["Fleet Health"] = health_tab

        rhdr = tk.Frame(health_tab, bg=BG_PANEL, pady=8, padx=14)
        rhdr.pack(fill=tk.X)
        tk.Label(rhdr, text="FLEET HEALTH", fg=TEXT_PRIMARY, bg=BG_PANEL,
                 font=("Arial", 12, "bold")).pack(side=tk.LEFT)
        self.fleet_lbl = tk.Label(rhdr, text="", fg=TEXT_DIM, bg=BG_PANEL, font=("Arial", 9))
        self.fleet_lbl.pack(side=tk.RIGHT)

        self.hc = tk.Canvas(health_tab, bg=BG_PANEL, highlightthickness=0)
        sb = ttk.Scrollbar(health_tab, orient="vertical", command=self.hc.yview)
        self.hf = tk.Frame(self.hc, bg=BG_PANEL)
        self.hf.bind("<Configure>", lambda e: self.hc.configure(scrollregion=self.hc.bbox("all")))
        self.hc.create_window((0, 0), window=self.hf, anchor="nw", width=350)
        self.hc.configure(yscrollcommand=sb.set)
        self.hc.pack(side=tk.LEFT, fill=tk.BOTH, expand=True)
        sb.pack(side=tk.RIGHT, fill=tk.Y)

        # ── Tab: Code Editor ──
        code_tab = tk.Frame(rp, bg=BG_PANEL)
        self._tab_frames["Code Editor"] = code_tab

        code_hdr = tk.Frame(code_tab, bg=BG_PANEL, padx=10, pady=8)
        code_hdr.pack(fill=tk.X)
        tk.Label(code_hdr, text="generated_flight_map.py", fg=ACCENT_CYAN, bg=BG_PANEL,
                 font=("Menlo", 10, "bold")).pack(side=tk.LEFT)
        self._btn(code_hdr, "Save & Reload", self._save_and_reload,
                  bg=ACCENT_GREEN, fg=BTN_FG).pack(side=tk.RIGHT)

        self.code_text = tk.Text(code_tab, bg="#111520", fg=TEXT_PRIMARY,
                                 insertbackground=ACCENT_CYAN, font=("Menlo", 11),
                                 wrap=tk.NONE, relief=tk.FLAT, padx=8, pady=8,
                                 undo=True, highlightthickness=1,
                                 highlightcolor=ACCENT_BLUE, highlightbackground=BORDER_COLOR)
        code_scroll_y = ttk.Scrollbar(code_tab, orient="vertical", command=self.code_text.yview)
        code_scroll_x = ttk.Scrollbar(code_tab, orient="horizontal", command=self.code_text.xview)
        self.code_text.configure(yscrollcommand=code_scroll_y.set, xscrollcommand=code_scroll_x.set)
        code_scroll_y.pack(side=tk.RIGHT, fill=tk.Y)
        code_scroll_x.pack(side=tk.BOTTOM, fill=tk.X)
        self.code_text.pack(fill=tk.BOTH, expand=True)

        self._load_code_editor()
        self._switch_tab("Fleet Health")

    def _switch_tab(self, name):
        for tn, frame in self._tab_frames.items():
            frame.pack_forget()
        self._tab_frames[name].pack(fill=tk.BOTH, expand=True)
        for tn, btn in self._tab_btns.items():
            if tn == name:
                btn.config(bg=ACCENT_BLUE, fg=BTN_FG)
            else:
                btn.config(bg=BG_CARD, fg=TEXT_SECONDARY)

    def _load_code_editor(self):
        path = self._get_map_path()
        try:
            with open(path, "r") as f:
                content = f.read()
            self.code_text.delete("1.0", tk.END)
            self.code_text.insert("1.0", content)
        except FileNotFoundError:
            self.code_text.delete("1.0", tk.END)
            self.code_text.insert("1.0", "# generated_flight_map.py not found\n")

    def _get_map_path(self):
        mod = sys.modules.get("generated_flight_map")
        if mod and hasattr(mod, "__file__") and mod.__file__:
            return mod.__file__
        return os.path.join(os.getcwd(), "generated_flight_map.py")

    def _save_and_reload(self):
        path = self._get_map_path()
        content = self.code_text.get("1.0", tk.END)
        try:
            with open(path, "w") as f:
                f.write(content)
        except Exception as e:
            messagebox.showerror("Save Error", str(e)); return

        try:
            importlib.reload(generated_flight_map)
        except Exception as e:
            messagebox.showerror("Reload Error", f"Syntax error in file:\n{e}"); return

        old_planes = dict(self.planes)
        self._load_all_routes()
        self._init_node_positions()
        self.planes.clear()
        self.plane_routes.clear()
        self.plane_node_keys.clear()
        for d in self.health_cards.values():
            d["card"].destroy()
        self.health_cards.clear()
        messagebox.showinfo("Reloaded",
                            "Map data reloaded successfully.\nFlights cleared (routes may have changed).")

    # ── Canvas interaction ────────────────────────────────────────────
    def _bind_canvas_events(self):
        self.canvas.bind("<ButtonPress-1>", self._on_press)
        self.canvas.bind("<B1-Motion>", self._on_drag)
        self.canvas.bind("<ButtonRelease-1>", self._on_release)
        self.canvas.bind("<ButtonPress-2>", self._on_pan_start)
        self.canvas.bind("<B2-Motion>", self._on_pan_move)
        self.canvas.bind("<ButtonPress-3>", self._on_pan_start)
        self.canvas.bind("<B3-Motion>", self._on_pan_move)
        self.canvas.bind("<MouseWheel>", self._on_scroll)
        self.canvas.bind("<Button-4>", lambda e: self._zoom_at(e, 1.15))
        self.canvas.bind("<Button-5>", lambda e: self._zoom_at(e, 0.87))

    def _hit_node(self, sx, sy):
        for name, pos in self.node_positions.items():
            nx, ny = self._w2s(pos[0], pos[1])
            is_ap = self.all_nodes[name]["is_airport"]
            if is_ap:
                hw, hh = AP_HW * self.zoom, AP_HH * self.zoom
                if abs(sx - nx) <= hw and abs(sy - ny) <= hh:
                    return name
            else:
                r = WP_R * self.zoom
                if math.hypot(sx - nx, sy - ny) <= r:
                    return name
        return None

    def _on_press(self, e):
        node = self._hit_node(e.x, e.y)
        if node is not None:
            self._drag_node = node
        else:
            self._pan_start = (e.x, e.y, self.pan_x, self.pan_y)

    def _on_drag(self, e):
        if self._drag_node is not None:
            wx, wy = self._s2w(e.x, e.y)
            self.node_positions[self._drag_node] = [wx, wy]
        elif self._pan_start:
            sx, sy, px, py = self._pan_start
            self.pan_x = px + (e.x - sx)
            self.pan_y = py + (e.y - sy)

    def _on_release(self, e):
        self._drag_node = None
        self._pan_start = None

    def _on_pan_start(self, e):
        self._pan_start = (e.x, e.y, self.pan_x, self.pan_y)

    def _on_pan_move(self, e):
        if self._pan_start:
            sx, sy, px, py = self._pan_start
            self.pan_x = px + (e.x - sx)
            self.pan_y = py + (e.y - sy)

    def _on_scroll(self, e):
        factor = 1.1 if e.delta > 0 else 0.9
        self._zoom_at(e, factor)

    def _zoom_at(self, e, factor):
        old_wx, old_wy = self._s2w(e.x, e.y)
        self.zoom *= factor
        self.zoom = max(0.15, min(5.0, self.zoom))
        new_sx, new_sy = self._w2s(old_wx, old_wy)
        self.pan_x += e.x - new_sx
        self.pan_y += e.y - new_sy

    def _zoom_by(self, factor):
        cw = self.canvas.winfo_width() / 2
        ch = self.canvas.winfo_height() / 2
        class FakeEvent:
            x = cw; y = ch; delta = 0
        self._zoom_at(FakeEvent(), factor)

    def _fit_to_view(self):
        if not self.node_positions:
            return
        cw = max(self.canvas.winfo_width() if hasattr(self, 'canvas') else 800, 600)
        ch = max(self.canvas.winfo_height() if hasattr(self, 'canvas') else 500, 400)
        xs = [p[0] for p in self.node_positions.values()]
        ys = [p[1] for p in self.node_positions.values()]
        margin = 100
        wx_min, wx_max = min(xs) - margin, max(xs) + margin
        wy_min, wy_max = min(ys) - margin, max(ys) + margin
        ww = max(1, wx_max - wx_min)
        wh = max(1, wy_max - wy_min)
        self.zoom = min(cw / ww, ch / wh)
        self.zoom = max(0.15, min(5.0, self.zoom))
        wcx = (wx_min + wx_max) / 2
        wcy = (wy_min + wy_max) / 2
        self.pan_x = cw / 2 - wcx * self.zoom
        self.pan_y = ch / 2 - wcy * self.zoom

    # ── Button helper ─────────────────────────────────────────────────
    @staticmethod
    def _btn(p, txt, cmd, bg="#3d4663", fg=BTN_FG, w=None):
        b = tk.Button(p, text=txt, command=cmd, bg=bg, fg=fg,
                      activebackground=bg, activeforeground=fg,
                      relief=tk.FLAT, padx=10, pady=4,
                      font=("Arial", 11, "bold"), cursor="hand2", borderwidth=0)
        if w: b.config(width=w)
        return b

    @staticmethod
    def _hcol(v):
        if v <= HEALTH_CRITICAL: return ACCENT_RED
        if v <= HEALTH_WARNING: return ACCENT_YELLOW
        return ACCENT_GREEN

    @staticmethod
    def _hstyle(v):
        if v <= HEALTH_CRITICAL: return "Red.Horizontal.TProgressbar"
        if v <= HEALTH_WARNING: return "Yellow.Horizontal.TProgressbar"
        return "Green.Horizontal.TProgressbar"

    # ══════════════════════════════════════════════════════════════════
    # DEPLOY DIALOG — user picks start & destination airports
    # ══════════════════════════════════════════════════════════════════
    def _open_deploy_dialog(self):
        name = self.id_var.get().strip()
        if not name:
            messagebox.showwarning("No ID", "Please enter a Flight ID first."); return
        if name in self.planes:
            messagebox.showwarning("Duplicate", f"'{name}' already deployed."); return

        dlg = tk.Toplevel(self.root)
        dlg.title("Deploy Flight")
        dlg.configure(bg=BG_DARK)
        dlg.geometry("420x380")
        dlg.resizable(False, False)
        dlg.transient(self.root)
        dlg.grab_set()

        # Centre on parent
        dlg.update_idletasks()
        px = self.root.winfo_x() + self.root.winfo_width() // 2 - 210
        py = self.root.winfo_y() + self.root.winfo_height() // 2 - 190
        dlg.geometry(f"+{px}+{py}")

        # Header
        hdr = tk.Frame(dlg, bg=BG_PANEL, padx=20, pady=14)
        hdr.pack(fill=tk.X)
        tk.Label(hdr, text=f"✈  Deploy  {name}", fg=ACCENT_BLUE, bg=BG_PANEL,
                 font=("Arial", 14, "bold")).pack(anchor="w")
        tk.Label(hdr, text="Select departure and arrival airports",
                 fg=TEXT_SECONDARY, bg=BG_PANEL, font=("Arial", 10)).pack(anchor="w")

        body = tk.Frame(dlg, bg=BG_DARK, padx=24, pady=16)
        body.pack(fill=tk.BOTH, expand=True)

        # Departure
        tk.Label(body, text="DEPARTURE AIRPORT", fg=TEXT_SECONDARY, bg=BG_DARK,
                 font=("Arial", 9, "bold")).pack(anchor="w", pady=(0, 4))
        dep_var = tk.StringVar()
        dep_cb = ttk.Combobox(body, textvariable=dep_var, values=self.airport_names,
                              state="readonly", font=("Arial", 12))
        dep_cb.pack(fill=tk.X, ipady=4, pady=(0, 14))
        if self.airport_names:
            dep_cb.current(0)

        # Arrival
        tk.Label(body, text="ARRIVAL AIRPORT", fg=TEXT_SECONDARY, bg=BG_DARK,
                 font=("Arial", 9, "bold")).pack(anchor="w", pady=(0, 4))
        arr_var = tk.StringVar()
        arr_cb = ttk.Combobox(body, textvariable=arr_var, values=self.airport_names,
                              state="readonly", font=("Arial", 12))
        arr_cb.pack(fill=tk.X, ipady=4, pady=(0, 14))
        if len(self.airport_names) > 1:
            arr_cb.current(1)

        # Route info label
        info_lbl = tk.Label(body, text="", fg=TEXT_DIM, bg=BG_DARK,
                            font=("Arial", 10), wraplength=360, justify=tk.LEFT)
        info_lbl.pack(fill=tk.X, pady=(0, 10))

        def _update_info(*_):
            src = dep_var.get(); dst = arr_var.get()
            if src == dst:
                info_lbl.config(text="⚠  Departure and arrival must differ.", fg=ACCENT_YELLOW)
                return
            key = (src, dst)
            if key in self.airport_route_map:
                ri_list = self.airport_route_map[key]
                r = self.routes[ri_list[0]]
                rname = r.get("name", r.get("route_id", "?"))
                total_d = sum(s["distance"] for s in r["segments"])
                segs_n = len(r["segments"])
                info_lbl.config(text=f"Route: {rname}  |  {total_d:.0f} km  |  {segs_n} segments",
                                fg=ACCENT_CYAN)
            else:
                info_lbl.config(text="⚠  No direct route between these airports.", fg=ACCENT_RED)

        dep_var.trace_add("write", _update_info)
        arr_var.trace_add("write", _update_info)
        _update_info()

        # Buttons
        btn_row = tk.Frame(body, bg=BG_DARK)
        btn_row.pack(fill=tk.X, pady=(6, 0))

        def _do_deploy():
            src = dep_var.get(); dst = arr_var.get()
            if src == dst:
                messagebox.showwarning("Invalid", "Departure and arrival must differ.", parent=dlg)
                return
            key = (src, dst)
            if key not in self.airport_route_map:
                messagebox.showwarning("No Route",
                                       f"No direct route between {src} and {dst}.", parent=dlg)
                return
            ri = self.airport_route_map[key][0]
            route = self.routes[ri]

            # Determine if we need to reverse the route (user picked dst→src order)
            segs = route["segments"]
            route_src = segs[0]["source_name"]
            is_reversed = (route_src != src)

            if is_reversed:
                # Build a reversed copy of the route
                rev_segs = []
                for seg in reversed(segs):
                    rev_seg = dict(seg)
                    rev_seg["source_name"] = seg["target_name"]
                    rev_seg["source_env"] = seg.get("target_env", {})
                    rev_seg["target_name"] = seg["source_name"]
                    rev_seg["target_env"] = seg.get("source_env", {})
                    rev_segs.append(rev_seg)
                route = dict(route)
                route["segments"] = rev_segs

            ap_idx = _get_airport_indices(route)
            plane = Plane(name, route, deploy_time=self.sim_time_var.get(),
                          airport_indices=ap_idx)

            node_names = self._get_route_node_names(route)
            self.planes[name] = plane
            self.plane_routes[name] = route
            self.plane_node_keys[name] = node_names
            self.next_id += 1
            self.id_var.set(f"Flight-{self.next_id}")
            self._add_card(name, route)
            dlg.destroy()

        self._btn(btn_row, "Deploy", _do_deploy, bg=ACCENT_GREEN, fg=BTN_FG, w=12).pack(side=tk.LEFT, padx=(0, 8))
        self._btn(btn_row, "Cancel", dlg.destroy, bg="#5a6280", fg=BTN_FG, w=10).pack(side=tk.LEFT)

    # ── Health card ───────────────────────────────────────────────────
    def _add_card(self, name, route):
        card = tk.Frame(self.hf, bg=BG_CARD, highlightbackground=BORDER_COLOR,
                        highlightthickness=1, padx=12, pady=10)
        card.pack(fill=tk.X, padx=8, pady=5)
        hdr = tk.Frame(card, bg=BG_CARD); hdr.pack(fill=tk.X)
        tk.Label(hdr, text=name, fg=ACCENT_BLUE, bg=BG_CARD,
                 font=("Arial", 12, "bold")).pack(side=tk.LEFT)
        st = tk.Label(hdr, text="FLYING", fg=ACCENT_GREEN, bg=BG_CARD,
                      font=("Arial", 9, "bold"))
        st.pack(side=tk.LEFT, padx=(10, 0))
        bb = tk.Frame(hdr, bg=BG_CARD); bb.pack(side=tk.RIGHT)
        rb = tk.Button(bb, text="Repair", font=("Arial", 10, "bold"),
                       bg=ACCENT_YELLOW, fg=BTN_FG, relief=tk.FLAT,
                       command=lambda: self._do_repair(name),
                       cursor="hand2", borderwidth=0, padx=8, pady=2, state=tk.DISABLED)
        rb.pack(side=tk.LEFT, padx=(0, 6))
        tk.Button(bb, text="X", font=("Arial", 11, "bold"), bg=BG_CARD, fg=ACCENT_RED,
                  relief=tk.FLAT, command=lambda: self._remove(name),
                  cursor="hand2", borderwidth=0).pack(side=tk.LEFT)

        # Route label
        rname = route.get("name", route.get("route_id", ""))
        segs = route["segments"]
        src_name = segs[0]["source_name"]
        dst_name = segs[-1]["target_name"]
        route_label = f"{src_name} → {dst_name}"
        tk.Label(card, text=route_label, fg=TEXT_DIM, bg=BG_CARD,
                 font=("Arial", 9)).pack(anchor="w", pady=(2, 4))

        bars = {}
        for comp, tag in [("Engine", "ENG"), ("Fuselage", "FUS"), ("Gear", "GER")]:
            row = tk.Frame(card, bg=BG_CARD); row.pack(fill=tk.X, pady=3)
            tk.Label(row, text=tag, fg=TEXT_DIM, bg=BG_CARD, width=4, anchor="w",
                     font=("Menlo", 10, "bold")).pack(side=tk.LEFT)
            pb = ttk.Progressbar(row, orient="horizontal", length=150, mode="determinate",
                                 style="Green.Horizontal.TProgressbar")
            pb.pack(side=tk.LEFT, padx=6); pb['value'] = 100
            lp = tk.Label(row, text="100.0%", fg=ACCENT_GREEN, bg=BG_CARD, width=7,
                          anchor="e", font=("Menlo", 10))
            lp.pack(side=tk.RIGHT)
            bars[comp] = {"bar": pb, "label": lp}
        srow = tk.Frame(card, bg=BG_CARD); srow.pack(fill=tk.X, pady=(6, 0))
        ll = tk.Label(srow, text="Laps: 0", fg=TEXT_DIM, bg=BG_CARD, font=("Arial", 9))
        ll.pack(side=tk.LEFT)
        ml = tk.Label(srow, text="Repairs: 0", fg=TEXT_DIM, bg=BG_CARD, font=("Arial", 9))
        ml.pack(side=tk.LEFT, padx=(14, 0))
        loc = tk.Label(srow, text="", fg=TEXT_DIM, bg=BG_CARD, font=("Arial", 9))
        loc.pack(side=tk.RIGHT)
        self.health_cards[name] = {"card": card, "bars": bars, "status": st,
                                   "repair": rb, "laps": ll, "maint": ml, "loc": loc}

    def _do_repair(self, name):
        p = self.planes.get(name)
        if not p: return
        s = p.get_state_at_time(self.sim_time_var.get())
        if not s[6]: return
        p.repair(self.sim_time_var.get())

    def _remove(self, name):
        self.planes.pop(name, None)
        self.plane_routes.pop(name, None)
        self.plane_node_keys.pop(name, None)
        c = self.health_cards.pop(name, None)
        if c: c["card"].destroy()

    def clear_all(self):
        self.planes.clear()
        self.plane_routes.clear()
        self.plane_node_keys.clear()
        self.timeline.set(0)
        for d in self.health_cards.values(): d["card"].destroy()
        self.health_cards.clear()

    def toggle_pause(self):
        self.is_paused = not self.is_paused
        self.btn_pause.config(text="Play" if self.is_paused else "Pause")

    # ── Map rendering ─────────────────────────────────────────────────
    def _draw_map(self):
        self.canvas.delete("all")
        z = self.zoom

        # Draw all route edges
        drawn_edges = set()
        for ri, src_name, tgt_name, seg in self.route_edges:
            edge_key = (src_name, tgt_name)
            rev_key = (tgt_name, src_name)
            if edge_key in drawn_edges or rev_key in drawn_edges:
                continue
            drawn_edges.add(edge_key)

            if src_name not in self.node_positions or tgt_name not in self.node_positions:
                continue

            wx1, wy1 = self.node_positions[src_name]
            wx2, wy2 = self.node_positions[tgt_name]
            is_ap_src = self.all_nodes[src_name]["is_airport"]
            is_ap_tgt = self.all_nodes[tgt_name]["is_airport"]

            ex1, ey1 = _shape_edge(wx1, wy1, wx2, wy2, is_ap_src)
            ex2, ey2 = _shape_edge(wx2, wy2, wx1, wy1, is_ap_tgt)
            asx, asy = self._w2s(ex1, ey1)
            aex, aey = self._w2s(ex2, ey2)

            seg_e = seg.get("seg_env", {})
            if seg_e.get("erosion", 0) > 0.5:
                color = "#f25c54"   # red — erosion
            elif seg_e.get("salinity", 0) > 0.5:
                color = "#4ea8de"   # blue — salinity
            elif seg_e.get("temp", 20) > 35.0:
                color = "#f4a236"   # orange — high temp
            elif seg_e.get("temp", 20) < 0:
                color = "#00ffff"   # cyan — low temp
            else:
                color = "#6b7280"   # grey — no severe factor
            arrow_w = max(1.5, 3 * z)

            self.canvas.create_line(asx, asy, aex, aey, fill=color, width=arrow_w,
                                    arrow=tk.LAST, arrowshape=(10*z, 12*z, 5*z))

            # Segment label (compact for multi-route)
            mx, my = (asx + aex) / 2, (asy + aey) / 2
            dist = seg.get("distance", 0)
            emojis = _seg_emojis(seg)
            eng = seg.get("wearEngine", 0)
            fus = seg.get("wearFuselage", 0)
            ger = seg.get("wearLandingGear", 0)
            parts = [f"{dist:.0f}km"]
            if emojis:
                parts.append(emojis)
            parts.append(f"E:{eng:.0f} F:{fus:.0f} G:{ger:.0f}")

            fs = max(7, int(8 * z))
            self.canvas.create_text(mx, my - 16 * z, text="  ".join(parts),
                                    fill=color, font=("Arial", fs, "bold"))

        # Draw all nodes
        for name, info in self.all_nodes.items():
            if name not in self.node_positions:
                continue
            wx, wy = self.node_positions[name]
            sx, sy = self._w2s(wx, wy)
            is_ap = info["is_airport"]
            env = info.get("env", {})
            ne = _node_emojis(env)

            if is_ap:
                hw, hh = AP_HW * z, AP_HH * z
                self.canvas.create_rectangle(sx - hw, sy - hh, sx + hw, sy + hh,
                                             fill=AIRPORT_RECT_FILL, outline="#cccccc", width=1)
                fs = max(8, int(11 * z))
                label = f"✈️ {name}"
                if ne: label += f"  {ne}"
                self.canvas.create_text(sx, sy + hh + 14 * z, text=label,
                                        fill=TEXT_PRIMARY, font=("Arial", fs, "bold"))
            else:
                r = WP_R * z
                self.canvas.create_oval(sx - r, sy - r, sx + r, sy + r,
                                        fill=WAYPOINT_FILL, outline="#999999", width=1)
                fs = max(7, int(9 * z))
                label = f"📍 {name}"
                if ne: label += f"  {ne}"
                self.canvas.create_text(sx, sy + r + 14 * z, text=label,
                                        fill=TEXT_SECONDARY, font=("Arial", fs))

    # ── Tick ──────────────────────────────────────────────────────────
    def _tick(self):
        self._draw_map()

        if not self.is_paused and self.planes:
            t = self.sim_time_var.get() + self.spd.get()
            if t > 5000:
                t = 5000; self.is_paused = True
                self.btn_pause.config(text="Play")
            self.sim_time_var.set(t)

        sim_t = self.sim_time_var.get()
        self.time_lbl.config(text=f"T = {sim_t:.0f}")

        flying = grounded = 0
        for pid, plane in self.planes.items():
            si, prog, we, wf, wg, alive, grd, gn = plane.get_state_at_time(sim_t)
            eh, fh, gh = plane.health_pct(we, wf, wg)
            laps = plane.laps_at(sim_t)
            if grd: grounded += 1
            else: flying += 1

            if pid in self.health_cards:
                hc = self.health_cards[pid]
                for comp, val in [("Engine", eh), ("Fuselage", fh), ("Gear", gh)]:
                    hc["bars"][comp]["bar"]['value'] = val
                    hc["bars"][comp]["bar"].configure(style=self._hstyle(val))
                    hc["bars"][comp]["label"].config(text=f"{val:.1f}%", fg=self._hcol(val))

                node_keys = self.plane_node_keys.get(pid, [])
                if grd:
                    nn = node_keys[gn] if gn is not None and gn < len(node_keys) else "?"
                    hc["status"].config(text="GROUNDED", fg=ACCENT_RED)
                    hc["loc"].config(text=f"At {nn}"); hc["repair"].config(state=tk.NORMAL)
                else:
                    hc["status"].config(text="FLYING", fg=ACCENT_GREEN)
                    hc["loc"].config(text=""); hc["repair"].config(state=tk.DISABLED)
                hc["laps"].config(text=f"Laps: {laps}")
                hc["maint"].config(text=f"Repairs: {plane.maintenance_count}")

            # Draw plane on the map using global node positions
            node_keys = self.plane_node_keys.get(pid, [])
            if not node_keys:
                continue

            # Get screen positions of this plane's route nodes
            route_screen = []
            for nk in node_keys:
                if nk in self.node_positions:
                    route_screen.append(self._w2s(*self.node_positions[nk]))
                else:
                    route_screen.append((0, 0))

            if grd and gn is not None:
                ni = min(gn, len(route_screen) - 1)
                px, py = route_screen[ni]
            else:
                route_data = self.plane_routes.get(pid)
                if route_data:
                    sc = len(route_data["segments"])
                    idx = min(si, sc - 1)
                    x1, y1 = route_screen[idx]
                    x2, y2 = route_screen[min(idx + 1, len(route_screen) - 1)]
                    px = x1 + (x2 - x1) * prog
                    py = y1 + (y2 - y1) * prog
                else:
                    px, py = 0, 0

            offset = (hash(pid) % 40) - 20
            py += offset
            dc = GROUNDED_COLOR if grd else ACCENT_BLUE
            r = max(5, 8 * self.zoom)
            self.canvas.create_oval(px-r+2, py-r+2, px+r+2, py+r+2, fill="#0a0a0a", outline="")
            self.canvas.create_oval(px-r, py-r, px+r, py+r, fill=dc, outline=TEXT_PRIMARY, width=1)
            fs = max(7, int(8 * self.zoom))
            tag = pid + (" [GRD]" if grd else "")
            self.canvas.create_text(px, py - r - 7, text=tag,
                                    fill=dc if grd else TEXT_PRIMARY, font=("Arial", fs, "bold"))

        self.active_lbl.config(text=f"{flying} flying  |  {grounded} grounded")
        self.fleet_lbl.config(text=f"{len(self.planes)} deployed")
        self.summary_lbl.config(
            text=f"{flying} flying, {grounded} grounded" if self.planes else "No flights deployed")
        self.root.after(50, self._tick)


if __name__ == "__main__":
    root = tk.Tk()
    SimulationApp(root)
    root.mainloop()
