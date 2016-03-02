/**
 */
package gmf_relational_model.gmf_relational_model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gmf_relational_model.gmf_relational_model.Attribute#getName <em>Name</em>}</li>
 *   <li>{@link gmf_relational_model.gmf_relational_model.Attribute#getType <em>Type</em>}</li>
 *   <li>{@link gmf_relational_model.gmf_relational_model.Attribute#getIsPK <em>Is PK</em>}</li>
 *   <li>{@link gmf_relational_model.gmf_relational_model.Attribute#getIsFK <em>Is FK</em>}</li>
 *   <li>{@link gmf_relational_model.gmf_relational_model.Attribute#isIsUN <em>Is UN</em>}</li>
 *   <li>{@link gmf_relational_model.gmf_relational_model.Attribute#isIsNN <em>Is NN</em>}</li>
 *   <li>{@link gmf_relational_model.gmf_relational_model.Attribute#getIsContained <em>Is Contained</em>}</li>
 * </ul>
 * </p>
 *
 * @see gmf_relational_model.gmf_relational_model.Gmf_relational_modelPackage#getAttribute()
 * @model
 * @generated
 */
public interface Attribute extends EObject {
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
	 * @see gmf_relational_model.gmf_relational_model.Gmf_relational_modelPackage#getAttribute_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link gmf_relational_model.gmf_relational_model.Attribute#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link gmf_relational_model.gmf_relational_model.EGenericType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see gmf_relational_model.gmf_relational_model.EGenericType
	 * @see #setType(EGenericType)
	 * @see gmf_relational_model.gmf_relational_model.Gmf_relational_modelPackage#getAttribute_Type()
	 * @model required="true"
	 * @generated
	 */
	EGenericType getType();

	/**
	 * Sets the value of the '{@link gmf_relational_model.gmf_relational_model.Attribute#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see gmf_relational_model.gmf_relational_model.EGenericType
	 * @see #getType()
	 * @generated
	 */
	void setType(EGenericType value);

	/**
	 * Returns the value of the '<em><b>Is PK</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gmf_relational_model.gmf_relational_model.Relation#getHasPK <em>Has PK</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is PK</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is PK</em>' reference.
	 * @see #setIsPK(Relation)
	 * @see gmf_relational_model.gmf_relational_model.Gmf_relational_modelPackage#getAttribute_IsPK()
	 * @see gmf_relational_model.gmf_relational_model.Relation#getHasPK
	 * @model opposite="hasPK"
	 * @generated
	 */
	Relation getIsPK();

	/**
	 * Sets the value of the '{@link gmf_relational_model.gmf_relational_model.Attribute#getIsPK <em>Is PK</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is PK</em>' reference.
	 * @see #getIsPK()
	 * @generated
	 */
	void setIsPK(Relation value);

	/**
	 * Returns the value of the '<em><b>Is FK</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is FK</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is FK</em>' reference.
	 * @see #setIsFK(Attribute)
	 * @see gmf_relational_model.gmf_relational_model.Gmf_relational_modelPackage#getAttribute_IsFK()
	 * @model
	 * @generated
	 */
	Attribute getIsFK();

	/**
	 * Sets the value of the '{@link gmf_relational_model.gmf_relational_model.Attribute#getIsFK <em>Is FK</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is FK</em>' reference.
	 * @see #getIsFK()
	 * @generated
	 */
	void setIsFK(Attribute value);

	/**
	 * Returns the value of the '<em><b>Is UN</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is UN</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is UN</em>' attribute.
	 * @see #setIsUN(boolean)
	 * @see gmf_relational_model.gmf_relational_model.Gmf_relational_modelPackage#getAttribute_IsUN()
	 * @model default="false"
	 * @generated
	 */
	boolean isIsUN();

	/**
	 * Sets the value of the '{@link gmf_relational_model.gmf_relational_model.Attribute#isIsUN <em>Is UN</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is UN</em>' attribute.
	 * @see #isIsUN()
	 * @generated
	 */
	void setIsUN(boolean value);

	/**
	 * Returns the value of the '<em><b>Is NN</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is NN</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is NN</em>' attribute.
	 * @see #setIsNN(boolean)
	 * @see gmf_relational_model.gmf_relational_model.Gmf_relational_modelPackage#getAttribute_IsNN()
	 * @model default="false"
	 * @generated
	 */
	boolean isIsNN();

	/**
	 * Sets the value of the '{@link gmf_relational_model.gmf_relational_model.Attribute#isIsNN <em>Is NN</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is NN</em>' attribute.
	 * @see #isIsNN()
	 * @generated
	 */
	void setIsNN(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Contained</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link gmf_relational_model.gmf_relational_model.Relation#getContainsAttributes <em>Contains Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Contained</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Contained</em>' container reference.
	 * @see #setIsContained(Relation)
	 * @see gmf_relational_model.gmf_relational_model.Gmf_relational_modelPackage#getAttribute_IsContained()
	 * @see gmf_relational_model.gmf_relational_model.Relation#getContainsAttributes
	 * @model opposite="containsAttributes" required="true" transient="false"
	 * @generated
	 */
	Relation getIsContained();

	/**
	 * Sets the value of the '{@link gmf_relational_model.gmf_relational_model.Attribute#getIsContained <em>Is Contained</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Contained</em>' container reference.
	 * @see #getIsContained()
	 * @generated
	 */
	void setIsContained(Relation value);

} // Attribute
