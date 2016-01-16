/**
 * <copyright>
 * </copyright>
 *
 */
package org.xtext.example.swrtj;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Anonimous Trait</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.swrtj.AnonimousTrait#getDefinitionList <em>Definition List</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.swrtj.SwrtjPackage#getAnonimousTrait()
 * @model
 * @generated
 */
public interface AnonimousTrait extends BaseTrait
{
  /**
   * Returns the value of the '<em><b>Definition List</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.swrtj.TraitElement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Definition List</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Definition List</em>' containment reference list.
   * @see org.xtext.example.swrtj.SwrtjPackage#getAnonimousTrait_DefinitionList()
   * @model containment="true"
   * @generated
   */
  EList<TraitElement> getDefinitionList();

} // AnonimousTrait
