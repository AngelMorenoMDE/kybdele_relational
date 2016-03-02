/**
 */
package gmf_relational_model.gmf_relational_model;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Schema</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gmf_relational_model.gmf_relational_model.Schema#getScontainsRelations <em>Scontains Relations</em>}</li>
 * </ul>
 * </p>
 *
 * @see gmf_relational_model.gmf_relational_model.Gmf_relational_modelPackage#getSchema()
 * @model
 * @generated
 */
public interface Schema extends EObject {
	/**
	 * Returns the value of the '<em><b>Scontains Relations</b></em>' containment reference list.
	 * The list contents are of type {@link gmf_relational_model.gmf_relational_model.Relation}.
	 * It is bidirectional and its opposite is '{@link gmf_relational_model.gmf_relational_model.Relation#getIsContained <em>Is Contained</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scontains Relations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scontains Relations</em>' containment reference list.
	 * @see gmf_relational_model.gmf_relational_model.Gmf_relational_modelPackage#getSchema_ScontainsRelations()
	 * @see gmf_relational_model.gmf_relational_model.Relation#getIsContained
	 * @model opposite="isContained" containment="true" required="true"
	 * @generated
	 */
	EList<Relation> getScontainsRelations();

} // Schema
