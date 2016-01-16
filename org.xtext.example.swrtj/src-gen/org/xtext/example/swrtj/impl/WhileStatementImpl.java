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

import org.xtext.example.swrtj.Block;
import org.xtext.example.swrtj.GenericExpression;
import org.xtext.example.swrtj.SwrtjPackage;
import org.xtext.example.swrtj.WhileStatement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>While Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.swrtj.impl.WhileStatementImpl#getCondiction <em>Condiction</em>}</li>
 *   <li>{@link org.xtext.example.swrtj.impl.WhileStatementImpl#getWhileBlock <em>While Block</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WhileStatementImpl extends StatementImpl implements WhileStatement
{
  /**
   * The cached value of the '{@link #getCondiction() <em>Condiction</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCondiction()
   * @generated
   * @ordered
   */
  protected GenericExpression condiction;

  /**
   * The cached value of the '{@link #getWhileBlock() <em>While Block</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWhileBlock()
   * @generated
   * @ordered
   */
  protected Block whileBlock;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected WhileStatementImpl()
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
    return SwrtjPackage.Literals.WHILE_STATEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GenericExpression getCondiction()
  {
    return condiction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCondiction(GenericExpression newCondiction, NotificationChain msgs)
  {
    GenericExpression oldCondiction = condiction;
    condiction = newCondiction;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SwrtjPackage.WHILE_STATEMENT__CONDICTION, oldCondiction, newCondiction);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCondiction(GenericExpression newCondiction)
  {
    if (newCondiction != condiction)
    {
      NotificationChain msgs = null;
      if (condiction != null)
        msgs = ((InternalEObject)condiction).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SwrtjPackage.WHILE_STATEMENT__CONDICTION, null, msgs);
      if (newCondiction != null)
        msgs = ((InternalEObject)newCondiction).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SwrtjPackage.WHILE_STATEMENT__CONDICTION, null, msgs);
      msgs = basicSetCondiction(newCondiction, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SwrtjPackage.WHILE_STATEMENT__CONDICTION, newCondiction, newCondiction));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Block getWhileBlock()
  {
    return whileBlock;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetWhileBlock(Block newWhileBlock, NotificationChain msgs)
  {
    Block oldWhileBlock = whileBlock;
    whileBlock = newWhileBlock;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SwrtjPackage.WHILE_STATEMENT__WHILE_BLOCK, oldWhileBlock, newWhileBlock);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setWhileBlock(Block newWhileBlock)
  {
    if (newWhileBlock != whileBlock)
    {
      NotificationChain msgs = null;
      if (whileBlock != null)
        msgs = ((InternalEObject)whileBlock).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SwrtjPackage.WHILE_STATEMENT__WHILE_BLOCK, null, msgs);
      if (newWhileBlock != null)
        msgs = ((InternalEObject)newWhileBlock).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SwrtjPackage.WHILE_STATEMENT__WHILE_BLOCK, null, msgs);
      msgs = basicSetWhileBlock(newWhileBlock, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SwrtjPackage.WHILE_STATEMENT__WHILE_BLOCK, newWhileBlock, newWhileBlock));
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
      case SwrtjPackage.WHILE_STATEMENT__CONDICTION:
        return basicSetCondiction(null, msgs);
      case SwrtjPackage.WHILE_STATEMENT__WHILE_BLOCK:
        return basicSetWhileBlock(null, msgs);
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
      case SwrtjPackage.WHILE_STATEMENT__CONDICTION:
        return getCondiction();
      case SwrtjPackage.WHILE_STATEMENT__WHILE_BLOCK:
        return getWhileBlock();
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
      case SwrtjPackage.WHILE_STATEMENT__CONDICTION:
        setCondiction((GenericExpression)newValue);
        return;
      case SwrtjPackage.WHILE_STATEMENT__WHILE_BLOCK:
        setWhileBlock((Block)newValue);
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
      case SwrtjPackage.WHILE_STATEMENT__CONDICTION:
        setCondiction((GenericExpression)null);
        return;
      case SwrtjPackage.WHILE_STATEMENT__WHILE_BLOCK:
        setWhileBlock((Block)null);
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
      case SwrtjPackage.WHILE_STATEMENT__CONDICTION:
        return condiction != null;
      case SwrtjPackage.WHILE_STATEMENT__WHILE_BLOCK:
        return whileBlock != null;
    }
    return super.eIsSet(featureID);
  }

} //WhileStatementImpl
