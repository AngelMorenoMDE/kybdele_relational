/**
 */
package gmf_relational_model.gmf_relational_model.impl;

import gmf_relational_model.gmf_relational_model.Attribute;
import gmf_relational_model.gmf_relational_model.EGenericType;
import gmf_relational_model.gmf_relational_model.Gmf_relational_modelPackage;
import gmf_relational_model.gmf_relational_model.LinkFK;
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
 *   <li>{@link gmf_relational_model.gmf_relational_model.impl.AttributeImpl#getPkReference <em>Pk Reference</em>}</li>
 *   <li>{@link gmf_relational_model.gmf_relational_model.impl.AttributeImpl#getIsFK <em>Is FK</em>}</li>
 *   <li>{@link gmf_relational_model.gmf_relational_model.impl.AttributeImpl#isIsUN <em>Is UN</em>}</li>
 *   <li>{@link gmf_relational_model.gmf_relational_model.impl.AttributeImpl#isIsNN <em>Is NN</em>}</li>
 *   <li>{@link gmf_relational_model.gmf_relational_model.impl.AttributeImpl#getIsContained <em>Is Contained</em>}</li>
 *   <li>{@link gmf_relational_model.gmf_relational_model.impl.AttributeImpl#getLabelWidth <em>Label Width</em>}</li>
 *   <li>{@link gmf_relational_model.gmf_relational_model.impl.AttributeImpl#isIsPK <em>Is PK</em>}</li>
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
	protected static final EGenericType TYPE_EDEFAULT = EGenericType.UNDEFINED;

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
	 * The cached value of the '{@link #getPkReference() <em>Pk Reference</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPkReference()
	 * @generated
	 * @ordered
	 */
	protected Relation pkReference;

	/**
	 * The cached value of the '{@link #getIsFK() <em>Is FK</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsFK()
	 * @generated
	 * @ordered
	 */
	protected LinkFK isFK;

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
	 * The default value of the '{@link #getLabelWidth() <em>Label Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabelWidth()
	 * @generated
	 * @ordered
	 */
	protected static final int LABEL_WIDTH_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getLabelWidth() <em>Label Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabelWidth()
	 * @generated
	 * @ordered
	 */
	protected int labelWidth = LABEL_WIDTH_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsPK() <em>Is PK</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsPK()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_PK_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsPK() <em>Is PK</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsPK()
	 * @generated
	 * @ordered
	 */
	protected boolean isPK = IS_PK_EDEFAULT;

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
	public Relation getPkReference() {
		if (pkReference != null && pkReference.eIsProxy()) {
			InternalEObject oldPkReference = (InternalEObject)pkReference;
			pkReference = (Relation)eResolveProxy(oldPkReference);
			if (pkReference != oldPkReference) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Gmf_relational_modelPackage.ATTRIBUTE__PK_REFERENCE, oldPkReference, pkReference));
			}
		}
		return pkReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Relation basicGetPkReference() {
		return pkReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPkReference(Relation newPkReference, NotificationChain msgs) {
		Relation oldPkReference = pkReference;
		pkReference = newPkReference;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Gmf_relational_modelPackage.ATTRIBUTE__PK_REFERENCE, oldPkReference, newPkReference);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPkReference(Relation newPkReference) {
		if (newPkReference != pkReference) {
			NotificationChain msgs = null;
			if (pkReference != null)
				msgs = ((InternalEObject)pkReference).eInverseRemove(this, Gmf_relational_modelPackage.RELATION__HAS_PK, Relation.class, msgs);
			if (newPkReference != null)
				msgs = ((InternalEObject)newPkReference).eInverseAdd(this, Gmf_relational_modelPackage.RELATION__HAS_PK, Relation.class, msgs);
			msgs = basicSetPkReference(newPkReference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Gmf_relational_modelPackage.ATTRIBUTE__PK_REFERENCE, newPkReference, newPkReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinkFK getIsFK() {
		if (isFK != null && isFK.eIsProxy()) {
			InternalEObject oldIsFK = (InternalEObject)isFK;
			isFK = (LinkFK)eResolveProxy(oldIsFK);
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
	public LinkFK basicGetIsFK() {
		return isFK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIsFK(LinkFK newIsFK, NotificationChain msgs) {
		LinkFK oldIsFK = isFK;
		isFK = newIsFK;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Gmf_relational_modelPackage.ATTRIBUTE__IS_FK, oldIsFK, newIsFK);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsFK(LinkFK newIsFK) {
		if (newIsFK != isFK) {
			NotificationChain msgs = null;
			if (isFK != null)
				msgs = ((InternalEObject)isFK).eInverseRemove(this, Gmf_relational_modelPackage.LINK_FK__SOURCE, LinkFK.class, msgs);
			if (newIsFK != null)
				msgs = ((InternalEObject)newIsFK).eInverseAdd(this, Gmf_relational_modelPackage.LINK_FK__SOURCE, LinkFK.class, msgs);
			msgs = basicSetIsFK(newIsFK, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Gmf_relational_modelPackage.ATTRIBUTE__IS_FK, newIsFK, newIsFK));
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
	public int getLabelWidth() {
		return labelWidth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLabelWidth(int newLabelWidth) {
		int oldLabelWidth = labelWidth;
		labelWidth = newLabelWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Gmf_relational_modelPackage.ATTRIBUTE__LABEL_WIDTH, oldLabelWidth, labelWidth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsPK() {
		return isPK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * 
	 * TODO JLS : seteamos la referencia a la relacion con la relacion que contiene a dicho atributo
	 */
	public void setIsPK(boolean newIsPK) {
		if (newIsPK){
			setPkReference(this.getIsContained());
			setIsUN(true);
			setIsNN(true);
		}else{
			setPkReference(null);
		}
		boolean oldFlagPK = isPK;
		isPK = newIsPK;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Gmf_relational_modelPackage.ATTRIBUTE__IS_PK, oldFlagPK, isPK));
		
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Gmf_relational_modelPackage.ATTRIBUTE__PK_REFERENCE:
				if (pkReference != null)
					msgs = ((InternalEObject)pkReference).eInverseRemove(this, Gmf_relational_modelPackage.RELATION__HAS_PK, Relation.class, msgs);
				return basicSetPkReference((Relation)otherEnd, msgs);
			case Gmf_relational_modelPackage.ATTRIBUTE__IS_FK:
				if (isFK != null)
					msgs = ((InternalEObject)isFK).eInverseRemove(this, Gmf_relational_modelPackage.LINK_FK__SOURCE, LinkFK.class, msgs);
				return basicSetIsFK((LinkFK)otherEnd, msgs);
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
			case Gmf_relational_modelPackage.ATTRIBUTE__PK_REFERENCE:
				return basicSetPkReference(null, msgs);
			case Gmf_relational_modelPackage.ATTRIBUTE__IS_FK:
				return basicSetIsFK(null, msgs);
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
			case Gmf_relational_modelPackage.ATTRIBUTE__PK_REFERENCE:
				if (resolve) return getPkReference();
				return basicGetPkReference();
			case Gmf_relational_modelPackage.ATTRIBUTE__IS_FK:
				if (resolve) return getIsFK();
				return basicGetIsFK();
			case Gmf_relational_modelPackage.ATTRIBUTE__IS_UN:
				return isIsUN();
			case Gmf_relational_modelPackage.ATTRIBUTE__IS_NN:
				return isIsNN();
			case Gmf_relational_modelPackage.ATTRIBUTE__IS_CONTAINED:
				return getIsContained();
			case Gmf_relational_modelPackage.ATTRIBUTE__LABEL_WIDTH:
				return getLabelWidth();
			case Gmf_relational_modelPackage.ATTRIBUTE__IS_PK:
				return isIsPK();
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
			case Gmf_relational_modelPackage.ATTRIBUTE__PK_REFERENCE:
				setPkReference((Relation)newValue);
				return;
			case Gmf_relational_modelPackage.ATTRIBUTE__IS_FK:
				setIsFK((LinkFK)newValue);
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
			case Gmf_relational_modelPackage.ATTRIBUTE__LABEL_WIDTH:
				setLabelWidth((Integer)newValue);
				return;
			case Gmf_relational_modelPackage.ATTRIBUTE__IS_PK:
				setIsPK((Boolean)newValue);
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
			case Gmf_relational_modelPackage.ATTRIBUTE__PK_REFERENCE:
				setPkReference((Relation)null);
				return;
			case Gmf_relational_modelPackage.ATTRIBUTE__IS_FK:
				setIsFK((LinkFK)null);
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
			case Gmf_relational_modelPackage.ATTRIBUTE__LABEL_WIDTH:
				setLabelWidth(LABEL_WIDTH_EDEFAULT);
				return;
			case Gmf_relational_modelPackage.ATTRIBUTE__IS_PK:
				setIsPK(IS_PK_EDEFAULT);
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
			case Gmf_relational_modelPackage.ATTRIBUTE__PK_REFERENCE:
				return pkReference != null;
			case Gmf_relational_modelPackage.ATTRIBUTE__IS_FK:
				return isFK != null;
			case Gmf_relational_modelPackage.ATTRIBUTE__IS_UN:
				return isUN != IS_UN_EDEFAULT;
			case Gmf_relational_modelPackage.ATTRIBUTE__IS_NN:
				return isNN != IS_NN_EDEFAULT;
			case Gmf_relational_modelPackage.ATTRIBUTE__IS_CONTAINED:
				return getIsContained() != null;
			case Gmf_relational_modelPackage.ATTRIBUTE__LABEL_WIDTH:
				return labelWidth != LABEL_WIDTH_EDEFAULT;
			case Gmf_relational_modelPackage.ATTRIBUTE__IS_PK:
				return isPK != IS_PK_EDEFAULT;
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
		result.append(", labelWidth: ");
		result.append(labelWidth);
		result.append(", isPK: ");
		result.append(isPK);
		result.append(')');
		return result.toString();
	}

} //AttributeImpl
