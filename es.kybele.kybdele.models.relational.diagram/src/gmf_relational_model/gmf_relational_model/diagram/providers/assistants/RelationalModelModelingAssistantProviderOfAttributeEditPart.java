package gmf_relational_model.gmf_relational_model.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

/**
 * @generated
 */
public class RelationalModelModelingAssistantProviderOfAttributeEditPart
		extends
		gmf_relational_model.gmf_relational_model.diagram.providers.RelationalModelModelingAssistantProvider {

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSource((gmf_relational_model.gmf_relational_model.diagram.edit.parts.AttributeEditPart) sourceEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnSource(
			gmf_relational_model.gmf_relational_model.diagram.edit.parts.AttributeEditPart source) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(gmf_relational_model.gmf_relational_model.diagram.providers.RelationalModelElementTypes.AttributeIsFK_4007);
		return types;
	}

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getRelTypesOnSourceAndTarget(IAdaptable source,
			IAdaptable target) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSourceAndTarget(
				(gmf_relational_model.gmf_relational_model.diagram.edit.parts.AttributeEditPart) sourceEditPart,
				targetEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnSourceAndTarget(
			gmf_relational_model.gmf_relational_model.diagram.edit.parts.AttributeEditPart source,
			IGraphicalEditPart targetEditPart) {
		List<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof gmf_relational_model.gmf_relational_model.diagram.edit.parts.LinkFKEditPart) {
			types.add(gmf_relational_model.gmf_relational_model.diagram.providers.RelationalModelElementTypes.AttributeIsFK_4007);
		}
		return types;
	}

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getTypesForTarget(IAdaptable source,
			IElementType relationshipType) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForTarget(
				(gmf_relational_model.gmf_relational_model.diagram.edit.parts.AttributeEditPart) sourceEditPart,
				relationshipType);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetTypesForTarget(
			gmf_relational_model.gmf_relational_model.diagram.edit.parts.AttributeEditPart source,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == gmf_relational_model.gmf_relational_model.diagram.providers.RelationalModelElementTypes.AttributeIsFK_4007) {
			types.add(gmf_relational_model.gmf_relational_model.diagram.providers.RelationalModelElementTypes.LinkFK_2002);
		}
		return types;
	}

}
