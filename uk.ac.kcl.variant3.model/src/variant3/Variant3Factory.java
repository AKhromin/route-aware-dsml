/**
 */
package variant3;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see variant3.Variant3Package
 * @generated
 */
public interface Variant3Factory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Variant3Factory eINSTANCE = variant3.impl.Variant3FactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Flight Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Flight Model</em>'.
	 * @generated
	 */
	FlightModel createFlightModel();

	/**
	 * Returns a new object of class '<em>Airport</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Airport</em>'.
	 * @generated
	 */
	Airport createAirport();

	/**
	 * Returns a new object of class '<em>Environment Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Environment Type</em>'.
	 * @generated
	 */
	EnvironmentType createEnvironmentType();

	/**
	 * Returns a new object of class '<em>Flight Route</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Flight Route</em>'.
	 * @generated
	 */
	FlightRoute createFlightRoute();

	/**
	 * Returns a new object of class '<em>Flight Segment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Flight Segment</em>'.
	 * @generated
	 */
	FlightSegment createFlightSegment();

	/**
	 * Returns a new object of class '<em>Waypoint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Waypoint</em>'.
	 * @generated
	 */
	Waypoint createWaypoint();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Variant3Package getVariant3Package();

} //Variant3Factory
