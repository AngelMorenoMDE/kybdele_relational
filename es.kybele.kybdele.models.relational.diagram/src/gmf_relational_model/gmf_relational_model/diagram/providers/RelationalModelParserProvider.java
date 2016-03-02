package gmf_relational_model.gmf_relational_model.diagram.providers;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.GetParserOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParserProvider;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserService;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.parser.ParserHintAdapter;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.parsers.EnumParser;

/**
 * @generated
 */
public class RelationalModelParserProvider extends AbstractProvider implements
		IParserProvider {

	/**
	 * @generated
	 */
	private IParser relationName_5004Parser;

	/**
	 * @generated
	 */
	private IParser getRelationName_5004Parser() {
		if (relationName_5004Parser == null) {
			EAttribute[] features = new EAttribute[] { gmf_relational_model.gmf_relational_model.Gmf_relational_modelPackage.eINSTANCE
					.getRelation_Name() };
			gmf_relational_model.gmf_relational_model.diagram.parsers.MessageFormatParser parser = new gmf_relational_model.gmf_relational_model.diagram.parsers.MessageFormatParser(
					features);
			relationName_5004Parser = parser;
		}
		return relationName_5004Parser;
	}

	/**
	 * @generated
	 */
	private IParser linkFKDelete_5005Parser;

	/**
	 * @generated
	 */
	private IParser getLinkFKDelete_5005Parser() {
		if (linkFKDelete_5005Parser == null) {
			EAttribute editableFeature = gmf_relational_model.gmf_relational_model.Gmf_relational_modelPackage.eINSTANCE
					.getLinkFK_Delete();
			EnumParser parser = new EnumParser(editableFeature);
			linkFKDelete_5005Parser = parser;
		}
		return linkFKDelete_5005Parser;
	}

	/**
	 * @generated
	 */
	private IParser linkFKModify_5006Parser;

	/**
	 * @generated
	 */
	private IParser getLinkFKModify_5006Parser() {
		if (linkFKModify_5006Parser == null) {
			EAttribute editableFeature = gmf_relational_model.gmf_relational_model.Gmf_relational_modelPackage.eINSTANCE
					.getLinkFK_Modify();
			EnumParser parser = new EnumParser(editableFeature);
			linkFKModify_5006Parser = parser;
		}
		return linkFKModify_5006Parser;
	}

	/**
	 * @generated
	 */
	private IParser attributeName_5001Parser;

	/**
	 * @generated
	 */
	private IParser getAttributeName_5001Parser() {
		if (attributeName_5001Parser == null) {
			EAttribute[] features = new EAttribute[] { gmf_relational_model.gmf_relational_model.Gmf_relational_modelPackage.eINSTANCE
					.getAttribute_Name() };
			gmf_relational_model.gmf_relational_model.diagram.parsers.MessageFormatParser parser = new gmf_relational_model.gmf_relational_model.diagram.parsers.MessageFormatParser(
					features);
			attributeName_5001Parser = parser;
		}
		return attributeName_5001Parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case gmf_relational_model.gmf_relational_model.diagram.edit.parts.RelationNameEditPart.VISUAL_ID:
			return getRelationName_5004Parser();

		case gmf_relational_model.gmf_relational_model.diagram.edit.parts.WrappingLabel5EditPart.VISUAL_ID:
			return getLinkFKDelete_5005Parser();

		case gmf_relational_model.gmf_relational_model.diagram.edit.parts.WrappingLabel6EditPart.VISUAL_ID:
			return getLinkFKModify_5006Parser();
		case gmf_relational_model.gmf_relational_model.diagram.edit.parts.AttributeNameEditPart.VISUAL_ID:
			return getAttributeName_5001Parser();
		}
		return null;
	}

	/**
	 * Utility method that consults ParserService
	 * @generated
	 */
	public static IParser getParser(IElementType type, EObject object,
			String parserHint) {
		return ParserService.getInstance().getParser(
				new HintAdapter(type, object, parserHint));
	}

	/**
	 * @generated
	 */
	public IParser getParser(IAdaptable hint) {
		String vid = (String) hint.getAdapter(String.class);
		if (vid != null) {
			return getParser(gmf_relational_model.gmf_relational_model.diagram.part.RelationalModelVisualIDRegistry
					.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(gmf_relational_model.gmf_relational_model.diagram.part.RelationalModelVisualIDRegistry
					.getVisualID(view));
		}
		return null;
	}

	/**
	 * @generated
	 */
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (gmf_relational_model.gmf_relational_model.diagram.providers.RelationalModelElementTypes
					.getElement(hint) == null) {
				return false;
			}
			return getParser(hint) != null;
		}
		return false;
	}

	/**
	 * @generated
	 */
	private static class HintAdapter extends ParserHintAdapter {

		/**
		 * @generated
		 */
		private final IElementType elementType;

		/**
		 * @generated
		 */
		public HintAdapter(IElementType type, EObject object, String parserHint) {
			super(object, parserHint);
			assert type != null;
			elementType = type;
		}

		/**
		 * @generated
		 */
		public Object getAdapter(Class adapter) {
			if (IElementType.class.equals(adapter)) {
				return elementType;
			}
			return super.getAdapter(adapter);
		}
	}

}
