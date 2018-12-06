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
import org.xtext.example.mydsl.pascal.statement;
import org.xtext.example.mydsl.pascal.statements;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>statements</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.pascal.impl.statementsImpl#getStatement1 <em>Statement1</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.pascal.impl.statementsImpl#getSemiTerminal1 <em>Semi Terminal1</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.pascal.impl.statementsImpl#getStatement2 <em>Statement2</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.pascal.impl.statementsImpl#getSemiTerminal2 <em>Semi Terminal2</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class statementsImpl extends MinimalEObjectImpl.Container implements statements
{
  /**
   * The cached value of the '{@link #getStatement1() <em>Statement1</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStatement1()
   * @generated
   * @ordered
   */
  protected EList<statement> statement1;

  /**
   * The cached value of the '{@link #getSemiTerminal1() <em>Semi Terminal1</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSemiTerminal1()
   * @generated
   * @ordered
   */
  protected EList<String> semiTerminal1;

  /**
   * The cached value of the '{@link #getStatement2() <em>Statement2</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStatement2()
   * @generated
   * @ordered
   */
  protected EList<statement> statement2;

  /**
   * The default value of the '{@link #getSemiTerminal2() <em>Semi Terminal2</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSemiTerminal2()
   * @generated
   * @ordered
   */
  protected static final String SEMI_TERMINAL2_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getSemiTerminal2() <em>Semi Terminal2</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSemiTerminal2()
   * @generated
   * @ordered
   */
  protected String semiTerminal2 = SEMI_TERMINAL2_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected statementsImpl()
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
    return PascalPackage.Literals.STATEMENTS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<statement> getStatement1()
  {
    if (statement1 == null)
    {
      statement1 = new EObjectContainmentEList<statement>(statement.class, this, PascalPackage.STATEMENTS__STATEMENT1);
    }
    return statement1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getSemiTerminal1()
  {
    if (semiTerminal1 == null)
    {
      semiTerminal1 = new EDataTypeEList<String>(String.class, this, PascalPackage.STATEMENTS__SEMI_TERMINAL1);
    }
    return semiTerminal1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<statement> getStatement2()
  {
    if (statement2 == null)
    {
      statement2 = new EObjectContainmentEList<statement>(statement.class, this, PascalPackage.STATEMENTS__STATEMENT2);
    }
    return statement2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getSemiTerminal2()
  {
    return semiTerminal2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSemiTerminal2(String newSemiTerminal2)
  {
    String oldSemiTerminal2 = semiTerminal2;
    semiTerminal2 = newSemiTerminal2;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PascalPackage.STATEMENTS__SEMI_TERMINAL2, oldSemiTerminal2, semiTerminal2));
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
      case PascalPackage.STATEMENTS__STATEMENT1:
        return ((InternalEList<?>)getStatement1()).basicRemove(otherEnd, msgs);
      case PascalPackage.STATEMENTS__STATEMENT2:
        return ((InternalEList<?>)getStatement2()).basicRemove(otherEnd, msgs);
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
      case PascalPackage.STATEMENTS__STATEMENT1:
        return getStatement1();
      case PascalPackage.STATEMENTS__SEMI_TERMINAL1:
        return getSemiTerminal1();
      case PascalPackage.STATEMENTS__STATEMENT2:
        return getStatement2();
      case PascalPackage.STATEMENTS__SEMI_TERMINAL2:
        return getSemiTerminal2();
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
      case PascalPackage.STATEMENTS__STATEMENT1:
        getStatement1().clear();
        getStatement1().addAll((Collection<? extends statement>)newValue);
        return;
      case PascalPackage.STATEMENTS__SEMI_TERMINAL1:
        getSemiTerminal1().clear();
        getSemiTerminal1().addAll((Collection<? extends String>)newValue);
        return;
      case PascalPackage.STATEMENTS__STATEMENT2:
        getStatement2().clear();
        getStatement2().addAll((Collection<? extends statement>)newValue);
        return;
      case PascalPackage.STATEMENTS__SEMI_TERMINAL2:
        setSemiTerminal2((String)newValue);
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
      case PascalPackage.STATEMENTS__STATEMENT1:
        getStatement1().clear();
        return;
      case PascalPackage.STATEMENTS__SEMI_TERMINAL1:
        getSemiTerminal1().clear();
        return;
      case PascalPackage.STATEMENTS__STATEMENT2:
        getStatement2().clear();
        return;
      case PascalPackage.STATEMENTS__SEMI_TERMINAL2:
        setSemiTerminal2(SEMI_TERMINAL2_EDEFAULT);
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
      case PascalPackage.STATEMENTS__STATEMENT1:
        return statement1 != null && !statement1.isEmpty();
      case PascalPackage.STATEMENTS__SEMI_TERMINAL1:
        return semiTerminal1 != null && !semiTerminal1.isEmpty();
      case PascalPackage.STATEMENTS__STATEMENT2:
        return statement2 != null && !statement2.isEmpty();
      case PascalPackage.STATEMENTS__SEMI_TERMINAL2:
        return SEMI_TERMINAL2_EDEFAULT == null ? semiTerminal2 != null : !SEMI_TERMINAL2_EDEFAULT.equals(semiTerminal2);
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
    result.append(" (semiTerminal1: ");
    result.append(semiTerminal1);
    result.append(", semiTerminal2: ");
    result.append(semiTerminal2);
    result.append(')');
    return result.toString();
  }

} //statementsImpl
