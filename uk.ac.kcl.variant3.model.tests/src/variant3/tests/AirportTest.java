/**
 */
package variant3.tests;

import junit.textui.TestRunner;

import variant3.Airport;
import variant3.Variant3Factory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Airport</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class AirportTest extends RouteNodeTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(AirportTest.class);
	}

	/**
	 * Constructs a new Airport test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AirportTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Airport test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Airport getFixture() {
		return (Airport)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(Variant3Factory.eINSTANCE.createAirport());
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

} //AirportTest
