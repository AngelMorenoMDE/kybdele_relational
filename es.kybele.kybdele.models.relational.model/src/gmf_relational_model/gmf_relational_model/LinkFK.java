/**
 */
package gmf_relational_model.gmf_relational_model;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Link FK</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gmf_relational_model.gmf_relational_model.LinkFK#getName <em>Name</em>}</li>
 *   <li>{@link gmf_relational_model.gmf_relational_model.LinkFK#getSource <em>Source</em>}</li>
 *   <li>{@link gmf_relational_model.gmf_relational_model.LinkFK#getTarget <em>Target</em>}</li>
 *   <li>{@link gmf_relational_model.gmf_relational_model.LinkFK#getDelete <em>Delete</em>}</li>
 *   <li>{@link gmf_relational_model.gmf_relational_model.LinkFK#getModify <em>Modify</em>}</li>
 * </ul>
 * </p>
 *
 * @see gmf_relational_model.gmf_relational_model.Gmf_relational_modelPackage#getLinkFK()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='unCompleteLink invalidTargetRelation'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot unCompleteLink='\n\t\tif(((self.target.oclIsUndefined())or not(self.source -> size() > 0)))then\n\t\t\tfalse\n\t\telse\n\t\t\ttrue\n\t\tendif' invalidTargetRelation='\n\t\tif(self.target.oclIsUndefined())then\n\t\t\tfalse\n\t\telse\n\t\t\tif (self.target.containsAttributes -> size()>0)then\n\t\t\t\tif (self.target.containsAttributes -> exists(isPK <> null))then\n\t\t\t\t\ttrue\n\t\t\t\telse\n\t\t\t\t\tif (self.target.containsAttributes -> exists(isUN = true))then\n\t\t\t\t\t\ttrue\n\t\t\t\t\telse\n\t\t\t\t\t\tfalse\n\t\t\t\t\tendif\n\t\t\t\tendif\n\t\t\telse\n\t\t\t\tfalse\n\t\t\tendif\n\t\tendif'"
 * @generated
 */
public interface LinkFK extends EObject {
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
	 * @see gmf_relational_model.gmf_relational_model.Gmf_relational_modelPackage#getLinkFK_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link gmf_relational_model.gmf_relational_model.LinkFK#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference list.
	 * The list contents are of type {@link gmf_relational_model.gmf_relational_model.Attribute}.
	 * It is bidirectional and its opposite is '{@link gmf_relational_model.gmf_relational_model.Attribute#getIsFK <em>Is FK</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference list.
	 * @see gmf_relational_model.gmf_relational_model.Gmf_relational_modelPackage#getLinkFK_Source()
	 * @see gmf_relational_model.gmf_relational_model.Attribute#getIsFK
	 * @model opposite="isFK"
	 * @generated
	 */
	EList<Attribute> getSource();

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(Relation)
	 * @see gmf_relational_model.gmf_relational_model.Gmf_relational_modelPackage#getLinkFK_Target()
	 * @model
	 * @generated
	 */
	Relation getTarget();

	/**
	 * Sets the value of the '{@link gmf_relational_model.gmf_relational_model.LinkFK#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Relation value);

	/**
	 * Returns the value of the '<em><b>Delete</b></em>' attribute.
	 * The literals are from the enumeration {@link gmf_relational_model.gmf_relational_model.EDMPolicy}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Delete</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delete</em>' attribute.
	 * @see gmf_relational_model.gmf_relational_model.EDMPolicy
	 * @see #setDelete(EDMPolicy)
	 * @see gmf_relational_model.gmf_relational_model.Gmf_relational_modelPackage#getLinkFK_Delete()
	 * @model
	 * @generated
	 */
	EDMPolicy getDelete();

	/**
	 * Sets the value of the '{@link gmf_relational_model.gmf_relational_model.LinkFK#getDelete <em>Delete</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delete</em>' attribute.
	 * @see gmf_relational_model.gmf_relational_model.EDMPolicy
	 * @see #getDelete()
	 * @generated
	 */
	void setDelete(EDMPolicy value);

	/**
	 * Returns the value of the '<em><b>Modify</b></em>' attribute.
	 * The literals are from the enumeration {@link gmf_relational_model.gmf_relational_model.EDMPolicy}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Modify</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modify</em>' attribute.
	 * @see gmf_relational_model.gmf_relational_model.EDMPolicy
	 * @see #setModify(EDMPolicy)
	 * @see gmf_relational_model.gmf_relational_model.Gmf_relational_modelPackage#getLinkFK_Modify()
	 * @model
	 * @generated
	 */
	EDMPolicy getModify();

	/**
	 * Sets the value of the '{@link gmf_relational_model.gmf_relational_model.LinkFK#getModify <em>Modify</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Modify</em>' attribute.
	 * @see gmf_relational_model.gmf_relational_model.EDMPolicy
	 * @see #getModify()
	 * @generated
	 */
	void setModify(EDMPolicy value);

} // LinkFK
