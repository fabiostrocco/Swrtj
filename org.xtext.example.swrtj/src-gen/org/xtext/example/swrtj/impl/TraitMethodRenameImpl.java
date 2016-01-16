/**
 * <copyright>
 * </copyright>
 *
 */
package org.xtext.example.swrtj.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.example.swrtj.MethodName;
import org.xtext.example.swrtj.SwrtjPackage;
import org.xtext.example.swrtj.TraitMethodRename;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Trait Method Rename</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.swrtj.impl.TraitMethodRenameImpl#getOriginalMethod <em>Original Method</em>}</li>
 *   <li>{@link org.xtext.example.swrtj.impl.TraitMethodRenameImpl#getNewMethod <em>New Method</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TraitMethodRenameImpl extends TraitOperationImpl implements TraitMethodRename
{
  /**
   * The cached value of the '{@link #getOriginalMethod() <em>Original Method</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOriginalMethod()
   * @generated
   * @ordered
   */
  protected MethodName originalMethod;

  /**
   * The cached value of the '{@link #getNewMethod() <em>New Method</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNewMethod()
   * @generated
   * @ordered
   */
  protected MethodName newMethod;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TraitMethodRenameImpl()
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
    return SwrtjPackage.Literals.TRAIT_METHOD_RENAME;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MethodName getOriginalMethod()
  {
    if (originalMethod != null && originalMethod.eIsProxy())
    {
      InternalEObject oldOriginalMethod = (InternalEObject)originalMethod;
      originalMethod = (MethodName)eResolveProxy(oldOriginalMethod);
      if (originalMethod != oldOriginalMethod)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, SwrtjPackage.TRAIT_METHOD_RENAME__ORIGINAL_METHOD, oldOriginalMethod, originalMethod));
      }
    }
    return originalMethod;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MethodName basicGetOriginalMethod()
  {
    return originalMethod;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOriginalMethod(MethodName newOriginalMethod)
  {
    MethodName oldOriginalMethod = originalMethod;
    originalMethod = newOriginalMethod;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SwrtjPackage.TRAIT_METHOD_RENAME__ORIGINAL_METHOD, oldOriginalMethod, originalMethod));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MethodName getNewMethod()
  {
    return newMethod;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetNewMethod(MethodName newNewMethod, NotificationChain msgs)
  {
    MethodName oldNewMethod = newMethod;
    newMethod = newNewMethod;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SwrtjPackage.TRAIT_METHOD_RENAME__NEW_METHOD, oldNewMethod, newNewMethod);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNewMethod(MethodName newNewMethod)
  {
    if (newNewMethod != newMethod)
    {
      NotificationChain msgs = null;
      if (newMethod != null)
        msgs = ((InternalEObject)newMethod).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SwrtjPackage.TRAIT_METHOD_RENAME__NEW_METHOD, null, msgs);
      if (newNewMethod != null)
        msgs = ((InternalEObject)newNewMethod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SwrtjPackage.TRAIT_METHOD_RENAME__NEW_METHOD, null, msgs);
      msgs = basicSetNewMethod(newNewMethod, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SwrtjPackage.TRAIT_METHOD_RENAME__NEW_METHOD, newNewMethod, newNewMethod));
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
      case SwrtjPackage.TRAIT_METHOD_RENAME__NEW_METHOD:
        return basicSetNewMethod(null, msgs);
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
      case SwrtjPackage.TRAIT_METHOD_RENAME__ORIGINAL_METHOD:
        if (resolve) return getOriginalMethod();
        return basicGetOriginalMethod();
      case SwrtjPackage.TRAIT_METHOD_RENAME__NEW_METHOD:
        return getNewMethod();
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
      case SwrtjPackage.TRAIT_METHOD_RENAME__ORIGINAL_METHOD:
        setOriginalMethod((MethodName)newValue);
        return;
      case SwrtjPackage.TRAIT_METHOD_RENAME__NEW_METHOD:
        setNewMethod((MethodName)newValue);
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
      case SwrtjPackage.TRAIT_METHOD_RENAME__ORIGINAL_METHOD:
        setOriginalMethod((MethodName)null);
        return;
      case SwrtjPackage.TRAIT_METHOD_RENAME__NEW_METHOD:
        setNewMethod((MethodName)null);
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
      case SwrtjPackage.TRAIT_METHOD_RENAME__ORIGINAL_METHOD:
        return originalMethod != null;
      case SwrtjPackage.TRAIT_METHOD_RENAME__NEW_METHOD:
        return newMethod != null;
    }
    return super.eIsSet(featureID);
  }

} //TraitMethodRenameImpl
