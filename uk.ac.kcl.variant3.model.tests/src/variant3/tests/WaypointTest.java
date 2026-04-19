/**
 */
package variant3.tests;

import junit.textui.TestRunner;

import variant3.Variant3Factory;
import variant3.Waypoint;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Waypoint</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class WaypointTest extends RouteNodeTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(WaypointTest.class);
	}

	/**
	 * Constructs a new Waypoint test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WaypointTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Waypoint test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Waypoint getFixture() {
		return (Waypoint)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(Variant3Factory.eINSTANCE.createWaypoint());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //WaypointTest
