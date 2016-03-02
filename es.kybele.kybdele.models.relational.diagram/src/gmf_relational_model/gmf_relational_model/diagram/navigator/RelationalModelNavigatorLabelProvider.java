package gmf_relational_model.gmf_relational_model.diagram.navigator;

import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserOptions;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.viewers.ITreePathLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.ViewerLabel;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonLabelProvider;

/**
 * @generated
 */
public class RelationalModelNavigatorLabelProvider extends LabelProvider
		implements ICommonLabelProvider, ITreePathLabelProvider {

	/**
	 * @generated
	 */
	static {
		gmf_relational_model.gmf_relational_model.diagram.part.RelationalModelDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?UnknownElement", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
		gmf_relational_model.gmf_relational_model.diagram.part.RelationalModelDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?ImageNotFound", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof gmf_relational_model.gmf_relational_model.diagram.navigator.RelationalModelNavigatorItem
				&& !isOwnView(((gmf_relational_model.gmf_relational_model.diagram.navigator.RelationalModelNavigatorItem) element)
						.getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	 * @generated
	 */
	public Image getImage(Object element) {
		if (element instanceof gmf_relational_model.gmf_relational_model.diagram.navigator.RelationalModelNavigatorGroup) {
			gmf_relational_model.gmf_relational_model.diagram.navigator.RelationalModelNavigatorGroup group = (gmf_relational_model.gmf_relational_model.diagram.navigator.RelationalModelNavigatorGroup) element;
			return gmf_relational_model.gmf_relational_model.diagram.part.RelationalModelDiagramEditorPlugin
					.getInstance().getBundledImage(group.getIcon());
		}

		if (element instanceof gmf_relational_model.gmf_relational_model.diagram.navigator.RelationalModelNavigatorItem) {
			gmf_relational_model.gmf_relational_model.diagram.navigator.RelationalModelNavigatorItem navigatorItem = (gmf_relational_model.gmf_relational_model.diagram.navigator.RelationalModelNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return super.getImage(element);
			}
			return getImage(navigatorItem.getView());
		}

		return super.getImage(element);
	}

	/**
	 * @generated
	 */
	public Image getImage(View view) {
		switch (gmf_relational_model.gmf_relational_model.diagram.part.RelationalModelVisualIDRegistry
				.getVisualID(view)) {
		case gmf_relational_model.gmf_relational_model.diagram.edit.parts.SchemaEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Diagram?http://gmf_relational_model/1.0?Schema", gmf_relational_model.gmf_relational_model.diagram.providers.RelationalModelElementTypes.Schema_1000); //$NON-NLS-1$
		case gmf_relational_model.gmf_relational_model.diagram.edit.parts.RelationEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://gmf_relational_model/1.0?Relation", gmf_relational_model.gmf_relational_model.diagram.providers.RelationalModelElementTypes.Relation_2001); //$NON-NLS-1$
		case gmf_relational_model.gmf_relational_model.diagram.edit.parts.LinkFKEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://gmf_relational_model/1.0?LinkFK", gmf_relational_model.gmf_relational_model.diagram.providers.RelationalModelElementTypes.LinkFK_2002); //$NON-NLS-1$
		case gmf_relational_model.gmf_relational_model.diagram.edit.parts.AttributeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://gmf_relational_model/1.0?Attribute", gmf_relational_model.gmf_relational_model.diagram.providers.RelationalModelElementTypes.Attribute_3001); //$NON-NLS-1$
		case gmf_relational_model.gmf_relational_model.diagram.edit.parts.LinkFKTargetEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://gmf_relational_model/1.0?LinkFK?target", gmf_relational_model.gmf_relational_model.diagram.providers.RelationalModelElementTypes.LinkFKTarget_4004); //$NON-NLS-1$
		case gmf_relational_model.gmf_relational_model.diagram.edit.parts.AttributeIsFKEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://gmf_relational_model/1.0?Attribute?isFK", gmf_relational_model.gmf_relational_model.diagram.providers.RelationalModelElementTypes.AttributeIsFK_4007); //$NON-NLS-1$
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = gmf_relational_model.gmf_relational_model.diagram.part.RelationalModelDiagramEditorPlugin
				.getInstance().getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null
				&& elementType != null
				&& gmf_relational_model.gmf_relational_model.diagram.providers.RelationalModelElementTypes
						.isKnownElementType(elementType)) {
			image = gmf_relational_model.gmf_relational_model.diagram.providers.RelationalModelElementTypes
					.getImage(elementType);
			imageRegistry.put(key, image);
		}

		if (image == null) {
			image = imageRegistry.get("Navigator?ImageNotFound"); //$NON-NLS-1$
			imageRegistry.put(key, image);
		}
		return image;
	}

	/**
	 * @generated
	 */
	public String getText(Object element) {
		if (element instanceof gmf_relational_model.gmf_relational_model.diagram.navigator.RelationalModelNavigatorGroup) {
			gmf_relational_model.gmf_relational_model.diagram.navigator.RelationalModelNavigatorGroup group = (gmf_relational_model.gmf_relational_model.diagram.navigator.RelationalModelNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof gmf_relational_model.gmf_relational_model.diagram.navigator.RelationalModelNavigatorItem) {
			gmf_relational_model.gmf_relational_model.diagram.navigator.RelationalModelNavigatorItem navigatorItem = (gmf_relational_model.gmf_relational_model.diagram.navigator.RelationalModelNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return null;
			}
			return getText(navigatorItem.getView());
		}

		return super.getText(element);
	}

	/**
	 * @generated
	 */
	public String getText(View view) {
		if (view.getElement() != null && view.getElement().eIsProxy()) {
			return getUnresolvedDomainElementProxyText(view);
		}
		switch (gmf_relational_model.gmf_relational_model.diagram.part.RelationalModelVisualIDRegistry
				.getVisualID(view)) {
		case gmf_relational_model.gmf_relational_model.diagram.edit.parts.SchemaEditPart.VISUAL_ID:
			return getSchema_1000Text(view);
		case gmf_relational_model.gmf_relational_model.diagram.edit.parts.RelationEditPart.VISUAL_ID:
			return getRelation_2001Text(view);
		case gmf_relational_model.gmf_relational_model.diagram.edit.parts.LinkFKEditPart.VISUAL_ID:
			return getLinkFK_2002Text(view);
		case gmf_relational_model.gmf_relational_model.diagram.edit.parts.AttributeEditPart.VISUAL_ID:
			return getAttribute_3001Text(view);
		case gmf_relational_model.gmf_relational_model.diagram.edit.parts.LinkFKTargetEditPart.VISUAL_ID:
			return getLinkFKTarget_4004Text(view);
		case gmf_relational_model.gmf_relational_model.diagram.edit.parts.AttributeIsFKEditPart.VISUAL_ID:
			return getAttributeIsFK_4007Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	 * @generated
	 */
	private String getSchema_1000Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getRelation_2001Text(View view) {
		IParser parser = gmf_relational_model.gmf_relational_model.diagram.providers.RelationalModelParserProvider
				.getParser(
						gmf_relational_model.gmf_relational_model.diagram.providers.RelationalModelElementTypes.Relation_2001,
						view.getElement() != null ? view.getElement() : view,
						gmf_relational_model.gmf_relational_model.diagram.part.RelationalModelVisualIDRegistry
								.getType(gmf_relational_model.gmf_relational_model.diagram.edit.parts.RelationNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			gmf_relational_model.gmf_relational_model.diagram.part.RelationalModelDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5004); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getLinkFK_2002Text(View view) {
		IParser parser = gmf_relational_model.gmf_relational_model.diagram.providers.RelationalModelParserProvider
				.getParser(
						gmf_relational_model.gmf_relational_model.diagram.providers.RelationalModelElementTypes.LinkFK_2002,
						view.getElement() != null ? view.getElement() : view,
						gmf_relational_model.gmf_relational_model.diagram.part.RelationalModelVisualIDRegistry
								.getType(gmf_relational_model.gmf_relational_model.diagram.edit.parts.WrappingLabel5EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			gmf_relational_model.gmf_relational_model.diagram.part.RelationalModelDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5005); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getAttribute_3001Text(View view) {
		IParser parser = gmf_relational_model.gmf_relational_model.diagram.providers.RelationalModelParserProvider
				.getParser(
						gmf_relational_model.gmf_relational_model.diagram.providers.RelationalModelElementTypes.Attribute_3001,
						view.getElement() != null ? view.getElement() : view,
						gmf_relational_model.gmf_relational_model.diagram.part.RelationalModelVisualIDRegistry
								.getType(gmf_relational_model.gmf_relational_model.diagram.edit.parts.AttributeNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			gmf_relational_model.gmf_relational_model.diagram.part.RelationalModelDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getLinkFKTarget_4004Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getAttributeIsFK_4007Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getUnknownElementText(View view) {
		return "<UnknownElement Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	private String getUnresolvedDomainElementProxyText(View view) {
		return "<Unresolved domain element Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	 * @generated
	 */
	public void restoreState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public void saveState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public String getDescription(Object anElement) {
		return null;
	}

	/**
	 * @generated
	 */
	private boolean isOwnView(View view) {
		return gmf_relational_model.gmf_relational_model.diagram.edit.parts.SchemaEditPart.MODEL_ID
				.equals(gmf_relational_model.gmf_relational_model.diagram.part.RelationalModelVisualIDRegistry
						.getModelID(view));
	}

}
