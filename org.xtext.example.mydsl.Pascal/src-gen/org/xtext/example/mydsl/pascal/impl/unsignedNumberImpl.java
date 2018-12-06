/**
 * generated by Xtext 2.15.0
 */
package org.xtext.example.mydsl.pascal.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.mydsl.pascal.PascalPackage;
import org.xtext.example.mydsl.pascal.unsignedInteger;
import org.xtext.example.mydsl.pascal.unsignedNumber;
import org.xtext.example.mydsl.pascal.unsignedReal;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>unsigned Number</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.pascal.impl.unsignedNumberImpl#getUnsignedInteger <em>Unsigned Integer</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.pascal.impl.unsignedNumberImpl#getUnsignedReal <em>Unsigned Real</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class unsignedNumberImpl extends MinimalEObjectImpl.Container implements unsignedNumber
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
   * The cached value of the '{@link #getUnsignedReal() <em>Unsigned Real</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUnsignedReal()
   * @generated
   * @ordered
   */
  protected unsignedReal unsignedReal;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected unsignedNumberImpl()
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
    return PascalPackage.Literals.UNSIGNED_NUMBER;
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PascalPackage.UNSIGNED_NUMBER__UNSIGNED_INTEGER, oldUnsignedInteger, newUnsignedInteger);
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
        msgs = ((InternalEObject)unsignedInteger).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PascalPackage.UNSIGNED_NUMBER__UNSIGNED_INTEGER, null, msgs);
      if (newUnsignedInteger != null)
        msgs = ((InternalEObject)newUnsignedInteger).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PascalPackage.UNSIGNED_NUMBER__UNSIGNED_INTEGER, null, msgs);
      msgs = basicSetUnsignedInteger(newUnsignedInteger, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PascalPackage.UNSIGNED_NUMBER__UNSIGNED_INTEGER, newUnsignedInteger, newUnsignedInteger));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public unsignedReal getUnsignedReal()
  {
    return unsignedReal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetUnsignedReal(unsignedReal newUnsignedReal, NotificationChain msgs)
  {
    unsignedReal oldUnsignedReal = unsignedReal;
    unsignedReal = newUnsignedReal;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PascalPackage.UNSIGNED_NUMBER__UNSIGNED_REAL, oldUnsignedReal, newUnsignedReal);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setUnsignedReal(unsignedReal newUnsignedReal)
  {
    if (newUnsignedReal != unsignedReal)
    {
      NotificationChain msgs = null;
      if (unsignedReal != null)
        msgs = ((InternalEObject)unsignedReal).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PascalPackage.UNSIGNED_NUMBER__UNSIGNED_REAL, null, msgs);
      if (newUnsignedReal != null)
        msgs = ((InternalEObject)newUnsignedReal).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PascalPackage.UNSIGNED_NUMBER__UNSIGNED_REAL, null, msgs);
      msgs = basicSetUnsignedReal(newUnsignedReal, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PascalPackage.UNSIGNED_NUMBER__UNSIGNED_REAL, newUnsignedReal, newUnsignedReal));
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
      case PascalPackage.UNSIGNED_NUMBER__UNSIGNED_INTEGER:
        return basicSetUnsignedInteger(null, msgs);
      case PascalPackage.UNSIGNED_NUMBER__UNSIGNED_REAL:
        return basicSetUnsignedReal(null, msgs);
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
      case PascalPackage.UNSIGNED_NUMBER__UNSIGNED_INTEGER:
        return getUnsignedInteger();
      case PascalPackage.UNSIGNED_NUMBER__UNSIGNED_REAL:
        return getUnsignedReal();
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
      case PascalPackage.UNSIGNED_NUMBER__UNSIGNED_INTEGER:
        setUnsignedInteger((unsignedInteger)newValue);
        return;
      case PascalPackage.UNSIGNED_NUMBER__UNSIGNED_REAL:
        setUnsignedReal((unsignedReal)newValue);
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
      case PascalPackage.UNSIGNED_NUMBER__UNSIGNED_INTEGER:
        setUnsignedInteger((unsignedInteger)null);
        return;
      case PascalPackage.UNSIGNED_NUMBER__UNSIGNED_REAL:
        setUnsignedReal((unsignedReal)null);
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
      case PascalPackage.UNSIGNED_NUMBER__UNSIGNED_INTEGER:
        return unsignedInteger != null;
      case PascalPackage.UNSIGNED_NUMBER__UNSIGNED_REAL:
        return unsignedReal != null;
    }
    return super.eIsSet(featureID);
  }

} //unsignedNumberImpl
