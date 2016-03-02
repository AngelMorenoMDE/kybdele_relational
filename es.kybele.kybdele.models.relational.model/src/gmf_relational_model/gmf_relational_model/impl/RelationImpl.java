/**
 */
package gmf_relational_model.gmf_relational_model.impl;

import gmf_relational_model.gmf_relational_model.Attribute;
import gmf_relational_model.gmf_relational_model.Gmf_relational_modelPackage;
import gmf_relational_model.gmf_relational_model.Relation;
import gmf_relational_model.gmf_relational_model.Schema;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Relation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gmf_relational_model.gmf_relational_model.impl.RelationImpl#getName <em>Name</em>}</li>
 *   <li>{@link gmf_relational_model.gmf_relational_model.impl.RelationImpl#getContainsAttributes <em>Contains Attributes</em>}</li>
 *   <li>{@link gmf_relational_model.gmf_relational_model.impl.RelationImpl#getHasPK <em>Has PK</em>}</li>
 *   <li>{@link gmf_relational_model.gmf_relational_model.impl.RelationImpl#getIsContained <em>Is Contained</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RelationImpl extends MinimalEObjectImpl.Container implements Relation {
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
	 * The cached value of the '{@link #getContainsAttributes() <em>Contains Attributes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainsAttributes()
	 * @generated
	 * @ordered
	 */
	protected EList<Attribute> containsAttributes;

	/**
	 * The cached value of the '{@link #getHasPK() <em>Has PK</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasPK()
	 * @generated
	 * @ordered
	 */
	protected EList<Attribute> hasPK;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Gmf_relational_modelPackage.Literals.RELATION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Gmf_relational_modelPackage.RELATION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Attribute> getContainsAttributes() {
		if (containsAttributes == null) {
			containsAttributes = new EObjectContainmentWithInverseEList<Attribute>(Attribute.class, this, Gmf_relational_modelPackage.RELATION__CONTAINS_ATTRIBUTES, Gmf_relational_modelPackage.ATTRIBUTE__IS_CONTAINED);
		}
		return containsAttributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Attribute> getHasPK() {
		if (hasPK == null) {
			hasPK = new EObjectWithInverseResolvingEList<Attribute>(Attribute.class, this, Gmf_relational_modelPackage.RELATION__HAS_PK, Gmf_relational_modelPackage.ATTRIBUTE__PK_REFERENCE);
		}
		return hasPK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Schema getIsContained() {
		if (eContainerFeatureID() != Gmf_relational_modelPackage.RELATION__IS_CONTAINED) return null;
		return (Schema)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIsContained(Schema newIsContained, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newIsContained, Gmf_relational_modelPackage.RELATION__IS_CONTAINED, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsContained(Schema newIsContained) {
		if (newIsContained != eInternalContainer() || (eContainerFeatureID() != Gmf_relational_modelPackage.RELATION__IS_CONTAINED && newIsContained != null)) {
			if (EcoreUtil.isAncestor(this, newIsContained))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newIsContained != null)
				msgs = ((InternalEObject)newIsContained).eInverseAdd(this, Gmf_relational_modelPackage.SCHEMA__SCONTAINS_RELATIONS, Schema.class, msgs);
			msgs = basicSetIsContained(newIsContained, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Gmf_relational_modelPackage.RELATION__IS_CONTAINED, newIsContained, newIsContained));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Gmf_relational_modelPackage.RELATION__CONTAINS_ATTRIBUTES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getContainsAttributes()).basicAdd(otherEnd, msgs);
			case Gmf_relational_modelPackage.RELATION__HAS_PK:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getHasPK()).basicAdd(otherEnd, msgs);
			case Gmf_relational_modelPackage.RELATION__IS_CONTAINED:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetIsContained((Schema)otherEnd, msgs);
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
			case Gmf_relational_modelPackage.RELATION__CONTAINS_ATTRIBUTES:
				return ((InternalEList<?>)getContainsAttributes()).basicRemove(otherEnd, msgs);
			case Gmf_relational_modelPackage.RELATION__HAS_PK:
				return ((InternalEList<?>)getHasPK()).basicRemove(otherEnd, msgs);
			case Gmf_relational_modelPackage.RELATION__IS_CONTAINED:
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
			case Gmf_relational_modelPackage.RELATION__IS_CONTAINED:
				return eInternalContainer().eInverseRemove(this, Gmf_relational_modelPackage.SCHEMA__SCONTAINS_RELATIONS, Schema.class, msgs);
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
			case Gmf_relational_modelPackage.RELATION__NAME:
				return getName();
			case Gmf_relational_modelPackage.RELATION__CONTAINS_ATTRIBUTES:
				return getContainsAttributes();
			case Gmf_relational_modelPackage.RELATION__HAS_PK:
				return getHasPK();
			case Gmf_relational_modelPackage.RELATION__IS_CONTAINED:
				return getIsContained();
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
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Gmf_relational_modelPackage.RELATION__NAME:
				setName((String)newValue);
				return;
			case Gmf_relational_modelPackage.RELATION__CONTAINS_ATTRIBUTES:
				getContainsAttributes().clear();
				getContainsAttributes().addAll((Collection<? extends Attribute>)newValue);
				return;
			case Gmf_relational_modelPackage.RELATION__HAS_PK:
				getHasPK().clear();
				getHasPK().addAll((Collection<? extends Attribute>)newValue);
				return;
			case Gmf_relational_modelPackage.RELATION__IS_CONTAINED:
				setIsContained((Schema)newValue);
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
			case Gmf_relational_modelPackage.RELATION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case Gmf_relational_modelPackage.RELATION__CONTAINS_ATTRIBUTES:
				getContainsAttributes().clear();
				return;
			case Gmf_relational_modelPackage.RELATION__HAS_PK:
				getHasPK().clear();
				return;
			case Gmf_relational_modelPackage.RELATION__IS_CONTAINED:
				setIsContained((Schema)null);
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
			case Gmf_relational_modelPackage.RELATION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case Gmf_relational_modelPackage.RELATION__CONTAINS_ATTRIBUTES:
				return containsAttributes != null && !containsAttributes.isEmpty();
			case Gmf_relational_modelPackage.RELATION__HAS_PK:
				return hasPK != null && !hasPK.isEmpty();
			case Gmf_relational_modelPackage.RELATION__IS_CONTAINED:
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
		result.append(')');
		return result.toString();
	}

} //RelationImpl
