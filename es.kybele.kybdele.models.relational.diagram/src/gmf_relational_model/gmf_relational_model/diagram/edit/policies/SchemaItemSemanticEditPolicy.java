package gmf_relational_model.gmf_relational_model.diagram.edit.policies;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.commands.core.commands.DuplicateEObjectsCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest;

/**
 * @generated
 */
public class SchemaItemSemanticEditPolicy
		extends
		gmf_relational_model.gmf_relational_model.diagram.edit.policies.RelationalModelBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public SchemaItemSemanticEditPolicy() {
		super(
				gmf_relational_model.gmf_relational_model.diagram.providers.RelationalModelElementTypes.Schema_1000);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (gmf_relational_model.gmf_relational_model.diagram.providers.RelationalModelElementTypes.Relation_2001 == req
				.getElementType()) {
			return getGEFWrapper(new gmf_relational_model.gmf_relational_model.diagram.edit.commands.RelationCreateCommand(
					req));
		}
		if (gmf_relational_model.gmf_relational_model.diagram.providers.RelationalModelElementTypes.LinkFK_2002 == req
				.getElementType()) {
			return getGEFWrapper(new gmf_relational_model.gmf_relational_model.diagram.edit.commands.LinkFKCreateCommand(
					req));
		}
		return super.getCreateCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getDuplicateCommand(DuplicateElementsRequest req) {
		TransactionalEditingDomain editingDomain = ((IGraphicalEditPart) getHost())
				.getEditingDomain();
		return getGEFWrapper(new DuplicateAnythingCommand(editingDomain, req));
	}

	/**
	 * @generated
	 */
	private static class DuplicateAnythingCommand extends
			DuplicateEObjectsCommand {

		/**
		 * @generated
		 */
		public DuplicateAnythingCommand(
				TransactionalEditingDomain editingDomain,
				DuplicateElementsRequest req) {
			super(editingDomain, req.getLabel(), req
					.getElementsToBeDuplicated(), req
					.getAllDuplicatedElementsMap());
		}

	}

}
