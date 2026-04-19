/**
 */
package variant3.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import variant3.FlightModel;
import variant3.Variant3Factory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Flight Model</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class FlightModelTest extends TestCase {

	/**
	 * The fixture for this Flight Model test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FlightModel fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(FlightModelTest.class);
	}

	/**
	 * Constructs a new Flight Model test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlightModelTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Flight Model test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(FlightModel fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Flight Model test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FlightModel getFixture() {
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
		setFixture(Variant3Factory.eINSTANCE.createFlightModel());
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

} //FlightModelTest
