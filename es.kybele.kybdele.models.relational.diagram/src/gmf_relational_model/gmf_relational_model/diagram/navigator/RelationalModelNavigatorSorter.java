package gmf_relational_model.gmf_relational_model.diagram.navigator;

import org.eclipse.jface.viewers.ViewerSorter;

/**
 * @generated
 */
public class RelationalModelNavigatorSorter extends ViewerSorter {

	/**
	 * @generated
	 */
	private static final int GROUP_CATEGORY = 7003;

	/**
	 * @generated
	 */
	public int category(Object element) {
		if (element instanceof gmf_relational_model.gmf_relational_model.diagram.navigator.RelationalModelNavigatorItem) {
			gmf_relational_model.gmf_relational_model.diagram.navigator.RelationalModelNavigatorItem item = (gmf_relational_model.gmf_relational_model.diagram.navigator.RelationalModelNavigatorItem) element;
			return gmf_relational_model.gmf_relational_model.diagram.part.RelationalModelVisualIDRegistry
					.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
