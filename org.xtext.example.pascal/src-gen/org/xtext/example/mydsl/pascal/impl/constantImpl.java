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
import org.xtext.example.mydsl.pascal.StringStart;
import org.xtext.example.mydsl.pascal.constant;
import org.xtext.example.mydsl.pascal.constantChr;
import org.xtext.example.mydsl.pascal.identifier;
import org.xtext.example.mydsl.pascal.sign;
import org.xtext.example.mydsl.pascal.unsignedNumber;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>constant</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.pascal.impl.constantImpl#getUnsignedNumber <em>Unsigned Number</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.pascal.impl.constantImpl#getSign1 <em>Sign1</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.pascal.impl.constantImpl#getIdentifier1 <em>Identifier1</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.pascal.impl.constantImpl#getSign2 <em>Sign2</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.pascal.impl.constantImpl#getIdentifier2 <em>Identifier2</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.pascal.impl.constantImpl#getString <em>String</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.pascal.impl.constantImpl#getConstantChr <em>Constant Chr</em>}</li>
 * </ul>
 *
 * @generated
 */
public class constantImpl extends MinimalEObjectImpl.Container implements constant
{
  /**
   * The cached value of the '{@link #getUnsignedNumber() <em>Unsigned Number</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUnsignedNumber()
   * @generated
   * @ordered
   */
  protected unsignedNumber unsignedNumber;

  /**
   * The cached value of the '{@link #getSign1() <em>Sign1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSign1()
   * @generated
   * @ordered
   */
  protected sign sign1;

  /**
   * The cached value of the '{@link #getIdentifier1() <em>Identifier1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIdentifier1()
   * @generated
   * @ordered
   */
  protected identifier identifier1;

  /**
   * The cached value of the '{@link #getSign2() <em>Sign2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSign2()
   * @generated
   * @ordered
   */
  protected sign sign2;

  /**
   * The cached value of the '{@link #getIdentifier2() <em>Identifier2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIdentifier2()
   * @generated
   * @ordered
   */
  protected identifier identifier2;

  /**
   * The cached value of the '{@link #getString() <em>String</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getString()
   * @generated
   * @ordered
   */
  protected StringStart string;

