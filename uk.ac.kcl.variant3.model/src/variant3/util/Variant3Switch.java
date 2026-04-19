/**
 */
package variant3.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import variant3.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see variant3.Variant3Package
 * @generated
 */
public class Variant3Switch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Variant3Package modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variant3Switch() {
		if (modelPackage == null) {
			modelPackage = Variant3Package.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case Variant3Package.FLIGHT_MODEL: {
				FlightModel flightModel = (FlightModel)theEObject;
				T result = caseFlightModel(flightModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Variant3Package.AIRPORT: {
				Airport airport = (Airport)theEObject;
				T result = caseAirport(airport);
				if (result == null) result = caseRouteNode(airport);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Variant3Package.ENVIRONMENT_TYPE: {
				EnvironmentType environmentType = (EnvironmentType)theEObject;
				T result = caseEnvironmentType(environmentType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Variant3Package.FLIGHT_ROUTE: {
				FlightRoute flightRoute = (FlightRoute)theEObject;
				T result = caseFlightRoute(flightRoute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Variant3Package.FLIGHT_SEGMENT: {
				FlightSegment flightSegment = (FlightSegment)theEObject;
				T result = caseFlightSegment(flightSegment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Variant3Package.ROUTE_NODE: {
				RouteNode routeNode = (RouteNode)theEObject;
				T result = caseRouteNode(routeNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Variant3Package.WAYPOINT: {
				Waypoint waypoint = (Waypoint)theEObject;
				T result = caseWaypoint(waypoint);
				if (result == null) result = caseRouteNode(waypoint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Flight Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Flight Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFlightModel(FlightModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Airport</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Airport</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAirport(Airport object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Environment Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Environment Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnvironmentType(EnvironmentType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Flight Route</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Flight Route</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFlightRoute(FlightRoute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Flight Segment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Flight Segment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFlightSegment(FlightSegment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Route Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Route Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRouteNode(RouteNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Waypoint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Waypoint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWaypoint(Waypoint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //Variant3Switch
