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
 *   <li>{@link gmf_relational_model.gmf_relational_model.Schema#getScontainsLinksFK <em>Scontains Links FK</em>}</li>
 * </ul>
 * </p>
 *
 * @see gmf_relational_model.gmf_relational_model.Gmf_relational_modelPackage#getSchema()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='relationNameUnique'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot relationNameUnique='if (self.ScontainsRelations -> size() > 0) then\n\t\t\tself.ScontainsRelations -> forAll(r1,r2 | r1 <> r2 implies r1.name <> r2.name)\n\t\telse\n\t\t\ttrue\n\t\tendif'"
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
	 * @model opposite="isContained" containment="true"
	 * @generated
	 */
	EList<Relation> getScontainsRelations();

	/**
	 * Returns the value of the '<em><b>Scontains Links FK</b></em>' containment reference list.
	 * The list contents are of type {@link gmf_relational_model.gmf_relational_model.LinkFK}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scontains Links FK</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scontains Links FK</em>' containment reference list.
	 * @see gmf_relational_model.gmf_relational_model.Gmf_relational_modelPackage#getSchema_ScontainsLinksFK()
	 * @model containment="true"
	 * @generated
	 */
	EList<LinkFK> getScontainsLinksFK();

} // Schema
