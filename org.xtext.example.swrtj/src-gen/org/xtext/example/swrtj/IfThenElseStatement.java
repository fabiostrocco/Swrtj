/**
 * <copyright>
 * </copyright>
 *
 */
package org.xtext.example.swrtj;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>If Then Else Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.swrtj.IfThenElseStatement#getCondiction <em>Condiction</em>}</li>
 *   <li>{@link org.xtext.example.swrtj.IfThenElseStatement#getTrueBranch <em>True Branch</em>}</li>
 *   <li>{@link org.xtext.example.swrtj.IfThenElseStatement#getFalseBranch <em>False Branch</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.swrtj.SwrtjPackage#getIfThenElseStatement()
 * @model
 * @generated
 */
public interface IfThenElseStatement extends Statement
{
  /**
   * Returns the value of the '<em><b>Condiction</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Condiction</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Condiction</em>' containment reference.
   * @see #setCondiction(GenericExpression)
   * @see org.xtext.example.swrtj.SwrtjPackage#getIfThenElseStatement_Condiction()
   * @model containment="true"
   * @generated
   */
  GenericExpression getCondiction();

  /**
   * Sets the value of the '{@link org.xtext.example.swrtj.IfThenElseStatement#getCondiction <em>Condiction</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Condiction</em>' containment reference.
   * @see #getCondiction()
   * @generated
   */
  void setCondiction(GenericExpression value);

  /**
   * Returns the value of the '<em><b>True Branch</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>True Branch</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>True Branch</em>' containment reference.
   * @see #setTrueBranch(Block)
   * @see org.xtext.example.swrtj.SwrtjPackage#getIfThenElseStatement_TrueBranch()
   * @model containment="true"
   * @generated
   */
  Block getTrueBranch();

  /**
   * Sets the value of the '{@link org.xtext.example.swrtj.IfThenElseStatement#getTrueBranch <em>True Branch</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>True Branch</em>' containment reference.
   * @see #getTrueBranch()
   * @generated
   */
  void setTrueBranch(Block value);

  /**
   * Returns the value of the '<em><b>False Branch</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>False Branch</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>False Branch</em>' containment reference.
   * @see #setFalseBranch(Block)
   * @see org.xtext.example.swrtj.SwrtjPackage#getIfThenElseStatement_FalseBranch()
   * @model containment="true"
   * @generated
   */
  Block getFalseBranch();

  /**
   * Sets the value of the '{@link org.xtext.example.swrtj.IfThenElseStatement#getFalseBranch <em>False Branch</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>False Branch</em>' containment reference.
   * @see #getFalseBranch()
   * @generated
   */
  void setFalseBranch(Block value);

} // IfThenElseStatement
