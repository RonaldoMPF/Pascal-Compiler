/**
 * generated by Xtext 2.16.0-SNAPSHOT
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
import org.xtext.example.mydsl.pascal.recordVariableList;
import org.xtext.example.mydsl.pascal.variable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>record Variable List</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.pascal.impl.recordVariableListImpl#getVariable1 <em>Variable1</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.pascal.impl.recordVariableListImpl#getCommaTerminal <em>Comma Terminal</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.pascal.impl.recordVariableListImpl#getVariable2 <em>Variable2</em>}</li>
 * </ul>
 *
 * @generated
 */
public class recordVariableListImpl extends MinimalEObjectImpl.Container implements recordVariableList
{
  /**
   * The cached value of the '{@link #getVariable1() <em>Variable1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVariable1()
   * @generated
   * @ordered
   */
  protected variable variable1;

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
   * The cached value of the '{@link #getVariable2() <em>Variable2</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVariable2()
   * @generated
   * @ordered
   */
  protected EList<variable> variable2;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected recordVariableListImpl()
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
    return PascalPackage.Literals.RECORD_VARIABLE_LIST;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public variable getVariable1()
  {
    return variable1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetVariable1(variable newVariable1, NotificationChain msgs)
  {
    variable oldVariable1 = variable1;
    variable1 = newVariable1;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PascalPackage.RECORD_VARIABLE_LIST__VARIABLE1, oldVariable1, newVariable1);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVariable1(variable newVariable1)
  {
    if (newVariable1 != variable1)
    {
      NotificationChain msgs = null;
      if (variable1 != null)
        msgs = ((InternalEObject)variable1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PascalPackage.RECORD_VARIABLE_LIST__VARIABLE1, null, msgs);
      if (newVariable1 != null)
        msgs = ((InternalEObject)newVariable1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PascalPackage.RECORD_VARIABLE_LIST__VARIABLE1, null, msgs);
      msgs = basicSetVariable1(newVariable1, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PascalPackage.RECORD_VARIABLE_LIST__VARIABLE1, newVariable1, newVariable1));
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
      commaTerminal = new EDataTypeEList<String>(String.class, this, PascalPackage.RECORD_VARIABLE_LIST__COMMA_TERMINAL);
    }
    return commaTerminal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<variable> getVariable2()
  {
    if (variable2 == null)
    {
      variable2 = new EObjectContainmentEList<variable>(variable.class, this, PascalPackage.RECORD_VARIABLE_LIST__VARIABLE2);
    }
    return variable2;
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
      case PascalPackage.RECORD_VARIABLE_LIST__VARIABLE1:
        return basicSetVariable1(null, msgs);
      case PascalPackage.RECORD_VARIABLE_LIST__VARIABLE2:
        return ((InternalEList<?>)getVariable2()).basicRemove(otherEnd, msgs);
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
      case PascalPackage.RECORD_VARIABLE_LIST__VARIABLE1:
        return getVariable1();
      case PascalPackage.RECORD_VARIABLE_LIST__COMMA_TERMINAL:
        return getCommaTerminal();
      case PascalPackage.RECORD_VARIABLE_LIST__VARIABLE2:
        return getVariable2();
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
      case PascalPackage.RECORD_VARIABLE_LIST__VARIABLE1:
        setVariable1((variable)newValue);
        return;
      case PascalPackage.RECORD_VARIABLE_LIST__COMMA_TERMINAL:
        getCommaTerminal().clear();
        getCommaTerminal().addAll((Collection<? extends String>)newValue);
        return;
      case PascalPackage.RECORD_VARIABLE_LIST__VARIABLE2:
        getVariable2().clear();
        getVariable2().addAll((Collection<? extends variable>)newValue);
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
      case PascalPackage.RECORD_VARIABLE_LIST__VARIABLE1:
        setVariable1((variable)null);
        return;
      case PascalPackage.RECORD_VARIABLE_LIST__COMMA_TERMINAL:
        getCommaTerminal().clear();
        return;
      case PascalPackage.RECORD_VARIABLE_LIST__VARIABLE2:
        getVariable2().clear();
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
      case PascalPackage.RECORD_VARIABLE_LIST__VARIABLE1:
        return variable1 != null;
      case PascalPackage.RECORD_VARIABLE_LIST__COMMA_TERMINAL:
        return commaTerminal != null && !commaTerminal.isEmpty();
      case PascalPackage.RECORD_VARIABLE_LIST__VARIABLE2:
        return variable2 != null && !variable2.isEmpty();
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

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (commaTerminal: ");
    result.append(commaTerminal);
    result.append(')');
    return result.toString();
  }

} //recordVariableListImpl
