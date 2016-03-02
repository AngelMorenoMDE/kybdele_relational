package gmf_relational_model.gmf_relational_model.diagram.edit.policies;

import java.util.Iterator;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand;
import org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyReferenceCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientReferenceRelationshipRequest;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class LinkFKItemSemanticEditPolicy
		extends
		gmf_relational_model.gmf_relational_model.diagram.edit.policies.RelationalModelBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public LinkFKItemSemanticEditPolicy() {
		super(
				gmf_relational_model.gmf_relational_model.diagram.providers.RelationalModelElementTypes.LinkFK_2002);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		View view = (View) getHost().getModel();
		CompositeTransactionalCommand cmd = new CompositeTransactionalCommand(
				getEditingDomain(), null);
		cmd.setTransactionNestingEnabled(false);
		for (Iterator<?> it = view.getTargetEdges().iterator(); it.hasNext();) {
			Edge incomingLink = (Edge) it.next();
			if (gmf_relational_model.gmf_relational_model.diagram.part.RelationalModelVisualIDRegistry
					.getVisualID(incomingLink) == gmf_relational_model.gmf_relational_model.diagram.edit.parts.AttributeIsFKEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
		}
		for (Iterator<?> it = view.getSourceEdges().iterator(); it.hasNext();) {
			Edge outgoingLink = (Edge) it.next();
			if (gmf_relational_model.gmf_relational_model.diagram.part.RelationalModelVisualIDRegistry
					.getVisualID(outgoingLink) == gmf_relational_model.gmf_relational_model.diagram.edit.parts.LinkFKTargetEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						outgoingLink.getSource().getElement(), null,
						outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
		}
		EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
		if (annotation == null) {
			// there are indirectly referenced children, need extra commands: false
			addDestroyShortcutsCommand(cmd, view);
			// delete host element
			cmd.add(new DestroyElementCommand(req));
		} else {
			cmd.add(new DeleteCommand(getEditingDomain(), view));
		}
		return getGEFWrapper(cmd.reduce());
	}

	/**
	 * @generated
	 */
	protected Command getCreateRelationshipCommand(CreateRelationshipRequest req) {
		Command command = req.getTarget() == null ? getStartCreateRelationshipCommand(req)
				: getCompleteCreateRelationshipCommand(req);
		return command != null ? command : super
				.getCreateRelationshipCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getStartCreateRelationshipCommand(
			CreateRelationshipRequest req) {
		if (gmf_relational_model.gmf_relational_model.diagram.providers.RelationalModelElementTypes.AttributeIsFK_4007 == req
				.getElementType()) {
			return null;
		}
		if (gmf_relational_model.gmf_relational_model.diagram.providers.RelationalModelElementTypes.LinkFKTarget_4004 == req
				.getElementType()) {
			return getGEFWrapper(new gmf_relational_model.gmf_relational_model.diagram.edit.commands.LinkFKTargetCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCompleteCreateRelationshipCommand(
			CreateRelationshipRequest req) {
		if (gmf_relational_model.gmf_relational_model.diagram.providers.RelationalModelElementTypes.AttributeIsFK_4007 == req
				.getElementType()) {
			return getGEFWrapper(new gmf_relational_model.gmf_relational_model.diagram.edit.commands.AttributeIsFKCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (gmf_relational_model.gmf_relational_model.diagram.providers.RelationalModelElementTypes.LinkFKTarget_4004 == req
				.getElementType()) {
			return null;
		}
		return null;
	}

	/**
	 * Returns command to reorient EReference based link. New link target or source
	 * should be the domain model element associated with this node.
	 * 
	 * @generated
	 */
	protected Command getReorientReferenceRelationshipCommand(
			ReorientReferenceRelationshipRequest req) {
		switch (getVisualID(req)) {
		case gmf_relational_model.gmf_relational_model.diagram.edit.parts.AttributeIsFKEditPart.VISUAL_ID:
			return getGEFWrapper(new gmf_relational_model.gmf_relational_model.diagram.edit.commands.AttributeIsFKReorientCommand(
					req));
		case gmf_relational_model.gmf_relational_model.diagram.edit.parts.LinkFKTargetEditPart.VISUAL_ID:
			return getGEFWrapper(new gmf_relational_model.gmf_relational_model.diagram.edit.commands.LinkFKTargetReorientCommand(
					req));
		}
		return super.getReorientReferenceRelationshipCommand(req);
	}

}
