/**
 * <copyright>
 * </copyright>
 *
 */
package org.xtext.example.swrtj;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.swrtj.Type#getInterfaceType <em>Interface Type</em>}</li>
 *   <li>{@link org.xtext.example.swrtj.Type#getPrimitiveType <em>Primitive Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.swrtj.SwrtjPackage#getType()
 * @model
 * @generated
 */
public interface Type extends EObject
{
  /**
   * Returns the value of the '<em><b>Interface Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Interface Type</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Interface Type</em>' reference.
   * @see #setInterfaceType(Interface)
   * @see org.xtext.example.swrtj.SwrtjPackage#getType_InterfaceType()
   * @model
   * @generated
   */
  Interface getInterfaceType();

  /**
   * Sets the value of the '{@link org.xtext.example.swrtj.Type#getInterfaceType <em>Interface Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Interface Type</em>' reference.
   * @see #getInterfaceType()
   * @generated
   */
  void setInterfaceType(Interface value);

  /**
   * Returns the value of the '<em><b>Primitive Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Primitive Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Primitive Type</em>' attribute.
   * @see #setPrimitiveType(String)
   * @see org.xtext.example.swrtj.SwrtjPackage#getType_PrimitiveType()
   * @model
   * @generated
   */
  String getPrimitiveType();

  /**
   * Sets the value of the '{@link org.xtext.example.swrtj.Type#getPrimitiveType <em>Primitive Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Primitive Type</em>' attribute.
   * @see #getPrimitiveType()
   * @generated
   */
  void setPrimitiveType(String value);

} // Type
