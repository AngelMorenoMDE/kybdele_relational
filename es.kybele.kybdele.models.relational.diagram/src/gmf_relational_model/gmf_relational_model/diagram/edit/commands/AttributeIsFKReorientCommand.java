package gmf_relational_model.gmf_relational_model.diagram.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientReferenceRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;

/**
 * @generated
 */
public class AttributeIsFKReorientCommand extends EditElementCommand {

	/**
	 * @generated
	 */
	private final int reorientDirection;

	/**
	 * @generated
	 */
	private final EObject referenceOwner;

	/**
	 * @generated
	 */
	private final EObject oldEnd;

	/**
	 * @generated
	 */
	private final EObject newEnd;

	/**
	 * @generated
	 */
	public AttributeIsFKReorientCommand(
			ReorientReferenceRelationshipRequest request) {
		super(request.getLabel(), null, request);
		reorientDirection = request.getDirection();
		referenceOwner = request.getReferenceOwner();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	 * @generated
	 */
	public boolean canExecute() {
		if (false == referenceOwner instanceof gmf_relational_model.gmf_relational_model.Attribute) {
			return false;
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return canReorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return canReorientTarget();
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean canReorientSource() {
		if (!(oldEnd instanceof gmf_relational_model.gmf_relational_model.LinkFK && newEnd instanceof gmf_relational_model.gmf_relational_model.Attribute)) {
			return false;
		}
		return gmf_relational_model.gmf_relational_model.diagram.edit.policies.RelationalModelBaseItemSemanticEditPolicy
				.getLinkConstraints().canExistAttributeIsFK_4007(
						getNewSource(), getOldTarget());
	}

	/**
	 * @generated
	 */
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof gmf_relational_model.gmf_relational_model.LinkFK && newEnd instanceof gmf_relational_model.gmf_relational_model.LinkFK)) {
			return false;
		}
		return gmf_relational_model.gmf_relational_model.diagram.edit.policies.RelationalModelBaseItemSemanticEditPolicy
				.getLinkConstraints().canExistAttributeIsFK_4007(
						getOldSource(), getNewTarget());
	}

	/**
	 * @generated
	 */
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor,
			IAdaptable info) throws ExecutionException {
		if (!canExecute()) {
			throw new ExecutionException(
					"Invalid arguments in reorient link command"); //$NON-NLS-1$
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return reorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return reorientTarget();
		}
		throw new IllegalStateException();
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientSource() throws ExecutionException {
		getOldSource().setIsFK(null);
		getNewSource().setIsFK(getOldTarget());
		return CommandResult.newOKCommandResult(referenceOwner);
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientTarget() throws ExecutionException {
		getOldSource().setIsFK(getNewTarget());
		return CommandResult.newOKCommandResult(referenceOwner);
	}

	/**
	 * @generated
	 */
	protected gmf_relational_model.gmf_relational_model.Attribute getOldSource() {
		return (gmf_relational_model.gmf_relational_model.Attribute) referenceOwner;
	}

	/**
	 * @generated
	 */
	protected gmf_relational_model.gmf_relational_model.Attribute getNewSource() {
		return (gmf_relational_model.gmf_relational_model.Attribute) newEnd;
	}

	/**
	 * @generated
	 */
	protected gmf_relational_model.gmf_relational_model.LinkFK getOldTarget() {
		return (gmf_relational_model.gmf_relational_model.LinkFK) oldEnd;
	}

	/**
	 * @generated
	 */
	protected gmf_relational_model.gmf_relational_model.LinkFK getNewTarget() {
		return (gmf_relational_model.gmf_relational_model.LinkFK) newEnd;
	}
}
