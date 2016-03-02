package gmf_relational_model.gmf_relational_model.diagram.sheet;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.sheet.DefaultPropertySection;
import org.eclipse.ui.views.properties.IPropertySourceProvider;

/**
 * @generated
 */
public class RelationalModelPropertySection extends DefaultPropertySection
		implements IPropertySourceProvider {

	/**
	 * Modify/unwrap selection.
	 * @generated
	 * 
	 * TODO JLS
	 */
	@Override
	protected Object transformSelection(Object selected) {
		selected = transformSelectionToDomain(selected);
		//get attributeeditpart. return attributeImpl
		return selected;
	}

	/**
	 * Modify/unwrap selection.
	 * @generated
	 * 
	 * TODO JLS
	 */
	@Override
	protected Object transformSelectionToDomain(Object selected) {

		if (selected instanceof EditPart) {
			Object model = ((EditPart) selected).getModel();
			return model instanceof View ? ((View) model).getElement() : null;
		}
		if (selected instanceof View) {
			return ((View) selected).getElement();
		}
		if (selected instanceof IAdaptable) {
			View view = (View) ((IAdaptable) selected).getAdapter(View.class);
			if (view != null) {
				return view.getElement();
			}
		}
		return selected;
	}

}
