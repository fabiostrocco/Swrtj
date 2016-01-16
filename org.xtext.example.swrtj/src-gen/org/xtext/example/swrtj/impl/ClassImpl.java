/**
 * <copyright>
 * </copyright>
 *
 */
package org.xtext.example.swrtj.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.example.swrtj.Constructor;
import org.xtext.example.swrtj.Interface;
import org.xtext.example.swrtj.RecordExpression;
import org.xtext.example.swrtj.SwrtjPackage;
import org.xtext.example.swrtj.TraitExpression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.swrtj.impl.ClassImpl#getImplementsList <em>Implements List</em>}</li>
 *   <li>{@link org.xtext.example.swrtj.impl.ClassImpl#getRecordExpression <em>Record Expression</em>}</li>
 *   <li>{@link org.xtext.example.swrtj.impl.ClassImpl#getTraitExpression <em>Trait Expression</em>}</li>
 *   <li>{@link org.xtext.example.swrtj.impl.ClassImpl#getConstructorList <em>Constructor List</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ClassImpl extends ElementImpl implements org.xtext.example.swrtj.Class
{
  /**
   * The cached value of the '{@link #getImplementsList() <em>Implements List</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImplementsList()
   * @generated
   * @ordered
   */
  protected EList<Interface> implementsList;

  /**
   * The cached value of the '{@link #getRecordExpression() <em>Record Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRecordExpression()
   * @generated
   * @ordered
   */
  protected RecordExpression recordExpression;

  /**
   * The cached value of the '{@link #getTraitExpression() <em>Trait Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTraitExpression()
   * @generated
   * @ordered
   */
  protected TraitExpression traitExpression;

  /**
   * The cached value of the '{@link #getConstructorList() <em>Constructor List</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConstructorList()
   * @generated
   * @ordered
   */
  protected EList<Constructor> constructorList;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ClassImpl()
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
    return SwrtjPackage.Literals.CLASS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Interface> getImplementsList()
  {
    if (implementsList == null)
    {
      implementsList = new EObjectResolvingEList<Interface>(Interface.class, this, SwrtjPackage.CLASS__IMPLEMENTS_LIST);
    }
    return implementsList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RecordExpression getRecordExpression()
  {
    return recordExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRecordExpression(RecordExpression newRecordExpression, NotificationChain msgs)
  {
    RecordExpression oldRecordExpression = recordExpression;
    recordExpression = newRecordExpression;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SwrtjPackage.CLASS__RECORD_EXPRESSION, oldRecordExpression, newRecordExpression);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRecordExpression(RecordExpression newRecordExpression)
  {
    if (newRecordExpression != recordExpression)
    {
      NotificationChain msgs = null;
      if (recordExpression != null)
        msgs = ((InternalEObject)recordExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SwrtjPackage.CLASS__RECORD_EXPRESSION, null, msgs);
      if (newRecordExpression != null)
        msgs = ((InternalEObject)newRecordExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SwrtjPackage.CLASS__RECORD_EXPRESSION, null, msgs);
      msgs = basicSetRecordExpression(newRecordExpression, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SwrtjPackage.CLASS__RECORD_EXPRESSION, newRecordExpression, newRecordExpression));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TraitExpression getTraitExpression()
  {
    return traitExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTraitExpression(TraitExpression newTraitExpression, NotificationChain msgs)
  {
    TraitExpression oldTraitExpression = traitExpression;
    traitExpression = newTraitExpression;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SwrtjPackage.CLASS__TRAIT_EXPRESSION, oldTraitExpression, newTraitExpression);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTraitExpression(TraitExpression newTraitExpression)
  {
    if (newTraitExpression != traitExpression)
    {
      NotificationChain msgs = null;
      if (traitExpression != null)
        msgs = ((InternalEObject)traitExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SwrtjPackage.CLASS__TRAIT_EXPRESSION, null, msgs);
      if (newTraitExpression != null)
        msgs = ((InternalEObject)newTraitExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SwrtjPackage.CLASS__TRAIT_EXPRESSION, null, msgs);
      msgs = basicSetTraitExpression(newTraitExpression, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SwrtjPackage.CLASS__TRAIT_EXPRESSION, newTraitExpression, newTraitExpression));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Constructor> getConstructorList()
  {
    if (constructorList == null)
    {
      constructorList = new EObjectContainmentEList<Constructor>(Constructor.class, this, SwrtjPackage.CLASS__CONSTRUCTOR_LIST);
    }
    return constructorList;
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
      case SwrtjPackage.CLASS__RECORD_EXPRESSION:
        return basicSetRecordExpression(null, msgs);
      case SwrtjPackage.CLASS__TRAIT_EXPRESSION:
        return basicSetTraitExpression(null, msgs);
      case SwrtjPackage.CLASS__CONSTRUCTOR_LIST:
        return ((InternalEList<?>)getConstructorList()).basicRemove(otherEnd, msgs);
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
      case SwrtjPackage.CLASS__IMPLEMENTS_LIST:
        return getImplementsList();
      case SwrtjPackage.CLASS__RECORD_EXPRESSION:
        return getRecordExpression();
      case SwrtjPackage.CLASS__TRAIT_EXPRESSION:
        return getTraitExpression();
      case SwrtjPackage.CLASS__CONSTRUCTOR_LIST:
        return getConstructorList();
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
      case SwrtjPackage.CLASS__IMPLEMENTS_LIST:
        getImplementsList().clear();
        getImplementsList().addAll((Collection<? extends Interface>)newValue);
        return;
      case SwrtjPackage.CLASS__RECORD_EXPRESSION:
        setRecordExpression((RecordExpression)newValue);
        return;
      case SwrtjPackage.CLASS__TRAIT_EXPRESSION:
        setTraitExpression((TraitExpression)newValue);
        return;
      case SwrtjPackage.CLASS__CONSTRUCTOR_LIST:
        getConstructorList().clear();
        getConstructorList().addAll((Collection<? extends Constructor>)newValue);
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
      case SwrtjPackage.CLASS__IMPLEMENTS_LIST:
        getImplementsList().clear();
        return;
      case SwrtjPackage.CLASS__RECORD_EXPRESSION:
        setRecordExpression((RecordExpression)null);
        return;
      case SwrtjPackage.CLASS__TRAIT_EXPRESSION:
        setTraitExpression((TraitExpression)null);
        return;
      case SwrtjPackage.CLASS__CONSTRUCTOR_LIST:
        getConstructorList().clear();
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
      case SwrtjPackage.CLASS__IMPLEMENTS_LIST:
        return implementsList != null && !implementsList.isEmpty();
      case SwrtjPackage.CLASS__RECORD_EXPRESSION:
        return recordExpression != null;
      case SwrtjPackage.CLASS__TRAIT_EXPRESSION:
        return traitExpression != null;
      case SwrtjPackage.CLASS__CONSTRUCTOR_LIST:
        return constructorList != null && !constructorList.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ClassImpl
