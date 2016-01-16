/**
 * <copyright>
 * </copyright>
 *
 */
package org.xtext.example.swrtj;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Boolean Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.swrtj.BooleanExpression#getAtomicList <em>Atomic List</em>}</li>
 *   <li>{@link org.xtext.example.swrtj.BooleanExpression#getBooleanOperatorList <em>Boolean Operator List</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.swrtj.SwrtjPackage#getBooleanExpression()
 * @model
 * @generated
 */
public interface BooleanExpression extends GenericExpression
{
  /**
   * Returns the value of the '<em><b>Atomic List</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.swrtj.AtomicBooleanExpression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Atomic List</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Atomic List</em>' containment reference list.
   * @see org.xtext.example.swrtj.SwrtjPackage#getBooleanExpression_AtomicList()
   * @model containment="true"
   * @generated
   */
  EList<AtomicBooleanExpression> getAtomicList();

  /**
   * Returns the value of the '<em><b>Boolean Operator List</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.swrtj.BooleanOperator}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Boolean Operator List</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Boolean Operator List</em>' containment reference list.
   * @see org.xtext.example.swrtj.SwrtjPackage#getBooleanExpression_BooleanOperatorList()
   * @model containment="true"
   * @generated
   */
  EList<BooleanOperator> getBooleanOperatorList();

} // BooleanExpression
