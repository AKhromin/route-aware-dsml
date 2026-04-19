# Route-Aware DSML for Aircraft Maintenance Forecasting

A Domain-Specific Modelling Language for modelling flight routes with explicit
environmental conditions (erosion, salinity, ambient temperature) and forecasting
component-specific wear on engines, fuselages, and landing gear.

Developed as a final-year Individual Project at King's College London
(6CCS3PRJ) in collaboration with Aerogility.

- **Author:** Alexey Khromin (K23001083)
- **Supervisor:** Dr Steffen Zschaler
- **Industry partner:** Aerogility

## Prerequisites

- **Eclipse Modeling Tools** 2024-03 or later
- **Eclipse Sirius** 7.x
- **Acceleo** 3.7
- **Python** 3.8+ (standard library only; uses `tkinter`)

## Setup

1. Clone this repository.
2. In Eclipse, choose `File → Import → General → Existing Projects into Workspace`,
   select the root of the cloned repository as the search folder, and import all six projects.
3. Install Sirius and Acceleo via the Eclipse Marketplace if not already installed.
4. Allow Eclipse to build the workspace. Any initial unresolved imports should
   disappear once Sirius and Acceleo are available.

## Running the DSML

1. Launch a runtime Eclipse instance: `Run -> Run Configurations -> New Eclipse Application -> Run`.
2. In the runtime workbench, open `uk.ac.kcl.variant3.model/model/variant3.aird`.
3. Expand the **Flight Design** viewpoint and double-click **FlightMap** to open the graphical editor.
4. Right-click the background of the diagram and select **Run Simulation** to compute wear values across all routes.
5. Run the Acceleo template (`generatePython.mtl`) via `Run As → Launch Acceleo Application` to regenerate `generated_flight_map.py`.
6. From a terminal, run `python simulation.py` from the `uk.ac.kcl.variant3.generation/` project root.

Full setup and walkthrough instructions are provided in Appendix A (User Guide) of the project report.

## Files authored for this project

The following files were manually authored and are the subject of the project's
source code appendix:

- `uk.ac.kcl.variant3.model/model/variant3.ecore` — metamodel
- `uk.ac.kcl.variant3.design/description/variant3.odesign` — Sirius viewpoint
- `uk.ac.kcl.variant3.generation/src/uk/ac/kcl/variant3/generation/main/generatePython.mtl` — Acceleo template
- `uk.ac.kcl.variant3.generation/simulation.py` — Python simulation tool

All other files under the Eclipse projects are auto-generated (by the EMF
code generator, the Acceleo launcher generator, or Eclipse's plugin scaffolding)
or are standard Eclipse plugin metadata.

## License

This project is submitted as academic coursework and is not released under an
open-source license. Third-party frameworks used (Eclipse EMF, Sirius, Acceleo,
Python) retain their own licenses.
