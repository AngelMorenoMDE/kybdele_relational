package gmf_relational_model.gmf_relational_model.diagram.preferences;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.jface.preference.IPreferenceStore;

/**
 * @generated
 */
public class DiagramPreferenceInitializer extends AbstractPreferenceInitializer {

	/**
	 * @generated
	 */
	public void initializeDefaultPreferences() {
		IPreferenceStore store = getPreferenceStore();
		gmf_relational_model.gmf_relational_model.diagram.preferences.DiagramGeneralPreferencePage
				.initDefaults(store);
		gmf_relational_model.gmf_relational_model.diagram.preferences.DiagramAppearancePreferencePage
				.initDefaults(store);
		gmf_relational_model.gmf_relational_model.diagram.preferences.DiagramConnectionsPreferencePage
				.initDefaults(store);
		gmf_relational_model.gmf_relational_model.diagram.preferences.DiagramPrintingPreferencePage
				.initDefaults(store);
		gmf_relational_model.gmf_relational_model.diagram.preferences.DiagramRulersAndGridPreferencePage
				.initDefaults(store);

	}

	/**
	 * @generated
	 */
	protected IPreferenceStore getPreferenceStore() {
		return gmf_relational_model.gmf_relational_model.diagram.part.RelationalModelDiagramEditorPlugin
				.getInstance().getPreferenceStore();
	}
}
