/**
 */
package variant3;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Component Category</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see variant3.Variant3Package#getComponentCategory()
 * @model
 * @generated
 */
public enum ComponentCategory implements Enumerator {
	/**
	 * The '<em><b>ENGINE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENGINE_VALUE
	 * @generated
	 * @ordered
	 */
	ENGINE(0, "ENGINE", "ENGINE"),

	/**
	 * The '<em><b>FUSELAGE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FUSELAGE_VALUE
	 * @generated
	 * @ordered
	 */
	FUSELAGE(1, "FUSELAGE", "FUSELAGE"),

	/**
	 * The '<em><b>LANDING GEAR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LANDING_GEAR_VALUE
	 * @generated
	 * @ordered
	 */
	LANDING_GEAR(2, "LANDING_GEAR", "LANDING_GEAR");

	/**
	 * The '<em><b>ENGINE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENGINE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ENGINE_VALUE = 0;

	/**
	 * The '<em><b>FUSELAGE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FUSELAGE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int FUSELAGE_VALUE = 1;

	/**
	 * The '<em><b>LANDING GEAR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LANDING_GEAR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LANDING_GEAR_VALUE = 2;

	/**
	 * An array of all the '<em><b>Component Category</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ComponentCategory[] VALUES_ARRAY =
		new ComponentCategory[] {
			ENGINE,
			FUSELAGE,
			LANDING_GEAR,
		};

	/**
	 * A public read-only list of all the '<em><b>Component Category</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ComponentCategory> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Component Category</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ComponentCategory get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ComponentCategory result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Component Category</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ComponentCategory getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ComponentCategory result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Component Category</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ComponentCategory get(int value) {
		switch (value) {
			case ENGINE_VALUE: return ENGINE;
			case FUSELAGE_VALUE: return FUSELAGE;
			case LANDING_GEAR_VALUE: return LANDING_GEAR;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private ComponentCategory(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
	  return value;
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
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //ComponentCategory
