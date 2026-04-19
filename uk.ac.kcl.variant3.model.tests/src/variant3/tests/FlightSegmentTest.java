/**
 */
package variant3.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import variant3.FlightSegment;
import variant3.Variant3Factory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Flight Segment</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class FlightSegmentTest extends TestCase {

	/**
	 * The fixture for this Flight Segment test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FlightSegment fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(FlightSegmentTest.class);
	}

	/**
	 * Constructs a new Flight Segment test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlightSegmentTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Flight Segment test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(FlightSegment fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Flight Segment test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FlightSegment getFixture() {
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
		setFixture(Variant3Factory.eINSTANCE.createFlightSegment());
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

} //FlightSegmentTest
