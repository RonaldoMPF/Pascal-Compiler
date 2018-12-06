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
import org.xtext.example.mydsl.pascal.compiler_defined_directives;
import org.xtext.example.mydsl.pascal.procedure_heading;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>compiler defined directives</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.pascal.impl.compiler_defined_directivesImpl#getProcedure_heading <em>Procedure heading</em>}</li>
 * </ul>
 *
 * @generated
 */
public class compiler_defined_directivesImpl extends MinimalEObjectImpl.Container implements compiler_defined_directives
{
  /**
   * The cached value of the '{@link #getProcedure_heading() <em>Procedure heading</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProcedure_heading()
   * @generated
   * @ordered
   */
  protected procedure_heading procedure_heading;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected compiler_defined_directivesImpl()
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
    return PascalPackage.Literals.COMPILER_DEFINED_DIRECTIVES;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public procedure_heading getProcedure_heading()
  {
    return procedure_heading;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetProcedure_heading(procedure_heading newProcedure_heading, NotificationChain msgs)
  {
    procedure_heading oldProcedure_heading = procedure_heading;
    procedure_heading = newProcedure_heading;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PascalPackage.COMPILER_DEFINED_DIRECTIVES__PROCEDURE_HEADING, oldProcedure_heading, newProcedure_heading);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setProcedure_heading(procedure_heading newProcedure_heading)
  {
    if (newProcedure_heading != procedure_heading)
    {
      NotificationChain msgs = null;
      if (procedure_heading != null)
        msgs = ((InternalEObject)procedure_heading).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PascalPackage.COMPILER_DEFINED_DIRECTIVES__PROCEDURE_HEADING, null, msgs);
      if (newProcedure_heading != null)
        msgs = ((InternalEObject)newProcedure_heading).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PascalPackage.COMPILER_DEFINED_DIRECTIVES__PROCEDURE_HEADING, null, msgs);
      msgs = basicSetProcedure_heading(newProcedure_heading, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PascalPackage.COMPILER_DEFINED_DIRECTIVES__PROCEDURE_HEADING, newProcedure_heading, newProcedure_heading));
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
      case PascalPackage.COMPILER_DEFINED_DIRECTIVES__PROCEDURE_HEADING:
        return basicSetProcedure_heading(null, msgs);
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
      case PascalPackage.COMPILER_DEFINED_DIRECTIVES__PROCEDURE_HEADING:
        return getProcedure_heading();
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
      case PascalPackage.COMPILER_DEFINED_DIRECTIVES__PROCEDURE_HEADING:
        setProcedure_heading((procedure_heading)newValue);
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
      case PascalPackage.COMPILER_DEFINED_DIRECTIVES__PROCEDURE_HEADING:
        setProcedure_heading((procedure_heading)null);
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
      case PascalPackage.COMPILER_DEFINED_DIRECTIVES__PROCEDURE_HEADING:
        return procedure_heading != null;
    }
    return super.eIsSet(featureID);
  }

} //compiler_defined_directivesImpl