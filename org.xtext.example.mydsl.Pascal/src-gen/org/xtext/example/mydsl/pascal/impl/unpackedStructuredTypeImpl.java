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
import org.xtext.example.mydsl.pascal.recordType;
import org.xtext.example.mydsl.pascal.unpackedStructuredType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>unpacked Structured Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.pascal.impl.unpackedStructuredTypeImpl#getUnpackedStructuredType <em>Unpacked Structured Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class unpackedStructuredTypeImpl extends MinimalEObjectImpl.Container implements unpackedStructuredType
{
  /**
   * The cached value of the '{@link #getUnpackedStructuredType() <em>Unpacked Structured Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUnpackedStructuredType()
   * @generated
   * @ordered
   */
  protected recordType unpackedStructuredType;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected unpackedStructuredTypeImpl()
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
    return PascalPackage.Literals.UNPACKED_STRUCTURED_TYPE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public recordType getUnpackedStructuredType()
  {
    return unpackedStructuredType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetUnpackedStructuredType(recordType newUnpackedStructuredType, NotificationChain msgs)
  {
    recordType oldUnpackedStructuredType = unpackedStructuredType;
    unpackedStructuredType = newUnpackedStructuredType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PascalPackage.UNPACKED_STRUCTURED_TYPE__UNPACKED_STRUCTURED_TYPE, oldUnpackedStructuredType, newUnpackedStructuredType);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setUnpackedStructuredType(recordType newUnpackedStructuredType)
  {
    if (newUnpackedStructuredType != unpackedStructuredType)
    {
      NotificationChain msgs = null;
      if (unpackedStructuredType != null)
        msgs = ((InternalEObject)unpackedStructuredType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PascalPackage.UNPACKED_STRUCTURED_TYPE__UNPACKED_STRUCTURED_TYPE, null, msgs);
      if (newUnpackedStructuredType != null)
        msgs = ((InternalEObject)newUnpackedStructuredType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PascalPackage.UNPACKED_STRUCTURED_TYPE__UNPACKED_STRUCTURED_TYPE, null, msgs);
      msgs = basicSetUnpackedStructuredType(newUnpackedStructuredType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PascalPackage.UNPACKED_STRUCTURED_TYPE__UNPACKED_STRUCTURED_TYPE, newUnpackedStructuredType, newUnpackedStructuredType));
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
      case PascalPackage.UNPACKED_STRUCTURED_TYPE__UNPACKED_STRUCTURED_TYPE:
        return basicSetUnpackedStructuredType(null, msgs);
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
      case PascalPackage.UNPACKED_STRUCTURED_TYPE__UNPACKED_STRUCTURED_TYPE:
        return getUnpackedStructuredType();
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
      case PascalPackage.UNPACKED_STRUCTURED_TYPE__UNPACKED_STRUCTURED_TYPE:
        setUnpackedStructuredType((recordType)newValue);
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
      case PascalPackage.UNPACKED_STRUCTURED_TYPE__UNPACKED_STRUCTURED_TYPE:
        setUnpackedStructuredType((recordType)null);
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
      case PascalPackage.UNPACKED_STRUCTURED_TYPE__UNPACKED_STRUCTURED_TYPE:
        return unpackedStructuredType != null;
    }
    return super.eIsSet(featureID);
  }

} //unpackedStructuredTypeImpl
