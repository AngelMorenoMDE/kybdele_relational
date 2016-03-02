package gmf_relational_model.gmf_relational_model.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

/**
 * @generated
 */
public class RelationalModelModelingAssistantProviderOfSchemaEditPart
		extends
		gmf_relational_model.gmf_relational_model.diagram.providers.RelationalModelModelingAssistantProvider {

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		List<IElementType> types = new ArrayList<IElementType>(2);
		types.add(gmf_relational_model.gmf_relational_model.diagram.providers.RelationalModelElementTypes.Relation_2001);
		types.add(gmf_relational_model.gmf_relational_model.diagram.providers.RelationalModelElementTypes.LinkFK_2002);
		return types;
	}

}
