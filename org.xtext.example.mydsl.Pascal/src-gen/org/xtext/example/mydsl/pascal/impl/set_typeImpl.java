/**
 * generated by Xtext 2.11.0
 */
package org.xtext.example.mydsl.pascal.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.xtext.example.mydsl.pascal.PascalPackage;
import org.xtext.example.mydsl.pascal.base_type;
import org.xtext.example.mydsl.pascal.set_type;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>set type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.pascal.impl.set_typeImpl#getBase_type <em>Base type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class set_typeImpl extends MinimalEObjectImpl.Container implements set_type
{
  /**
   * The cached value of the '{@link #getBase_type() <em>Base type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBase_type()
   * @generated
   * @ordered
   */
  protected base_type base_type;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected set_typeImpl()
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
    return PascalPackage.Literals.SET_TYPE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public base_type getBase_type()
  {
    return base_type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBase_type(base_type newBase_type, NotificationChain msgs)
  {
    base_type oldBase_type = base_type;
    base_type = newBase_type;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PascalPackage.SET_TYPE__BASE_TYPE, oldBase_type, newBase_type);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBase_type(base_type newBase_type)
  {
    if (newBase_type != base_type)
    {
      NotificationChain msgs = null;
      if (base_type != null)
        msgs = ((InternalEObject)base_type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PascalPackage.SET_TYPE__BASE_TYPE, null, msgs);
      if (newBase_type != null)
        msgs = ((InternalEObject)newBase_type).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PascalPackage.SET_TYPE__BASE_TYPE, null, msgs);
      msgs = basicSetBase_type(newBase_type, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PascalPackage.SET_TYPE__BASE_TYPE, newBase_type, newBase_type));
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
      case PascalPackage.SET_TYPE__BASE_TYPE:
        return basicSetBase_type(null, msgs);
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
      case PascalPackage.SET_TYPE__BASE_TYPE:
        return getBase_type();
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
      case PascalPackage.SET_TYPE__BASE_TYPE:
        setBase_type((base_type)newValue);
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
      case PascalPackage.SET_TYPE__BASE_TYPE:
        setBase_type((base_type)null);
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
      case PascalPackage.SET_TYPE__BASE_TYPE:
        return base_type != null;
    }
    return super.eIsSet(featureID);
  }

} //set_typeImpl
