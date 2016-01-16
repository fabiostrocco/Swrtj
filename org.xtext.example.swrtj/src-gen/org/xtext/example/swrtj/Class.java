/**
 * <copyright>
 * </copyright>
 *
 */
package org.xtext.example.swrtj;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.swrtj.Class#getImplementsList <em>Implements List</em>}</li>
 *   <li>{@link org.xtext.example.swrtj.Class#getRecordExpression <em>Record Expression</em>}</li>
 *   <li>{@link org.xtext.example.swrtj.Class#getTraitExpression <em>Trait Expression</em>}</li>
 *   <li>{@link org.xtext.example.swrtj.Class#getConstructorList <em>Constructor List</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.swrtj.SwrtjPackage#getClass_()
 * @model
 * @generated
 */
public interface Class extends Element
{
  /**
   * Returns the value of the '<em><b>Implements List</b></em>' reference list.
   * The list contents are of type {@link org.xtext.example.swrtj.Interface}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Implements List</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Implements List</em>' reference list.
   * @see org.xtext.example.swrtj.SwrtjPackage#getClass_ImplementsList()
   * @model
   * @generated
   */
  EList<Interface> getImplementsList();

  /**
   * Returns the value of the '<em><b>Record Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Record Expression</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Record Expression</em>' containment reference.
   * @see #setRecordExpression(RecordExpression)
   * @see org.xtext.example.swrtj.SwrtjPackage#getClass_RecordExpression()
   * @model containment="true"
   * @generated
   */
  RecordExpression getRecordExpression();

  /**
   * Sets the value of the '{@link org.xtext.example.swrtj.Class#getRecordExpression <em>Record Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Record Expression</em>' containment reference.
   * @see #getRecordExpression()
   * @generated
   */
  void setRecordExpression(RecordExpression value);

  /**
   * Returns the value of the '<em><b>Trait Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Trait Expression</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Trait Expression</em>' containment reference.
   * @see #setTraitExpression(TraitExpression)
   * @see org.xtext.example.swrtj.SwrtjPackage#getClass_TraitExpression()
   * @model containment="true"
   * @generated
   */
  TraitExpression getTraitExpression();

  /**
   * Sets the value of the '{@link org.xtext.example.swrtj.Class#getTraitExpression <em>Trait Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Trait Expression</em>' containment reference.
   * @see #getTraitExpression()
   * @generated
   */
  void setTraitExpression(TraitExpression value);

  /**
   * Returns the value of the '<em><b>Constructor List</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.swrtj.Constructor}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Constructor List</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Constructor List</em>' containment reference list.
   * @see org.xtext.example.swrtj.SwrtjPackage#getClass_ConstructorList()
   * @model containment="true"
   * @generated
   */
  EList<Constructor> getConstructorList();

} // Class
