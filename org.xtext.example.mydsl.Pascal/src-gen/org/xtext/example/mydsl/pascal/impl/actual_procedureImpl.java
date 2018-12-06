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
import org.xtext.example.mydsl.pascal.actual_procedure;
import org.xtext.example.mydsl.pascal.identifier;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>actual procedure</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.pascal.impl.actual_procedureImpl#getProcedure_identifier <em>Procedure identifier</em>}</li>
 * </ul>
 *
 * @generated
 */
public class actual_procedureImpl extends MinimalEObjectImpl.Container implements actual_procedure
{
  /**
   * The cached value of the '{@link #getProcedure_identifier() <em>Procedure identifier</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProcedure_identifier()
   * @generated
   * @ordered
   */
  protected identifier procedure_identifier;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected actual_procedureImpl()
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
    return PascalPackage.Literals.ACTUAL_PROCEDURE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public identifier getProcedure_identifier()
  {
    return procedure_identifier;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetProcedure_identifier(identifier newProcedure_identifier, NotificationChain msgs)
  {
    identifier oldProcedure_identifier = procedure_identifier;
    procedure_identifier = newProcedure_identifier;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PascalPackage.ACTUAL_PROCEDURE__PROCEDURE_IDENTIFIER, oldProcedure_identifier, newProcedure_identifier);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setProcedure_identifier(identifier newProcedure_identifier)
  {
    if (newProcedure_identifier != procedure_identifier)
    {
      NotificationChain msgs = null;
      if (procedure_identifier != null)
        msgs = ((InternalEObject)procedure_identifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PascalPackage.ACTUAL_PROCEDURE__PROCEDURE_IDENTIFIER, null, msgs);
      if (newProcedure_identifier != null)
        msgs = ((InternalEObject)newProcedure_identifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PascalPackage.ACTUAL_PROCEDURE__PROCEDURE_IDENTIFIER, null, msgs);
      msgs = basicSetProcedure_identifier(newProcedure_identifier, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PascalPackage.ACTUAL_PROCEDURE__PROCEDURE_IDENTIFIER, newProcedure_identifier, newProcedure_identifier));
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
      case PascalPackage.ACTUAL_PROCEDURE__PROCEDURE_IDENTIFIER:
        return basicSetProcedure_identifier(null, msgs);
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
      case PascalPackage.ACTUAL_PROCEDURE__PROCEDURE_IDENTIFIER:
        return getProcedure_identifier();
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
      case PascalPackage.ACTUAL_PROCEDURE__PROCEDURE_IDENTIFIER:
        setProcedure_identifier((identifier)newValue);
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
      case PascalPackage.ACTUAL_PROCEDURE__PROCEDURE_IDENTIFIER:
        setProcedure_identifier((identifier)null);
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
      case PascalPackage.ACTUAL_PROCEDURE__PROCEDURE_IDENTIFIER:
        return procedure_identifier != null;
    }
    return super.eIsSet(featureID);
  }

} //actual_procedureImpl
