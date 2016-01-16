/**
 * <copyright>
 * </copyright>
 *
 */
package org.xtext.example.swrtj;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>While Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.swrtj.WhileStatement#getCondiction <em>Condiction</em>}</li>
 *   <li>{@link org.xtext.example.swrtj.WhileStatement#getWhileBlock <em>While Block</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.swrtj.SwrtjPackage#getWhileStatement()
 * @model
 * @generated
 */
public interface WhileStatement extends Statement
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
   * @see org.xtext.example.swrtj.SwrtjPackage#getWhileStatement_Condiction()
   * @model containment="true"
   * @generated
   */
  GenericExpression getCondiction();

  /**
   * Sets the value of the '{@link org.xtext.example.swrtj.WhileStatement#getCondiction <em>Condiction</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Condiction</em>' containment reference.
   * @see #getCondiction()
   * @generated
   */
  void setCondiction(GenericExpression value);

  /**
   * Returns the value of the '<em><b>While Block</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>While Block</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>While Block</em>' containment reference.
   * @see #setWhileBlock(Block)
   * @see org.xtext.example.swrtj.SwrtjPackage#getWhileStatement_WhileBlock()
   * @model containment="true"
   * @generated
   */
  Block getWhileBlock();

  /**
   * Sets the value of the '{@link org.xtext.example.swrtj.WhileStatement#getWhileBlock <em>While Block</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>While Block</em>' containment reference.
   * @see #getWhileBlock()
   * @generated
   */
  void setWhileBlock(Block value);

} // WhileStatement
