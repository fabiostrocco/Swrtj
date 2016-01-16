/**
 * <copyright>
 * </copyright>
 *
 */
package org.xtext.example.swrtj;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Anonimous Record</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.swrtj.AnonimousRecord#getDeclarationList <em>Declaration List</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.swrtj.SwrtjPackage#getAnonimousRecord()
 * @model
 * @generated
 */
public interface AnonimousRecord extends BaseRecord
{
  /**
   * Returns the value of the '<em><b>Declaration List</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.swrtj.Field}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Declaration List</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Declaration List</em>' containment reference list.
   * @see org.xtext.example.swrtj.SwrtjPackage#getAnonimousRecord_DeclarationList()
   * @model containment="true"
   * @generated
   */
  EList<Field> getDeclarationList();

} // AnonimousRecord
