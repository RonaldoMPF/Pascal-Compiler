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
import org.xtext.example.mydsl.pascal.resultType;
import org.xtext.example.mydsl.pascal.typeIdentifier;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>result Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.pascal.impl.resultTypeImpl#getTypeIdentifier <em>Type Identifier</em>}</li>
 * </ul>
 *
 * @generated
 */
public class resultTypeImpl extends MinimalEObjectImpl.Container implements resultType
{
  /**
   * The cached value of the '{@link #getTypeIdentifier() <em>Type Identifier</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTypeIdentifier()
   * @generated
   * @ordered
   */
  protected typeIdentifier typeIdentifier;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected resultTypeImpl()
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
    return PascalPackage.Literals.RESULT_TYPE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public typeIdentifier getTypeIdentifier()
  {
    return typeIdentifier;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTypeIdentifier(typeIdentifier newTypeIdentifier, NotificationChain msgs)
  {
    typeIdentifier oldTypeIdentifier = typeIdentifier;
    typeIdentifier = newTypeIdentifier;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PascalPackage.RESULT_TYPE__TYPE_IDENTIFIER, oldTypeIdentifier, newTypeIdentifier);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTypeIdentifier(typeIdentifier newTypeIdentifier)
  {
    if (newTypeIdentifier != typeIdentifier)
    {
      NotificationChain msgs = null;
      if (typeIdentifier != null)
        msgs = ((InternalEObject)typeIdentifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PascalPackage.RESULT_TYPE__TYPE_IDENTIFIER, null, msgs);
      if (newTypeIdentifier != null)
        msgs = ((InternalEObject)newTypeIdentifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PascalPackage.RESULT_TYPE__TYPE_IDENTIFIER, null, msgs);
      msgs = basicSetTypeIdentifier(newTypeIdentifier, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PascalPackage.RESULT_TYPE__TYPE_IDENTIFIER, newTypeIdentifier, newTypeIdentifier));
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
      case PascalPackage.RESULT_TYPE__TYPE_IDENTIFIER:
        return basicSetTypeIdentifier(null, msgs);
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
      case PascalPackage.RESULT_TYPE__TYPE_IDENTIFIER:
        return getTypeIdentifier();
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
      case PascalPackage.RESULT_TYPE__TYPE_IDENTIFIER:
        setTypeIdentifier((typeIdentifier)newValue);
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
      case PascalPackage.RESULT_TYPE__TYPE_IDENTIFIER:
        setTypeIdentifier((typeIdentifier)null);
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
      case PascalPackage.RESULT_TYPE__TYPE_IDENTIFIER:
        return typeIdentifier != null;
    }
    return super.eIsSet(featureID);
  }

} //resultTypeImpl
