/**
 * <copyright>
 * </copyright>
 *
 */
package org.xtext.example.swrtj;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Method Invocation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.swrtj.MethodInvocation#getMethod <em>Method</em>}</li>
 *   <li>{@link org.xtext.example.swrtj.MethodInvocation#getArgumentList <em>Argument List</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.swrtj.SwrtjPackage#getMethodInvocation()
 * @model
 * @generated
 */
public interface MethodInvocation extends Message
{
  /**
   * Returns the value of the '<em><b>Method</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Method</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Method</em>' reference.
   * @see #setMethod(MethodName)
   * @see org.xtext.example.swrtj.SwrtjPackage#getMethodInvocation_Method()
   * @model
   * @generated
   */
  MethodName getMethod();

  /**
   * Sets the value of the '{@link org.xtext.example.swrtj.MethodInvocation#getMethod <em>Method</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Method</em>' reference.
   * @see #getMethod()
   * @generated
   */
  void setMethod(MethodName value);

  /**
   * Returns the value of the '<em><b>Argument List</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.swrtj.GenericExpression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Argument List</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Argument List</em>' containment reference list.
   * @see org.xtext.example.swrtj.SwrtjPackage#getMethodInvocation_ArgumentList()
   * @model containment="true"
   * @generated
   */
  EList<GenericExpression> getArgumentList();

} // MethodInvocation
