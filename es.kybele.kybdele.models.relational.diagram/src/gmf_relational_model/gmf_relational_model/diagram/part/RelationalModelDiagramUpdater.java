package gmf_relational_model.gmf_relational_model.diagram.part;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.update.DiagramUpdater;

/**
 * @generated
 */
public class RelationalModelDiagramUpdater {

	/**
	 * @generated
	 */
	public static List<gmf_relational_model.gmf_relational_model.diagram.part.RelationalModelNodeDescriptor> getSemanticChildren(
			View view) {
		switch (gmf_relational_model.gmf_relational_model.diagram.part.RelationalModelVisualIDRegistry
				.getVisualID(view)) {
		case gmf_relational_model.gmf_relational_model.diagram.edit.parts.SchemaEditPart.VISUAL_ID:
			return getSchema_1000SemanticChildren(view);
		case gmf_relational_model.gmf_relational_model.diagram.edit.parts.RelationCompartmentAttributesEditPart.VISUAL_ID:
			return getRelationCompartmentAttributes_7001SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<gmf_relational_model.gmf_relational_model.diagram.part.RelationalModelNodeDescriptor> getSchema_1000SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		gmf_relational_model.gmf_relational_model.Schema modelElement = (gmf_relational_model.gmf_relational_model.Schema) view
				.getElement();
		LinkedList<gmf_relational_model.gmf_relational_model.diagram.part.RelationalModelNodeDescriptor> result = new LinkedList<gmf_relational_model.gmf_relational_model.diagram.part.RelationalModelNodeDescriptor>();
		for (Iterator<?> it = modelElement.getScontainsRelations().iterator(); it
				.hasNext();) {
			gmf_relational_model.gmf_relational_model.Relation childElement = (gmf_relational_model.gmf_relational_model.Relation) it
					.next();
			int visualID = gmf_relational_model.gmf_relational_model.diagram.part.RelationalModelVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == gmf_relational_model.gmf_relational_model.diagram.edit.parts.RelationEditPart.VISUAL_ID) {
				result.add(new gmf_relational_model.gmf_relational_model.diagram.part.RelationalModelNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getScontainsLinksFK().iterator(); it
				.hasNext();) {
			gmf_relational_model.gmf_relational_model.LinkFK childElement = (gmf_relational_model.gmf_relational_model.LinkFK) it
					.next();
			int visualID = gmf_relational_model.gmf_relational_model.diagram.part.RelationalModelVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == gmf_relational_model.gmf_relational_model.diagram.edit.parts.LinkFKEditPart.VISUAL_ID) {
				result.add(new gmf_relational_model.gmf_relational_model.diagram.part.RelationalModelNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<gmf_relational_model.gmf_relational_model.diagram.part.RelationalModelNodeDescriptor> getRelationCompartmentAttributes_7001SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		gmf_relational_model.gmf_relational_model.Relation modelElement = (gmf_relational_model.gmf_relational_model.Relation) containerView
				.getElement();
		LinkedList<gmf_relational_model.gmf_relational_model.diagram.part.RelationalModelNodeDescriptor> result = new LinkedList<gmf_relational_model.gmf_relational_model.diagram.part.RelationalModelNodeDescriptor>();
		for (Iterator<?> it = modelElement.getContainsAttributes().iterator(); it
				.hasNext();) {
			gmf_relational_model.gmf_relational_model.Attribute childElement = (gmf_relational_model.gmf_relational_model.Attribute) it
					.next();
			int visualID = gmf_relational_model.gmf_relational_model.diagram.part.RelationalModelVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == gmf_relational_model.gmf_relational_model.diagram.edit.parts.AttributeEditPart.VISUAL_ID) {
				result.add(new gmf_relational_model.gmf_relational_model.diagram.part.RelationalModelNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<gmf_relational_model.gmf_relational_model.diagram.part.RelationalModelLinkDescriptor> getContainedLinks(
			View view) {
		switch (gmf_relational_model.gmf_relational_model.diagram.part.RelationalModelVisualIDRegistry
				.getVisualID(view)) {
		case gmf_relational_model.gmf_relational_model.diagram.edit.parts.SchemaEditPart.VISUAL_ID:
			return getSchema_1000ContainedLinks(view);
		case gmf_relational_model.gmf_relational_model.diagram.edit.parts.RelationEditPart.VISUAL_ID:
			return getRelation_2001ContainedLinks(view);
		case gmf_relational_model.gmf_relational_model.diagram.edit.parts.LinkFKEditPart.VISUAL_ID:
			return getLinkFK_2002ContainedLinks(view);
		case gmf_relational_model.gmf_relational_model.diagram.edit.parts.AttributeEditPart.VISUAL_ID:
			return getAttribute_3001ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<gmf_relational_model.gmf_relational_model.diagram.part.RelationalModelLinkDescriptor> getIncomingLinks(
			View view) {
		switch (gmf_relational_model.gmf_relational_model.diagram.part.RelationalModelVisualIDRegistry
				.getVisualID(view)) {
		case gmf_relational_model.gmf_relational_model.diagram.edit.parts.RelationEditPart.VISUAL_ID:
			return getRelation_2001IncomingLinks(view);
		case gmf_relational_model.gmf_relational_model.diagram.edit.parts.LinkFKEditPart.VISUAL_ID:
			return getLinkFK_2002IncomingLinks(view);
		case gmf_relational_model.gmf_relational_model.diagram.edit.parts.AttributeEditPart.VISUAL_ID:
			return getAttribute_3001IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<gmf_relational_model.gmf_relational_model.diagram.part.RelationalModelLinkDescriptor> getOutgoingLinks(
			View view) {
		switch (gmf_relational_model.gmf_relational_model.diagram.part.RelationalModelVisualIDRegistry
				.getVisualID(view)) {
		case gmf_relational_model.gmf_relational_model.diagram.edit.parts.RelationEditPart.VISUAL_ID:
			return getRelation_2001OutgoingLinks(view);
		case gmf_relational_model.gmf_relational_model.diagram.edit.parts.LinkFKEditPart.VISUAL_ID:
			return getLinkFK_2002OutgoingLinks(view);
		case gmf_relational_model.gmf_relational_model.diagram.edit.parts.AttributeEditPart.VISUAL_ID:
			return getAttribute_3001OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<gmf_relational_model.gmf_relational_model.diagram.part.RelationalModelLinkDescriptor> getSchema_1000ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<gmf_relational_model.gmf_relational_model.diagram.part.RelationalModelLinkDescriptor> getRelation_2001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<gmf_relational_model.gmf_relational_model.diagram.part.RelationalModelLinkDescriptor> getLinkFK_2002ContainedLinks(
			View view) {
		gmf_relational_model.gmf_relational_model.LinkFK modelElement = (gmf_relational_model.gmf_relational_model.LinkFK) view
				.getElement();
		LinkedList<gmf_relational_model.gmf_relational_model.diagram.part.RelationalModelLinkDescriptor> result = new LinkedList<gmf_relational_model.gmf_relational_model.diagram.part.RelationalModelLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_LinkFK_Target_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<gmf_relational_model.gmf_relational_model.diagram.part.RelationalModelLinkDescriptor> getAttribute_3001ContainedLinks(
			View view) {
		gmf_relational_model.gmf_relational_model.Attribute modelElement = (gmf_relational_model.gmf_relational_model.Attribute) view
				.getElement();
		LinkedList<gmf_relational_model.gmf_relational_model.diagram.part.RelationalModelLinkDescriptor> result = new LinkedList<gmf_relational_model.gmf_relational_model.diagram.part.RelationalModelLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Attribute_IsFK_4007(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<gmf_relational_model.gmf_relational_model.diagram.part.RelationalModelLinkDescriptor> getRelation_2001IncomingLinks(
			View view) {
		gmf_relational_model.gmf_relational_model.Relation modelElement = (gmf_relational_model.gmf_relational_model.Relation) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<gmf_relational_model.gmf_relational_model.diagram.part.RelationalModelLinkDescriptor> result = new LinkedList<gmf_relational_model.gmf_relational_model.diagram.part.RelationalModelLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_LinkFK_Target_4004(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<gmf_relational_model.gmf_relational_model.diagram.part.RelationalModelLinkDescriptor> getLinkFK_2002IncomingLinks(
			View view) {
		gmf_relational_model.gmf_relational_model.LinkFK modelElement = (gmf_relational_model.gmf_relational_model.LinkFK) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<gmf_relational_model.gmf_relational_model.diagram.part.RelationalModelLinkDescriptor> result = new LinkedList<gmf_relational_model.gmf_relational_model.diagram.part.RelationalModelLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Attribute_IsFK_4007(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<gmf_relational_model.gmf_relational_model.diagram.part.RelationalModelLinkDescriptor> getAttribute_3001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<gmf_relational_model.gmf_relational_model.diagram.part.RelationalModelLinkDescriptor> getRelation_2001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<gmf_relational_model.gmf_relational_model.diagram.part.RelationalModelLinkDescriptor> getLinkFK_2002OutgoingLinks(
			View view) {
		gmf_relational_model.gmf_relational_model.LinkFK modelElement = (gmf_relational_model.gmf_relational_model.LinkFK) view
				.getElement();
		LinkedList<gmf_relational_model.gmf_relational_model.diagram.part.RelationalModelLinkDescriptor> result = new LinkedList<gmf_relational_model.gmf_relational_model.diagram.part.RelationalModelLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_LinkFK_Target_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<gmf_relational_model.gmf_relational_model.diagram.part.RelationalModelLinkDescriptor> getAttribute_3001OutgoingLinks(
			View view) {
		gmf_relational_model.gmf_relational_model.Attribute modelElement = (gmf_relational_model.gmf_relational_model.Attribute) view
				.getElement();
		LinkedList<gmf_relational_model.gmf_relational_model.diagram.part.RelationalModelLinkDescriptor> result = new LinkedList<gmf_relational_model.gmf_relational_model.diagram.part.RelationalModelLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Attribute_IsFK_4007(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<gmf_relational_model.gmf_relational_model.diagram.part.RelationalModelLinkDescriptor> getIncomingFeatureModelFacetLinks_Attribute_IsFK_4007(
			gmf_relational_model.gmf_relational_model.LinkFK target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<gmf_relational_model.gmf_relational_model.diagram.part.RelationalModelLinkDescriptor> result = new LinkedList<gmf_relational_model.gmf_relational_model.diagram.part.RelationalModelLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == gmf_relational_model.gmf_relational_model.Gmf_relational_modelPackage.eINSTANCE
					.getAttribute_IsFK()) {
				result.add(new gmf_relational_model.gmf_relational_model.diagram.part.RelationalModelLinkDescriptor(
						setting.getEObject(),
						target,
						gmf_relational_model.gmf_relational_model.diagram.providers.RelationalModelElementTypes.AttributeIsFK_4007,
						gmf_relational_model.gmf_relational_model.diagram.edit.parts.AttributeIsFKEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<gmf_relational_model.gmf_relational_model.diagram.part.RelationalModelLinkDescriptor> getIncomingFeatureModelFacetLinks_LinkFK_Target_4004(
			gmf_relational_model.gmf_relational_model.Relation target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<gmf_relational_model.gmf_relational_model.diagram.part.RelationalModelLinkDescriptor> result = new LinkedList<gmf_relational_model.gmf_relational_model.diagram.part.RelationalModelLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == gmf_relational_model.gmf_relational_model.Gmf_relational_modelPackage.eINSTANCE
					.getLinkFK_Target()) {
				result.add(new gmf_relational_model.gmf_relational_model.diagram.part.RelationalModelLinkDescriptor(
						setting.getEObject(),
						target,
						gmf_relational_model.gmf_relational_model.diagram.providers.RelationalModelElementTypes.LinkFKTarget_4004,
						gmf_relational_model.gmf_relational_model.diagram.edit.parts.LinkFKTargetEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<gmf_relational_model.gmf_relational_model.diagram.part.RelationalModelLinkDescriptor> getOutgoingFeatureModelFacetLinks_Attribute_IsFK_4007(
			gmf_relational_model.gmf_relational_model.Attribute source) {
		LinkedList<gmf_relational_model.gmf_relational_model.diagram.part.RelationalModelLinkDescriptor> result = new LinkedList<gmf_relational_model.gmf_relational_model.diagram.part.RelationalModelLinkDescriptor>();
		gmf_relational_model.gmf_relational_model.LinkFK destination = source
				.getIsFK();
		if (destination == null) {
			return result;
		}
		result.add(new gmf_relational_model.gmf_relational_model.diagram.part.RelationalModelLinkDescriptor(
				source,
				destination,
				gmf_relational_model.gmf_relational_model.diagram.providers.RelationalModelElementTypes.AttributeIsFK_4007,
				gmf_relational_model.gmf_relational_model.diagram.edit.parts.AttributeIsFKEditPart.VISUAL_ID));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<gmf_relational_model.gmf_relational_model.diagram.part.RelationalModelLinkDescriptor> getOutgoingFeatureModelFacetLinks_LinkFK_Target_4004(
			gmf_relational_model.gmf_relational_model.LinkFK source) {
		LinkedList<gmf_relational_model.gmf_relational_model.diagram.part.RelationalModelLinkDescriptor> result = new LinkedList<gmf_relational_model.gmf_relational_model.diagram.part.RelationalModelLinkDescriptor>();
		gmf_relational_model.gmf_relational_model.Relation destination = source
				.getTarget();
		if (destination == null) {
			return result;
		}
		result.add(new gmf_relational_model.gmf_relational_model.diagram.part.RelationalModelLinkDescriptor(
				source,
				destination,
				gmf_relational_model.gmf_relational_model.diagram.providers.RelationalModelElementTypes.LinkFKTarget_4004,
				gmf_relational_model.gmf_relational_model.diagram.edit.parts.LinkFKTargetEditPart.VISUAL_ID));
		return result;
	}

	/**
	 * @generated
	 */
	public static final DiagramUpdater TYPED_INSTANCE = new DiagramUpdater() {
		/**
		 * @generated
		 */
		@Override
		public List<gmf_relational_model.gmf_relational_model.diagram.part.RelationalModelNodeDescriptor> getSemanticChildren(
				View view) {
			return RelationalModelDiagramUpdater.getSemanticChildren(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<gmf_relational_model.gmf_relational_model.diagram.part.RelationalModelLinkDescriptor> getContainedLinks(
				View view) {
			return RelationalModelDiagramUpdater.getContainedLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<gmf_relational_model.gmf_relational_model.diagram.part.RelationalModelLinkDescriptor> getIncomingLinks(
				View view) {
			return RelationalModelDiagramUpdater.getIncomingLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<gmf_relational_model.gmf_relational_model.diagram.part.RelationalModelLinkDescriptor> getOutgoingLinks(
				View view) {
			return RelationalModelDiagramUpdater.getOutgoingLinks(view);
		}
	};

}
