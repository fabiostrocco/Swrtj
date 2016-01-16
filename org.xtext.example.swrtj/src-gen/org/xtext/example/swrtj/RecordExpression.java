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
 * A representation of the model object '<em><b>Record Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.swrtj.RecordExpression#getRecordList <em>Record List</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.swrtj.SwrtjPackage#getRecordExpression()
 * @model
 * @generated
 */
public interface RecordExpression extends EObject
{
  /**
   * Returns the value of the '<em><b>Record List</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.swrtj.BaseRecord}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Record List</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Record List</em>' containment reference list.
   * @see org.xtext.example.swrtj.SwrtjPackage#getRecordExpression_RecordList()
   * @model containment="true"
   * @generated
   */
  EList<BaseRecord> getRecordList();

} // RecordExpression
