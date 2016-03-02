package gmf_relational_model.gmf_relational_model.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class RelationCompartmentAttributesItemSemanticEditPolicy
		extends
		gmf_relational_model.gmf_relational_model.diagram.edit.policies.RelationalModelBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public RelationCompartmentAttributesItemSemanticEditPolicy() {
		super(
				gmf_relational_model.gmf_relational_model.diagram.providers.RelationalModelElementTypes.Relation_2001);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (gmf_relational_model.gmf_relational_model.diagram.providers.RelationalModelElementTypes.Attribute_3001 == req
				.getElementType()) {
			return getGEFWrapper(new gmf_relational_model.gmf_relational_model.diagram.edit.commands.AttributeCreateCommand(
					req));
		}
		return super.getCreateCommand(req);
	}

}
