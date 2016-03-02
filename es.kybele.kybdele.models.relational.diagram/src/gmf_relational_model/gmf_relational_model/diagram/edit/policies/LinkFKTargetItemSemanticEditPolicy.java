package gmf_relational_model.gmf_relational_model.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyReferenceCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;

/**
 * @generated
 */
public class LinkFKTargetItemSemanticEditPolicy
		extends
		gmf_relational_model.gmf_relational_model.diagram.edit.policies.RelationalModelBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public LinkFKTargetItemSemanticEditPolicy() {
		super(
				gmf_relational_model.gmf_relational_model.diagram.providers.RelationalModelElementTypes.LinkFKTarget_4004);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyReferenceCommand(DestroyReferenceRequest req) {
		return getGEFWrapper(new DestroyReferenceCommand(req));
	}

}
