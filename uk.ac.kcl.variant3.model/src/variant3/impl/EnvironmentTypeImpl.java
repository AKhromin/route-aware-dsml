/**
 */
package variant3.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import variant3.EnvironmentType;
import variant3.Variant3Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Environment Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link variant3.impl.EnvironmentTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link variant3.impl.EnvironmentTypeImpl#getErosionIndex <em>Erosion Index</em>}</li>
 *   <li>{@link variant3.impl.EnvironmentTypeImpl#getSalinityLevel <em>Salinity Level</em>}</li>
 *   <li>{@link variant3.impl.EnvironmentTypeImpl#getAmbientTemp <em>Ambient Temp</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EnvironmentTypeImpl extends MinimalEObjectImpl.Container implements EnvironmentType {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getErosionIndex() <em>Erosion Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErosionIndex()
	 * @generated
	 * @ordered
	 */
	protected static final double EROSION_INDEX_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getErosionIndex() <em>Erosion Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErosionIndex()
	 * @generated
	 * @ordered
	 */
	protected double erosionIndex = EROSION_INDEX_EDEFAULT;

	/**
	 * The default value of the '{@link #getSalinityLevel() <em>Salinity Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSalinityLevel()
	 * @generated
	 * @ordered
	 */
	protected static final double SALINITY_LEVEL_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getSalinityLevel() <em>Salinity Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSalinityLevel()
	 * @generated
	 * @ordered
	 */
	protected double salinityLevel = SALINITY_LEVEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getAmbientTemp() <em>Ambient Temp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmbientTemp()
	 * @generated
	 * @ordered
	 */
	protected static final double AMBIENT_TEMP_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getAmbientTemp() <em>Ambient Temp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmbientTemp()
	 * @generated
	 * @ordered
	 */
	protected double ambientTemp = AMBIENT_TEMP_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnvironmentTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Variant3Package.Literals.ENVIRONMENT_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Variant3Package.ENVIRONMENT_TYPE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getErosionIndex() {
		return erosionIndex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setErosionIndex(double newErosionIndex) {
		double oldErosionIndex = erosionIndex;
		erosionIndex = newErosionIndex;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Variant3Package.ENVIRONMENT_TYPE__EROSION_INDEX, oldErosionIndex, erosionIndex));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getSalinityLevel() {
		return salinityLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSalinityLevel(double newSalinityLevel) {
		double oldSalinityLevel = salinityLevel;
		salinityLevel = newSalinityLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Variant3Package.ENVIRONMENT_TYPE__SALINITY_LEVEL, oldSalinityLevel, salinityLevel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getAmbientTemp() {
		return ambientTemp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAmbientTemp(double newAmbientTemp) {
		double oldAmbientTemp = ambientTemp;
		ambientTemp = newAmbientTemp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Variant3Package.ENVIRONMENT_TYPE__AMBIENT_TEMP, oldAmbientTemp, ambientTemp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Variant3Package.ENVIRONMENT_TYPE__NAME:
				return getName();
			case Variant3Package.ENVIRONMENT_TYPE__EROSION_INDEX:
				return getErosionIndex();
			case Variant3Package.ENVIRONMENT_TYPE__SALINITY_LEVEL:
				return getSalinityLevel();
			case Variant3Package.ENVIRONMENT_TYPE__AMBIENT_TEMP:
				return getAmbientTemp();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Variant3Package.ENVIRONMENT_TYPE__NAME:
				setName((String)newValue);
				return;
			case Variant3Package.ENVIRONMENT_TYPE__EROSION_INDEX:
				setErosionIndex((Double)newValue);
				return;
			case Variant3Package.ENVIRONMENT_TYPE__SALINITY_LEVEL:
				setSalinityLevel((Double)newValue);
				return;
			case Variant3Package.ENVIRONMENT_TYPE__AMBIENT_TEMP:
				setAmbientTemp((Double)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case Variant3Package.ENVIRONMENT_TYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case Variant3Package.ENVIRONMENT_TYPE__EROSION_INDEX:
				setErosionIndex(EROSION_INDEX_EDEFAULT);
				return;
			case Variant3Package.ENVIRONMENT_TYPE__SALINITY_LEVEL:
				setSalinityLevel(SALINITY_LEVEL_EDEFAULT);
				return;
			case Variant3Package.ENVIRONMENT_TYPE__AMBIENT_TEMP:
				setAmbientTemp(AMBIENT_TEMP_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Variant3Package.ENVIRONMENT_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case Variant3Package.ENVIRONMENT_TYPE__EROSION_INDEX:
				return erosionIndex != EROSION_INDEX_EDEFAULT;
			case Variant3Package.ENVIRONMENT_TYPE__SALINITY_LEVEL:
				return salinityLevel != SALINITY_LEVEL_EDEFAULT;
			case Variant3Package.ENVIRONMENT_TYPE__AMBIENT_TEMP:
				return ambientTemp != AMBIENT_TEMP_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", erosionIndex: ");
		result.append(erosionIndex);
		result.append(", salinityLevel: ");
		result.append(salinityLevel);
		result.append(", ambientTemp: ");
		result.append(ambientTemp);
		result.append(')');
		return result.toString();
	}

} //EnvironmentTypeImpl
