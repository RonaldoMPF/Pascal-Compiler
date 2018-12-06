/**
 * generated by Xtext 2.15.0
 */
package org.xtext.example.mydsl.pascal.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.mydsl.pascal.PascalPackage;
import org.xtext.example.mydsl.pascal.identifierList;
import org.xtext.example.mydsl.pascal.parameterGroup;
import org.xtext.example.mydsl.pascal.typeIdentifier;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>parameter Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.pascal.impl.parameterGroupImpl#getIdentifierList <em>Identifier List</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.pascal.impl.parameterGroupImpl#getTypeIdentifier <em>Type Identifier</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class parameterGroupImpl extends MinimalEObjectImpl.Container implements parameterGroup
{
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
  protected parameterGroupImpl()
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
    return PascalPackage.Literals.PARAMETER_GROUP;
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PascalPackage.PARAMETER_GROUP__IDENTIFIER_LIST, oldIdentifierList, newIdentifierList);
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
        msgs = ((InternalEObject)identifierList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PascalPackage.PARAMETER_GROUP__IDENTIFIER_LIST, null, msgs);
      if (newIdentifierList != null)
        msgs = ((InternalEObject)newIdentifierList).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PascalPackage.PARAMETER_GROUP__IDENTIFIER_LIST, null, msgs);
      msgs = basicSetIdentifierList(newIdentifierList, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PascalPackage.PARAMETER_GROUP__IDENTIFIER_LIST, newIdentifierList, newIdentifierList));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PascalPackage.PARAMETER_GROUP__TYPE_IDENTIFIER, oldTypeIdentifier, newTypeIdentifier);
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
        msgs = ((InternalEObject)typeIdentifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PascalPackage.PARAMETER_GROUP__TYPE_IDENTIFIER, null, msgs);
      if (newTypeIdentifier != null)
        msgs = ((InternalEObject)newTypeIdentifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PascalPackage.PARAMETER_GROUP__TYPE_IDENTIFIER, null, msgs);
      msgs = basicSetTypeIdentifier(newTypeIdentifier, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PascalPackage.PARAMETER_GROUP__TYPE_IDENTIFIER, newTypeIdentifier, newTypeIdentifier));
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
      case PascalPackage.PARAMETER_GROUP__IDENTIFIER_LIST:
        return basicSetIdentifierList(null, msgs);
      case PascalPackage.PARAMETER_GROUP__TYPE_IDENTIFIER:
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
      case PascalPackage.PARAMETER_GROUP__IDENTIFIER_LIST:
        return getIdentifierList();
      case PascalPackage.PARAMETER_GROUP__TYPE_IDENTIFIER:
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
      case PascalPackage.PARAMETER_GROUP__IDENTIFIER_LIST:
        setIdentifierList((identifierList)newValue);
        return;
      case PascalPackage.PARAMETER_GROUP__TYPE_IDENTIFIER:
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
      case PascalPackage.PARAMETER_GROUP__IDENTIFIER_LIST:
        setIdentifierList((identifierList)null);
        return;
      case PascalPackage.PARAMETER_GROUP__TYPE_IDENTIFIER:
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
      case PascalPackage.PARAMETER_GROUP__IDENTIFIER_LIST:
        return identifierList != null;
      case PascalPackage.PARAMETER_GROUP__TYPE_IDENTIFIER:
        return typeIdentifier != null;
    }
    return super.eIsSet(featureID);
  }

} //parameterGroupImpl
