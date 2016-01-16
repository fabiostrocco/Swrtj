/**
 * <copyright>
 * </copyright>
 *
 */
package org.xtext.example.swrtj;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Record Name</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.swrtj.RecordName#getRecord <em>Record</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.swrtj.SwrtjPackage#getRecordName()
 * @model
 * @generated
 */
public interface RecordName extends BaseRecord
{
  /**
   * Returns the value of the '<em><b>Record</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Record</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Record</em>' reference.
   * @see #setRecord(Record)
   * @see org.xtext.example.swrtj.SwrtjPackage#getRecordName_Record()
   * @model
   * @generated
   */
  Record getRecord();

  /**
   * Sets the value of the '{@link org.xtext.example.swrtj.RecordName#getRecord <em>Record</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Record</em>' reference.
   * @see #getRecord()
   * @generated
   */
  void setRecord(Record value);

} // RecordName
