/**
 * generated by Xtext 2.15.0
 */
package org.xtext.example.mydsl.pascal.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.example.mydsl.pascal.PascalPackage;
import org.xtext.example.mydsl.pascal.constList;
import org.xtext.example.mydsl.pascal.constant;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>const List</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.pascal.impl.constListImpl#getConstant1 <em>Constant1</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.pascal.impl.constListImpl#getCommaTerminal <em>Comma Terminal</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.pascal.impl.constListImpl#getConstant2 <em>Constant2</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class constListImpl extends MinimalEObjectImpl.Container implements constList
{
  /**
   * The cached value of the '{@link #getConstant1() <em>Constant1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConstant1()
   * @generated
   * @ordered
   */
  protected constant constant1;

  /**
   * The cached value of the '{@link #getCommaTerminal() <em>Comma Terminal</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCommaTerminal()
   * @generated
   * @ordered
   */
  protected EList<String> commaTerminal;

  /**
   * The cached value of the '{@link #getConstant2() <em>Constant2</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConstant2()
   * @generated
   * @ordered
   */
  protected EList<constant> constant2;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected constListImpl()
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
    return PascalPackage.Literals.CONST_LIST;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public constant getConstant1()
  {
    return constant1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetConstant1(constant newConstant1, NotificationChain msgs)
  {
    constant oldConstant1 = constant1;
    constant1 = newConstant1;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PascalPackage.CONST_LIST__CONSTANT1, oldConstant1, newConstant1);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setConstant1(constant newConstant1)
  {
    if (newConstant1 != constant1)
    {
      NotificationChain msgs = null;
      if (constant1 != null)
        msgs = ((InternalEObject)constant1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PascalPackage.CONST_LIST__CONSTANT1, null, msgs);
      if (newConstant1 != null)
        msgs = ((InternalEObject)newConstant1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PascalPackage.CONST_LIST__CONSTANT1, null, msgs);
      msgs = basicSetConstant1(newConstant1, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PascalPackage.CONST_LIST__CONSTANT1, newConstant1, newConstant1));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getCommaTerminal()
  {
    if (commaTerminal == null)
    {
      commaTerminal = new EDataTypeEList<String>(String.class, this, PascalPackage.CONST_LIST__COMMA_TERMINAL);
    }
    return commaTerminal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<constant> getConstant2()
  {
    if (constant2 == null)
    {
      constant2 = new EObjectContainmentEList<constant>(constant.class, this, PascalPackage.CONST_LIST__CONSTANT2);
    }
    return constant2;
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
      case PascalPackage.CONST_LIST__CONSTANT1:
        return basicSetConstant1(null, msgs);
      case PascalPackage.CONST_LIST__CONSTANT2:
        return ((InternalEList<?>)getConstant2()).basicRemove(otherEnd, msgs);
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
      case PascalPackage.CONST_LIST__CONSTANT1:
        return getConstant1();
      case PascalPackage.CONST_LIST__COMMA_TERMINAL:
        return getCommaTerminal();
      case PascalPackage.CONST_LIST__CONSTANT2:
        return getConstant2();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case PascalPackage.CONST_LIST__CONSTANT1:
        setConstant1((constant)newValue);
        return;
      case PascalPackage.CONST_LIST__COMMA_TERMINAL:
        getCommaTerminal().clear();
        getCommaTerminal().addAll((Collection<? extends String>)newValue);
        return;
      case PascalPackage.CONST_LIST__CONSTANT2:
        getConstant2().clear();
        getConstant2().addAll((Collection<? extends constant>)newValue);
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
      case PascalPackage.CONST_LIST__CONSTANT1:
        setConstant1((constant)null);
        return;
      case PascalPackage.CONST_LIST__COMMA_TERMINAL:
        getCommaTerminal().clear();
        return;
      case PascalPackage.CONST_LIST__CONSTANT2:
        getConstant2().clear();
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
      case PascalPackage.CONST_LIST__CONSTANT1:
        return constant1 != null;
      case PascalPackage.CONST_LIST__COMMA_TERMINAL:
        return commaTerminal != null && !commaTerminal.isEmpty();
      case PascalPackage.CONST_LIST__CONSTANT2:
        return constant2 != null && !constant2.isEmpty();
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
    result.append(" (commaTerminal: ");
    result.append(commaTerminal);
    result.append(')');
    return result.toString();
  }

} //constListImpl
