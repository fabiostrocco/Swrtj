/**
 * <copyright>
 * </copyright>
 *
 */
package org.xtext.example.swrtj;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constructor Invocation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.swrtj.ConstructorInvocation#getClassRef <em>Class Ref</em>}</li>
 *   <li>{@link org.xtext.example.swrtj.ConstructorInvocation#getArgumentList <em>Argument List</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.swrtj.SwrtjPackage#getConstructorInvocation()
 * @model
 * @generated
 */
public interface ConstructorInvocation extends Start
{
  /**
   * Returns the value of the '<em><b>Class Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Class Ref</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Class Ref</em>' reference.
   * @see #setClassRef(org.xtext.example.swrtj.Class)
   * @see org.xtext.example.swrtj.SwrtjPackage#getConstructorInvocation_ClassRef()
   * @model
   * @generated
   */
  org.xtext.example.swrtj.Class getClassRef();

  /**
   * Sets the value of the '{@link org.xtext.example.swrtj.ConstructorInvocation#getClassRef <em>Class Ref</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Class Ref</em>' reference.
   * @see #getClassRef()
   * @generated
   */
  void setClassRef(org.xtext.example.swrtj.Class value);

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
   * @see org.xtext.example.swrtj.SwrtjPackage#getConstructorInvocation_ArgumentList()
   * @model containment="true"
   * @generated
   */
  EList<GenericExpression> getArgumentList();

} // ConstructorInvocation
