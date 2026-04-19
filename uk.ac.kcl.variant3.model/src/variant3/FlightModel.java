/**
 */
package variant3;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Flight Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link variant3.FlightModel#getAirports <em>Airports</em>}</li>
 *   <li>{@link variant3.FlightModel#getRoutes <em>Routes</em>}</li>
 *   <li>{@link variant3.FlightModel#getLibrary <em>Library</em>}</li>
 *   <li>{@link variant3.FlightModel#getWaypoints <em>Waypoints</em>}</li>
 * </ul>
 *
 * @see variant3.Variant3Package#getFlightModel()
 * @model
 * @generated
 */
public interface FlightModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Airports</b></em>' containment reference list.
	 * The list contents are of type {@link variant3.Airport}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Airports</em>' containment reference list.
	 * @see variant3.Variant3Package#getFlightModel_Airports()
	 * @model containment="true"
	 * @generated
	 */
	EList<Airport> getAirports();

	/**
	 * Returns the value of the '<em><b>Routes</b></em>' containment reference list.
	 * The list contents are of type {@link variant3.FlightRoute}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Routes</em>' containment reference list.
	 * @see variant3.Variant3Package#getFlightModel_Routes()
	 * @model containment="true"
	 * @generated
	 */
	EList<FlightRoute> getRoutes();

	/**
	 * Returns the value of the '<em><b>Library</b></em>' containment reference list.
	 * The list contents are of type {@link variant3.EnvironmentType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Library</em>' containment reference list.
	 * @see variant3.Variant3Package#getFlightModel_Library()
	 * @model containment="true"
	 * @generated
	 */
	EList<EnvironmentType> getLibrary();

	/**
	 * Returns the value of the '<em><b>Waypoints</b></em>' containment reference list.
	 * The list contents are of type {@link variant3.Waypoint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Waypoints</em>' containment reference list.
	 * @see variant3.Variant3Package#getFlightModel_Waypoints()
	 * @model containment="true"
	 * @generated
	 */
	EList<Waypoint> getWaypoints();

} // FlightModel
