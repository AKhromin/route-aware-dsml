/**
 */
package variant3.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import variant3.FlightRoute;
import variant3.Variant3Factory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Flight Route</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class FlightRouteTest extends TestCase {

	/**
	 * The fixture for this Flight Route test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FlightRoute fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(FlightRouteTest.class);
	}

	/**
	 * Constructs a new Flight Route test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlightRouteTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Flight Route test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(FlightRoute fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Flight Route test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FlightRoute getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(Variant3Factory.eINSTANCE.createFlightRoute());
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

} //FlightRouteTest
