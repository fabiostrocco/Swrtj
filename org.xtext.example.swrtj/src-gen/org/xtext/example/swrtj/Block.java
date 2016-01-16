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
 * A representation of the model object '<em><b>Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.swrtj.Block#getParameterList <em>Parameter List</em>}</li>
 *   <li>{@link org.xtext.example.swrtj.Block#getStatementList <em>Statement List</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.swrtj.SwrtjPackage#getBlock()
 * @model
 * @generated
 */
public interface Block extends EObject
{
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
   * @see org.xtext.example.swrtj.SwrtjPackage#getBlock_ParameterList()
   * @model containment="true"
   * @generated
   */
  EList<Parameter> getParameterList();

  /**
   * Returns the value of the '<em><b>Statement List</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.swrtj.Statement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Statement List</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Statement List</em>' containment reference list.
   * @see org.xtext.example.swrtj.SwrtjPackage#getBlock_StatementList()
   * @model containment="true"
   * @generated
   */
  EList<Statement> getStatementList();

} // Block
