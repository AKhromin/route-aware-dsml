/**
 */
package variant3;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Airport</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link variant3.Airport#getCode <em>Code</em>}</li>
 * </ul>
 *
 * @see variant3.Variant3Package#getAirport()
 * @model
 * @generated
 */
public interface Airport extends RouteNode {
	/**
	 * Returns the value of the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code</em>' attribute.
	 * @see #setCode(String)
	 * @see variant3.Variant3Package#getAirport_Code()
	 * @model
	 * @generated
	 */
	String getCode();

	/**
	 * Sets the value of the '{@link variant3.Airport#getCode <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' attribute.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(String value);

} // Airport
