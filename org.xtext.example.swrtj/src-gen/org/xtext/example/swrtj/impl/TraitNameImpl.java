/**
 * <copyright>
 * </copyright>
 *
 */
package org.xtext.example.swrtj.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.example.swrtj.SwrtjPackage;
import org.xtext.example.swrtj.Trait;
import org.xtext.example.swrtj.TraitName;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Trait Name</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.swrtj.impl.TraitNameImpl#getTrait <em>Trait</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TraitNameImpl extends BaseTraitImpl implements TraitName
{
  /**
   * The cached value of the '{@link #getTrait() <em>Trait</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTrait()
   * @generated
   * @ordered
   */
  protected Trait trait;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TraitNameImpl()
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
    return SwrtjPackage.Literals.TRAIT_NAME;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Trait getTrait()
  {
    if (trait != null && trait.eIsProxy())
    {
      InternalEObject oldTrait = (InternalEObject)trait;
      trait = (Trait)eResolveProxy(oldTrait);
      if (trait != oldTrait)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, SwrtjPackage.TRAIT_NAME__TRAIT, oldTrait, trait));
      }
    }
    return trait;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Trait basicGetTrait()
  {
    return trait;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTrait(Trait newTrait)
  {
    Trait oldTrait = trait;
    trait = newTrait;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SwrtjPackage.TRAIT_NAME__TRAIT, oldTrait, trait));
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
      case SwrtjPackage.TRAIT_NAME__TRAIT:
        if (resolve) return getTrait();
        return basicGetTrait();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case SwrtjPackage.TRAIT_NAME__TRAIT:
        setTrait((Trait)newValue);
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
      case SwrtjPackage.TRAIT_NAME__TRAIT:
        setTrait((Trait)null);
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
      case SwrtjPackage.TRAIT_NAME__TRAIT:
        return trait != null;
    }
    return super.eIsSet(featureID);
  }

} //TraitNameImpl
