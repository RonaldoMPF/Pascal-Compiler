/**
 * generated by Xtext 2.16.0-SNAPSHOT
 */
package org.xtext.example.mydsl.pascal.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.mydsl.pascal.PascalPackage;
import org.xtext.example.mydsl.pascal.constantChr;
import org.xtext.example.mydsl.pascal.unsignedInteger;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>constant Chr</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.pascal.impl.constantChrImpl#getUnsignedInteger <em>Unsigned Integer</em>}</li>
 * </ul>
 *
 * @generated
 */
public class constantChrImpl extends MinimalEObjectImpl.Container implements constantChr
{
  /**
   * The cached value of the '{@link #getUnsignedInteger() <em>Unsigned Integer</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUnsignedInteger()
   * @generated
   * @ordered
   */
  protected unsignedInteger unsignedInteger;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected constantChrImpl()
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
    return PascalPackage.Literals.CONSTANT_CHR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public unsignedInteger getUnsignedInteger()
  {
    return unsignedInteger;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetUnsignedInteger(unsignedInteger newUnsignedInteger, NotificationChain msgs)
  {
    unsignedInteger oldUnsignedInteger = unsignedInteger;
    unsignedInteger = newUnsignedInteger;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PascalPackage.CONSTANT_CHR__UNSIGNED_INTEGER, oldUnsignedInteger, newUnsignedInteger);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setUnsignedInteger(unsignedInteger newUnsignedInteger)
  {
    if (newUnsignedInteger != unsignedInteger)
    {
      NotificationChain msgs = null;
      if (unsignedInteger != null)
        msgs = ((InternalEObject)unsignedInteger).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PascalPackage.CONSTANT_CHR__UNSIGNED_INTEGER, null, msgs);
      if (newUnsignedInteger != null)
        msgs = ((InternalEObject)newUnsignedInteger).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PascalPackage.CONSTANT_CHR__UNSIGNED_INTEGER, null, msgs);
      msgs = basicSetUnsignedInteger(newUnsignedInteger, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PascalPackage.CONSTANT_CHR__UNSIGNED_INTEGER, newUnsignedInteger, newUnsignedInteger));
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
      case PascalPackage.CONSTANT_CHR__UNSIGNED_INTEGER:
        return basicSetUnsignedInteger(null, msgs);
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
      case PascalPackage.CONSTANT_CHR__UNSIGNED_INTEGER:
        return getUnsignedInteger();
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
      case PascalPackage.CONSTANT_CHR__UNSIGNED_INTEGER:
        setUnsignedInteger((unsignedInteger)newValue);
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
      case PascalPackage.CONSTANT_CHR__UNSIGNED_INTEGER:
        setUnsignedInteger((unsignedInteger)null);
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
      case PascalPackage.CONSTANT_CHR__UNSIGNED_INTEGER:
        return unsignedInteger != null;
    }
    return super.eIsSet(featureID);
  }

} //constantChrImpl