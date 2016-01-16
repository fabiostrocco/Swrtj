/**
 * <copyright>
 * </copyright>
 *
 */
package org.xtext.example.swrtj;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.swrtj.Expression#getSign <em>Sign</em>}</li>
 *   <li>{@link org.xtext.example.swrtj.Expression#getTermList <em>Term List</em>}</li>
 *   <li>{@link org.xtext.example.swrtj.Expression#getOperatorList <em>Operator List</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.swrtj.SwrtjPackage#getExpression()
 * @model
 * @generated
 */
public interface Expression extends GenericExpression
{
  /**
   * Returns the value of the '<em><b>Sign</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sign</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sign</em>' attribute.
   * @see #setSign(String)
   * @see org.xtext.example.swrtj.SwrtjPackage#getExpression_Sign()
   * @model
   * @generated
   */
  String getSign();

  /**
   * Sets the value of the '{@link org.xtext.example.swrtj.Expression#getSign <em>Sign</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Sign</em>' attribute.
   * @see #getSign()
   * @generated
   */
  void setSign(String value);

  /**
   * Returns the value of the '<em><b>Term List</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.swrtj.DottedExpression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Term List</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Term List</em>' containment reference list.
   * @see org.xtext.example.swrtj.SwrtjPackage#getExpression_TermList()
   * @model containment="true"
   * @generated
   */
  EList<DottedExpression> getTermList();

  /**
   * Returns the value of the '<em><b>Operator List</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Operator List</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Operator List</em>' attribute list.
   * @see org.xtext.example.swrtj.SwrtjPackage#getExpression_OperatorList()
   * @model unique="false"
   * @generated
   */
  EList<String> getOperatorList();

} // Expression
