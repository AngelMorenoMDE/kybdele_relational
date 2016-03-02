/**
 */
package gmf_relational_model.gmf_relational_model.impl;

import gmf_relational_model.gmf_relational_model.Attribute;
import gmf_relational_model.gmf_relational_model.EDMPolicy;
import gmf_relational_model.gmf_relational_model.EGenericType;
import gmf_relational_model.gmf_relational_model.Gmf_relational_modelFactory;
import gmf_relational_model.gmf_relational_model.Gmf_relational_modelPackage;
import gmf_relational_model.gmf_relational_model.LinkFK;
import gmf_relational_model.gmf_relational_model.Relation;
import gmf_relational_model.gmf_relational_model.Schema;
import gmf_relational_model.gmf_relational_model.util.Gmf_relational_modelValidator;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Gmf_relational_modelPackageImpl extends EPackageImpl implements Gmf_relational_modelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass schemaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass linkFKEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum eGenericTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum edmPolicyEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see gmf_relational_model.gmf_relational_model.Gmf_relational_modelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Gmf_relational_modelPackageImpl() {
		super(eNS_URI, Gmf_relational_modelFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link Gmf_relational_modelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Gmf_relational_modelPackage init() {
		if (isInited) return (Gmf_relational_modelPackage)EPackage.Registry.INSTANCE.getEPackage(Gmf_relational_modelPackage.eNS_URI);

		// Obtain or create and register package
		Gmf_relational_modelPackageImpl theGmf_relational_modelPackage = (Gmf_relational_modelPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof Gmf_relational_modelPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new Gmf_relational_modelPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theGmf_relational_modelPackage.createPackageContents();

		// Initialize created meta-data
		theGmf_relational_modelPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theGmf_relational_modelPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return Gmf_relational_modelValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theGmf_relational_modelPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Gmf_relational_modelPackage.eNS_URI, theGmf_relational_modelPackage);
		return theGmf_relational_modelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSchema() {
		return schemaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSchema_ScontainsRelations() {
		return (EReference)schemaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSchema_ScontainsLinksFK() {
		return (EReference)schemaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLinkFK() {
		return linkFKEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLinkFK_Name() {
		return (EAttribute)linkFKEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLinkFK_Source() {
		return (EReference)linkFKEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLinkFK_Target() {
		return (EReference)linkFKEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLinkFK_Delete() {
		return (EAttribute)linkFKEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLinkFK_Modify() {
		return (EAttribute)linkFKEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRelation() {
		return relationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelation_Name() {
		return (EAttribute)relationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelation_ContainsAttributes() {
		return (EReference)relationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelation_HasPK() {
		return (EReference)relationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelation_IsContained() {
		return (EReference)relationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttribute() {
		return attributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttribute_Name() {
		return (EAttribute)attributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttribute_Type() {
		return (EAttribute)attributeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttribute_PkReference() {
		return (EReference)attributeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttribute_IsFK() {
		return (EReference)attributeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttribute_IsUN() {
		return (EAttribute)attributeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttribute_IsNN() {
		return (EAttribute)attributeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttribute_IsContained() {
		return (EReference)attributeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttribute_LabelWidth() {
		return (EAttribute)attributeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttribute_IsPK() {
		return (EAttribute)attributeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEGenericType() {
		return eGenericTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEDMPolicy() {
		return edmPolicyEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Gmf_relational_modelFactory getGmf_relational_modelFactory() {
		return (Gmf_relational_modelFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		schemaEClass = createEClass(SCHEMA);
		createEReference(schemaEClass, SCHEMA__SCONTAINS_RELATIONS);
		createEReference(schemaEClass, SCHEMA__SCONTAINS_LINKS_FK);

		linkFKEClass = createEClass(LINK_FK);
		createEAttribute(linkFKEClass, LINK_FK__NAME);
		createEReference(linkFKEClass, LINK_FK__SOURCE);
		createEReference(linkFKEClass, LINK_FK__TARGET);
		createEAttribute(linkFKEClass, LINK_FK__DELETE);
		createEAttribute(linkFKEClass, LINK_FK__MODIFY);

		relationEClass = createEClass(RELATION);
		createEAttribute(relationEClass, RELATION__NAME);
		createEReference(relationEClass, RELATION__CONTAINS_ATTRIBUTES);
		createEReference(relationEClass, RELATION__HAS_PK);
		createEReference(relationEClass, RELATION__IS_CONTAINED);

		attributeEClass = createEClass(ATTRIBUTE);
		createEAttribute(attributeEClass, ATTRIBUTE__NAME);
		createEAttribute(attributeEClass, ATTRIBUTE__TYPE);
		createEReference(attributeEClass, ATTRIBUTE__PK_REFERENCE);
		createEReference(attributeEClass, ATTRIBUTE__IS_FK);
		createEAttribute(attributeEClass, ATTRIBUTE__IS_UN);
		createEAttribute(attributeEClass, ATTRIBUTE__IS_NN);
		createEReference(attributeEClass, ATTRIBUTE__IS_CONTAINED);
		createEAttribute(attributeEClass, ATTRIBUTE__LABEL_WIDTH);
		createEAttribute(attributeEClass, ATTRIBUTE__IS_PK);

		// Create enums
		eGenericTypeEEnum = createEEnum(EGENERIC_TYPE);
		edmPolicyEEnum = createEEnum(EDM_POLICY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(schemaEClass, Schema.class, "Schema", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSchema_ScontainsRelations(), this.getRelation(), this.getRelation_IsContained(), "ScontainsRelations", null, 0, -1, Schema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSchema_ScontainsLinksFK(), this.getLinkFK(), null, "ScontainsLinksFK", null, 0, -1, Schema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(linkFKEClass, LinkFK.class, "LinkFK", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLinkFK_Name(), ecorePackage.getEString(), "name", null, 0, 1, LinkFK.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLinkFK_Source(), this.getAttribute(), this.getAttribute_IsFK(), "source", null, 0, -1, LinkFK.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLinkFK_Target(), this.getRelation(), null, "target", null, 0, 1, LinkFK.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLinkFK_Delete(), this.getEDMPolicy(), "delete", null, 0, 1, LinkFK.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLinkFK_Modify(), this.getEDMPolicy(), "modify", null, 0, 1, LinkFK.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(relationEClass, Relation.class, "Relation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRelation_Name(), ecorePackage.getEString(), "name", null, 0, 1, Relation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelation_ContainsAttributes(), this.getAttribute(), this.getAttribute_IsContained(), "containsAttributes", null, 0, -1, Relation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelation_HasPK(), this.getAttribute(), this.getAttribute_PkReference(), "hasPK", null, 0, -1, Relation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelation_IsContained(), this.getSchema(), this.getSchema_ScontainsRelations(), "isContained", null, 0, 1, Relation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attributeEClass, Attribute.class, "Attribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAttribute_Name(), ecorePackage.getEString(), "name", null, 0, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttribute_Type(), this.getEGenericType(), "type", "UNDEFINED", 0, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAttribute_PkReference(), this.getRelation(), this.getRelation_HasPK(), "pkReference", null, 0, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAttribute_IsFK(), this.getLinkFK(), this.getLinkFK_Source(), "isFK", null, 0, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttribute_IsUN(), ecorePackage.getEBoolean(), "isUN", "false", 0, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttribute_IsNN(), ecorePackage.getEBoolean(), "isNN", "false", 0, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAttribute_IsContained(), this.getRelation(), this.getRelation_ContainsAttributes(), "isContained", null, 1, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttribute_LabelWidth(), ecorePackage.getEInt(), "labelWidth", null, 1, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttribute_IsPK(), ecorePackage.getEBoolean(), "isPK", "false", 0, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(eGenericTypeEEnum, EGenericType.class, "EGenericType");
		addEEnumLiteral(eGenericTypeEEnum, EGenericType.UNDEFINED);
		addEEnumLiteral(eGenericTypeEEnum, EGenericType.VARCHAR);
		addEEnumLiteral(eGenericTypeEEnum, EGenericType.NUMERIC);
		addEEnumLiteral(eGenericTypeEEnum, EGenericType.TIME);
		addEEnumLiteral(eGenericTypeEEnum, EGenericType.DATE);
		addEEnumLiteral(eGenericTypeEEnum, EGenericType.FLOAT);
		addEEnumLiteral(eGenericTypeEEnum, EGenericType.CHAR);
		addEEnumLiteral(eGenericTypeEEnum, EGenericType.BOOLEAN);

		initEEnum(edmPolicyEEnum, EDMPolicy.class, "EDMPolicy");
		addEEnumLiteral(edmPolicyEEnum, EDMPolicy.CASCADE);
		addEEnumLiteral(edmPolicyEEnum, EDMPolicy.RESTRICT);
		addEEnumLiteral(edmPolicyEEnum, EDMPolicy.SETNULL);
		addEEnumLiteral(edmPolicyEEnum, EDMPolicy.SETDEFAUL);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot
		createPivotAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";	
		addAnnotation
		  (schemaEClass, 
		   source, 
		   new String[] {
			 "constraints", "relationNameUnique"
		   });	
		addAnnotation
		  (linkFKEClass, 
		   source, 
		   new String[] {
			 "constraints", "unCompleteLink invalidTargetRelation"
		   });	
		addAnnotation
		  (relationEClass, 
		   source, 
		   new String[] {
			 "constraints", "almostOneAttribute relationHasPK attributeNameUnique relationNameDefined"
		   });	
		addAnnotation
		  (attributeEClass, 
		   source, 
		   new String[] {
			 "constraints", "attributeNameDefined pkWellFormed undefinedType"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createPivotAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot";	
		addAnnotation
		  (schemaEClass, 
		   source, 
		   new String[] {
			 "relationNameUnique", "if (self.ScontainsRelations -> size() > 0) then\n\t\t\tself.ScontainsRelations -> forAll(r1,r2 | r1 <> r2 implies r1.name <> r2.name)\n\t\telse\n\t\t\ttrue\n\t\tendif"
		   });	
		addAnnotation
		  (linkFKEClass, 
		   source, 
		   new String[] {
			 "unCompleteLink", "\n\t\tif(((self.target.oclIsUndefined())or not(self.source -> size() > 0)))then\n\t\t\tfalse\n\t\telse\n\t\t\ttrue\n\t\tendif",
			 "invalidTargetRelation", "\n\t\tif(self.target.oclIsUndefined())then\n\t\t\tfalse\n\t\telse\n\t\t\tif (self.target.containsAttributes -> size()>0)then\n\t\t\t\tif (self.target.containsAttributes -> exists(isPK <> null))then\n\t\t\t\t\ttrue\n\t\t\t\telse\n\t\t\t\t\tif (self.target.containsAttributes -> exists(isUN = true))then\n\t\t\t\t\t\ttrue\n\t\t\t\t\telse\n\t\t\t\t\t\tfalse\n\t\t\t\t\tendif\n\t\t\t\tendif\n\t\t\telse\n\t\t\t\tfalse\n\t\t\tendif\n\t\tendif"
		   });	
		addAnnotation
		  (relationEClass, 
		   source, 
		   new String[] {
			 "almostOneAttribute", "self.containsAttributes -> size() >= 1",
			 "relationHasPK", "not self.hasPK -> isEmpty()",
			 "attributeNameUnique", "if (self.containsAttributes -> size() > 0) then\n\t\t\tself.containsAttributes -> forAll(a1,a2 | a1 <> a2 implies a1.name <> a2.name)\n\t\telse\n\t\t\ttrue\n\t\tendif",
			 "relationNameDefined", "not self.name.oclIsUndefined()"
		   });	
		addAnnotation
		  (attributeEClass, 
		   source, 
		   new String[] {
			 "attributeNameDefined", "not self.name.oclIsUndefined()",
			 "pkWellFormed", "\n\t\t\tif (self.isPK.oclIsUndefined())then\n\t\t\t\ttrue\n\t\t\telse\n\t\t\t\tif (self.isNN and self.isUN)then\n\t\t\t\t\ttrue\n\t\t\t\telse\n\t\t\t\t\tfalse\n\t\t\t\tendif\n\t\t\tendif",
			 "undefinedType", "self.type <>  EGenericType::UNDEFINED"
		   });
	}

} //Gmf_relational_modelPackageImpl
