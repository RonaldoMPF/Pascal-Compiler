/**
 * generated by Xtext 2.16.0-SNAPSHOT
 */
package org.xtext.example.mydsl.pascal.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.example.mydsl.pascal.PascalPackage;
import org.xtext.example.mydsl.pascal.typeDefinition;
import org.xtext.example.mydsl.pascal.typeDefinitionPart;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>type Definition Part</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.pascal.impl.typeDefinitionPartImpl#getTypeDefinition <em>Type Definition</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.pascal.impl.typeDefinitionPartImpl#getSemiTerminal <em>Semi Terminal</em>}</li>
 * </ul>
 *
 * @generated
 */
public class typeDefinitionPartImpl extends MinimalEObjectImpl.Container implements typeDefinitionPart
{
  /**
   * The cached value of the '{@link #getTypeDefinition() <em>Type Definition</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTypeDefinition()
   * @generated
   * @ordered
   */
  protected EList<typeDefinition> typeDefinition;

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
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected typeDefinitionPartImpl()
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
    return PascalPackage.Literals.TYPE_DEFINITION_PART;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<typeDefinition> getTypeDefinition()
  {
    if (typeDefinition == null)
    {
      typeDefinition = new EObjectContainmentEList<typeDefinition>(typeDefinition.class, this, PascalPackage.TYPE_DEFINITION_PART__TYPE_DEFINITION);
    }
    return typeDefinition;
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
      semiTerminal = new EDataTypeEList<String>(String.class, this, PascalPackage.TYPE_DEFINITION_PART__SEMI_TERMINAL);
    }
    return semiTerminal;
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
      case PascalPackage.TYPE_DEFINITION_PART__TYPE_DEFINITION:
        return ((InternalEList<?>)getTypeDefinition()).basicRemove(otherEnd, msgs);
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
      case PascalPackage.TYPE_DEFINITION_PART__TYPE_DEFINITION:
        return getTypeDefinition();
      case PascalPackage.TYPE_DEFINITION_PART__SEMI_TERMINAL:
        return getSemiTerminal();
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
      case PascalPackage.TYPE_DEFINITION_PART__TYPE_DEFINITION:
        getTypeDefinition().clear();
        getTypeDefinition().addAll((Collection<? extends typeDefinition>)newValue);
        return;
      case PascalPackage.TYPE_DEFINITION_PART__SEMI_TERMINAL:
        getSemiTerminal().clear();
        getSemiTerminal().addAll((Collection<? extends String>)newValue);
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
      case PascalPackage.TYPE_DEFINITION_PART__TYPE_DEFINITION:
        getTypeDefinition().clear();
        return;
      case PascalPackage.TYPE_DEFINITION_PART__SEMI_TERMINAL:
        getSemiTerminal().clear();
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
      case PascalPackage.TYPE_DEFINITION_PART__TYPE_DEFINITION:
        return typeDefinition != null && !typeDefinition.isEmpty();
      case PascalPackage.TYPE_DEFINITION_PART__SEMI_TERMINAL:
        return semiTerminal != null && !semiTerminal.isEmpty();
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

} //typeDefinitionPartImpl