/**
 */
package variant3;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Environment Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link variant3.EnvironmentType#getName <em>Name</em>}</li>
 *   <li>{@link variant3.EnvironmentType#getErosionIndex <em>Erosion Index</em>}</li>
 *   <li>{@link variant3.EnvironmentType#getSalinityLevel <em>Salinity Level</em>}</li>
 *   <li>{@link variant3.EnvironmentType#getAmbientTemp <em>Ambient Temp</em>}</li>
 * </ul>
 *
 * @see variant3.Variant3Package#getEnvironmentType()
 * @model
 * @generated
 */
public interface EnvironmentType extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see variant3.Variant3Package#getEnvironmentType_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link variant3.EnvironmentType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Erosion Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Erosion Index</em>' attribute.
	 * @see #setErosionIndex(double)
	 * @see variant3.Variant3Package#getEnvironmentType_ErosionIndex()
	 * @model
	 * @generated
	 */
	double getErosionIndex();

	/**
	 * Sets the value of the '{@link variant3.EnvironmentType#getErosionIndex <em>Erosion Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Erosion Index</em>' attribute.
	 * @see #getErosionIndex()
	 * @generated
	 */
	void setErosionIndex(double value);

	/**
	 * Returns the value of the '<em><b>Salinity Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Salinity Level</em>' attribute.
	 * @see #setSalinityLevel(double)
	 * @see variant3.Variant3Package#getEnvironmentType_SalinityLevel()
	 * @model
	 * @generated
	 */
	double getSalinityLevel();

	/**
	 * Sets the value of the '{@link variant3.EnvironmentType#getSalinityLevel <em>Salinity Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Salinity Level</em>' attribute.
	 * @see #getSalinityLevel()
	 * @generated
	 */
	void setSalinityLevel(double value);

	/**
	 * Returns the value of the '<em><b>Ambient Temp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ambient Temp</em>' attribute.
	 * @see #setAmbientTemp(double)
	 * @see variant3.Variant3Package#getEnvironmentType_AmbientTemp()
	 * @model
	 * @generated
	 */
	double getAmbientTemp();

	/**
	 * Sets the value of the '{@link variant3.EnvironmentType#getAmbientTemp <em>Ambient Temp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ambient Temp</em>' attribute.
	 * @see #getAmbientTemp()
	 * @generated
	 */
	void setAmbientTemp(double value);

} // EnvironmentType
