/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ProjectWizard;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Project Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see ProjectWizard.ProjectWizardPackage#getProjectType()
 * @model
 * @generated
 */
public enum ProjectType implements Enumerator {
	/**
	 * The '<em><b>Bank Account</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BANK_ACCOUNT_VALUE
	 * @generated
	 * @ordered
	 */
	BANK_ACCOUNT(0, "BankAccount", "BankAccount"),

	/**
	 * The '<em><b>Java Streams Refactoring</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #JAVA_STREAMS_REFACTORING_VALUE
	 * @generated
	 * @ordered
	 */
	JAVA_STREAMS_REFACTORING(1, "JavaStreamsRefactoring", "JavaStreamsRefactoring"),

	/**
	 * The '<em><b>Expressions</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXPRESSIONS_VALUE
	 * @generated
	 * @ordered
	 */
	EXPRESSIONS(2, "Expressions", "Expressions");

	/**
	 * The '<em><b>Bank Account</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Bank Account</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BANK_ACCOUNT
	 * @model name="BankAccount"
	 * @generated
	 * @ordered
	 */
	public static final int BANK_ACCOUNT_VALUE = 0;

	/**
	 * The '<em><b>Java Streams Refactoring</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Java Streams Refactoring</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #JAVA_STREAMS_REFACTORING
	 * @model name="JavaStreamsRefactoring"
	 * @generated
	 * @ordered
	 */
	public static final int JAVA_STREAMS_REFACTORING_VALUE = 1;

	/**
	 * The '<em><b>Expressions</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Expressions</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EXPRESSIONS
	 * @model name="Expressions"
	 * @generated
	 * @ordered
	 */
	public static final int EXPRESSIONS_VALUE = 2;

	/**
	 * An array of all the '<em><b>Project Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ProjectType[] VALUES_ARRAY =
		new ProjectType[] {
			BANK_ACCOUNT,
			JAVA_STREAMS_REFACTORING,
			EXPRESSIONS,
		};

	/**
	 * A public read-only list of all the '<em><b>Project Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ProjectType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Project Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ProjectType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ProjectType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Project Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ProjectType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ProjectType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Project Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ProjectType get(int value) {
		switch (value) {
			case BANK_ACCOUNT_VALUE: return BANK_ACCOUNT;
			case JAVA_STREAMS_REFACTORING_VALUE: return JAVA_STREAMS_REFACTORING;
			case EXPRESSIONS_VALUE: return EXPRESSIONS;
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
	private ProjectType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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
	
} //ProjectType
