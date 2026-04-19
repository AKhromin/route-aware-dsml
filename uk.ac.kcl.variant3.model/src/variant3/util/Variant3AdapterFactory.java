/**
 */
package variant3.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import variant3.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see variant3.Variant3Package
 * @generated
 */
public class Variant3AdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Variant3Package modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variant3AdapterFactory() {
		if (modelPackage == null) {
			modelPackage = Variant3Package.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Variant3Switch<Adapter> modelSwitch =
		new Variant3Switch<Adapter>() {
			@Override
			public Adapter caseFlightModel(FlightModel object) {
				return createFlightModelAdapter();
			}
			@Override
			public Adapter caseAirport(Airport object) {
				return createAirportAdapter();
			}
			@Override
			public Adapter caseEnvironmentType(EnvironmentType object) {
				return createEnvironmentTypeAdapter();
			}
			@Override
			public Adapter caseFlightRoute(FlightRoute object) {
				return createFlightRouteAdapter();
			}
			@Override
			public Adapter caseFlightSegment(FlightSegment object) {
				return createFlightSegmentAdapter();
			}
			@Override
			public Adapter caseRouteNode(RouteNode object) {
				return createRouteNodeAdapter();
			}
			@Override
			public Adapter caseWaypoint(Waypoint object) {
				return createWaypointAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link variant3.FlightModel <em>Flight Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see variant3.FlightModel
	 * @generated
	 */
	public Adapter createFlightModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link variant3.Airport <em>Airport</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see variant3.Airport
	 * @generated
	 */
	public Adapter createAirportAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link variant3.EnvironmentType <em>Environment Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see variant3.EnvironmentType
	 * @generated
	 */
	public Adapter createEnvironmentTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link variant3.FlightRoute <em>Flight Route</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see variant3.FlightRoute
	 * @generated
	 */
	public Adapter createFlightRouteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link variant3.FlightSegment <em>Flight Segment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see variant3.FlightSegment
	 * @generated
	 */
	public Adapter createFlightSegmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link variant3.RouteNode <em>Route Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see variant3.RouteNode
	 * @generated
	 */
	public Adapter createRouteNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link variant3.Waypoint <em>Waypoint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see variant3.Waypoint
	 * @generated
	 */
	public Adapter createWaypointAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //Variant3AdapterFactory
