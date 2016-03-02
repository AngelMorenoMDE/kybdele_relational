/**
 */
package gmf_relational_model.gmf_relational_model.impl;

import gmf_relational_model.gmf_relational_model.Attribute;
import gmf_relational_model.gmf_relational_model.EDMPolicy;
import gmf_relational_model.gmf_relational_model.Gmf_relational_modelPackage;
import gmf_relational_model.gmf_relational_model.LinkFK;
import gmf_relational_model.gmf_relational_model.Relation;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Link FK</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gmf_relational_model.gmf_relational_model.impl.LinkFKImpl#getName <em>Name</em>}</li>
 *   <li>{@link gmf_relational_model.gmf_relational_model.impl.LinkFKImpl#getSource <em>Source</em>}</li>
 *   <li>{@link gmf_relational_model.gmf_relational_model.impl.LinkFKImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link gmf_relational_model.gmf_relational_model.impl.LinkFKImpl#getDelete <em>Delete</em>}</li>
 *   <li>{@link gmf_relational_model.gmf_relational_model.impl.LinkFKImpl#getModify <em>Modify</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LinkFKImpl extends MinimalEObjectImpl.Container implements LinkFK {
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
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected EList<Attribute> source;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected Relation target;

	/**
	 * The default value of the '{@link #getDelete() <em>Delete</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDelete()
	 * @generated
	 * @ordered
	 */
	protected static final EDMPolicy DELETE_EDEFAULT = EDMPolicy.CASCADE;

	/**
	 * The cached value of the '{@link #getDelete() <em>Delete</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDelete()
	 * @generated
	 * @ordered
	 */
	protected EDMPolicy delete = DELETE_EDEFAULT;

	/**
	 * The default value of the '{@link #getModify() <em>Modify</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModify()
	 * @generated
	 * @ordered
	 */
	protected static final EDMPolicy MODIFY_EDEFAULT = EDMPolicy.CASCADE;

	/**
	 * The cached value of the '{@link #getModify() <em>Modify</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModify()
	 * @generated
	 * @ordered
	 */
	protected EDMPolicy modify = MODIFY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LinkFKImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Gmf_relational_modelPackage.Literals.LINK_FK;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Gmf_relational_modelPackage.LINK_FK__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Attribute> getSource() {
		if (source == null) {
			source = new EObjectWithInverseResolvingEList<Attribute>(Attribute.class, this, Gmf_relational_modelPackage.LINK_FK__SOURCE, Gmf_relational_modelPackage.ATTRIBUTE__IS_FK);
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Relation getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject)target;
			target = (Relation)eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Gmf_relational_modelPackage.LINK_FK__TARGET, oldTarget, target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Relation basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * 
	 * Set LinkFK name when target != null
	 * 
	 * TODO JLS
	 */
	public void setTarget(Relation newTarget) {
		Relation oldTarget = target;
		if (newTarget != null){
			setName("FK_" + newTarget.getName());
		}
		target = newTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Gmf_relational_modelPackage.LINK_FK__TARGET, oldTarget, target));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDMPolicy getDelete() {
		return delete;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDelete(EDMPolicy newDelete) {
		EDMPolicy oldDelete = delete;
		delete = newDelete == null ? DELETE_EDEFAULT : newDelete;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Gmf_relational_modelPackage.LINK_FK__DELETE, oldDelete, delete));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDMPolicy getModify() {
		return modify;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModify(EDMPolicy newModify) {
		EDMPolicy oldModify = modify;
		modify = newModify == null ? MODIFY_EDEFAULT : newModify;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Gmf_relational_modelPackage.LINK_FK__MODIFY, oldModify, modify));
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
			case Gmf_relational_modelPackage.LINK_FK__SOURCE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSource()).basicAdd(otherEnd, msgs);
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
			case Gmf_relational_modelPackage.LINK_FK__SOURCE:
				return ((InternalEList<?>)getSource()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Gmf_relational_modelPackage.LINK_FK__NAME:
				return getName();
			case Gmf_relational_modelPackage.LINK_FK__SOURCE:
				return getSource();
			case Gmf_relational_modelPackage.LINK_FK__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
			case Gmf_relational_modelPackage.LINK_FK__DELETE:
				return getDelete();
			case Gmf_relational_modelPackage.LINK_FK__MODIFY:
				return getModify();
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
			case Gmf_relational_modelPackage.LINK_FK__NAME:
				setName((String)newValue);
				return;
			case Gmf_relational_modelPackage.LINK_FK__SOURCE:
				getSource().clear();
				getSource().addAll((Collection<? extends Attribute>)newValue);
				return;
			case Gmf_relational_modelPackage.LINK_FK__TARGET:
				setTarget((Relation)newValue);
				return;
			case Gmf_relational_modelPackage.LINK_FK__DELETE:
				setDelete((EDMPolicy)newValue);
				return;
			case Gmf_relational_modelPackage.LINK_FK__MODIFY:
				setModify((EDMPolicy)newValue);
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
			case Gmf_relational_modelPackage.LINK_FK__NAME:
				setName(NAME_EDEFAULT);
				return;
			case Gmf_relational_modelPackage.LINK_FK__SOURCE:
				getSource().clear();
				return;
			case Gmf_relational_modelPackage.LINK_FK__TARGET:
				setTarget((Relation)null);
				return;
			case Gmf_relational_modelPackage.LINK_FK__DELETE:
				setDelete(DELETE_EDEFAULT);
				return;
			case Gmf_relational_modelPackage.LINK_FK__MODIFY:
				setModify(MODIFY_EDEFAULT);
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
			case Gmf_relational_modelPackage.LINK_FK__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case Gmf_relational_modelPackage.LINK_FK__SOURCE:
				return source != null && !source.isEmpty();
			case Gmf_relational_modelPackage.LINK_FK__TARGET:
				return target != null;
			case Gmf_relational_modelPackage.LINK_FK__DELETE:
				return delete != DELETE_EDEFAULT;
			case Gmf_relational_modelPackage.LINK_FK__MODIFY:
				return modify != MODIFY_EDEFAULT;
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
		result.append(", delete: ");
		result.append(delete);
		result.append(", modify: ");
		result.append(modify);
		result.append(')');
		return result.toString();
	}

} //LinkFKImpl
