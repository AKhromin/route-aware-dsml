/**
 */
package variant3;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Flight Route</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link variant3.FlightRoute#getId <em>Id</em>}</li>
 *   <li>{@link variant3.FlightRoute#getSegments <em>Segments</em>}</li>
 * </ul>
 *
 * @see variant3.Variant3Package#getFlightRoute()
 * @model
 * @generated
 */
public interface FlightRoute extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see variant3.Variant3Package#getFlightRoute_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link variant3.FlightRoute#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Segments</b></em>' containment reference list.
	 * The list contents are of type {@link variant3.FlightSegment}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Segments</em>' containment reference list.
	 * @see variant3.Variant3Package#getFlightRoute_Segments()
	 * @model containment="true"
	 * @generated
	 */
	EList<FlightSegment> getSegments();

} // FlightRoute
