/**
 * <copyright>
 * </copyright>
 *
 */
package org.xtext.example.swrtj;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Record Rename</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.swrtj.RecordRename#getOriginalField <em>Original Field</em>}</li>
 *   <li>{@link org.xtext.example.swrtj.RecordRename#getNewField <em>New Field</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.swrtj.SwrtjPackage#getRecordRename()
 * @model
 * @generated
 */
public interface RecordRename extends RecordOperation
{
  /**
   * Returns the value of the '<em><b>Original Field</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Original Field</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Original Field</em>' reference.
   * @see #setOriginalField(FieldName)
   * @see org.xtext.example.swrtj.SwrtjPackage#getRecordRename_OriginalField()
   * @model
   * @generated
   */
  FieldName getOriginalField();

  /**
   * Sets the value of the '{@link org.xtext.example.swrtj.RecordRename#getOriginalField <em>Original Field</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Original Field</em>' reference.
   * @see #getOriginalField()
   * @generated
   */
  void setOriginalField(FieldName value);

  /**
   * Returns the value of the '<em><b>New Field</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>New Field</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>New Field</em>' containment reference.
   * @see #setNewField(FieldName)
   * @see org.xtext.example.swrtj.SwrtjPackage#getRecordRename_NewField()
   * @model containment="true"
   * @generated
   */
  FieldName getNewField();

  /**
   * Sets the value of the '{@link org.xtext.example.swrtj.RecordRename#getNewField <em>New Field</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>New Field</em>' containment reference.
   * @see #getNewField()
   * @generated
   */
  void setNewField(FieldName value);

} // RecordRename
