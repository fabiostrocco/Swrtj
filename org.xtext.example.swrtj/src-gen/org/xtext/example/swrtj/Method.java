/**
 * <copyright>
 * </copyright>
 *
 */
package org.xtext.example.swrtj;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Method</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.swrtj.Method#getReturnType <em>Return Type</em>}</li>
 *   <li>{@link org.xtext.example.swrtj.Method#getMethodRef <em>Method Ref</em>}</li>
 *   <li>{@link org.xtext.example.swrtj.Method#getParameterList <em>Parameter List</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.swrtj.SwrtjPackage#getMethod()
 * @model
 * @generated
 */
public interface Method extends TraitElement
{
  /**
   * Returns the value of the '<em><b>Return Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Return Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Return Type</em>' containment reference.
   * @see #setReturnType(Type)
   * @see org.xtext.example.swrtj.SwrtjPackage#getMethod_ReturnType()
   * @model containment="true"
   * @generated
   */
  Type getReturnType();

  /**
   * Sets the value of the '{@link org.xtext.example.swrtj.Method#getReturnType <em>Return Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Return Type</em>' containment reference.
   * @see #getReturnType()
   * @generated
   */
  void setReturnType(Type value);

  /**
   * Returns the value of the '<em><b>Method Ref</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Method Ref</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Method Ref</em>' containment reference.
   * @see #setMethodRef(MethodName)
   * @see org.xtext.example.swrtj.SwrtjPackage#getMethod_MethodRef()
   * @model containment="true"
   * @generated
   */
  MethodName getMethodRef();

  /**
   * Sets the value of the '{@link org.xtext.example.swrtj.Method#getMethodRef <em>Method Ref</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Method Ref</em>' containment reference.
   * @see #getMethodRef()
   * @generated
   */
  void setMethodRef(MethodName value);

  /**
   * Returns the value of the '<em><b>Parameter List</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.swrtj.Parameter}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parameter List</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parameter List</em>' containment reference list.
   * @see org.xtext.example.swrtj.SwrtjPackage#getMethod_ParameterList()
   * @model containment="true"
   * @generated
   */
  EList<Parameter> getParameterList();

} // Method
