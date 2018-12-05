/**
 * generated by Xtext 2.16.0-SNAPSHOT
 */
package org.xtext.example.mydsl.pascal.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.mydsl.pascal.PascalPackage;
import org.xtext.example.mydsl.pascal.assignmentStatement;
import org.xtext.example.mydsl.pascal.gotoStatement;
import org.xtext.example.mydsl.pascal.procedureStatement;
import org.xtext.example.mydsl.pascal.simpleStatement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>simple Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.pascal.impl.simpleStatementImpl#getAssignmentStatement <em>Assignment Statement</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.pascal.impl.simpleStatementImpl#getProcedureStatement <em>Procedure Statement</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.pascal.impl.simpleStatementImpl#getGotoStatement <em>Goto Statement</em>}</li>
 * </ul>
 *
 * @generated
 */
public class simpleStatementImpl extends MinimalEObjectImpl.Container implements simpleStatement
{
  /**
   * The cached value of the '{@link #getAssignmentStatement() <em>Assignment Statement</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAssignmentStatement()
   * @generated
   * @ordered
   */
  protected assignmentStatement assignmentStatement;

  /**
   * The cached value of the '{@link #getProcedureStatement() <em>Procedure Statement</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProcedureStatement()
   * @generated
   * @ordered
   */
  protected procedureStatement procedureStatement;

  /**
   * The cached value of the '{@link #getGotoStatement() <em>Goto Statement</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGotoStatement()
   * @generated
   * @ordered
   */
  protected gotoStatement gotoStatement;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected simpleStatementImpl()
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
    return PascalPackage.Literals.SIMPLE_STATEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public assignmentStatement getAssignmentStatement()
  {
    return assignmentStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAssignmentStatement(assignmentStatement newAssignmentStatement, NotificationChain msgs)
  {
    assignmentStatement oldAssignmentStatement = assignmentStatement;
    assignmentStatement = newAssignmentStatement;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PascalPackage.SIMPLE_STATEMENT__ASSIGNMENT_STATEMENT, oldAssignmentStatement, newAssignmentStatement);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAssignmentStatement(assignmentStatement newAssignmentStatement)
  {
    if (newAssignmentStatement != assignmentStatement)
    {
      NotificationChain msgs = null;
      if (assignmentStatement != null)
        msgs = ((InternalEObject)assignmentStatement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PascalPackage.SIMPLE_STATEMENT__ASSIGNMENT_STATEMENT, null, msgs);
      if (newAssignmentStatement != null)
        msgs = ((InternalEObject)newAssignmentStatement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PascalPackage.SIMPLE_STATEMENT__ASSIGNMENT_STATEMENT, null, msgs);
      msgs = basicSetAssignmentStatement(newAssignmentStatement, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PascalPackage.SIMPLE_STATEMENT__ASSIGNMENT_STATEMENT, newAssignmentStatement, newAssignmentStatement));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public procedureStatement getProcedureStatement()
  {
    return procedureStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetProcedureStatement(procedureStatement newProcedureStatement, NotificationChain msgs)
  {
    procedureStatement oldProcedureStatement = procedureStatement;
    procedureStatement = newProcedureStatement;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PascalPackage.SIMPLE_STATEMENT__PROCEDURE_STATEMENT, oldProcedureStatement, newProcedureStatement);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setProcedureStatement(procedureStatement newProcedureStatement)
  {
    if (newProcedureStatement != procedureStatement)
    {
      NotificationChain msgs = null;
      if (procedureStatement != null)
        msgs = ((InternalEObject)procedureStatement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PascalPackage.SIMPLE_STATEMENT__PROCEDURE_STATEMENT, null, msgs);
      if (newProcedureStatement != null)
        msgs = ((InternalEObject)newProcedureStatement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PascalPackage.SIMPLE_STATEMENT__PROCEDURE_STATEMENT, null, msgs);
      msgs = basicSetProcedureStatement(newProcedureStatement, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PascalPackage.SIMPLE_STATEMENT__PROCEDURE_STATEMENT, newProcedureStatement, newProcedureStatement));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public gotoStatement getGotoStatement()
  {
    return gotoStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetGotoStatement(gotoStatement newGotoStatement, NotificationChain msgs)
  {
    gotoStatement oldGotoStatement = gotoStatement;
    gotoStatement = newGotoStatement;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PascalPackage.SIMPLE_STATEMENT__GOTO_STATEMENT, oldGotoStatement, newGotoStatement);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setGotoStatement(gotoStatement newGotoStatement)
  {
    if (newGotoStatement != gotoStatement)
    {
      NotificationChain msgs = null;
      if (gotoStatement != null)
        msgs = ((InternalEObject)gotoStatement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PascalPackage.SIMPLE_STATEMENT__GOTO_STATEMENT, null, msgs);
      if (newGotoStatement != null)
        msgs = ((InternalEObject)newGotoStatement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PascalPackage.SIMPLE_STATEMENT__GOTO_STATEMENT, null, msgs);
      msgs = basicSetGotoStatement(newGotoStatement, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PascalPackage.SIMPLE_STATEMENT__GOTO_STATEMENT, newGotoStatement, newGotoStatement));
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
      case PascalPackage.SIMPLE_STATEMENT__ASSIGNMENT_STATEMENT:
        return basicSetAssignmentStatement(null, msgs);
      case PascalPackage.SIMPLE_STATEMENT__PROCEDURE_STATEMENT:
        return basicSetProcedureStatement(null, msgs);
      case PascalPackage.SIMPLE_STATEMENT__GOTO_STATEMENT:
        return basicSetGotoStatement(null, msgs);
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
      case PascalPackage.SIMPLE_STATEMENT__ASSIGNMENT_STATEMENT:
        return getAssignmentStatement();
      case PascalPackage.SIMPLE_STATEMENT__PROCEDURE_STATEMENT:
        return getProcedureStatement();
      case PascalPackage.SIMPLE_STATEMENT__GOTO_STATEMENT:
        return getGotoStatement();
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
      case PascalPackage.SIMPLE_STATEMENT__ASSIGNMENT_STATEMENT:
        setAssignmentStatement((assignmentStatement)newValue);
        return;
      case PascalPackage.SIMPLE_STATEMENT__PROCEDURE_STATEMENT:
        setProcedureStatement((procedureStatement)newValue);
        return;
      case PascalPackage.SIMPLE_STATEMENT__GOTO_STATEMENT:
        setGotoStatement((gotoStatement)newValue);
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
      case PascalPackage.SIMPLE_STATEMENT__ASSIGNMENT_STATEMENT:
        setAssignmentStatement((assignmentStatement)null);
        return;
      case PascalPackage.SIMPLE_STATEMENT__PROCEDURE_STATEMENT:
        setProcedureStatement((procedureStatement)null);
        return;
      case PascalPackage.SIMPLE_STATEMENT__GOTO_STATEMENT:
        setGotoStatement((gotoStatement)null);
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
      case PascalPackage.SIMPLE_STATEMENT__ASSIGNMENT_STATEMENT:
        return assignmentStatement != null;
      case PascalPackage.SIMPLE_STATEMENT__PROCEDURE_STATEMENT:
        return procedureStatement != null;
      case PascalPackage.SIMPLE_STATEMENT__GOTO_STATEMENT:
        return gotoStatement != null;
    }
    return super.eIsSet(featureID);
  }

} //simpleStatementImpl
