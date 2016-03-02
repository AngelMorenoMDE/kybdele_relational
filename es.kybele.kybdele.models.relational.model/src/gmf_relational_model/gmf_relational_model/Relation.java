/**
 */
package gmf_relational_model.gmf_relational_model;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gmf_relational_model.gmf_relational_model.Relation#getName <em>Name</em>}</li>
 *   <li>{@link gmf_relational_model.gmf_relational_model.Relation#getContainsAttributes <em>Contains Attributes</em>}</li>
 *   <li>{@link gmf_relational_model.gmf_relational_model.Relation#getHasPK <em>Has PK</em>}</li>
 *   <li>{@link gmf_relational_model.gmf_relational_model.Relation#getIsContained <em>Is Contained</em>}</li>
 * </ul>
 * </p>
 *
 * @see gmf_relational_model.gmf_relational_model.Gmf_relational_modelPackage#getRelation()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='almostOneAttribute relationHasPK attributeNameUnique relationNameDefined'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot almostOneAttribute='self.containsAttributes -> size() >= 1' relationHasPK='not self.hasPK -> isEmpty()' attributeNameUnique='if (self.containsAttributes -> size() > 0) then\n\t\t\tself.containsAttributes -> forAll(a1,a2 | a1 <> a2 implies a1.name <> a2.name)\n\t\telse\n\t\t\ttrue\n\t\tendif' relationNameDefined='not self.name.oclIsUndefined()'"
 * @generated
 */
public interface Relation extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see gmf_relational_model.gmf_relational_model.Gmf_relational_modelPackage#getRelation_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link gmf_relational_model.gmf_relational_model.Relation#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Contains Attributes</b></em>' containment reference list.
	 * The list contents are of type {@link gmf_relational_model.gmf_relational_model.Attribute}.
	 * It is bidirectional and its opposite is '{@link gmf_relational_model.gmf_relational_model.Attribute#getIsContained <em>Is Contained</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contains Attributes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contains Attributes</em>' containment reference list.
	 * @see gmf_relational_model.gmf_relational_model.Gmf_relational_modelPackage#getRelation_ContainsAttributes()
	 * @see gmf_relational_model.gmf_relational_model.Attribute#getIsContained
	 * @model opposite="isContained" containment="true"
	 * @generated
	 */
	EList<Attribute> getContainsAttributes();

	/**
	 * Returns the value of the '<em><b>Has PK</b></em>' reference list.
	 * The list contents are of type {@link gmf_relational_model.gmf_relational_model.Attribute}.
	 * It is bidirectional and its opposite is '{@link gmf_relational_model.gmf_relational_model.Attribute#getPkReference <em>Pk Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has PK</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has PK</em>' reference list.
	 * @see gmf_relational_model.gmf_relational_model.Gmf_relational_modelPackage#getRelation_HasPK()
	 * @see gmf_relational_model.gmf_relational_model.Attribute#getPkReference
	 * @model opposite="pkReference"
	 * @generated
	 */
	EList<Attribute> getHasPK();

	/**
	 * Returns the value of the '<em><b>Is Contained</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link gmf_relational_model.gmf_relational_model.Schema#getScontainsRelations <em>Scontains Relations</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Contained</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Contained</em>' container reference.
	 * @see #setIsContained(Schema)
	 * @see gmf_relational_model.gmf_relational_model.Gmf_relational_modelPackage#getRelation_IsContained()
	 * @see gmf_relational_model.gmf_relational_model.Schema#getScontainsRelations
	 * @model opposite="ScontainsRelations" transient="false"
	 * @generated
	 */
	Schema getIsContained();

	/**
	 * Sets the value of the '{@link gmf_relational_model.gmf_relational_model.Relation#getIsContained <em>Is Contained</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Contained</em>' container reference.
	 * @see #getIsContained()
	 * @generated
	 */
	void setIsContained(Schema value);

} // Relation
