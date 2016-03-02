/**
 */
package gmf_relational_model.gmf_relational_model.impl;

import gmf_relational_model.gmf_relational_model.Gmf_relational_modelPackage;
import gmf_relational_model.gmf_relational_model.LinkFK;
import gmf_relational_model.gmf_relational_model.Relation;
import gmf_relational_model.gmf_relational_model.Schema;
import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Schema</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gmf_relational_model.gmf_relational_model.impl.SchemaImpl#getScontainsRelations <em>Scontains Relations</em>}</li>
 *   <li>{@link gmf_relational_model.gmf_relational_model.impl.SchemaImpl#getScontainsLinksFK <em>Scontains Links FK</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SchemaImpl extends MinimalEObjectImpl.Container implements Schema {
	/**
	 * The cached value of the '{@link #getScontainsRelations() <em>Scontains Relations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScontainsRelations()
	 * @generated
	 * @ordered
	 */
	protected EList<Relation> scontainsRelations;

	/**
	 * The cached value of the '{@link #getScontainsLinksFK() <em>Scontains Links FK</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScontainsLinksFK()
	 * @generated
	 * @ordered
	 */
	protected EList<LinkFK> scontainsLinksFK;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SchemaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Gmf_relational_modelPackage.Literals.SCHEMA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Relation> getScontainsRelations() {
		if (scontainsRelations == null) {
			scontainsRelations = new EObjectContainmentWithInverseEList<Relation>(Relation.class, this, Gmf_relational_modelPackage.SCHEMA__SCONTAINS_RELATIONS, Gmf_relational_modelPackage.RELATION__IS_CONTAINED);
		}
		return scontainsRelations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LinkFK> getScontainsLinksFK() {
		if (scontainsLinksFK == null) {
			scontainsLinksFK = new EObjectContainmentEList<LinkFK>(LinkFK.class, this, Gmf_relational_modelPackage.SCHEMA__SCONTAINS_LINKS_FK);
		}
		return scontainsLinksFK;
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
			case Gmf_relational_modelPackage.SCHEMA__SCONTAINS_RELATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getScontainsRelations()).basicAdd(otherEnd, msgs);
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
			case Gmf_relational_modelPackage.SCHEMA__SCONTAINS_RELATIONS:
				return ((InternalEList<?>)getScontainsRelations()).basicRemove(otherEnd, msgs);
			case Gmf_relational_modelPackage.SCHEMA__SCONTAINS_LINKS_FK:
				return ((InternalEList<?>)getScontainsLinksFK()).basicRemove(otherEnd, msgs);
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
			case Gmf_relational_modelPackage.SCHEMA__SCONTAINS_RELATIONS:
				return getScontainsRelations();
			case Gmf_relational_modelPackage.SCHEMA__SCONTAINS_LINKS_FK:
				return getScontainsLinksFK();
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
			case Gmf_relational_modelPackage.SCHEMA__SCONTAINS_RELATIONS:
				getScontainsRelations().clear();
				getScontainsRelations().addAll((Collection<? extends Relation>)newValue);
				return;
			case Gmf_relational_modelPackage.SCHEMA__SCONTAINS_LINKS_FK:
				getScontainsLinksFK().clear();
				getScontainsLinksFK().addAll((Collection<? extends LinkFK>)newValue);
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
			case Gmf_relational_modelPackage.SCHEMA__SCONTAINS_RELATIONS:
				getScontainsRelations().clear();
				return;
			case Gmf_relational_modelPackage.SCHEMA__SCONTAINS_LINKS_FK:
				getScontainsLinksFK().clear();
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
			case Gmf_relational_modelPackage.SCHEMA__SCONTAINS_RELATIONS:
				return scontainsRelations != null && !scontainsRelations.isEmpty();
			case Gmf_relational_modelPackage.SCHEMA__SCONTAINS_LINKS_FK:
				return scontainsLinksFK != null && !scontainsLinksFK.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SchemaImpl
