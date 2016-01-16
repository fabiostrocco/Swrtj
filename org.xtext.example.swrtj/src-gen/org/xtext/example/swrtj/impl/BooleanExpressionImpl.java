/**
 * <copyright>
 * </copyright>
 *
 */
package org.xtext.example.swrtj.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.example.swrtj.AtomicBooleanExpression;
import org.xtext.example.swrtj.BooleanExpression;
import org.xtext.example.swrtj.BooleanOperator;
import org.xtext.example.swrtj.SwrtjPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Boolean Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.swrtj.impl.BooleanExpressionImpl#getAtomicList <em>Atomic List</em>}</li>
 *   <li>{@link org.xtext.example.swrtj.impl.BooleanExpressionImpl#getBooleanOperatorList <em>Boolean Operator List</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BooleanExpressionImpl extends GenericExpressionImpl implements BooleanExpression
{
  /**
   * The cached value of the '{@link #getAtomicList() <em>Atomic List</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAtomicList()
   * @generated
   * @ordered
   */
  protected EList<AtomicBooleanExpression> atomicList;

  /**
   * The cached value of the '{@link #getBooleanOperatorList() <em>Boolean Operator List</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBooleanOperatorList()
   * @generated
   * @ordered
   */
  protected EList<BooleanOperator> booleanOperatorList;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BooleanExpressionImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return SwrtjPackage.Literals.BOOLEAN_EXPRESSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<AtomicBooleanExpression> getAtomicList()
  {
    if (atomicList == null)
    {
      atomicList = new EObjectContainmentEList<AtomicBooleanExpression>(AtomicBooleanExpression.class, this, SwrtjPackage.BOOLEAN_EXPRESSION__ATOMIC_LIST);
    }
    return atomicList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<BooleanOperator> getBooleanOperatorList()
  {
    if (booleanOperatorList == null)
    {
      booleanOperatorList = new EObjectContainmentEList<BooleanOperator>(BooleanOperator.class, this, SwrtjPackage.BOOLEAN_EXPRESSION__BOOLEAN_OPERATOR_LIST);
    }
    return booleanOperatorList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case SwrtjPackage.BOOLEAN_EXPRESSION__ATOMIC_LIST:
        return ((InternalEList<?>)getAtomicList()).basicRemove(otherEnd, msgs);
      case SwrtjPackage.BOOLEAN_EXPRESSION__BOOLEAN_OPERATOR_LIST:
        return ((InternalEList<?>)getBooleanOperatorList()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case SwrtjPackage.BOOLEAN_EXPRESSION__ATOMIC_LIST:
        return getAtomicList();
      case SwrtjPackage.BOOLEAN_EXPRESSION__BOOLEAN_OPERATOR_LIST:
        return getBooleanOperatorList();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case SwrtjPackage.BOOLEAN_EXPRESSION__ATOMIC_LIST:
        getAtomicList().clear();
        getAtomicList().addAll((Collection<? extends AtomicBooleanExpression>)newValue);
        return;
      case SwrtjPackage.BOOLEAN_EXPRESSION__BOOLEAN_OPERATOR_LIST:
        getBooleanOperatorList().clear();
        getBooleanOperatorList().addAll((Collection<? extends BooleanOperator>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case SwrtjPackage.BOOLEAN_EXPRESSION__ATOMIC_LIST:
        getAtomicList().clear();
        return;
      case SwrtjPackage.BOOLEAN_EXPRESSION__BOOLEAN_OPERATOR_LIST:
        getBooleanOperatorList().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case SwrtjPackage.BOOLEAN_EXPRESSION__ATOMIC_LIST:
        return atomicList != null && !atomicList.isEmpty();
      case SwrtjPackage.BOOLEAN_EXPRESSION__BOOLEAN_OPERATOR_LIST:
        return booleanOperatorList != null && !booleanOperatorList.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //BooleanExpressionImpl
