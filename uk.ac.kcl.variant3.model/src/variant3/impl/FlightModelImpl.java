/**
 */
package variant3.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import variant3.Airport;
import variant3.EnvironmentType;
import variant3.FlightModel;
import variant3.FlightRoute;
import variant3.Variant3Package;
import variant3.Waypoint;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Flight Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link variant3.impl.FlightModelImpl#getAirports <em>Airports</em>}</li>
 *   <li>{@link variant3.impl.FlightModelImpl#getRoutes <em>Routes</em>}</li>
 *   <li>{@link variant3.impl.FlightModelImpl#getLibrary <em>Library</em>}</li>
 *   <li>{@link variant3.impl.FlightModelImpl#getWaypoints <em>Waypoints</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FlightModelImpl extends MinimalEObjectImpl.Container implements FlightModel {
	/**
	 * The cached value of the '{@link #getAirports() <em>Airports</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAirports()
	 * @generated
	 * @ordered
	 */
	protected EList<Airport> airports;

	/**
	 * The cached value of the '{@link #getRoutes() <em>Routes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoutes()
	 * @generated
	 * @ordered
	 */
	protected EList<FlightRoute> routes;

	/**
	 * The cached value of the '{@link #getLibrary() <em>Library</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLibrary()
	 * @generated
	 * @ordered
	 */
	protected EList<EnvironmentType> library;

	/**
	 * The cached value of the '{@link #getWaypoints() <em>Waypoints</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWaypoints()
	 * @generated
	 * @ordered
	 */
	protected EList<Waypoint> waypoints;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FlightModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Variant3Package.Literals.FLIGHT_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Airport> getAirports() {
		if (airports == null) {
			airports = new EObjectContainmentEList<Airport>(Airport.class, this, Variant3Package.FLIGHT_MODEL__AIRPORTS);
		}
		return airports;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FlightRoute> getRoutes() {
		if (routes == null) {
			routes = new EObjectContainmentEList<FlightRoute>(FlightRoute.class, this, Variant3Package.FLIGHT_MODEL__ROUTES);
		}
		return routes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EnvironmentType> getLibrary() {
		if (library == null) {
			library = new EObjectContainmentEList<EnvironmentType>(EnvironmentType.class, this, Variant3Package.FLIGHT_MODEL__LIBRARY);
		}
		return library;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Waypoint> getWaypoints() {
		if (waypoints == null) {
			waypoints = new EObjectContainmentEList<Waypoint>(Waypoint.class, this, Variant3Package.FLIGHT_MODEL__WAYPOINTS);
		}
		return waypoints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Variant3Package.FLIGHT_MODEL__AIRPORTS:
				return ((InternalEList<?>)getAirports()).basicRemove(otherEnd, msgs);
			case Variant3Package.FLIGHT_MODEL__ROUTES:
				return ((InternalEList<?>)getRoutes()).basicRemove(otherEnd, msgs);
			case Variant3Package.FLIGHT_MODEL__LIBRARY:
				return ((InternalEList<?>)getLibrary()).basicRemove(otherEnd, msgs);
			case Variant3Package.FLIGHT_MODEL__WAYPOINTS:
				return ((InternalEList<?>)getWaypoints()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Variant3Package.FLIGHT_MODEL__AIRPORTS:
				return getAirports();
			case Variant3Package.FLIGHT_MODEL__ROUTES:
				return getRoutes();
			case Variant3Package.FLIGHT_MODEL__LIBRARY:
				return getLibrary();
			case Variant3Package.FLIGHT_MODEL__WAYPOINTS:
				return getWaypoints();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Variant3Package.FLIGHT_MODEL__AIRPORTS:
				getAirports().clear();
				getAirports().addAll((Collection<? extends Airport>)newValue);
				return;
			case Variant3Package.FLIGHT_MODEL__ROUTES:
				getRoutes().clear();
				getRoutes().addAll((Collection<? extends FlightRoute>)newValue);
				return;
			case Variant3Package.FLIGHT_MODEL__LIBRARY:
				getLibrary().clear();
				getLibrary().addAll((Collection<? extends EnvironmentType>)newValue);
				return;
			case Variant3Package.FLIGHT_MODEL__WAYPOINTS:
				getWaypoints().clear();
				getWaypoints().addAll((Collection<? extends Waypoint>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case Variant3Package.FLIGHT_MODEL__AIRPORTS:
				getAirports().clear();
				return;
			case Variant3Package.FLIGHT_MODEL__ROUTES:
				getRoutes().clear();
				return;
			case Variant3Package.FLIGHT_MODEL__LIBRARY:
				getLibrary().clear();
				return;
			case Variant3Package.FLIGHT_MODEL__WAYPOINTS:
				getWaypoints().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Variant3Package.FLIGHT_MODEL__AIRPORTS:
				return airports != null && !airports.isEmpty();
			case Variant3Package.FLIGHT_MODEL__ROUTES:
				return routes != null && !routes.isEmpty();
			case Variant3Package.FLIGHT_MODEL__LIBRARY:
				return library != null && !library.isEmpty();
			case Variant3Package.FLIGHT_MODEL__WAYPOINTS:
				return waypoints != null && !waypoints.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //FlightModelImpl
