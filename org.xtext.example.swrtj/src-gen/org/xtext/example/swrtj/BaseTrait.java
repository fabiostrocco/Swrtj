/**
 * <copyright>
 * </copyright>
 *
 */
package org.xtext.example.swrtj;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Base Trait</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.swrtj.BaseTrait#getOperationList <em>Operation List</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.swrtj.SwrtjPackage#getBaseTrait()
 * @model
 * @generated
 */
public interface BaseTrait extends EObject
{
  /**
   * Returns the value of the '<em><b>Operation List</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.swrtj.TraitOperation}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Operation List</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Operation List</em>' containment reference list.
   * @see org.xtext.example.swrtj.SwrtjPackage#getBaseTrait_OperationList()
   * @model containment="true"
   * @generated
   */
  EList<TraitOperation> getOperationList();

} // BaseTrait
