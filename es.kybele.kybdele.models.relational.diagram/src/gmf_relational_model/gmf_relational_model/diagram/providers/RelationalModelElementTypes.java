package gmf_relational_model.gmf_relational_model.diagram.providers;

import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypeImages;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypes;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;

/**
 * @generated
 */
public class RelationalModelElementTypes {

	/**
	 * @generated
	 */
	private RelationalModelElementTypes() {
	}

	/**
	 * @generated
	 */
	private static Map<IElementType, ENamedElement> elements;

	/**
	 * @generated
	 */
	private static DiagramElementTypeImages elementTypeImages = new DiagramElementTypeImages(
			gmf_relational_model.gmf_relational_model.diagram.part.RelationalModelDiagramEditorPlugin
					.getInstance().getItemProvidersAdapterFactory());

	/**
	 * @generated
	 */
	private static Set<IElementType> KNOWN_ELEMENT_TYPES;

	/**
	 * @generated
	 */
	public static final IElementType Schema_1000 = getElementType("gmf_relational_model.diagram.Schema_1000"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Relation_2001 = getElementType("gmf_relational_model.diagram.Relation_2001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType LinkFK_2002 = getElementType("gmf_relational_model.diagram.LinkFK_2002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Attribute_3001 = getElementType("gmf_relational_model.diagram.Attribute_3001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType AttributeIsFK_4007 = getElementType("gmf_relational_model.diagram.AttributeIsFK_4007"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType LinkFKTarget_4004 = getElementType("gmf_relational_model.diagram.LinkFKTarget_4004"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(ENamedElement element) {
		return elementTypeImages.getImageDescriptor(element);
	}

	/**
	 * @generated
	 */
	public static Image getImage(ENamedElement element) {
		return elementTypeImages.getImage(element);
	}

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(IAdaptable hint) {
		return getImageDescriptor(getElement(hint));
	}

	/**
	 * @generated
	 */
	public static Image getImage(IAdaptable hint) {
		return getImage(getElement(hint));
	}

	/**
	 * Returns 'type' of the ecore object associated with the hint.
	 * 
	 * @generated
	 */
	public static ENamedElement getElement(IAdaptable hint) {
		Object type = hint.getAdapter(IElementType.class);
		if (elements == null) {
			elements = new IdentityHashMap<IElementType, ENamedElement>();

			elements.put(
					Schema_1000,
					gmf_relational_model.gmf_relational_model.Gmf_relational_modelPackage.eINSTANCE
							.getSchema());

			elements.put(
					Relation_2001,
					gmf_relational_model.gmf_relational_model.Gmf_relational_modelPackage.eINSTANCE
							.getRelation());

			elements.put(
					LinkFK_2002,
					gmf_relational_model.gmf_relational_model.Gmf_relational_modelPackage.eINSTANCE
							.getLinkFK());

			elements.put(
					Attribute_3001,
					gmf_relational_model.gmf_relational_model.Gmf_relational_modelPackage.eINSTANCE
							.getAttribute());

			elements.put(
					AttributeIsFK_4007,
					gmf_relational_model.gmf_relational_model.Gmf_relational_modelPackage.eINSTANCE
							.getAttribute_IsFK());

			elements.put(
					LinkFKTarget_4004,
					gmf_relational_model.gmf_relational_model.Gmf_relational_modelPackage.eINSTANCE
							.getLinkFK_Target());
		}
		return (ENamedElement) elements.get(type);
	}

	/**
	 * @generated
	 */
	private static IElementType getElementType(String id) {
		return ElementTypeRegistry.getInstance().getType(id);
	}

	/**
	 * @generated
	 */
	public static boolean isKnownElementType(IElementType elementType) {
		if (KNOWN_ELEMENT_TYPES == null) {
			KNOWN_ELEMENT_TYPES = new HashSet<IElementType>();
			KNOWN_ELEMENT_TYPES.add(Schema_1000);
			KNOWN_ELEMENT_TYPES.add(Relation_2001);
			KNOWN_ELEMENT_TYPES.add(LinkFK_2002);
			KNOWN_ELEMENT_TYPES.add(Attribute_3001);
			KNOWN_ELEMENT_TYPES.add(AttributeIsFK_4007);
			KNOWN_ELEMENT_TYPES.add(LinkFKTarget_4004);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	 * @generated
	 */
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case gmf_relational_model.gmf_relational_model.diagram.edit.parts.SchemaEditPart.VISUAL_ID:
			return Schema_1000;
		case gmf_relational_model.gmf_relational_model.diagram.edit.parts.RelationEditPart.VISUAL_ID:
			return Relation_2001;
		case gmf_relational_model.gmf_relational_model.diagram.edit.parts.LinkFKEditPart.VISUAL_ID:
			return LinkFK_2002;
		case gmf_relational_model.gmf_relational_model.diagram.edit.parts.AttributeEditPart.VISUAL_ID:
			return Attribute_3001;
		case gmf_relational_model.gmf_relational_model.diagram.edit.parts.AttributeIsFKEditPart.VISUAL_ID:
			return AttributeIsFK_4007;
		case gmf_relational_model.gmf_relational_model.diagram.edit.parts.LinkFKTargetEditPart.VISUAL_ID:
			return LinkFKTarget_4004;
		}
		return null;
	}

	/**
	 * @generated
	 */
	public static final DiagramElementTypes TYPED_INSTANCE = new DiagramElementTypes(
			elementTypeImages) {

		/**
		 * @generated
		 */
		@Override
		public boolean isKnownElementType(IElementType elementType) {
			return gmf_relational_model.gmf_relational_model.diagram.providers.RelationalModelElementTypes
					.isKnownElementType(elementType);
		}

		/**
		 * @generated
		 */
		@Override
		public IElementType getElementTypeForVisualId(int visualID) {
			return gmf_relational_model.gmf_relational_model.diagram.providers.RelationalModelElementTypes
					.getElementType(visualID);
		}

		/**
		 * @generated
		 */
		@Override
		public ENamedElement getDefiningNamedElement(
				IAdaptable elementTypeAdapter) {
			return gmf_relational_model.gmf_relational_model.diagram.providers.RelationalModelElementTypes
					.getElement(elementTypeAdapter);
		}
	};

}
