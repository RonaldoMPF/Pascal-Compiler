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

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.example.mydsl.pascal.PascalPackage;
import org.xtext.example.mydsl.pascal.identifierList;
import org.xtext.example.mydsl.pascal.recordSection;
import org.xtext.example.mydsl.pascal.typeStart;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>record Section</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.pascal.impl.recordSectionImpl#getSemiTerminal <em>Semi Terminal</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.pascal.impl.recordSectionImpl#getRecordSection <em>Record Section</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.pascal.impl.recordSectionImpl#getIdentifierList <em>Identifier List</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.pascal.impl.recordSectionImpl#getTypeStart <em>Type Start</em>}</li>
 * </ul>
 *
 * @generated
 */
public class recordSectionImpl extends fixedPartImpl implements recordSection
{
  /**
   * The cached value of the '{@link #getSemiTerminal() <em>Semi Terminal</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSemiTerminal()
   * @generated
   * @ordered
   */
  protected EList<String> semiTerminal;

  /**
   * The cached value of the '{@link #getRecordSection() <em>Record Section</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRecordSection()
   * @generated
   * @ordered
   */
  protected EList<recordSection> recordSection;

  /**
   * The cached value of the '{@link #getIdentifierList() <em>Identifier List</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIdentifierList()
   * @generated
   * @ordered
   */
  protected identifierList identifierList;

  /**
   * The cached value of the '{@link #getTypeStart() <em>Type Start</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTypeStart()
   * @generated
   * @ordered
   */
  protected typeStart typeStart;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected recordSectionImpl()
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
    return PascalPackage.Literals.RECORD_SECTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getSemiTerminal()
  {
    if (semiTerminal == null)
    {
      semiTerminal = new EDataTypeEList<String>(String.class, this, PascalPackage.RECORD_SECTION__SEMI_TERMINAL);
    }
    return semiTerminal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<recordSection> getRecordSection()
  {
    if (recordSection == null)
    {
      recordSection = new EObjectContainmentEList<recordSection>(recordSection.class, this, PascalPackage.RECORD_SECTION__RECORD_SECTION);
    }
    return recordSection;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public identifierList getIdentifierList()
  {
    return identifierList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetIdentifierList(identifierList newIdentifierList, NotificationChain msgs)
  {
    identifierList oldIdentifierList = identifierList;
    identifierList = newIdentifierList;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PascalPackage.RECORD_SECTION__IDENTIFIER_LIST, oldIdentifierList, newIdentifierList);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIdentifierList(identifierList newIdentifierList)
  {
    if (newIdentifierList != identifierList)
    {
      NotificationChain msgs = null;
      if (identifierList != null)
        msgs = ((InternalEObject)identifierList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PascalPackage.RECORD_SECTION__IDENTIFIER_LIST, null, msgs);
      if (newIdentifierList != null)
        msgs = ((InternalEObject)newIdentifierList).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PascalPackage.RECORD_SECTION__IDENTIFIER_LIST, null, msgs);
      msgs = basicSetIdentifierList(newIdentifierList, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PascalPackage.RECORD_SECTION__IDENTIFIER_LIST, newIdentifierList, newIdentifierList));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public typeStart getTypeStart()
  {
    return typeStart;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTypeStart(typeStart newTypeStart, NotificationChain msgs)
  {
    typeStart oldTypeStart = typeStart;
    typeStart = newTypeStart;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PascalPackage.RECORD_SECTION__TYPE_START, oldTypeStart, newTypeStart);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTypeStart(typeStart newTypeStart)
  {
    if (newTypeStart != typeStart)
    {
      NotificationChain msgs = null;
      if (typeStart != null)
        msgs = ((InternalEObject)typeStart).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PascalPackage.RECORD_SECTION__TYPE_START, null, msgs);
      if (newTypeStart != null)
        msgs = ((InternalEObject)newTypeStart).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PascalPackage.RECORD_SECTION__TYPE_START, null, msgs);
      msgs = basicSetTypeStart(newTypeStart, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PascalPackage.RECORD_SECTION__TYPE_START, newTypeStart, newTypeStart));
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
      case PascalPackage.RECORD_SECTION__RECORD_SECTION:
        return ((InternalEList<?>)getRecordSection()).basicRemove(otherEnd, msgs);
      case PascalPackage.RECORD_SECTION__IDENTIFIER_LIST:
        return basicSetIdentifierList(null, msgs);
      case PascalPackage.RECORD_SECTION__TYPE_START:
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
      case PascalPackage.RECORD_SECTION__SEMI_TERMINAL:
        return getSemiTerminal();
      case PascalPackage.RECORD_SECTION__RECORD_SECTION:
        return getRecordSection();
      case PascalPackage.RECORD_SECTION__IDENTIFIER_LIST:
        return getIdentifierList();
      case PascalPackage.RECORD_SECTION__TYPE_START:
        return getTypeStart();
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
      case PascalPackage.RECORD_SECTION__SEMI_TERMINAL:
        getSemiTerminal().clear();
        getSemiTerminal().addAll((Collection<? extends String>)newValue);
        return;
      case PascalPackage.RECORD_SECTION__RECORD_SECTION:
        getRecordSection().clear();
        getRecordSection().addAll((Collection<? extends recordSection>)newValue);
        return;
      case PascalPackage.RECORD_SECTION__IDENTIFIER_LIST:
        setIdentifierList((identifierList)newValue);
        return;
      case PascalPackage.RECORD_SECTION__TYPE_START:
        setTypeStart((typeStart)newValue);
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
      case PascalPackage.RECORD_SECTION__SEMI_TERMINAL:
        getSemiTerminal().clear();
        return;
      case PascalPackage.RECORD_SECTION__RECORD_SECTION:
        getRecordSection().clear();
        return;
      case PascalPackage.RECORD_SECTION__IDENTIFIER_LIST:
        setIdentifierList((identifierList)null);
        return;
      case PascalPackage.RECORD_SECTION__TYPE_START:
        setTypeStart((typeStart)null);
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
      case PascalPackage.RECORD_SECTION__SEMI_TERMINAL:
        return semiTerminal != null && !semiTerminal.isEmpty();
      case PascalPackage.RECORD_SECTION__RECORD_SECTION:
        return recordSection != null && !recordSection.isEmpty();
      case PascalPackage.RECORD_SECTION__IDENTIFIER_LIST:
        return identifierList != null;
      case PascalPackage.RECORD_SECTION__TYPE_START:
        return typeStart != null;
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
    result.append(" (semiTerminal: ");
    result.append(semiTerminal);
    result.append(')');
    return result.toString();
  }

} //recordSectionImpl