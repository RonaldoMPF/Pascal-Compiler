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
import org.xtext.example.mydsl.pascal.formalParameterList;
import org.xtext.example.mydsl.pascal.formalParameterSection;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>formal Parameter List</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.pascal.impl.formalParameterListImpl#getFormalParameterSection1 <em>Formal Parameter Section1</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.pascal.impl.formalParameterListImpl#getSemiterminal <em>Semiterminal</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.pascal.impl.formalParameterListImpl#getFormalParameterSection2 <em>Formal Parameter Section2</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class formalParameterListImpl extends MinimalEObjectImpl.Container implements formalParameterList
{
  /**
   * The cached value of the '{@link #getFormalParameterSection1() <em>Formal Parameter Section1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFormalParameterSection1()
   * @generated
   * @ordered
   */
  protected formalParameterSection formalParameterSection1;

  /**
   * The cached value of the '{@link #getSemiterminal() <em>Semiterminal</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSemiterminal()
   * @generated
   * @ordered
   */
  protected EList<String> semiterminal;

  /**
   * The cached value of the '{@link #getFormalParameterSection2() <em>Formal Parameter Section2</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFormalParameterSection2()
   * @generated
   * @ordered
   */
  protected EList<formalParameterSection> formalParameterSection2;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected formalParameterListImpl()
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
    return PascalPackage.Literals.FORMAL_PARAMETER_LIST;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public formalParameterSection getFormalParameterSection1()
  {
    return formalParameterSection1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFormalParameterSection1(formalParameterSection newFormalParameterSection1, NotificationChain msgs)
  {
    formalParameterSection oldFormalParameterSection1 = formalParameterSection1;
    formalParameterSection1 = newFormalParameterSection1;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PascalPackage.FORMAL_PARAMETER_LIST__FORMAL_PARAMETER_SECTION1, oldFormalParameterSection1, newFormalParameterSection1);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFormalParameterSection1(formalParameterSection newFormalParameterSection1)
  {
    if (newFormalParameterSection1 != formalParameterSection1)
    {
      NotificationChain msgs = null;
      if (formalParameterSection1 != null)
        msgs = ((InternalEObject)formalParameterSection1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PascalPackage.FORMAL_PARAMETER_LIST__FORMAL_PARAMETER_SECTION1, null, msgs);
      if (newFormalParameterSection1 != null)
        msgs = ((InternalEObject)newFormalParameterSection1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PascalPackage.FORMAL_PARAMETER_LIST__FORMAL_PARAMETER_SECTION1, null, msgs);
      msgs = basicSetFormalParameterSection1(newFormalParameterSection1, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PascalPackage.FORMAL_PARAMETER_LIST__FORMAL_PARAMETER_SECTION1, newFormalParameterSection1, newFormalParameterSection1));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getSemiterminal()
  {
    if (semiterminal == null)
    {
      semiterminal = new EDataTypeEList<String>(String.class, this, PascalPackage.FORMAL_PARAMETER_LIST__SEMITERMINAL);
    }
    return semiterminal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<formalParameterSection> getFormalParameterSection2()
  {
    if (formalParameterSection2 == null)
    {
      formalParameterSection2 = new EObjectContainmentEList<formalParameterSection>(formalParameterSection.class, this, PascalPackage.FORMAL_PARAMETER_LIST__FORMAL_PARAMETER_SECTION2);
    }
    return formalParameterSection2;
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
      case PascalPackage.FORMAL_PARAMETER_LIST__FORMAL_PARAMETER_SECTION1:
        return basicSetFormalParameterSection1(null, msgs);
      case PascalPackage.FORMAL_PARAMETER_LIST__FORMAL_PARAMETER_SECTION2:
        return ((InternalEList<?>)getFormalParameterSection2()).basicRemove(otherEnd, msgs);
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
      case PascalPackage.FORMAL_PARAMETER_LIST__FORMAL_PARAMETER_SECTION1:
        return getFormalParameterSection1();
      case PascalPackage.FORMAL_PARAMETER_LIST__SEMITERMINAL:
        return getSemiterminal();
      case PascalPackage.FORMAL_PARAMETER_LIST__FORMAL_PARAMETER_SECTION2:
        return getFormalParameterSection2();
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
      case PascalPackage.FORMAL_PARAMETER_LIST__FORMAL_PARAMETER_SECTION1:
        setFormalParameterSection1((formalParameterSection)newValue);
        return;
      case PascalPackage.FORMAL_PARAMETER_LIST__SEMITERMINAL:
        getSemiterminal().clear();
        getSemiterminal().addAll((Collection<? extends String>)newValue);
        return;
      case PascalPackage.FORMAL_PARAMETER_LIST__FORMAL_PARAMETER_SECTION2:
        getFormalParameterSection2().clear();
        getFormalParameterSection2().addAll((Collection<? extends formalParameterSection>)newValue);
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
      case PascalPackage.FORMAL_PARAMETER_LIST__FORMAL_PARAMETER_SECTION1:
        setFormalParameterSection1((formalParameterSection)null);
        return;
      case PascalPackage.FORMAL_PARAMETER_LIST__SEMITERMINAL:
        getSemiterminal().clear();
        return;
      case PascalPackage.FORMAL_PARAMETER_LIST__FORMAL_PARAMETER_SECTION2:
        getFormalParameterSection2().clear();
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
      case PascalPackage.FORMAL_PARAMETER_LIST__FORMAL_PARAMETER_SECTION1:
        return formalParameterSection1 != null;
      case PascalPackage.FORMAL_PARAMETER_LIST__SEMITERMINAL:
        return semiterminal != null && !semiterminal.isEmpty();
      case PascalPackage.FORMAL_PARAMETER_LIST__FORMAL_PARAMETER_SECTION2:
        return formalParameterSection2 != null && !formalParameterSection2.isEmpty();
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
    result.append(" (semiterminal: ");
    result.append(semiterminal);
    result.append(')');
    return result.toString();
  }

} //formalParameterListImpl
