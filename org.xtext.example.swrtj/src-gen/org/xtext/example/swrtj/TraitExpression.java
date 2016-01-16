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
 * A representation of the model object '<em><b>Trait Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.swrtj.TraitExpression#getTraitList <em>Trait List</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.swrtj.SwrtjPackage#getTraitExpression()
 * @model
 * @generated
 */
public interface TraitExpression extends EObject
{
  /**
   * Returns the value of the '<em><b>Trait List</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.swrtj.BaseTrait}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Trait List</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Trait List</em>' containment reference list.
   * @see org.xtext.example.swrtj.SwrtjPackage#getTraitExpression_TraitList()
   * @model containment="true"
   * @generated
   */
  EList<BaseTrait> getTraitList();

} // TraitExpression
