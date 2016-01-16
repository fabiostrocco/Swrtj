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
import org.xtext.example.swrtj.TraitExpression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Trait Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.swrtj.impl.TraitExpressionImpl#getTraitList <em>Trait List</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TraitExpressionImpl extends MinimalEObjectImpl.Container implements TraitExpression
{
  /**
   * The cached value of the '{@link #getTraitList() <em>Trait List</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTraitList()
   * @generated
   * @ordered
   */
  protected EList<BaseTrait> traitList;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TraitExpressionImpl()
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
    return SwrtjPackage.Literals.TRAIT_EXPRESSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<BaseTrait> getTraitList()
  {
    if (traitList == null)
    {
      traitList = new EObjectContainmentEList<BaseTrait>(BaseTrait.class, this, SwrtjPackage.TRAIT_EXPRESSION__TRAIT_LIST);
    }
    return traitList;
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
      case SwrtjPackage.TRAIT_EXPRESSION__TRAIT_LIST:
        return ((InternalEList<?>)getTraitList()).basicRemove(otherEnd, msgs);
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
      case SwrtjPackage.TRAIT_EXPRESSION__TRAIT_LIST:
        return getTraitList();
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
      case SwrtjPackage.TRAIT_EXPRESSION__TRAIT_LIST:
        getTraitList().clear();
        getTraitList().addAll((Collection<? extends BaseTrait>)newValue);
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
      case SwrtjPackage.TRAIT_EXPRESSION__TRAIT_LIST:
        getTraitList().clear();
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
      case SwrtjPackage.TRAIT_EXPRESSION__TRAIT_LIST:
        return traitList != null && !traitList.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //TraitExpressionImpl
