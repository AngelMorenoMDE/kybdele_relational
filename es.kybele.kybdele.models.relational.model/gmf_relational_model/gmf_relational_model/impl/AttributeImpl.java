/**
 */
package gmf_relational_model.gmf_relational_model.impl;

import gmf_relational_model.gmf_relational_model.Attribute;
import gmf_relational_model.gmf_relational_model.EGenericType;
import gmf_relational_model.gmf_relational_model.Gmf_relational_modelPackage;
import gmf_relational_model.gmf_relational_model.Relation;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gmf_relational_model.gmf_relational_model.impl.AttributeImpl#getName <em>Name</em>}</li>
 *   <li>{@link gmf_relational_model.gmf_relational_model.impl.AttributeImpl#getType <em>Type</em>}</li>
 *   <li>{@link gmf_relational_model.gmf_relational_model.impl.AttributeImpl#getIsPK <em>Is PK</em>}</li>
 *   <li>{@link gmf_relational_model.gmf_relational_model.impl.AttributeImpl#getIsFK <em>Is FK</em>}</li>
 *   <li>{@link gmf_relational_model.gmf_relational_model.impl.AttributeImpl#isIsUN <em>Is UN</em>}</li>
 *   <li>{@link gmf_relational_model.gmf_relational_model.impl.AttributeImpl#isIsNN <em>Is NN</em>}</li>
 *   <li>{@link gmf_relational_model.gmf_relational_model.impl.AttributeImpl#getIsContained <em>Is Contained</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AttributeImpl extends MinimalEObjectImpl.Container implements Attribute {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final EGenericType TYPE_EDEFAULT = EGenericType.STRING;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected EGenericType type = TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getIsPK() <em>Is PK</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsPK()
	 * @generated
	 * @ordered
	 */
	protected Relation isPK;

	/**
	 * The cached value of the '{@link #getIsFK() <em>Is FK</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsFK()
	 * @generated
	 * @ordered
	 */
	protected Attribute isFK;

	/**
	 * The default value of the '{@link #isIsUN() <em>Is UN</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsUN()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_UN_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsUN() <em>Is UN</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsUN()
	 * @generated
	 * @ordered
	 */
	protected boolean isUN = IS_UN_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsNN() <em>Is NN</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsNN()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_NN_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsNN() <em>Is NN</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsNN()
	 * @generated
	 * @ordered
	 */
	protected boolean isNN = IS_NN_EDEFAULT;
	
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttributeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Gmf_relational_modelPackage.Literals.ATTRIBUTE;
	}
	
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Gmf_relational_modelPackage.ATTRIBUTE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EGenericType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(EGenericType newType) {
		EGenericType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Gmf_relational_modelPackage.ATTRIBUTE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Relation getIsPK() {
		if (isPK != null && isPK.eIsProxy()) {
			InternalEObject oldIsPK = (InternalEObject)isPK;
			isPK = (Relation)eResolveProxy(oldIsPK);
			if (isPK != oldIsPK) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Gmf_relational_modelPackage.ATTRIBUTE__IS_PK, oldIsPK, isPK));
			}
		}
		return isPK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Relation basicGetIsPK() {
		return isPK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIsPK(Relation newIsPK, NotificationChain msgs) {
		Relation oldIsPK = isPK;
		isPK = newIsPK;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Gmf_relational_modelPackage.ATTRIBUTE__IS_PK, oldIsPK, newIsPK);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsPK(Relation newIsPK) {
		if (newIsPK != isPK) {
			NotificationChain msgs = null;
			if (isPK != null)
				msgs = ((InternalEObject)isPK).eInverseRemove(this, Gmf_relational_modelPackage.RELATION__HAS_PK, Relation.class, msgs);
			if (newIsPK != null)
				msgs = ((InternalEObject)newIsPK).eInverseAdd(this, Gmf_relational_modelPackage.RELATION__HAS_PK, Relation.class, msgs);
			msgs = basicSetIsPK(newIsPK, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Gmf_relational_modelPackage.ATTRIBUTE__IS_PK, newIsPK, newIsPK));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute getIsFK() {
		if (isFK != null && isFK.eIsProxy()) {
			InternalEObject oldIsFK = (InternalEObject)isFK;
			isFK = (Attribute)eResolveProxy(oldIsFK);
			if (isFK != oldIsFK) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Gmf_relational_modelPackage.ATTRIBUTE__IS_FK, oldIsFK, isFK));
			}
		}
		return isFK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute basicGetIsFK() {
		return isFK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsFK(Attribute newIsFK) {
		Attribute oldIsFK = isFK;
		isFK = newIsFK;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Gmf_relational_modelPackage.ATTRIBUTE__IS_FK, oldIsFK, isFK));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsUN() {
		return isUN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsUN(boolean newIsUN) {
		boolean oldIsUN = isUN;
		isUN = newIsUN;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Gmf_relational_modelPackage.ATTRIBUTE__IS_UN, oldIsUN, isUN));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsNN() {
		return isNN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsNN(boolean newIsNN) {
		boolean oldIsNN = isNN;
		isNN = newIsNN;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Gmf_relational_modelPackage.ATTRIBUTE__IS_NN, oldIsNN, isNN));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Relation getIsContained() {
		if (eContainerFeatureID() != Gmf_relational_modelPackage.ATTRIBUTE__IS_CONTAINED) return null;
		return (Relation)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIsContained(Relation newIsContained, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newIsContained, Gmf_relational_modelPackage.ATTRIBUTE__IS_CONTAINED, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsContained(Relation newIsContained) {
		if (newIsContained != eInternalContainer() || (eContainerFeatureID() != Gmf_relational_modelPackage.ATTRIBUTE__IS_CONTAINED && newIsContained != null)) {
			if (EcoreUtil.isAncestor(this, newIsContained))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newIsContained != null)
				msgs = ((InternalEObject)newIsContained).eInverseAdd(this, Gmf_relational_modelPackage.RELATION__CONTAINS_ATTRIBUTES, Relation.class, msgs);
			msgs = basicSetIsContained(newIsContained, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Gmf_relational_modelPackage.ATTRIBUTE__IS_CONTAINED, newIsContained, newIsContained));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Gmf_relational_modelPackage.ATTRIBUTE__IS_PK:
				if (isPK != null)
					msgs = ((InternalEObject)isPK).eInverseRemove(this, Gmf_relational_modelPackage.RELATION__HAS_PK, Relation.class, msgs);
				return basicSetIsPK((Relation)otherEnd, msgs);
			case Gmf_relational_modelPackage.ATTRIBUTE__IS_CONTAINED:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetIsContained((Relation)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Gmf_relational_modelPackage.ATTRIBUTE__IS_PK:
				return basicSetIsPK(null, msgs);
			case Gmf_relational_modelPackage.ATTRIBUTE__IS_CONTAINED:
				return basicSetIsContained(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case Gmf_relational_modelPackage.ATTRIBUTE__IS_CONTAINED:
				return eInternalContainer().eInverseRemove(this, Gmf_relational_modelPackage.RELATION__CONTAINS_ATTRIBUTES, Relation.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Gmf_relational_modelPackage.ATTRIBUTE__NAME:
				return getName();
			case Gmf_relational_modelPackage.ATTRIBUTE__TYPE:
				return getType();
			case Gmf_relational_modelPackage.ATTRIBUTE__IS_PK:
				if (resolve) return getIsPK();
				return basicGetIsPK();
			case Gmf_relational_modelPackage.ATTRIBUTE__IS_FK:
				if (resolve) return getIsFK();
				return basicGetIsFK();
			case Gmf_relational_modelPackage.ATTRIBUTE__IS_UN:
				return isIsUN();
			case Gmf_relational_modelPackage.ATTRIBUTE__IS_NN:
				return isIsNN();
			case Gmf_relational_modelPackage.ATTRIBUTE__IS_CONTAINED:
				return getIsContained();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Gmf_relational_modelPackage.ATTRIBUTE__NAME:
				setName((String)newValue);
				return;
			case Gmf_relational_modelPackage.ATTRIBUTE__TYPE:
				setType((EGenericType)newValue);
				return;
			case Gmf_relational_modelPackage.ATTRIBUTE__IS_PK:
				setIsPK((Relation)newValue);
				return;
			case Gmf_relational_modelPackage.ATTRIBUTE__IS_FK:
				setIsFK((Attribute)newValue);
				return;
			case Gmf_relational_modelPackage.ATTRIBUTE__IS_UN:
				setIsUN((Boolean)newValue);
				return;
			case Gmf_relational_modelPackage.ATTRIBUTE__IS_NN:
				setIsNN((Boolean)newValue);
				return;
			case Gmf_relational_modelPackage.ATTRIBUTE__IS_CONTAINED:
				setIsContained((Relation)newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case Gmf_relational_modelPackage.ATTRIBUTE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case Gmf_relational_modelPackage.ATTRIBUTE__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case Gmf_relational_modelPackage.ATTRIBUTE__IS_PK:
				setIsPK((Relation)null);
				return;
			case Gmf_relational_modelPackage.ATTRIBUTE__IS_FK:
				setIsFK((Attribute)null);
				return;
			case Gmf_relational_modelPackage.ATTRIBUTE__IS_UN:
				setIsUN(IS_UN_EDEFAULT);
				return;
			case Gmf_relational_modelPackage.ATTRIBUTE__IS_NN:
				setIsNN(IS_NN_EDEFAULT);
				return;
			case Gmf_relational_modelPackage.ATTRIBUTE__IS_CONTAINED:
				setIsContained((Relation)null);
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Gmf_relational_modelPackage.ATTRIBUTE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case Gmf_relational_modelPackage.ATTRIBUTE__TYPE:
				return type != TYPE_EDEFAULT;
			case Gmf_relational_modelPackage.ATTRIBUTE__IS_PK:
				return isPK != null;
			case Gmf_relational_modelPackage.ATTRIBUTE__IS_FK:
				return isFK != null;
			case Gmf_relational_modelPackage.ATTRIBUTE__IS_UN:
				return isUN != IS_UN_EDEFAULT;
			case Gmf_relational_modelPackage.ATTRIBUTE__IS_NN:
				return isNN != IS_NN_EDEFAULT;
			case Gmf_relational_modelPackage.ATTRIBUTE__IS_CONTAINED:
				return getIsContained() != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", type: ");
		result.append(type);
		result.append(", isUN: ");
		result.append(isUN);
		result.append(", isNN: ");
		result.append(isNN);
		result.append(')');
		return result.toString();
	}

} //AttributeImpl
