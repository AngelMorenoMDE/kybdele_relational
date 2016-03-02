package gmf_relational_model.gmf_relational_model.diagram.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.directedit.locator.CellEditorLocatorAccess;

/**
 * @generated
 */
public class RelationalModelEditPartFactory implements EditPartFactory {

	/**
	 * @generated
	 */
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (gmf_relational_model.gmf_relational_model.diagram.part.RelationalModelVisualIDRegistry
					.getVisualID(view)) {

			case gmf_relational_model.gmf_relational_model.diagram.edit.parts.SchemaEditPart.VISUAL_ID:
				return new gmf_relational_model.gmf_relational_model.diagram.edit.parts.SchemaEditPart(
						view);

			case gmf_relational_model.gmf_relational_model.diagram.edit.parts.RelationEditPart.VISUAL_ID:
				return new gmf_relational_model.gmf_relational_model.diagram.edit.parts.RelationEditPart(
						view);

			case gmf_relational_model.gmf_relational_model.diagram.edit.parts.RelationNameEditPart.VISUAL_ID:
				return new gmf_relational_model.gmf_relational_model.diagram.edit.parts.RelationNameEditPart(
						view);

			case gmf_relational_model.gmf_relational_model.diagram.edit.parts.LinkFKEditPart.VISUAL_ID:
				return new gmf_relational_model.gmf_relational_model.diagram.edit.parts.LinkFKEditPart(
						view);

			case gmf_relational_model.gmf_relational_model.diagram.edit.parts.WrappingLabel5EditPart.VISUAL_ID:
				return new gmf_relational_model.gmf_relational_model.diagram.edit.parts.WrappingLabel5EditPart(
						view);

			case gmf_relational_model.gmf_relational_model.diagram.edit.parts.WrappingLabel6EditPart.VISUAL_ID:
				return new gmf_relational_model.gmf_relational_model.diagram.edit.parts.WrappingLabel6EditPart(
						view);

			case gmf_relational_model.gmf_relational_model.diagram.edit.parts.AttributeEditPart.VISUAL_ID:
				return new gmf_relational_model.gmf_relational_model.diagram.edit.parts.AttributeEditPart(
						view);

			case gmf_relational_model.gmf_relational_model.diagram.edit.parts.AttributeNameEditPart.VISUAL_ID:
				return new gmf_relational_model.gmf_relational_model.diagram.edit.parts.AttributeNameEditPart(
						view);

			case gmf_relational_model.gmf_relational_model.diagram.edit.parts.WrappingLabelEditPart.VISUAL_ID:
				return new gmf_relational_model.gmf_relational_model.diagram.edit.parts.WrappingLabelEditPart(
						view);

			case gmf_relational_model.gmf_relational_model.diagram.edit.parts.WrappingLabel2EditPart.VISUAL_ID:
				return new gmf_relational_model.gmf_relational_model.diagram.edit.parts.WrappingLabel2EditPart(
						view);

			case gmf_relational_model.gmf_relational_model.diagram.edit.parts.RelationCompartmentAttributesEditPart.VISUAL_ID:
				return new gmf_relational_model.gmf_relational_model.diagram.edit.parts.RelationCompartmentAttributesEditPart(
						view);

			case gmf_relational_model.gmf_relational_model.diagram.edit.parts.AttributeIsFKEditPart.VISUAL_ID:
				return new gmf_relational_model.gmf_relational_model.diagram.edit.parts.AttributeIsFKEditPart(
						view);

			case gmf_relational_model.gmf_relational_model.diagram.edit.parts.LinkFKTargetEditPart.VISUAL_ID:
				return new gmf_relational_model.gmf_relational_model.diagram.edit.parts.LinkFKTargetEditPart(
						view);

			}
		}
		return createUnrecognizedEditPart(context, model);
	}

	/**
	 * @generated
	 */
	private EditPart createUnrecognizedEditPart(EditPart context, Object model) {
		// Handle creation of unrecognized child node EditParts here
		return null;
	}

	/**
	 * @generated
	 */
	public static CellEditorLocator getTextCellEditorLocator(
			ITextAwareEditPart source) {
		return CellEditorLocatorAccess.INSTANCE
				.getTextCellEditorLocator(source);
	}

}
