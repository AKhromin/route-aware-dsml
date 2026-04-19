/**
 */
package variant3;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Flight Segment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link variant3.FlightSegment#getDistance <em>Distance</em>}</li>
 *   <li>{@link variant3.FlightSegment#getSource <em>Source</em>}</li>
 *   <li>{@link variant3.FlightSegment#getTarget <em>Target</em>}</li>
 *   <li>{@link variant3.FlightSegment#getEnvironment <em>Environment</em>}</li>
 *   <li>{@link variant3.FlightSegment#getWearTotal <em>Wear Total</em>}</li>
 *   <li>{@link variant3.FlightSegment#getWearEngine <em>Wear Engine</em>}</li>
 *   <li>{@link variant3.FlightSegment#getWearFuselage <em>Wear Fuselage</em>}</li>
 *   <li>{@link variant3.FlightSegment#getWearLandingGear <em>Wear Landing Gear</em>}</li>
 * </ul>
 *
 * @see variant3.Variant3Package#getFlightSegment()
 * @model
 * @generated
 */
public interface FlightSegment extends EObject {
	/**
	 * Returns the value of the '<em><b>Distance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Distance</em>' attribute.
	 * @see #setDistance(double)
	 * @see variant3.Variant3Package#getFlightSegment_Distance()
	 * @model
	 * @generated
	 */
	double getDistance();

	/**
	 * Sets the value of the '{@link variant3.FlightSegment#getDistance <em>Distance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Distance</em>' attribute.
	 * @see #getDistance()
	 * @generated
	 */
	void setDistance(double value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(RouteNode)
	 * @see variant3.Variant3Package#getFlightSegment_Source()
	 * @model
	 * @generated
	 */
	RouteNode getSource();

	/**
	 * Sets the value of the '{@link variant3.FlightSegment#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(RouteNode value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(RouteNode)
	 * @see variant3.Variant3Package#getFlightSegment_Target()
	 * @model
	 * @generated
	 */
	RouteNode getTarget();

	/**
	 * Sets the value of the '{@link variant3.FlightSegment#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(RouteNode value);

	/**
	 * Returns the value of the '<em><b>Environment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Environment</em>' reference.
	 * @see #setEnvironment(EnvironmentType)
	 * @see variant3.Variant3Package#getFlightSegment_Environment()
	 * @model
	 * @generated
	 */
	EnvironmentType getEnvironment();

	/**
	 * Sets the value of the '{@link variant3.FlightSegment#getEnvironment <em>Environment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Environment</em>' reference.
	 * @see #getEnvironment()
	 * @generated
	 */
	void setEnvironment(EnvironmentType value);

	/**
	 * Returns the value of the '<em><b>Wear Total</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wear Total</em>' attribute.
	 * @see #setWearTotal(double)
	 * @see variant3.Variant3Package#getFlightSegment_WearTotal()
	 * @model
	 * @generated
	 */
	double getWearTotal();

	/**
	 * Sets the value of the '{@link variant3.FlightSegment#getWearTotal <em>Wear Total</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wear Total</em>' attribute.
	 * @see #getWearTotal()
	 * @generated
	 */
	void setWearTotal(double value);

	/**
	 * Returns the value of the '<em><b>Wear Engine</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wear Engine</em>' attribute.
	 * @see #setWearEngine(double)
	 * @see variant3.Variant3Package#getFlightSegment_WearEngine()
	 * @model
	 * @generated
	 */
	double getWearEngine();

	/**
	 * Sets the value of the '{@link variant3.FlightSegment#getWearEngine <em>Wear Engine</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wear Engine</em>' attribute.
	 * @see #getWearEngine()
	 * @generated
	 */
	void setWearEngine(double value);

	/**
	 * Returns the value of the '<em><b>Wear Fuselage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wear Fuselage</em>' attribute.
	 * @see #setWearFuselage(double)
	 * @see variant3.Variant3Package#getFlightSegment_WearFuselage()
	 * @model
	 * @generated
	 */
	double getWearFuselage();

	/**
	 * Sets the value of the '{@link variant3.FlightSegment#getWearFuselage <em>Wear Fuselage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wear Fuselage</em>' attribute.
	 * @see #getWearFuselage()
	 * @generated
	 */
	void setWearFuselage(double value);

	/**
	 * Returns the value of the '<em><b>Wear Landing Gear</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wear Landing Gear</em>' attribute.
	 * @see #setWearLandingGear(double)
	 * @see variant3.Variant3Package#getFlightSegment_WearLandingGear()
	 * @model
	 * @generated
	 */
	double getWearLandingGear();

	/**
	 * Sets the value of the '{@link variant3.FlightSegment#getWearLandingGear <em>Wear Landing Gear</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wear Landing Gear</em>' attribute.
	 * @see #getWearLandingGear()
	 * @generated
	 */
	void setWearLandingGear(double value);

} // FlightSegment
