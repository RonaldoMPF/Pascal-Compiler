/**
 * generated by Xtext 2.11.0
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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.xtext.example.mydsl.pascal.PascalPackage;
import org.xtext.example.mydsl.pascal.addition_operator;
import org.xtext.example.mydsl.pascal.simple_expression;
import org.xtext.example.mydsl.pascal.term;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>simple expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.pascal.impl.simple_expressionImpl#getSign <em>Sign</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.pascal.impl.simple_expressionImpl#getTerm <em>Term</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.pascal.impl.simple_expressionImpl#getAddition_operator <em>Addition operator</em>}</li>
 * </ul>
 *
 * @generated
 */
public class simple_expressionImpl extends MinimalEObjectImpl.Container implements simple_expression
{
  /**
   * The default value of the '{@link #getSign() <em>Sign</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSign()
   * @generated
   * @ordered
   */
  protected static final String SIGN_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getSign() <em>Sign</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSign()
   * @generated
   * @ordered
   */
  protected String sign = SIGN_EDEFAULT;

  /**
   * The cached value of the '{@link #getTerm() <em>Term</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTerm()
   * @generated
   * @ordered
   */
  protected EList<term> term;

  /**
   * The cached value of the '{@link #getAddition_operator() <em>Addition operator</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAddition_operator()
   * @generated
   * @ordered
   */
  protected EList<addition_operator> addition_operator;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected simple_expressionImpl()
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
    return PascalPackage.Literals.SIMPLE_EXPRESSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getSign()
  {
    return sign;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSign(String newSign)
  {
    String oldSign = sign;
    sign = newSign;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PascalPackage.SIMPLE_EXPRESSION__SIGN, oldSign, sign));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<term> getTerm()
  {
    if (term == null)
    {
      term = new EObjectContainmentEList<term>(term.class, this, PascalPackage.SIMPLE_EXPRESSION__TERM);
    }
    return term;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<addition_operator> getAddition_operator()
  {
    if (addition_operator == null)
    {
      addition_operator = new EObjectContainmentEList<addition_operator>(addition_operator.class, this, PascalPackage.SIMPLE_EXPRESSION__ADDITION_OPERATOR);
    }
    return addition_operator;
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
      case PascalPackage.SIMPLE_EXPRESSION__TERM:
        return ((InternalEList<?>)getTerm()).basicRemove(otherEnd, msgs);
      case PascalPackage.SIMPLE_EXPRESSION__ADDITION_OPERATOR:
        return ((InternalEList<?>)getAddition_operator()).basicRemove(otherEnd, msgs);
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
      case PascalPackage.SIMPLE_EXPRESSION__SIGN:
        return getSign();
      case PascalPackage.SIMPLE_EXPRESSION__TERM:
        return getTerm();
      case PascalPackage.SIMPLE_EXPRESSION__ADDITION_OPERATOR:
        return getAddition_operator();
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
      case PascalPackage.SIMPLE_EXPRESSION__SIGN:
        setSign((String)newValue);
        return;
      case PascalPackage.SIMPLE_EXPRESSION__TERM:
        getTerm().clear();
        getTerm().addAll((Collection<? extends term>)newValue);
        return;
      case PascalPackage.SIMPLE_EXPRESSION__ADDITION_OPERATOR:
        getAddition_operator().clear();
        getAddition_operator().addAll((Collection<? extends addition_operator>)newValue);
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
      case PascalPackage.SIMPLE_EXPRESSION__SIGN:
        setSign(SIGN_EDEFAULT);
        return;
      case PascalPackage.SIMPLE_EXPRESSION__TERM:
        getTerm().clear();
        return;
      case PascalPackage.SIMPLE_EXPRESSION__ADDITION_OPERATOR:
        getAddition_operator().clear();
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
      case PascalPackage.SIMPLE_EXPRESSION__SIGN:
        return SIGN_EDEFAULT == null ? sign != null : !SIGN_EDEFAULT.equals(sign);
      case PascalPackage.SIMPLE_EXPRESSION__TERM:
        return term != null && !term.isEmpty();
      case PascalPackage.SIMPLE_EXPRESSION__ADDITION_OPERATOR:
        return addition_operator != null && !addition_operator.isEmpty();
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
    result.append(" (sign: ");
    result.append(sign);
    result.append(')');
    return result.toString();
  }

} //simple_expressionImpl
