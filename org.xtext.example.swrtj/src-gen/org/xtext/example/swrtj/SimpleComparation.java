/**
 * <copyright>
 * </copyright>
 *
 */
package org.xtext.example.swrtj;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Simple Comparation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.swrtj.SimpleComparation#getLeftExpression <em>Left Expression</em>}</li>
 *   <li>{@link org.xtext.example.swrtj.SimpleComparation#getCompare <em>Compare</em>}</li>
 *   <li>{@link org.xtext.example.swrtj.SimpleComparation#getRightExpression <em>Right Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.swrtj.SwrtjPackage#getSimpleComparation()
 * @model
 * @generated
 */
public interface SimpleComparation extends AtomicBooleanExpression
{
  /**
   * Returns the value of the '<em><b>Left Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Left Expression</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Left Expression</em>' containment reference.
   * @see #setLeftExpression(GenericExpression)
   * @see org.xtext.example.swrtj.SwrtjPackage#getSimpleComparation_LeftExpression()
   * @model containment="true"
   * @generated
   */
  GenericExpression getLeftExpression();

  /**
   * Sets the value of the '{@link org.xtext.example.swrtj.SimpleComparation#getLeftExpression <em>Left Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left Expression</em>' containment reference.
   * @see #getLeftExpression()
   * @generated
   */
  void setLeftExpression(GenericExpression value);

  /**
   * Returns the value of the '<em><b>Compare</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Compare</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Compare</em>' containment reference.
   * @see #setCompare(CompareOperator)
   * @see org.xtext.example.swrtj.SwrtjPackage#getSimpleComparation_Compare()
   * @model containment="true"
   * @generated
   */
  CompareOperator getCompare();

  /**
   * Sets the value of the '{@link org.xtext.example.swrtj.SimpleComparation#getCompare <em>Compare</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Compare</em>' containment reference.
   * @see #getCompare()
   * @generated
   */
  void setCompare(CompareOperator value);

  /**
   * Returns the value of the '<em><b>Right Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Right Expression</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right Expression</em>' containment reference.
   * @see #setRightExpression(GenericExpression)
   * @see org.xtext.example.swrtj.SwrtjPackage#getSimpleComparation_RightExpression()
   * @model containment="true"
   * @generated
   */
  GenericExpression getRightExpression();

  /**
   * Sets the value of the '{@link org.xtext.example.swrtj.SimpleComparation#getRightExpression <em>Right Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right Expression</em>' containment reference.
   * @see #getRightExpression()
   * @generated
   */
  void setRightExpression(GenericExpression value);

} // SimpleComparation
