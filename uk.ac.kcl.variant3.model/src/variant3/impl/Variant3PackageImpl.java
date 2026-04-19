/**
 */
package variant3.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import variant3.Airport;
import variant3.ComponentCategory;
import variant3.EnvironmentType;
import variant3.FlightModel;
import variant3.FlightRoute;
import variant3.FlightSegment;
import variant3.RouteNode;
import variant3.Variant3Factory;
import variant3.Variant3Package;
import variant3.Waypoint;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Variant3PackageImpl extends EPackageImpl implements Variant3Package {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass flightModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass airportEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass environmentTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass flightRouteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass flightSegmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass routeNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass waypointEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum componentCategoryEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see variant3.Variant3Package#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Variant3PackageImpl() {
		super(eNS_URI, Variant3Factory.eINSTANCE);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link Variant3Package#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Variant3Package init() {
		if (isInited) return (Variant3Package)EPackage.Registry.INSTANCE.getEPackage(Variant3Package.eNS_URI);

		// Obtain or create and register package
		Object registeredVariant3Package = EPackage.Registry.INSTANCE.get(eNS_URI);
		Variant3PackageImpl theVariant3Package = registeredVariant3Package instanceof Variant3PackageImpl ? (Variant3PackageImpl)registeredVariant3Package : new Variant3PackageImpl();

		isInited = true;

		// Create package meta-data objects
		theVariant3Package.createPackageContents();

		// Initialize created meta-data
		theVariant3Package.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theVariant3Package.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Variant3Package.eNS_URI, theVariant3Package);
		return theVariant3Package;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFlightModel() {
		return flightModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFlightModel_Airports() {
		return (EReference)flightModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFlightModel_Routes() {
		return (EReference)flightModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFlightModel_Library() {
		return (EReference)flightModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFlightModel_Waypoints() {
		return (EReference)flightModelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAirport() {
		return airportEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAirport_Code() {
		return (EAttribute)airportEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEnvironmentType() {
		return environmentTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEnvironmentType_Name() {
		return (EAttribute)environmentTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEnvironmentType_ErosionIndex() {
		return (EAttribute)environmentTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEnvironmentType_SalinityLevel() {
		return (EAttribute)environmentTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEnvironmentType_AmbientTemp() {
		return (EAttribute)environmentTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFlightRoute() {
		return flightRouteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFlightRoute_Id() {
		return (EAttribute)flightRouteEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFlightRoute_Segments() {
		return (EReference)flightRouteEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFlightSegment() {
		return flightSegmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFlightSegment_Distance() {
		return (EAttribute)flightSegmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFlightSegment_Source() {
		return (EReference)flightSegmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFlightSegment_Target() {
		return (EReference)flightSegmentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFlightSegment_Environment() {
		return (EReference)flightSegmentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFlightSegment_WearTotal() {
		return (EAttribute)flightSegmentEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFlightSegment_WearEngine() {
		return (EAttribute)flightSegmentEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFlightSegment_WearFuselage() {
		return (EAttribute)flightSegmentEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFlightSegment_WearLandingGear() {
		return (EAttribute)flightSegmentEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRouteNode() {
		return routeNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRouteNode_Environment() {
		return (EReference)routeNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRouteNode_Latitude() {
		return (EAttribute)routeNodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRouteNode_Longitude() {
		return (EAttribute)routeNodeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRouteNode_Name() {
		return (EAttribute)routeNodeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getWaypoint() {
		return waypointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getComponentCategory() {
		return componentCategoryEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Variant3Factory getVariant3Factory() {
		return (Variant3Factory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		flightModelEClass = createEClass(FLIGHT_MODEL);
		createEReference(flightModelEClass, FLIGHT_MODEL__AIRPORTS);
		createEReference(flightModelEClass, FLIGHT_MODEL__ROUTES);
		createEReference(flightModelEClass, FLIGHT_MODEL__LIBRARY);
		createEReference(flightModelEClass, FLIGHT_MODEL__WAYPOINTS);

		airportEClass = createEClass(AIRPORT);
		createEAttribute(airportEClass, AIRPORT__CODE);

		environmentTypeEClass = createEClass(ENVIRONMENT_TYPE);
		createEAttribute(environmentTypeEClass, ENVIRONMENT_TYPE__NAME);
		createEAttribute(environmentTypeEClass, ENVIRONMENT_TYPE__EROSION_INDEX);
		createEAttribute(environmentTypeEClass, ENVIRONMENT_TYPE__SALINITY_LEVEL);
		createEAttribute(environmentTypeEClass, ENVIRONMENT_TYPE__AMBIENT_TEMP);

		flightRouteEClass = createEClass(FLIGHT_ROUTE);
		createEAttribute(flightRouteEClass, FLIGHT_ROUTE__ID);
		createEReference(flightRouteEClass, FLIGHT_ROUTE__SEGMENTS);

		flightSegmentEClass = createEClass(FLIGHT_SEGMENT);
		createEAttribute(flightSegmentEClass, FLIGHT_SEGMENT__DISTANCE);
		createEReference(flightSegmentEClass, FLIGHT_SEGMENT__SOURCE);
		createEReference(flightSegmentEClass, FLIGHT_SEGMENT__TARGET);
		createEReference(flightSegmentEClass, FLIGHT_SEGMENT__ENVIRONMENT);
		createEAttribute(flightSegmentEClass, FLIGHT_SEGMENT__WEAR_TOTAL);
		createEAttribute(flightSegmentEClass, FLIGHT_SEGMENT__WEAR_ENGINE);
		createEAttribute(flightSegmentEClass, FLIGHT_SEGMENT__WEAR_FUSELAGE);
		createEAttribute(flightSegmentEClass, FLIGHT_SEGMENT__WEAR_LANDING_GEAR);

		routeNodeEClass = createEClass(ROUTE_NODE);
		createEReference(routeNodeEClass, ROUTE_NODE__ENVIRONMENT);
		createEAttribute(routeNodeEClass, ROUTE_NODE__LATITUDE);
		createEAttribute(routeNodeEClass, ROUTE_NODE__LONGITUDE);
		createEAttribute(routeNodeEClass, ROUTE_NODE__NAME);

		waypointEClass = createEClass(WAYPOINT);

		// Create enums
		componentCategoryEEnum = createEEnum(COMPONENT_CATEGORY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		airportEClass.getESuperTypes().add(this.getRouteNode());
		waypointEClass.getESuperTypes().add(this.getRouteNode());

		// Initialize classes, features, and operations; add parameters
		initEClass(flightModelEClass, FlightModel.class, "FlightModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFlightModel_Airports(), this.getAirport(), null, "airports", null, 0, -1, FlightModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFlightModel_Routes(), this.getFlightRoute(), null, "routes", null, 0, -1, FlightModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFlightModel_Library(), this.getEnvironmentType(), null, "library", null, 0, -1, FlightModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFlightModel_Waypoints(), this.getWaypoint(), null, "waypoints", null, 0, -1, FlightModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(airportEClass, Airport.class, "Airport", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAirport_Code(), ecorePackage.getEString(), "code", null, 0, 1, Airport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(environmentTypeEClass, EnvironmentType.class, "EnvironmentType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEnvironmentType_Name(), ecorePackage.getEString(), "name", null, 0, 1, EnvironmentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEnvironmentType_ErosionIndex(), ecorePackage.getEDouble(), "erosionIndex", null, 0, 1, EnvironmentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEnvironmentType_SalinityLevel(), ecorePackage.getEDouble(), "salinityLevel", null, 0, 1, EnvironmentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEnvironmentType_AmbientTemp(), ecorePackage.getEDouble(), "ambientTemp", null, 0, 1, EnvironmentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(flightRouteEClass, FlightRoute.class, "FlightRoute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFlightRoute_Id(), ecorePackage.getEString(), "id", null, 0, 1, FlightRoute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFlightRoute_Segments(), this.getFlightSegment(), null, "segments", null, 0, -1, FlightRoute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(flightSegmentEClass, FlightSegment.class, "FlightSegment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFlightSegment_Distance(), ecorePackage.getEDouble(), "distance", null, 0, 1, FlightSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFlightSegment_Source(), this.getRouteNode(), null, "source", null, 0, 1, FlightSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFlightSegment_Target(), this.getRouteNode(), null, "target", null, 0, 1, FlightSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFlightSegment_Environment(), this.getEnvironmentType(), null, "environment", null, 0, 1, FlightSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFlightSegment_WearTotal(), ecorePackage.getEDouble(), "wearTotal", null, 0, 1, FlightSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFlightSegment_WearEngine(), ecorePackage.getEDouble(), "wearEngine", null, 0, 1, FlightSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFlightSegment_WearFuselage(), ecorePackage.getEDouble(), "wearFuselage", null, 0, 1, FlightSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFlightSegment_WearLandingGear(), ecorePackage.getEDouble(), "wearLandingGear", null, 0, 1, FlightSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(routeNodeEClass, RouteNode.class, "RouteNode", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRouteNode_Environment(), this.getEnvironmentType(), null, "environment", null, 0, 1, RouteNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRouteNode_Latitude(), ecorePackage.getEDouble(), "latitude", null, 0, 1, RouteNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRouteNode_Longitude(), ecorePackage.getEDouble(), "longitude", null, 0, 1, RouteNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRouteNode_Name(), ecorePackage.getEString(), "name", null, 0, 1, RouteNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(waypointEClass, Waypoint.class, "Waypoint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(componentCategoryEEnum, ComponentCategory.class, "ComponentCategory");
		addEEnumLiteral(componentCategoryEEnum, ComponentCategory.ENGINE);
		addEEnumLiteral(componentCategoryEEnum, ComponentCategory.FUSELAGE);
		addEEnumLiteral(componentCategoryEEnum, ComponentCategory.LANDING_GEAR);

		// Create resource
		createResource(eNS_URI);
	}

} //Variant3PackageImpl
