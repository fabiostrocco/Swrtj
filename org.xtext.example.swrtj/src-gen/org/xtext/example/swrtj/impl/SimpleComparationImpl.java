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

import org.xtext.example.swrtj.CompareOperator;
import org.xtext.example.swrtj.GenericExpression;
import org.xtext.example.swrtj.SimpleComparation;
import org.xtext.example.swrtj.SwrtjPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Simple Comparation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.swrtj.impl.SimpleComparationImpl#getLeftExpression <em>Left Expression</em>}</li>
 *   <li>{@link org.xtext.example.swrtj.impl.SimpleComparationImpl#getCompare <em>Compare</em>}</li>
 *   <li>{@link org.xtext.example.swrtj.impl.SimpleComparationImpl#getRightExpression <em>Right Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SimpleComparationImpl extends AtomicBooleanExpressionImpl implements SimpleComparation
{
  /**
   * The cached value of the '{@link #getLeftExpression() <em>Left Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLeftExpression()
   * @generated
   * @ordered
   */
  protected GenericExpression leftExpression;

  /**
   * The cached value of the '{@link #getCompare() <em>Compare</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCompare()
   * @generated
   * @ordered
   */
  protected CompareOperator compare;

  /**
   * The cached value of the '{@link #getRightExpression() <em>Right Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRightExpression()
   * @generated
   * @ordered
   */
  protected GenericExpression rightExpression;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SimpleComparationImpl()
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
    return SwrtjPackage.Literals.SIMPLE_COMPARATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GenericExpression getLeftExpression()
  {
    return leftExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLeftExpression(GenericExpression newLeftExpression, NotificationChain msgs)
  {
    GenericExpression oldLeftExpression = leftExpression;
    leftExpression = newLeftExpression;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SwrtjPackage.SIMPLE_COMPARATION__LEFT_EXPRESSION, oldLeftExpression, newLeftExpression);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLeftExpression(GenericExpression newLeftExpression)
  {
    if (newLeftExpression != leftExpression)
    {
      NotificationChain msgs = null;
      if (leftExpression != null)
        msgs = ((InternalEObject)leftExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SwrtjPackage.SIMPLE_COMPARATION__LEFT_EXPRESSION, null, msgs);
      if (newLeftExpression != null)
        msgs = ((InternalEObject)newLeftExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SwrtjPackage.SIMPLE_COMPARATION__LEFT_EXPRESSION, null, msgs);
      msgs = basicSetLeftExpression(newLeftExpression, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SwrtjPackage.SIMPLE_COMPARATION__LEFT_EXPRESSION, newLeftExpression, newLeftExpression));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CompareOperator getCompare()
  {
    return compare;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCompare(CompareOperator newCompare, NotificationChain msgs)
  {
    CompareOperator oldCompare = compare;
    compare = newCompare;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SwrtjPackage.SIMPLE_COMPARATION__COMPARE, oldCompare, newCompare);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCompare(CompareOperator newCompare)
  {
    if (newCompare != compare)
    {
      NotificationChain msgs = null;
      if (compare != null)
        msgs = ((InternalEObject)compare).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SwrtjPackage.SIMPLE_COMPARATION__COMPARE, null, msgs);
      if (newCompare != null)
        msgs = ((InternalEObject)newCompare).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SwrtjPackage.SIMPLE_COMPARATION__COMPARE, null, msgs);
      msgs = basicSetCompare(newCompare, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SwrtjPackage.SIMPLE_COMPARATION__COMPARE, newCompare, newCompare));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GenericExpression getRightExpression()
  {
    return rightExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRightExpression(GenericExpression newRightExpression, NotificationChain msgs)
  {
    GenericExpression oldRightExpression = rightExpression;
    rightExpression = newRightExpression;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SwrtjPackage.SIMPLE_COMPARATION__RIGHT_EXPRESSION, oldRightExpression, newRightExpression);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRightExpression(GenericExpression newRightExpression)
  {
    if (newRightExpression != rightExpression)
    {
      NotificationChain msgs = null;
      if (rightExpression != null)
        msgs = ((InternalEObject)rightExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SwrtjPackage.SIMPLE_COMPARATION__RIGHT_EXPRESSION, null, msgs);
      if (newRightExpression != null)
        msgs = ((InternalEObject)newRightExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SwrtjPackage.SIMPLE_COMPARATION__RIGHT_EXPRESSION, null, msgs);
      msgs = basicSetRightExpression(newRightExpression, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SwrtjPackage.SIMPLE_COMPARATION__RIGHT_EXPRESSION, newRightExpression, newRightExpression));
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
      case SwrtjPackage.SIMPLE_COMPARATION__LEFT_EXPRESSION:
        return basicSetLeftExpression(null, msgs);
      case SwrtjPackage.SIMPLE_COMPARATION__COMPARE:
        return basicSetCompare(null, msgs);
      case SwrtjPackage.SIMPLE_COMPARATION__RIGHT_EXPRESSION:
        return basicSetRightExpression(null, msgs);
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
      case SwrtjPackage.SIMPLE_COMPARATION__LEFT_EXPRESSION:
        return getLeftExpression();
      case SwrtjPackage.SIMPLE_COMPARATION__COMPARE:
        return getCompare();
      case SwrtjPackage.SIMPLE_COMPARATION__RIGHT_EXPRESSION:
        return getRightExpression();
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
      case SwrtjPackage.SIMPLE_COMPARATION__LEFT_EXPRESSION:
        setLeftExpression((GenericExpression)newValue);
        return;
      case SwrtjPackage.SIMPLE_COMPARATION__COMPARE:
        setCompare((CompareOperator)newValue);
        return;
      case SwrtjPackage.SIMPLE_COMPARATION__RIGHT_EXPRESSION:
        setRightExpression((GenericExpression)newValue);
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
      case SwrtjPackage.SIMPLE_COMPARATION__LEFT_EXPRESSION:
        setLeftExpression((GenericExpression)null);
        return;
      case SwrtjPackage.SIMPLE_COMPARATION__COMPARE:
        setCompare((CompareOperator)null);
        return;
      case SwrtjPackage.SIMPLE_COMPARATION__RIGHT_EXPRESSION:
        setRightExpression((GenericExpression)null);
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
      case SwrtjPackage.SIMPLE_COMPARATION__LEFT_EXPRESSION:
        return leftExpression != null;
      case SwrtjPackage.SIMPLE_COMPARATION__COMPARE:
        return compare != null;
      case SwrtjPackage.SIMPLE_COMPARATION__RIGHT_EXPRESSION:
        return rightExpression != null;
    }
    return super.eIsSet(featureID);
  }

} //SimpleComparationImpl
