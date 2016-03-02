package gmf_relational_model.gmf_relational_model.diagram.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.structure.DiagramStructure;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class RelationalModelVisualIDRegistry {

	/**
	 * @generated
	 */
	private static final String DEBUG_KEY = "gmf_relational_model.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (gmf_relational_model.gmf_relational_model.diagram.edit.parts.SchemaEditPart.MODEL_ID
					.equals(view.getType())) {
				return gmf_relational_model.gmf_relational_model.diagram.edit.parts.SchemaEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return gmf_relational_model.gmf_relational_model.diagram.part.RelationalModelVisualIDRegistry
				.getVisualID(view.getType());
	}

	/**
	 * @generated
	 */
	public static String getModelID(View view) {
		View diagram = view.getDiagram();
		while (view != diagram) {
			EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
			if (annotation != null) {
				return (String) annotation.getDetails().get("modelID"); //$NON-NLS-1$
			}
			view = (View) view.eContainer();
		}
		return diagram != null ? diagram.getType() : null;
	}

	/**
	 * @generated
	 */
	public static int getVisualID(String type) {
		try {
			return Integer.parseInt(type);
		} catch (NumberFormatException e) {
			if (Boolean.TRUE.toString().equalsIgnoreCase(
					Platform.getDebugOption(DEBUG_KEY))) {
				gmf_relational_model.gmf_relational_model.diagram.part.RelationalModelDiagramEditorPlugin
						.getInstance().logError(
								"Unable to parse view type as a visualID number: "
										+ type);
			}
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static String getType(int visualID) {
		return Integer.toString(visualID);
	}

	/**
	 * @generated
	 */
	public static int getDiagramVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (gmf_relational_model.gmf_relational_model.Gmf_relational_modelPackage.eINSTANCE
				.getSchema().isSuperTypeOf(domainElement.eClass())
				&& isDiagram((gmf_relational_model.gmf_relational_model.Schema) domainElement)) {
			return gmf_relational_model.gmf_relational_model.diagram.edit.parts.SchemaEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static int getNodeVisualID(View containerView, EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		String containerModelID = gmf_relational_model.gmf_relational_model.diagram.part.RelationalModelVisualIDRegistry
				.getModelID(containerView);
		if (!gmf_relational_model.gmf_relational_model.diagram.edit.parts.SchemaEditPart.MODEL_ID
				.equals(containerModelID)) {
			return -1;
		}
		int containerVisualID;
		if (gmf_relational_model.gmf_relational_model.diagram.edit.parts.SchemaEditPart.MODEL_ID
				.equals(containerModelID)) {
			containerVisualID = gmf_relational_model.gmf_relational_model.diagram.part.RelationalModelVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = gmf_relational_model.gmf_relational_model.diagram.edit.parts.SchemaEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case gmf_relational_model.gmf_relational_model.diagram.edit.parts.SchemaEditPart.VISUAL_ID:
			if (gmf_relational_model.gmf_relational_model.Gmf_relational_modelPackage.eINSTANCE
					.getRelation().isSuperTypeOf(domainElement.eClass())) {
				return gmf_relational_model.gmf_relational_model.diagram.edit.parts.RelationEditPart.VISUAL_ID;
			}
			if (gmf_relational_model.gmf_relational_model.Gmf_relational_modelPackage.eINSTANCE
					.getLinkFK().isSuperTypeOf(domainElement.eClass())) {
				return gmf_relational_model.gmf_relational_model.diagram.edit.parts.LinkFKEditPart.VISUAL_ID;
			}
			break;
		case gmf_relational_model.gmf_relational_model.diagram.edit.parts.RelationCompartmentAttributesEditPart.VISUAL_ID:
			if (gmf_relational_model.gmf_relational_model.Gmf_relational_modelPackage.eINSTANCE
					.getAttribute().isSuperTypeOf(domainElement.eClass())) {
				return gmf_relational_model.gmf_relational_model.diagram.edit.parts.AttributeEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = gmf_relational_model.gmf_relational_model.diagram.part.RelationalModelVisualIDRegistry
				.getModelID(containerView);
		if (!gmf_relational_model.gmf_relational_model.diagram.edit.parts.SchemaEditPart.MODEL_ID
				.equals(containerModelID)) {
			return false;
		}
		int containerVisualID;
		if (gmf_relational_model.gmf_relational_model.diagram.edit.parts.SchemaEditPart.MODEL_ID
				.equals(containerModelID)) {
			containerVisualID = gmf_relational_model.gmf_relational_model.diagram.part.RelationalModelVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = gmf_relational_model.gmf_relational_model.diagram.edit.parts.SchemaEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case gmf_relational_model.gmf_relational_model.diagram.edit.parts.SchemaEditPart.VISUAL_ID:
			if (gmf_relational_model.gmf_relational_model.diagram.edit.parts.RelationEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (gmf_relational_model.gmf_relational_model.diagram.edit.parts.LinkFKEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case gmf_relational_model.gmf_relational_model.diagram.edit.parts.RelationEditPart.VISUAL_ID:
			if (gmf_relational_model.gmf_relational_model.diagram.edit.parts.RelationNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (gmf_relational_model.gmf_relational_model.diagram.edit.parts.RelationCompartmentAttributesEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case gmf_relational_model.gmf_relational_model.diagram.edit.parts.LinkFKEditPart.VISUAL_ID:
			if (gmf_relational_model.gmf_relational_model.diagram.edit.parts.WrappingLabel5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (gmf_relational_model.gmf_relational_model.diagram.edit.parts.WrappingLabel6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case gmf_relational_model.gmf_relational_model.diagram.edit.parts.AttributeEditPart.VISUAL_ID:
			if (gmf_relational_model.gmf_relational_model.diagram.edit.parts.AttributeNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (gmf_relational_model.gmf_relational_model.diagram.edit.parts.WrappingLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (gmf_relational_model.gmf_relational_model.diagram.edit.parts.WrappingLabel2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case gmf_relational_model.gmf_relational_model.diagram.edit.parts.RelationCompartmentAttributesEditPart.VISUAL_ID:
			if (gmf_relational_model.gmf_relational_model.diagram.edit.parts.AttributeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static int getLinkWithClassVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 * 
	 * @generated
	 */
	private static boolean isDiagram(
			gmf_relational_model.gmf_relational_model.Schema element) {
		return true;
	}

	/**
	 * @generated
	 */
	public static boolean checkNodeVisualID(View containerView,
			EObject domainElement, int candidate) {
		if (candidate == -1) {
			//unrecognized id is always bad
			return false;
		}
		int basic = getNodeVisualID(containerView, domainElement);
		return basic == candidate;
	}

	/**
	 * @generated
	 */
	public static boolean isCompartmentVisualID(int visualID) {
		switch (visualID) {
		case gmf_relational_model.gmf_relational_model.diagram.edit.parts.RelationCompartmentAttributesEditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static boolean isSemanticLeafVisualID(int visualID) {
		switch (visualID) {
		case gmf_relational_model.gmf_relational_model.diagram.edit.parts.SchemaEditPart.VISUAL_ID:
			return false;
		case gmf_relational_model.gmf_relational_model.diagram.edit.parts.LinkFKEditPart.VISUAL_ID:
		case gmf_relational_model.gmf_relational_model.diagram.edit.parts.AttributeEditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static final DiagramStructure TYPED_INSTANCE = new DiagramStructure() {
		/**
		 * @generated
		 */
		@Override
		public int getVisualID(View view) {
			return gmf_relational_model.gmf_relational_model.diagram.part.RelationalModelVisualIDRegistry
					.getVisualID(view);
		}

		/**
		 * @generated
		 */
		@Override
		public String getModelID(View view) {
			return gmf_relational_model.gmf_relational_model.diagram.part.RelationalModelVisualIDRegistry
					.getModelID(view);
		}

		/**
		 * @generated
		 */
		@Override
		public int getNodeVisualID(View containerView, EObject domainElement) {
			return gmf_relational_model.gmf_relational_model.diagram.part.RelationalModelVisualIDRegistry
					.getNodeVisualID(containerView, domainElement);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean checkNodeVisualID(View containerView,
				EObject domainElement, int candidate) {
			return gmf_relational_model.gmf_relational_model.diagram.part.RelationalModelVisualIDRegistry
					.checkNodeVisualID(containerView, domainElement, candidate);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean isCompartmentVisualID(int visualID) {
			return gmf_relational_model.gmf_relational_model.diagram.part.RelationalModelVisualIDRegistry
					.isCompartmentVisualID(visualID);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean isSemanticLeafVisualID(int visualID) {
			return gmf_relational_model.gmf_relational_model.diagram.part.RelationalModelVisualIDRegistry
					.isSemanticLeafVisualID(visualID);
		}
	};

}
