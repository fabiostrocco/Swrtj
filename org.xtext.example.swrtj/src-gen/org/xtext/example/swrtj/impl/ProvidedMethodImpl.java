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
import org.xtext.example.swrtj.ProvidedMethod;
import org.xtext.example.swrtj.ReturnStatement;
import org.xtext.example.swrtj.SwrtjPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Provided Method</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.swrtj.impl.ProvidedMethodImpl#isIsSynchronized <em>Is Synchronized</em>}</li>
 *   <li>{@link org.xtext.example.swrtj.impl.ProvidedMethodImpl#getBlock <em>Block</em>}</li>
 *   <li>{@link org.xtext.example.swrtj.impl.ProvidedMethodImpl#getReturnStatement <em>Return Statement</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProvidedMethodImpl extends MethodImpl implements ProvidedMethod
{
  /**
   * The default value of the '{@link #isIsSynchronized() <em>Is Synchronized</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsSynchronized()
   * @generated
   * @ordered
   */
  protected static final boolean IS_SYNCHRONIZED_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isIsSynchronized() <em>Is Synchronized</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsSynchronized()
   * @generated
   * @ordered
   */
  protected boolean isSynchronized = IS_SYNCHRONIZED_EDEFAULT;

  /**
   * The cached value of the '{@link #getBlock() <em>Block</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBlock()
   * @generated
   * @ordered
   */
  protected Block block;

  /**
   * The cached value of the '{@link #getReturnStatement() <em>Return Statement</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReturnStatement()
   * @generated
   * @ordered
   */
  protected ReturnStatement returnStatement;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ProvidedMethodImpl()
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
    return SwrtjPackage.Literals.PROVIDED_METHOD;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isIsSynchronized()
  {
    return isSynchronized;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIsSynchronized(boolean newIsSynchronized)
  {
    boolean oldIsSynchronized = isSynchronized;
    isSynchronized = newIsSynchronized;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SwrtjPackage.PROVIDED_METHOD__IS_SYNCHRONIZED, oldIsSynchronized, isSynchronized));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Block getBlock()
  {
    return block;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBlock(Block newBlock, NotificationChain msgs)
  {
    Block oldBlock = block;
    block = newBlock;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SwrtjPackage.PROVIDED_METHOD__BLOCK, oldBlock, newBlock);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBlock(Block newBlock)
  {
    if (newBlock != block)
    {
      NotificationChain msgs = null;
      if (block != null)
        msgs = ((InternalEObject)block).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SwrtjPackage.PROVIDED_METHOD__BLOCK, null, msgs);
      if (newBlock != null)
        msgs = ((InternalEObject)newBlock).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SwrtjPackage.PROVIDED_METHOD__BLOCK, null, msgs);
      msgs = basicSetBlock(newBlock, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SwrtjPackage.PROVIDED_METHOD__BLOCK, newBlock, newBlock));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ReturnStatement getReturnStatement()
  {
    return returnStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetReturnStatement(ReturnStatement newReturnStatement, NotificationChain msgs)
  {
    ReturnStatement oldReturnStatement = returnStatement;
    returnStatement = newReturnStatement;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SwrtjPackage.PROVIDED_METHOD__RETURN_STATEMENT, oldReturnStatement, newReturnStatement);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setReturnStatement(ReturnStatement newReturnStatement)
  {
    if (newReturnStatement != returnStatement)
    {
      NotificationChain msgs = null;
      if (returnStatement != null)
        msgs = ((InternalEObject)returnStatement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SwrtjPackage.PROVIDED_METHOD__RETURN_STATEMENT, null, msgs);
      if (newReturnStatement != null)
        msgs = ((InternalEObject)newReturnStatement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SwrtjPackage.PROVIDED_METHOD__RETURN_STATEMENT, null, msgs);
      msgs = basicSetReturnStatement(newReturnStatement, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SwrtjPackage.PROVIDED_METHOD__RETURN_STATEMENT, newReturnStatement, newReturnStatement));
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
      case SwrtjPackage.PROVIDED_METHOD__BLOCK:
        return basicSetBlock(null, msgs);
      case SwrtjPackage.PROVIDED_METHOD__RETURN_STATEMENT:
        return basicSetReturnStatement(null, msgs);
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
      case SwrtjPackage.PROVIDED_METHOD__IS_SYNCHRONIZED:
        return isIsSynchronized();
      case SwrtjPackage.PROVIDED_METHOD__BLOCK:
        return getBlock();
      case SwrtjPackage.PROVIDED_METHOD__RETURN_STATEMENT:
        return getReturnStatement();
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
      case SwrtjPackage.PROVIDED_METHOD__IS_SYNCHRONIZED:
        setIsSynchronized((Boolean)newValue);
        return;
      case SwrtjPackage.PROVIDED_METHOD__BLOCK:
        setBlock((Block)newValue);
        return;
      case SwrtjPackage.PROVIDED_METHOD__RETURN_STATEMENT:
        setReturnStatement((ReturnStatement)newValue);
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
      case SwrtjPackage.PROVIDED_METHOD__IS_SYNCHRONIZED:
        setIsSynchronized(IS_SYNCHRONIZED_EDEFAULT);
        return;
      case SwrtjPackage.PROVIDED_METHOD__BLOCK:
        setBlock((Block)null);
        return;
      case SwrtjPackage.PROVIDED_METHOD__RETURN_STATEMENT:
        setReturnStatement((ReturnStatement)null);
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
      case SwrtjPackage.PROVIDED_METHOD__IS_SYNCHRONIZED:
        return isSynchronized != IS_SYNCHRONIZED_EDEFAULT;
      case SwrtjPackage.PROVIDED_METHOD__BLOCK:
        return block != null;
      case SwrtjPackage.PROVIDED_METHOD__RETURN_STATEMENT:
        return returnStatement != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (isSynchronized: ");
    result.append(isSynchronized);
    result.append(')');
    return result.toString();
  }

} //ProvidedMethodImpl
