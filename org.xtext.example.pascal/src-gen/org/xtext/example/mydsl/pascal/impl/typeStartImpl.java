/**
 * generated by Xtext 2.16.0-SNAPSHOT
 */
package org.xtext.example.mydsl.pascal.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.mydsl.pascal.PascalPackage;
import org.xtext.example.mydsl.pascal.typeStart;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>type Start</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.pascal.impl.typeStartImpl#getTypeStart <em>Type Start</em>}</li>
 * </ul>
 *
 * @generated
 */
public class typeStartImpl extends MinimalEObjectImpl.Container implements typeStart
{
  /**
   * The cached value of the '{@link #getTypeStart() <em>Type Start</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTypeStart()
   * @generated
   * @ordered
   */
  protected EObject typeStart;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected typeStartImpl()
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
    return PascalPackage.Literals.TYPE_START;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EObject getTypeStart()
  {
    return typeStart;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTypeStart(EObject newTypeStart, NotificationChain msgs)
  {
    EObject oldTypeStart = typeStart;
    typeStart = newTypeStart;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PascalPackage.TYPE_START__TYPE_START, oldTypeStart, newTypeStart);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTypeStart(EObject newTypeStart)
  {
    if (newTypeStart != typeStart)
    {
      NotificationChain msgs = null;
      if (typeStart != null)
        msgs = ((InternalEObject)typeStart).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PascalPackage.TYPE_START__TYPE_START, null, msgs);
      if (newTypeStart != null)
        msgs = ((InternalEObject)newTypeStart).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PascalPackage.TYPE_START__TYPE_START, null, msgs);
      msgs = basicSetTypeStart(newTypeStart, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PascalPackage.TYPE_START__TYPE_START, newTypeStart, newTypeStart));
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
      case PascalPackage.TYPE_START__TYPE_START:
        return basicSetTypeStart(null, msgs);
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
      case PascalPackage.TYPE_START__TYPE_START:
        return getTypeStart();
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
      case PascalPackage.TYPE_START__TYPE_START:
        setTypeStart((EObject)newValue);
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
      case PascalPackage.TYPE_START__TYPE_START:
        setTypeStart((EObject)null);
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
      case PascalPackage.TYPE_START__TYPE_START:
        return typeStart != null;
    }
    return super.eIsSet(featureID);
  }

} //typeStartImpl
