/**
 * <copyright>
 * </copyright>
 *
 */
package org.xtext.example.swrtj;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interface</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.swrtj.Interface#getExtendsList <em>Extends List</em>}</li>
 *   <li>{@link org.xtext.example.swrtj.Interface#getRequiredMethodList <em>Required Method List</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.swrtj.SwrtjPackage#getInterface()
 * @model
 * @generated
 */
public interface Interface extends Element
{
  /**
   * Returns the value of the '<em><b>Extends List</b></em>' reference list.
   * The list contents are of type {@link org.xtext.example.swrtj.Interface}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Extends List</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Extends List</em>' reference list.
   * @see org.xtext.example.swrtj.SwrtjPackage#getInterface_ExtendsList()
   * @model
   * @generated
   */
  EList<Interface> getExtendsList();

  /**
   * Returns the value of the '<em><b>Required Method List</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.swrtj.Method}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Required Method List</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Required Method List</em>' containment reference list.
   * @see org.xtext.example.swrtj.SwrtjPackage#getInterface_RequiredMethodList()
   * @model containment="true"
   * @generated
   */
  EList<Method> getRequiredMethodList();

} // Interface
