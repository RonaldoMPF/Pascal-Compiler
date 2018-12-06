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
import org.xtext.example.mydsl.pascal.integer_number;
import org.xtext.example.mydsl.pascal.label;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>label</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.pascal.impl.labelImpl#getInteger_number <em>Integer number</em>}</li>
 * </ul>
 *
 * @generated
 */
public class labelImpl extends MinimalEObjectImpl.Container implements label
{
  /**
   * The cached value of the '{@link #getInteger_number() <em>Integer number</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInteger_number()
   * @generated
   * @ordered
   */
  protected integer_number integer_number;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected labelImpl()
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
    return PascalPackage.Literals.LABEL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public integer_number getInteger_number()
  {
    return integer_number;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetInteger_number(integer_number newInteger_number, NotificationChain msgs)
  {
    integer_number oldInteger_number = integer_number;
    integer_number = newInteger_number;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PascalPackage.LABEL__INTEGER_NUMBER, oldInteger_number, newInteger_number);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInteger_number(integer_number newInteger_number)
  {
    if (newInteger_number != integer_number)
    {
      NotificationChain msgs = null;
      if (integer_number != null)
        msgs = ((InternalEObject)integer_number).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PascalPackage.LABEL__INTEGER_NUMBER, null, msgs);
      if (newInteger_number != null)
        msgs = ((InternalEObject)newInteger_number).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PascalPackage.LABEL__INTEGER_NUMBER, null, msgs);
      msgs = basicSetInteger_number(newInteger_number, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PascalPackage.LABEL__INTEGER_NUMBER, newInteger_number, newInteger_number));
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
      case PascalPackage.LABEL__INTEGER_NUMBER:
        return basicSetInteger_number(null, msgs);
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
      case PascalPackage.LABEL__INTEGER_NUMBER:
        return getInteger_number();
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
      case PascalPackage.LABEL__INTEGER_NUMBER:
        setInteger_number((integer_number)newValue);
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
      case PascalPackage.LABEL__INTEGER_NUMBER:
        setInteger_number((integer_number)null);
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
      case PascalPackage.LABEL__INTEGER_NUMBER:
        return integer_number != null;
    }
    return super.eIsSet(featureID);
  }

} //labelImpl