  /**
   * The cached value of the '{@link #getConstantChr() <em>Constant Chr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConstantChr()
   * @generated
   * @ordered
   */
  protected constantChr constantChr;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected constantImpl()
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
    return PascalPackage.Literals.CONSTANT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public unsignedNumber getUnsignedNumber()
  {
    return unsignedNumber;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetUnsignedNumber(unsignedNumber newUnsignedNumber, NotificationChain msgs)
  {
    unsignedNumber oldUnsignedNumber = unsignedNumber;
    unsignedNumber = newUnsignedNumber;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PascalPackage.CONSTANT__UNSIGNED_NUMBER, oldUnsignedNumber, newUnsignedNumber);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setUnsignedNumber(unsignedNumber newUnsignedNumber)
  {
    if (newUnsignedNumber != unsignedNumber)
    {
      NotificationChain msgs = null;
      if (unsignedNumber != null)
        msgs = ((InternalEObject)unsignedNumber).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PascalPackage.CONSTANT__UNSIGNED_NUMBER, null, msgs);
      if (newUnsignedNumber != null)
        msgs = ((InternalEObject)newUnsignedNumber).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PascalPackage.CONSTANT__UNSIGNED_NUMBER, null, msgs);
      msgs = basicSetUnsignedNumber(newUnsignedNumber, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PascalPackage.CONSTANT__UNSIGNED_NUMBER, newUnsignedNumber, newUnsignedNumber));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public sign getSign1()
  {
    return sign1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSign1(sign newSign1, NotificationChain msgs)
  {
    sign oldSign1 = sign1;
    sign1 = newSign1;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PascalPackage.CONSTANT__SIGN1, oldSign1, newSign1);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSign1(sign newSign1)
  {
    if (newSign1 != sign1)
    {
      NotificationChain msgs = null;
      if (sign1 != null)
        msgs = ((InternalEObject)sign1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PascalPackage.CONSTANT__SIGN1, null, msgs);
      if (newSign1 != null)
        msgs = ((InternalEObject)newSign1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PascalPackage.CONSTANT__SIGN1, null, msgs);
      msgs = basicSetSign1(newSign1, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PascalPackage.CONSTANT__SIGN1, newSign1, newSign1));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public identifier getIdentifier1()
  {
    return identifier1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetIdentifier1(identifier newIdentifier1, NotificationChain msgs)
  {
    identifier oldIdentifier1 = identifier1;
    identifier1 = newIdentifier1;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PascalPackage.CONSTANT__IDENTIFIER1, oldIdentifier1, newIdentifier1);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIdentifier1(identifier newIdentifier1)
  {
    if (newIdentifier1 != identifier1)
    {
      NotificationChain msgs = null;
      if (identifier1 != null)
        msgs = ((InternalEObject)identifier1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PascalPackage.CONSTANT__IDENTIFIER1, null, msgs);
      if (newIdentifier1 != null)
        msgs = ((InternalEObject)newIdentifier1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PascalPackage.CONSTANT__IDENTIFIER1, null, msgs);
      msgs = basicSetIdentifier1(newIdentifier1, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PascalPackage.CONSTANT__IDENTIFIER1, newIdentifier1, newIdentifier1));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public sign getSign2()
  {
    return sign2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSign2(sign newSign2, NotificationChain msgs)
  {
    sign oldSign2 = sign2;
    sign2 = newSign2;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PascalPackage.CONSTANT__SIGN2, oldSign2, newSign2);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSign2(sign newSign2)
  {
    if (newSign2 != sign2)
    {
      NotificationChain msgs = null;
      if (sign2 != null)
        msgs = ((InternalEObject)sign2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PascalPackage.CONSTANT__SIGN2, null, msgs);
      if (newSign2 != null)
        msgs = ((InternalEObject)newSign2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PascalPackage.CONSTANT__SIGN2, null, msgs);
      msgs = basicSetSign2(newSign2, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PascalPackage.CONSTANT__SIGN2, newSign2, newSign2));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public identifier getIdentifier2()
  {
    return identifier2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetIdentifier2(identifier newIdentifier2, NotificationChain msgs)
  {
    identifier oldIdentifier2 = identifier2;
    identifier2 = newIdentifier2;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PascalPackage.CONSTANT__IDENTIFIER2, oldIdentifier2, newIdentifier2);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIdentifier2(identifier newIdentifier2)
  {
    if (newIdentifier2 != identifier2)
    {
      NotificationChain msgs = null;
      if (identifier2 != null)
        msgs = ((InternalEObject)identifier2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PascalPackage.CONSTANT__IDENTIFIER2, null, msgs);
      if (newIdentifier2 != null)
        msgs = ((InternalEObject)newIdentifier2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PascalPackage.CONSTANT__IDENTIFIER2, null, msgs);
      msgs = basicSetIdentifier2(newIdentifier2, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PascalPackage.CONSTANT__IDENTIFIER2, newIdentifier2, newIdentifier2));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StringStart getString()
  {
    return string;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetString(StringStart newString, NotificationChain msgs)
  {
    StringStart oldString = string;
    string = newString;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PascalPackage.CONSTANT__STRING, oldString, newString);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setString(StringStart newString)
  {
    if (newString != string)
    {
      NotificationChain msgs = null;
      if (string != null)
        msgs = ((InternalEObject)string).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PascalPackage.CONSTANT__STRING, null, msgs);
      if (newString != null)
        msgs = ((InternalEObject)newString).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PascalPackage.CONSTANT__STRING, null, msgs);
      msgs = basicSetString(newString, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PascalPackage.CONSTANT__STRING, newString, newString));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public constantChr getConstantChr()
  {
    return constantChr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetConstantChr(constantChr newConstantChr, NotificationChain msgs)
  {
    constantChr oldConstantChr = constantChr;
    constantChr = newConstantChr;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PascalPackage.CONSTANT__CONSTANT_CHR, oldConstantChr, newConstantChr);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setConstantChr(constantChr newConstantChr)
  {
    if (newConstantChr != constantChr)
    {
      NotificationChain msgs = null;
      if (constantChr != null)
        msgs = ((InternalEObject)constantChr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PascalPackage.CONSTANT__CONSTANT_CHR, null, msgs);
      if (newConstantChr != null)
        msgs = ((InternalEObject)newConstantChr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PascalPackage.CONSTANT__CONSTANT_CHR, null, msgs);
      msgs = basicSetConstantChr(newConstantChr, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PascalPackage.CONSTANT__CONSTANT_CHR, newConstantChr, newConstantChr));
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
      case PascalPackage.CONSTANT__UNSIGNED_NUMBER:
        return basicSetUnsignedNumber(null, msgs);
      case PascalPackage.CONSTANT__SIGN1:
        return basicSetSign1(null, msgs);
      case PascalPackage.CONSTANT__IDENTIFIER1:
        return basicSetIdentifier1(null, msgs);
      case PascalPackage.CONSTANT__SIGN2:
        return basicSetSign2(null, msgs);
      case PascalPackage.CONSTANT__IDENTIFIER2:
        return basicSetIdentifier2(null, msgs);
      case PascalPackage.CONSTANT__STRING:
        return basicSetString(null, msgs);
      case PascalPackage.CONSTANT__CONSTANT_CHR:
        return basicSetConstantChr(null, msgs);
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
      case PascalPackage.CONSTANT__UNSIGNED_NUMBER:
        return getUnsignedNumber();
      case PascalPackage.CONSTANT__SIGN1:
        return getSign1();
      case PascalPackage.CONSTANT__IDENTIFIER1:
        return getIdentifier1();
      case PascalPackage.CONSTANT__SIGN2:
        return getSign2();
      case PascalPackage.CONSTANT__IDENTIFIER2:
        return getIdentifier2();
      case PascalPackage.CONSTANT__STRING:
        return getString();
      case PascalPackage.CONSTANT__CONSTANT_CHR:
        return getConstantChr();
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
      case PascalPackage.CONSTANT__UNSIGNED_NUMBER:
        setUnsignedNumber((unsignedNumber)newValue);
        return;
      case PascalPackage.CONSTANT__SIGN1:
        setSign1((sign)newValue);
        return;
      case PascalPackage.CONSTANT__IDENTIFIER1:
        setIdentifier1((identifier)newValue);
        return;
      case PascalPackage.CONSTANT__SIGN2:
        setSign2((sign)newValue);
        return;
      case PascalPackage.CONSTANT__IDENTIFIER2:
        setIdentifier2((identifier)newValue);
        return;
      case PascalPackage.CONSTANT__STRING:
        setString((StringStart)newValue);
        return;
      case PascalPackage.CONSTANT__CONSTANT_CHR:
        setConstantChr((constantChr)newValue);
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
      case PascalPackage.CONSTANT__UNSIGNED_NUMBER:
        setUnsignedNumber((unsignedNumber)null);
        return;
      case PascalPackage.CONSTANT__SIGN1:
        setSign1((sign)null);
        return;
      case PascalPackage.CONSTANT__IDENTIFIER1:
        setIdentifier1((identifier)null);
        return;
      case PascalPackage.CONSTANT__SIGN2:
        setSign2((sign)null);
        return;
      case PascalPackage.CONSTANT__IDENTIFIER2:
        setIdentifier2((identifier)null);
        return;
      case PascalPackage.CONSTANT__STRING:
        setString((StringStart)null);
        return;
      case PascalPackage.CONSTANT__CONSTANT_CHR:
        setConstantChr((constantChr)null);
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
      case PascalPackage.CONSTANT__UNSIGNED_NUMBER:
        return unsignedNumber != null;
      case PascalPackage.CONSTANT__SIGN1:
        return sign1 != null;
      case PascalPackage.CONSTANT__IDENTIFIER1:
        return identifier1 != null;
      case PascalPackage.CONSTANT__SIGN2:
        return sign2 != null;
      case PascalPackage.CONSTANT__IDENTIFIER2:
        return identifier2 != null;
      case PascalPackage.CONSTANT__STRING:
        return string != null;
      case PascalPackage.CONSTANT__CONSTANT_CHR:
        return constantChr != null;
    }
    return super.eIsSet(featureID);
  }

} //constantImpl
