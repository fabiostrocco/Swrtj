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
 * A representation of the model object '<em><b>File</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.swrtj.File#getImportList <em>Import List</em>}</li>
 *   <li>{@link org.xtext.example.swrtj.File#getElementList <em>Element List</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.swrtj.SwrtjPackage#getFile()
 * @model
 * @generated
 */
public interface File extends EObject
{
  /**
   * Returns the value of the '<em><b>Import List</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.swrtj.Import}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Import List</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Import List</em>' containment reference list.
   * @see org.xtext.example.swrtj.SwrtjPackage#getFile_ImportList()
   * @model containment="true"
   * @generated
   */
  EList<Import> getImportList();

  /**
   * Returns the value of the '<em><b>Element List</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.swrtj.Element}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Element List</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Element List</em>' containment reference list.
   * @see org.xtext.example.swrtj.SwrtjPackage#getFile_ElementList()
   * @model containment="true"
   * @generated
   */
  EList<Element> getElementList();

} // File
