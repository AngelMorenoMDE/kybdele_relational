/**
 */
package gmf_relational_model.gmf_relational_model;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see gmf_relational_model.gmf_relational_model.Gmf_relational_modelFactory
 * @model kind="package"
 * @generated
 */
public interface Gmf_relational_modelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "gmf_relational_model";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://gmf_relational_model/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "gmf_relational_model";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Gmf_relational_modelPackage eINSTANCE = gmf_relational_model.gmf_relational_model.impl.Gmf_relational_modelPackageImpl.init();

	/**
	 * The meta object id for the '{@link gmf_relational_model.gmf_relational_model.impl.SchemaImpl <em>Schema</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gmf_relational_model.gmf_relational_model.impl.SchemaImpl
	 * @see gmf_relational_model.gmf_relational_model.impl.Gmf_relational_modelPackageImpl#getSchema()
	 * @generated
	 */
	int SCHEMA = 0;

	/**
	 * The feature id for the '<em><b>Scontains Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__SCONTAINS_RELATIONS = 0;

	/**
	 * The number of structural features of the '<em>Schema</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Schema</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gmf_relational_model.gmf_relational_model.impl.RelationImpl <em>Relation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gmf_relational_model.gmf_relational_model.impl.RelationImpl
	 * @see gmf_relational_model.gmf_relational_model.impl.Gmf_relational_modelPackageImpl#getRelation()
	 * @generated
	 */
	int RELATION = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Contains Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__CONTAINS_ATTRIBUTES = 1;

	/**
	 * The feature id for the '<em><b>Has PK</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__HAS_PK = 2;

	/**
	 * The feature id for the '<em><b>Is Contained</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__IS_CONTAINED = 3;

	/**
	 * The number of structural features of the '<em>Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gmf_relational_model.gmf_relational_model.impl.AttributeImpl <em>Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gmf_relational_model.gmf_relational_model.impl.AttributeImpl
	 * @see gmf_relational_model.gmf_relational_model.impl.Gmf_relational_modelPackageImpl#getAttribute()
	 * @generated
	 */
	int ATTRIBUTE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Is PK</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__IS_PK = 2;

	/**
	 * The feature id for the '<em><b>Is FK</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__IS_FK = 3;

	/**
	 * The feature id for the '<em><b>Is UN</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__IS_UN = 4;

	/**
	 * The feature id for the '<em><b>Is NN</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__IS_NN = 5;

	/**
	 * The feature id for the '<em><b>Is Contained</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__IS_CONTAINED = 6;

	/**
	 * The number of structural features of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gmf_relational_model.gmf_relational_model.EGenericType <em>EGeneric Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gmf_relational_model.gmf_relational_model.EGenericType
	 * @see gmf_relational_model.gmf_relational_model.impl.Gmf_relational_modelPackageImpl#getEGenericType()
	 * @generated
	 */
	int EGENERIC_TYPE = 3;


	/**
	 * Returns the meta object for class '{@link gmf_relational_model.gmf_relational_model.Schema <em>Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Schema</em>'.
	 * @see gmf_relational_model.gmf_relational_model.Schema
	 * @generated
	 */
	EClass getSchema();

	/**
	 * Returns the meta object for the containment reference list '{@link gmf_relational_model.gmf_relational_model.Schema#getScontainsRelations <em>Scontains Relations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Scontains Relations</em>'.
	 * @see gmf_relational_model.gmf_relational_model.Schema#getScontainsRelations()
	 * @see #getSchema()
	 * @generated
	 */
	EReference getSchema_ScontainsRelations();

	/**
	 * Returns the meta object for class '{@link gmf_relational_model.gmf_relational_model.Relation <em>Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relation</em>'.
	 * @see gmf_relational_model.gmf_relational_model.Relation
	 * @generated
	 */
	EClass getRelation();

	/**
	 * Returns the meta object for the attribute '{@link gmf_relational_model.gmf_relational_model.Relation#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see gmf_relational_model.gmf_relational_model.Relation#getName()
	 * @see #getRelation()
	 * @generated
	 */
	EAttribute getRelation_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link gmf_relational_model.gmf_relational_model.Relation#getContainsAttributes <em>Contains Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contains Attributes</em>'.
	 * @see gmf_relational_model.gmf_relational_model.Relation#getContainsAttributes()
	 * @see #getRelation()
	 * @generated
	 */
	EReference getRelation_ContainsAttributes();

	/**
	 * Returns the meta object for the reference list '{@link gmf_relational_model.gmf_relational_model.Relation#getHasPK <em>Has PK</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Has PK</em>'.
	 * @see gmf_relational_model.gmf_relational_model.Relation#getHasPK()
	 * @see #getRelation()
	 * @generated
	 */
	EReference getRelation_HasPK();

	/**
	 * Returns the meta object for the container reference '{@link gmf_relational_model.gmf_relational_model.Relation#getIsContained <em>Is Contained</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Is Contained</em>'.
	 * @see gmf_relational_model.gmf_relational_model.Relation#getIsContained()
	 * @see #getRelation()
	 * @generated
	 */
	EReference getRelation_IsContained();

	/**
	 * Returns the meta object for class '{@link gmf_relational_model.gmf_relational_model.Attribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute</em>'.
	 * @see gmf_relational_model.gmf_relational_model.Attribute
	 * @generated
	 */
	EClass getAttribute();

	/**
	 * Returns the meta object for the attribute '{@link gmf_relational_model.gmf_relational_model.Attribute#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see gmf_relational_model.gmf_relational_model.Attribute#getName()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Name();

	/**
	 * Returns the meta object for the attribute '{@link gmf_relational_model.gmf_relational_model.Attribute#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see gmf_relational_model.gmf_relational_model.Attribute#getType()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Type();

	/**
	 * Returns the meta object for the reference '{@link gmf_relational_model.gmf_relational_model.Attribute#getIsPK <em>Is PK</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Is PK</em>'.
	 * @see gmf_relational_model.gmf_relational_model.Attribute#getIsPK()
	 * @see #getAttribute()
	 * @generated
	 */
	EReference getAttribute_IsPK();

	/**
	 * Returns the meta object for the reference '{@link gmf_relational_model.gmf_relational_model.Attribute#getIsFK <em>Is FK</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Is FK</em>'.
	 * @see gmf_relational_model.gmf_relational_model.Attribute#getIsFK()
	 * @see #getAttribute()
	 * @generated
	 */
	EReference getAttribute_IsFK();

	/**
	 * Returns the meta object for the attribute '{@link gmf_relational_model.gmf_relational_model.Attribute#isIsUN <em>Is UN</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is UN</em>'.
	 * @see gmf_relational_model.gmf_relational_model.Attribute#isIsUN()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_IsUN();

	/**
	 * Returns the meta object for the attribute '{@link gmf_relational_model.gmf_relational_model.Attribute#isIsNN <em>Is NN</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is NN</em>'.
	 * @see gmf_relational_model.gmf_relational_model.Attribute#isIsNN()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_IsNN();

	/**
	 * Returns the meta object for the container reference '{@link gmf_relational_model.gmf_relational_model.Attribute#getIsContained <em>Is Contained</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Is Contained</em>'.
	 * @see gmf_relational_model.gmf_relational_model.Attribute#getIsContained()
	 * @see #getAttribute()
	 * @generated
	 */
	EReference getAttribute_IsContained();

	/**
	 * Returns the meta object for enum '{@link gmf_relational_model.gmf_relational_model.EGenericType <em>EGeneric Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>EGeneric Type</em>'.
	 * @see gmf_relational_model.gmf_relational_model.EGenericType
	 * @generated
	 */
	EEnum getEGenericType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Gmf_relational_modelFactory getGmf_relational_modelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link gmf_relational_model.gmf_relational_model.impl.SchemaImpl <em>Schema</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gmf_relational_model.gmf_relational_model.impl.SchemaImpl
		 * @see gmf_relational_model.gmf_relational_model.impl.Gmf_relational_modelPackageImpl#getSchema()
		 * @generated
		 */
		EClass SCHEMA = eINSTANCE.getSchema();

		/**
		 * The meta object literal for the '<em><b>Scontains Relations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHEMA__SCONTAINS_RELATIONS = eINSTANCE.getSchema_ScontainsRelations();

		/**
		 * The meta object literal for the '{@link gmf_relational_model.gmf_relational_model.impl.RelationImpl <em>Relation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gmf_relational_model.gmf_relational_model.impl.RelationImpl
		 * @see gmf_relational_model.gmf_relational_model.impl.Gmf_relational_modelPackageImpl#getRelation()
		 * @generated
		 */
		EClass RELATION = eINSTANCE.getRelation();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATION__NAME = eINSTANCE.getRelation_Name();

		/**
		 * The meta object literal for the '<em><b>Contains Attributes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATION__CONTAINS_ATTRIBUTES = eINSTANCE.getRelation_ContainsAttributes();

		/**
		 * The meta object literal for the '<em><b>Has PK</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATION__HAS_PK = eINSTANCE.getRelation_HasPK();

		/**
		 * The meta object literal for the '<em><b>Is Contained</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATION__IS_CONTAINED = eINSTANCE.getRelation_IsContained();

		/**
		 * The meta object literal for the '{@link gmf_relational_model.gmf_relational_model.impl.AttributeImpl <em>Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gmf_relational_model.gmf_relational_model.impl.AttributeImpl
		 * @see gmf_relational_model.gmf_relational_model.impl.Gmf_relational_modelPackageImpl#getAttribute()
		 * @generated
		 */
		EClass ATTRIBUTE = eINSTANCE.getAttribute();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__NAME = eINSTANCE.getAttribute_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__TYPE = eINSTANCE.getAttribute_Type();

		/**
		 * The meta object literal for the '<em><b>Is PK</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE__IS_PK = eINSTANCE.getAttribute_IsPK();

		/**
		 * The meta object literal for the '<em><b>Is FK</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE__IS_FK = eINSTANCE.getAttribute_IsFK();

		/**
		 * The meta object literal for the '<em><b>Is UN</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__IS_UN = eINSTANCE.getAttribute_IsUN();

		/**
		 * The meta object literal for the '<em><b>Is NN</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__IS_NN = eINSTANCE.getAttribute_IsNN();

		/**
		 * The meta object literal for the '<em><b>Is Contained</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE__IS_CONTAINED = eINSTANCE.getAttribute_IsContained();

		/**
		 * The meta object literal for the '{@link gmf_relational_model.gmf_relational_model.EGenericType <em>EGeneric Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gmf_relational_model.gmf_relational_model.EGenericType
		 * @see gmf_relational_model.gmf_relational_model.impl.Gmf_relational_modelPackageImpl#getEGenericType()
		 * @generated
		 */
		EEnum EGENERIC_TYPE = eINSTANCE.getEGenericType();

	}

} //Gmf_relational_modelPackage
