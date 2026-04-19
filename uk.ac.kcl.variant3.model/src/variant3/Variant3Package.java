/**
 */
package variant3;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see variant3.Variant3Factory
 * @model kind="package"
 * @generated
 */
public interface Variant3Package extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "variant3";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://uk.ac.kcl.variant3";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "variant3";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Variant3Package eINSTANCE = variant3.impl.Variant3PackageImpl.init();

	/**
	 * The meta object id for the '{@link variant3.impl.FlightModelImpl <em>Flight Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see variant3.impl.FlightModelImpl
	 * @see variant3.impl.Variant3PackageImpl#getFlightModel()
	 * @generated
	 */
	int FLIGHT_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Airports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLIGHT_MODEL__AIRPORTS = 0;

	/**
	 * The feature id for the '<em><b>Routes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLIGHT_MODEL__ROUTES = 1;

	/**
	 * The feature id for the '<em><b>Library</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLIGHT_MODEL__LIBRARY = 2;

	/**
	 * The feature id for the '<em><b>Waypoints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLIGHT_MODEL__WAYPOINTS = 3;

	/**
	 * The number of structural features of the '<em>Flight Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLIGHT_MODEL_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Flight Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLIGHT_MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link variant3.impl.RouteNodeImpl <em>Route Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see variant3.impl.RouteNodeImpl
	 * @see variant3.impl.Variant3PackageImpl#getRouteNode()
	 * @generated
	 */
	int ROUTE_NODE = 5;

	/**
	 * The feature id for the '<em><b>Environment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE_NODE__ENVIRONMENT = 0;

	/**
	 * The feature id for the '<em><b>Latitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE_NODE__LATITUDE = 1;

	/**
	 * The feature id for the '<em><b>Longitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE_NODE__LONGITUDE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE_NODE__NAME = 3;

	/**
	 * The number of structural features of the '<em>Route Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE_NODE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Route Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE_NODE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link variant3.impl.AirportImpl <em>Airport</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see variant3.impl.AirportImpl
	 * @see variant3.impl.Variant3PackageImpl#getAirport()
	 * @generated
	 */
	int AIRPORT = 1;

	/**
	 * The feature id for the '<em><b>Environment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AIRPORT__ENVIRONMENT = ROUTE_NODE__ENVIRONMENT;

	/**
	 * The feature id for the '<em><b>Latitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AIRPORT__LATITUDE = ROUTE_NODE__LATITUDE;

	/**
	 * The feature id for the '<em><b>Longitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AIRPORT__LONGITUDE = ROUTE_NODE__LONGITUDE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AIRPORT__NAME = ROUTE_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AIRPORT__CODE = ROUTE_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Airport</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AIRPORT_FEATURE_COUNT = ROUTE_NODE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Airport</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AIRPORT_OPERATION_COUNT = ROUTE_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link variant3.impl.EnvironmentTypeImpl <em>Environment Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see variant3.impl.EnvironmentTypeImpl
	 * @see variant3.impl.Variant3PackageImpl#getEnvironmentType()
	 * @generated
	 */
	int ENVIRONMENT_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_TYPE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Erosion Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_TYPE__EROSION_INDEX = 1;

	/**
	 * The feature id for the '<em><b>Salinity Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_TYPE__SALINITY_LEVEL = 2;

	/**
	 * The feature id for the '<em><b>Ambient Temp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_TYPE__AMBIENT_TEMP = 3;

	/**
	 * The number of structural features of the '<em>Environment Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Environment Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link variant3.impl.FlightRouteImpl <em>Flight Route</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see variant3.impl.FlightRouteImpl
	 * @see variant3.impl.Variant3PackageImpl#getFlightRoute()
	 * @generated
	 */
	int FLIGHT_ROUTE = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLIGHT_ROUTE__ID = 0;

	/**
	 * The feature id for the '<em><b>Segments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLIGHT_ROUTE__SEGMENTS = 1;

	/**
	 * The number of structural features of the '<em>Flight Route</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLIGHT_ROUTE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Flight Route</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLIGHT_ROUTE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link variant3.impl.FlightSegmentImpl <em>Flight Segment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see variant3.impl.FlightSegmentImpl
	 * @see variant3.impl.Variant3PackageImpl#getFlightSegment()
	 * @generated
	 */
	int FLIGHT_SEGMENT = 4;

	/**
	 * The feature id for the '<em><b>Distance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLIGHT_SEGMENT__DISTANCE = 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLIGHT_SEGMENT__SOURCE = 1;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLIGHT_SEGMENT__TARGET = 2;

	/**
	 * The feature id for the '<em><b>Environment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLIGHT_SEGMENT__ENVIRONMENT = 3;

	/**
	 * The feature id for the '<em><b>Wear Total</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLIGHT_SEGMENT__WEAR_TOTAL = 4;

	/**
	 * The feature id for the '<em><b>Wear Engine</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLIGHT_SEGMENT__WEAR_ENGINE = 5;

	/**
	 * The feature id for the '<em><b>Wear Fuselage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLIGHT_SEGMENT__WEAR_FUSELAGE = 6;

	/**
	 * The feature id for the '<em><b>Wear Landing Gear</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLIGHT_SEGMENT__WEAR_LANDING_GEAR = 7;

	/**
	 * The number of structural features of the '<em>Flight Segment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLIGHT_SEGMENT_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Flight Segment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLIGHT_SEGMENT_OPERATION_COUNT = 0;


	/**
	 * The meta object id for the '{@link variant3.impl.WaypointImpl <em>Waypoint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see variant3.impl.WaypointImpl
	 * @see variant3.impl.Variant3PackageImpl#getWaypoint()
	 * @generated
	 */
	int WAYPOINT = 6;

	/**
	 * The feature id for the '<em><b>Environment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAYPOINT__ENVIRONMENT = ROUTE_NODE__ENVIRONMENT;

	/**
	 * The feature id for the '<em><b>Latitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAYPOINT__LATITUDE = ROUTE_NODE__LATITUDE;

	/**
	 * The feature id for the '<em><b>Longitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAYPOINT__LONGITUDE = ROUTE_NODE__LONGITUDE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAYPOINT__NAME = ROUTE_NODE__NAME;

	/**
	 * The number of structural features of the '<em>Waypoint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAYPOINT_FEATURE_COUNT = ROUTE_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Waypoint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAYPOINT_OPERATION_COUNT = ROUTE_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link variant3.ComponentCategory <em>Component Category</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see variant3.ComponentCategory
	 * @see variant3.impl.Variant3PackageImpl#getComponentCategory()
	 * @generated
	 */
	int COMPONENT_CATEGORY = 7;


	/**
	 * Returns the meta object for class '{@link variant3.FlightModel <em>Flight Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Flight Model</em>'.
	 * @see variant3.FlightModel
	 * @generated
	 */
	EClass getFlightModel();

	/**
	 * Returns the meta object for the containment reference list '{@link variant3.FlightModel#getAirports <em>Airports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Airports</em>'.
	 * @see variant3.FlightModel#getAirports()
	 * @see #getFlightModel()
	 * @generated
	 */
	EReference getFlightModel_Airports();

	/**
	 * Returns the meta object for the containment reference list '{@link variant3.FlightModel#getRoutes <em>Routes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Routes</em>'.
	 * @see variant3.FlightModel#getRoutes()
	 * @see #getFlightModel()
	 * @generated
	 */
	EReference getFlightModel_Routes();

	/**
	 * Returns the meta object for the containment reference list '{@link variant3.FlightModel#getLibrary <em>Library</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Library</em>'.
	 * @see variant3.FlightModel#getLibrary()
	 * @see #getFlightModel()
	 * @generated
	 */
	EReference getFlightModel_Library();

	/**
	 * Returns the meta object for the containment reference list '{@link variant3.FlightModel#getWaypoints <em>Waypoints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Waypoints</em>'.
	 * @see variant3.FlightModel#getWaypoints()
	 * @see #getFlightModel()
	 * @generated
	 */
	EReference getFlightModel_Waypoints();

	/**
	 * Returns the meta object for class '{@link variant3.Airport <em>Airport</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Airport</em>'.
	 * @see variant3.Airport
	 * @generated
	 */
	EClass getAirport();

	/**
	 * Returns the meta object for the attribute '{@link variant3.Airport#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see variant3.Airport#getCode()
	 * @see #getAirport()
	 * @generated
	 */
	EAttribute getAirport_Code();

	/**
	 * Returns the meta object for class '{@link variant3.EnvironmentType <em>Environment Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Environment Type</em>'.
	 * @see variant3.EnvironmentType
	 * @generated
	 */
	EClass getEnvironmentType();

	/**
	 * Returns the meta object for the attribute '{@link variant3.EnvironmentType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see variant3.EnvironmentType#getName()
	 * @see #getEnvironmentType()
	 * @generated
	 */
	EAttribute getEnvironmentType_Name();

	/**
	 * Returns the meta object for the attribute '{@link variant3.EnvironmentType#getErosionIndex <em>Erosion Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Erosion Index</em>'.
	 * @see variant3.EnvironmentType#getErosionIndex()
	 * @see #getEnvironmentType()
	 * @generated
	 */
	EAttribute getEnvironmentType_ErosionIndex();

	/**
	 * Returns the meta object for the attribute '{@link variant3.EnvironmentType#getSalinityLevel <em>Salinity Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Salinity Level</em>'.
	 * @see variant3.EnvironmentType#getSalinityLevel()
	 * @see #getEnvironmentType()
	 * @generated
	 */
	EAttribute getEnvironmentType_SalinityLevel();

	/**
	 * Returns the meta object for the attribute '{@link variant3.EnvironmentType#getAmbientTemp <em>Ambient Temp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ambient Temp</em>'.
	 * @see variant3.EnvironmentType#getAmbientTemp()
	 * @see #getEnvironmentType()
	 * @generated
	 */
	EAttribute getEnvironmentType_AmbientTemp();

	/**
	 * Returns the meta object for class '{@link variant3.FlightRoute <em>Flight Route</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Flight Route</em>'.
	 * @see variant3.FlightRoute
	 * @generated
	 */
	EClass getFlightRoute();

	/**
	 * Returns the meta object for the attribute '{@link variant3.FlightRoute#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see variant3.FlightRoute#getId()
	 * @see #getFlightRoute()
	 * @generated
	 */
	EAttribute getFlightRoute_Id();

	/**
	 * Returns the meta object for the containment reference list '{@link variant3.FlightRoute#getSegments <em>Segments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Segments</em>'.
	 * @see variant3.FlightRoute#getSegments()
	 * @see #getFlightRoute()
	 * @generated
	 */
	EReference getFlightRoute_Segments();

	/**
	 * Returns the meta object for class '{@link variant3.FlightSegment <em>Flight Segment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Flight Segment</em>'.
	 * @see variant3.FlightSegment
	 * @generated
	 */
	EClass getFlightSegment();

	/**
	 * Returns the meta object for the attribute '{@link variant3.FlightSegment#getDistance <em>Distance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Distance</em>'.
	 * @see variant3.FlightSegment#getDistance()
	 * @see #getFlightSegment()
	 * @generated
	 */
	EAttribute getFlightSegment_Distance();

	/**
	 * Returns the meta object for the reference '{@link variant3.FlightSegment#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see variant3.FlightSegment#getSource()
	 * @see #getFlightSegment()
	 * @generated
	 */
	EReference getFlightSegment_Source();

	/**
	 * Returns the meta object for the reference '{@link variant3.FlightSegment#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see variant3.FlightSegment#getTarget()
	 * @see #getFlightSegment()
	 * @generated
	 */
	EReference getFlightSegment_Target();

	/**
	 * Returns the meta object for the reference '{@link variant3.FlightSegment#getEnvironment <em>Environment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Environment</em>'.
	 * @see variant3.FlightSegment#getEnvironment()
	 * @see #getFlightSegment()
	 * @generated
	 */
	EReference getFlightSegment_Environment();

	/**
	 * Returns the meta object for the attribute '{@link variant3.FlightSegment#getWearTotal <em>Wear Total</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wear Total</em>'.
	 * @see variant3.FlightSegment#getWearTotal()
	 * @see #getFlightSegment()
	 * @generated
	 */
	EAttribute getFlightSegment_WearTotal();

	/**
	 * Returns the meta object for the attribute '{@link variant3.FlightSegment#getWearEngine <em>Wear Engine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wear Engine</em>'.
	 * @see variant3.FlightSegment#getWearEngine()
	 * @see #getFlightSegment()
	 * @generated
	 */
	EAttribute getFlightSegment_WearEngine();

	/**
	 * Returns the meta object for the attribute '{@link variant3.FlightSegment#getWearFuselage <em>Wear Fuselage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wear Fuselage</em>'.
	 * @see variant3.FlightSegment#getWearFuselage()
	 * @see #getFlightSegment()
	 * @generated
	 */
	EAttribute getFlightSegment_WearFuselage();

	/**
	 * Returns the meta object for the attribute '{@link variant3.FlightSegment#getWearLandingGear <em>Wear Landing Gear</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wear Landing Gear</em>'.
	 * @see variant3.FlightSegment#getWearLandingGear()
	 * @see #getFlightSegment()
	 * @generated
	 */
	EAttribute getFlightSegment_WearLandingGear();

	/**
	 * Returns the meta object for class '{@link variant3.RouteNode <em>Route Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Route Node</em>'.
	 * @see variant3.RouteNode
	 * @generated
	 */
	EClass getRouteNode();

	/**
	 * Returns the meta object for the reference '{@link variant3.RouteNode#getEnvironment <em>Environment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Environment</em>'.
	 * @see variant3.RouteNode#getEnvironment()
	 * @see #getRouteNode()
	 * @generated
	 */
	EReference getRouteNode_Environment();

	/**
	 * Returns the meta object for the attribute '{@link variant3.RouteNode#getLatitude <em>Latitude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Latitude</em>'.
	 * @see variant3.RouteNode#getLatitude()
	 * @see #getRouteNode()
	 * @generated
	 */
	EAttribute getRouteNode_Latitude();

	/**
	 * Returns the meta object for the attribute '{@link variant3.RouteNode#getLongitude <em>Longitude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Longitude</em>'.
	 * @see variant3.RouteNode#getLongitude()
	 * @see #getRouteNode()
	 * @generated
	 */
	EAttribute getRouteNode_Longitude();

	/**
	 * Returns the meta object for the attribute '{@link variant3.RouteNode#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see variant3.RouteNode#getName()
	 * @see #getRouteNode()
	 * @generated
	 */
	EAttribute getRouteNode_Name();

	/**
	 * Returns the meta object for class '{@link variant3.Waypoint <em>Waypoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Waypoint</em>'.
	 * @see variant3.Waypoint
	 * @generated
	 */
	EClass getWaypoint();

	/**
	 * Returns the meta object for enum '{@link variant3.ComponentCategory <em>Component Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Component Category</em>'.
	 * @see variant3.ComponentCategory
	 * @generated
	 */
	EEnum getComponentCategory();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Variant3Factory getVariant3Factory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link variant3.impl.FlightModelImpl <em>Flight Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see variant3.impl.FlightModelImpl
		 * @see variant3.impl.Variant3PackageImpl#getFlightModel()
		 * @generated
		 */
		EClass FLIGHT_MODEL = eINSTANCE.getFlightModel();

		/**
		 * The meta object literal for the '<em><b>Airports</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLIGHT_MODEL__AIRPORTS = eINSTANCE.getFlightModel_Airports();

		/**
		 * The meta object literal for the '<em><b>Routes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLIGHT_MODEL__ROUTES = eINSTANCE.getFlightModel_Routes();

		/**
		 * The meta object literal for the '<em><b>Library</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLIGHT_MODEL__LIBRARY = eINSTANCE.getFlightModel_Library();

		/**
		 * The meta object literal for the '<em><b>Waypoints</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLIGHT_MODEL__WAYPOINTS = eINSTANCE.getFlightModel_Waypoints();

		/**
		 * The meta object literal for the '{@link variant3.impl.AirportImpl <em>Airport</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see variant3.impl.AirportImpl
		 * @see variant3.impl.Variant3PackageImpl#getAirport()
		 * @generated
		 */
		EClass AIRPORT = eINSTANCE.getAirport();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AIRPORT__CODE = eINSTANCE.getAirport_Code();

		/**
		 * The meta object literal for the '{@link variant3.impl.EnvironmentTypeImpl <em>Environment Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see variant3.impl.EnvironmentTypeImpl
		 * @see variant3.impl.Variant3PackageImpl#getEnvironmentType()
		 * @generated
		 */
		EClass ENVIRONMENT_TYPE = eINSTANCE.getEnvironmentType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENVIRONMENT_TYPE__NAME = eINSTANCE.getEnvironmentType_Name();

		/**
		 * The meta object literal for the '<em><b>Erosion Index</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENVIRONMENT_TYPE__EROSION_INDEX = eINSTANCE.getEnvironmentType_ErosionIndex();

		/**
		 * The meta object literal for the '<em><b>Salinity Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENVIRONMENT_TYPE__SALINITY_LEVEL = eINSTANCE.getEnvironmentType_SalinityLevel();

		/**
		 * The meta object literal for the '<em><b>Ambient Temp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENVIRONMENT_TYPE__AMBIENT_TEMP = eINSTANCE.getEnvironmentType_AmbientTemp();

		/**
		 * The meta object literal for the '{@link variant3.impl.FlightRouteImpl <em>Flight Route</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see variant3.impl.FlightRouteImpl
		 * @see variant3.impl.Variant3PackageImpl#getFlightRoute()
		 * @generated
		 */
		EClass FLIGHT_ROUTE = eINSTANCE.getFlightRoute();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLIGHT_ROUTE__ID = eINSTANCE.getFlightRoute_Id();

		/**
		 * The meta object literal for the '<em><b>Segments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLIGHT_ROUTE__SEGMENTS = eINSTANCE.getFlightRoute_Segments();

		/**
		 * The meta object literal for the '{@link variant3.impl.FlightSegmentImpl <em>Flight Segment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see variant3.impl.FlightSegmentImpl
		 * @see variant3.impl.Variant3PackageImpl#getFlightSegment()
		 * @generated
		 */
		EClass FLIGHT_SEGMENT = eINSTANCE.getFlightSegment();

		/**
		 * The meta object literal for the '<em><b>Distance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLIGHT_SEGMENT__DISTANCE = eINSTANCE.getFlightSegment_Distance();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLIGHT_SEGMENT__SOURCE = eINSTANCE.getFlightSegment_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLIGHT_SEGMENT__TARGET = eINSTANCE.getFlightSegment_Target();

		/**
		 * The meta object literal for the '<em><b>Environment</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLIGHT_SEGMENT__ENVIRONMENT = eINSTANCE.getFlightSegment_Environment();

		/**
		 * The meta object literal for the '<em><b>Wear Total</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLIGHT_SEGMENT__WEAR_TOTAL = eINSTANCE.getFlightSegment_WearTotal();

		/**
		 * The meta object literal for the '<em><b>Wear Engine</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLIGHT_SEGMENT__WEAR_ENGINE = eINSTANCE.getFlightSegment_WearEngine();

		/**
		 * The meta object literal for the '<em><b>Wear Fuselage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLIGHT_SEGMENT__WEAR_FUSELAGE = eINSTANCE.getFlightSegment_WearFuselage();

		/**
		 * The meta object literal for the '<em><b>Wear Landing Gear</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLIGHT_SEGMENT__WEAR_LANDING_GEAR = eINSTANCE.getFlightSegment_WearLandingGear();

		/**
		 * The meta object literal for the '{@link variant3.impl.RouteNodeImpl <em>Route Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see variant3.impl.RouteNodeImpl
		 * @see variant3.impl.Variant3PackageImpl#getRouteNode()
		 * @generated
		 */
		EClass ROUTE_NODE = eINSTANCE.getRouteNode();

		/**
		 * The meta object literal for the '<em><b>Environment</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROUTE_NODE__ENVIRONMENT = eINSTANCE.getRouteNode_Environment();

		/**
		 * The meta object literal for the '<em><b>Latitude</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROUTE_NODE__LATITUDE = eINSTANCE.getRouteNode_Latitude();

		/**
		 * The meta object literal for the '<em><b>Longitude</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROUTE_NODE__LONGITUDE = eINSTANCE.getRouteNode_Longitude();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROUTE_NODE__NAME = eINSTANCE.getRouteNode_Name();

		/**
		 * The meta object literal for the '{@link variant3.impl.WaypointImpl <em>Waypoint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see variant3.impl.WaypointImpl
		 * @see variant3.impl.Variant3PackageImpl#getWaypoint()
		 * @generated
		 */
		EClass WAYPOINT = eINSTANCE.getWaypoint();

		/**
		 * The meta object literal for the '{@link variant3.ComponentCategory <em>Component Category</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see variant3.ComponentCategory
		 * @see variant3.impl.Variant3PackageImpl#getComponentCategory()
		 * @generated
		 */
		EEnum COMPONENT_CATEGORY = eINSTANCE.getComponentCategory();

	}

} //Variant3Package
