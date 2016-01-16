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

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.example.swrtj.BaseTrait;
import org.xtext.example.swrtj.SwrtjPackage;
import org.xtext.example.swrtj.TraitOperation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Base Trait</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.swrtj.impl.BaseTraitImpl#getOperationList <em>Operation List</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BaseTraitImpl extends MinimalEObjectImpl.Container implements BaseTrait
{
  /**
   * The cached value of the '{@link #getOperationList() <em>Operation List</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOperationList()
   * @generated
   * @ordered
   */
  protected EList<TraitOperation> operationList;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BaseTraitImpl()
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
    return SwrtjPackage.Literals.BASE_TRAIT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<TraitOperation> getOperationList()
  {
    if (operationList == null)
    {
      operationList = new EObjectContainmentEList<TraitOperation>(TraitOperation.class, this, SwrtjPackage.BASE_TRAIT__OPERATION_LIST);
    }
    return operationList;
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
      case SwrtjPackage.BASE_TRAIT__OPERATION_LIST:
        return ((InternalEList<?>)getOperationList()).basicRemove(otherEnd, msgs);
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
      case SwrtjPackage.BASE_TRAIT__OPERATION_LIST:
        return getOperationList();
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
      case SwrtjPackage.BASE_TRAIT__OPERATION_LIST:
        getOperationList().clear();
        getOperationList().addAll((Collection<? extends TraitOperation>)newValue);
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
      case SwrtjPackage.BASE_TRAIT__OPERATION_LIST:
        getOperationList().clear();
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
      case SwrtjPackage.BASE_TRAIT__OPERATION_LIST:
        return operationList != null && !operationList.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //BaseTraitImpl
