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
import org.xtext.example.mydsl.pascal.tag;
import org.xtext.example.mydsl.pascal.variant;
import org.xtext.example.mydsl.pascal.variantPart;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>variant Part</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.pascal.impl.variantPartImpl#getTag <em>Tag</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.pascal.impl.variantPartImpl#getVariant1 <em>Variant1</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.pascal.impl.variantPartImpl#getSemiTerminal <em>Semi Terminal</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.pascal.impl.variantPartImpl#getVariant2 <em>Variant2</em>}</li>
 * </ul>
 *
 * @generated
 */
public class variantPartImpl extends MinimalEObjectImpl.Container implements variantPart
{
  /**
   * The cached value of the '{@link #getTag() <em>Tag</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTag()
   * @generated
   * @ordered
   */
  protected tag tag;

  /**
   * The cached value of the '{@link #getVariant1() <em>Variant1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVariant1()
   * @generated
   * @ordered
   */
  protected variant variant1;

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
   * The cached value of the '{@link #getVariant2() <em>Variant2</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVariant2()
   * @generated
   * @ordered
   */
  protected EList<variant> variant2;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected variantPartImpl()
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
    return PascalPackage.Literals.VARIANT_PART;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public tag getTag()
  {
    return tag;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTag(tag newTag, NotificationChain msgs)
  {
    tag oldTag = tag;
    tag = newTag;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PascalPackage.VARIANT_PART__TAG, oldTag, newTag);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTag(tag newTag)
  {
    if (newTag != tag)
    {
      NotificationChain msgs = null;
      if (tag != null)
        msgs = ((InternalEObject)tag).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PascalPackage.VARIANT_PART__TAG, null, msgs);
      if (newTag != null)
        msgs = ((InternalEObject)newTag).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PascalPackage.VARIANT_PART__TAG, null, msgs);
      msgs = basicSetTag(newTag, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PascalPackage.VARIANT_PART__TAG, newTag, newTag));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public variant getVariant1()
  {
    return variant1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetVariant1(variant newVariant1, NotificationChain msgs)
  {
    variant oldVariant1 = variant1;
    variant1 = newVariant1;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PascalPackage.VARIANT_PART__VARIANT1, oldVariant1, newVariant1);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVariant1(variant newVariant1)
  {
    if (newVariant1 != variant1)
    {
      NotificationChain msgs = null;
      if (variant1 != null)
        msgs = ((InternalEObject)variant1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PascalPackage.VARIANT_PART__VARIANT1, null, msgs);
      if (newVariant1 != null)
        msgs = ((InternalEObject)newVariant1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PascalPackage.VARIANT_PART__VARIANT1, null, msgs);
      msgs = basicSetVariant1(newVariant1, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PascalPackage.VARIANT_PART__VARIANT1, newVariant1, newVariant1));
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
      semiTerminal = new EDataTypeEList<String>(String.class, this, PascalPackage.VARIANT_PART__SEMI_TERMINAL);
    }
    return semiTerminal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<variant> getVariant2()
  {
    if (variant2 == null)
    {
      variant2 = new EObjectContainmentEList<variant>(variant.class, this, PascalPackage.VARIANT_PART__VARIANT2);
    }
    return variant2;
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
      case PascalPackage.VARIANT_PART__TAG:
        return basicSetTag(null, msgs);
      case PascalPackage.VARIANT_PART__VARIANT1:
        return basicSetVariant1(null, msgs);
      case PascalPackage.VARIANT_PART__VARIANT2:
        return ((InternalEList<?>)getVariant2()).basicRemove(otherEnd, msgs);
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
      case PascalPackage.VARIANT_PART__TAG:
        return getTag();
      case PascalPackage.VARIANT_PART__VARIANT1:
        return getVariant1();
      case PascalPackage.VARIANT_PART__SEMI_TERMINAL:
        return getSemiTerminal();
      case PascalPackage.VARIANT_PART__VARIANT2:
        return getVariant2();
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
      case PascalPackage.VARIANT_PART__TAG:
        setTag((tag)newValue);
        return;
      case PascalPackage.VARIANT_PART__VARIANT1:
        setVariant1((variant)newValue);
        return;
      case PascalPackage.VARIANT_PART__SEMI_TERMINAL:
        getSemiTerminal().clear();
        getSemiTerminal().addAll((Collection<? extends String>)newValue);
        return;
      case PascalPackage.VARIANT_PART__VARIANT2:
        getVariant2().clear();
        getVariant2().addAll((Collection<? extends variant>)newValue);
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
      case PascalPackage.VARIANT_PART__TAG:
        setTag((tag)null);
        return;
      case PascalPackage.VARIANT_PART__VARIANT1:
        setVariant1((variant)null);
        return;
      case PascalPackage.VARIANT_PART__SEMI_TERMINAL:
        getSemiTerminal().clear();
        return;
      case PascalPackage.VARIANT_PART__VARIANT2:
        getVariant2().clear();
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
      case PascalPackage.VARIANT_PART__TAG:
        return tag != null;
      case PascalPackage.VARIANT_PART__VARIANT1:
        return variant1 != null;
      case PascalPackage.VARIANT_PART__SEMI_TERMINAL:
        return semiTerminal != null && !semiTerminal.isEmpty();
      case PascalPackage.VARIANT_PART__VARIANT2:
        return variant2 != null && !variant2.isEmpty();
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

} //variantPartImpl