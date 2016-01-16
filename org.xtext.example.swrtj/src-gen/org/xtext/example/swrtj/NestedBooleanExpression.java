/**
 * <copyright>
 * </copyright>
 *
 */
package org.xtext.example.swrtj;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Nested Boolean Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.swrtj.NestedBooleanExpression#getNestedExpression <em>Nested Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.swrtj.SwrtjPackage#getNestedBooleanExpression()
 * @model
 * @generated
 */
public interface NestedBooleanExpression extends AtomicBooleanExpression
{
  /**
   * Returns the value of the '<em><b>Nested Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Nested Expression</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Nested Expression</em>' containment reference.
   * @see #setNestedExpression(GenericExpression)
   * @see org.xtext.example.swrtj.SwrtjPackage#getNestedBooleanExpression_NestedExpression()
   * @model containment="true"
   * @generated
   */
  GenericExpression getNestedExpression();

  /**
   * Sets the value of the '{@link org.xtext.example.swrtj.NestedBooleanExpression#getNestedExpression <em>Nested Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Nested Expression</em>' containment reference.
   * @see #getNestedExpression()
   * @generated
   */
  void setNestedExpression(GenericExpression value);

} // NestedBooleanExpression
