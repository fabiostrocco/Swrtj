/**
 * <copyright>
 * </copyright>
 *
 */
package org.xtext.example.swrtj;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trait Method Rename</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.swrtj.TraitMethodRename#getOriginalMethod <em>Original Method</em>}</li>
 *   <li>{@link org.xtext.example.swrtj.TraitMethodRename#getNewMethod <em>New Method</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.swrtj.SwrtjPackage#getTraitMethodRename()
 * @model
 * @generated
 */
public interface TraitMethodRename extends TraitOperation
{
  /**
   * Returns the value of the '<em><b>Original Method</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Original Method</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Original Method</em>' reference.
   * @see #setOriginalMethod(MethodName)
   * @see org.xtext.example.swrtj.SwrtjPackage#getTraitMethodRename_OriginalMethod()
   * @model
   * @generated
   */
  MethodName getOriginalMethod();

  /**
   * Sets the value of the '{@link org.xtext.example.swrtj.TraitMethodRename#getOriginalMethod <em>Original Method</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Original Method</em>' reference.
   * @see #getOriginalMethod()
   * @generated
   */
  void setOriginalMethod(MethodName value);

  /**
   * Returns the value of the '<em><b>New Method</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>New Method</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>New Method</em>' containment reference.
   * @see #setNewMethod(MethodName)
   * @see org.xtext.example.swrtj.SwrtjPackage#getTraitMethodRename_NewMethod()
   * @model containment="true"
   * @generated
   */
  MethodName getNewMethod();

  /**
   * Sets the value of the '{@link org.xtext.example.swrtj.TraitMethodRename#getNewMethod <em>New Method</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>New Method</em>' containment reference.
   * @see #getNewMethod()
   * @generated
   */
  void setNewMethod(MethodName value);

} // TraitMethodRename
