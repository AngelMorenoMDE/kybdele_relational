package gmf_relational_model.gmf_relational_model.diagram.providers;

/**
 * @generated
 */
public class ElementInitializers {

	protected ElementInitializers() {
		// use #getInstance to access cached instance
	}

	/**
	 * @generated
	 */
	public static ElementInitializers getInstance() {
		ElementInitializers cached = gmf_relational_model.gmf_relational_model.diagram.part.RelationalModelDiagramEditorPlugin
				.getInstance().getElementInitializers();
		if (cached == null) {
			gmf_relational_model.gmf_relational_model.diagram.part.RelationalModelDiagramEditorPlugin
					.getInstance().setElementInitializers(
							cached = new ElementInitializers());
		}
		return cached;
	}
}
