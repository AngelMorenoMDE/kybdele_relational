package gmf_relational_model.gmf_relational_model.diagram.preferences;

import org.eclipse.gmf.runtime.diagram.ui.preferences.ConnectionsPreferencePage;
import org.eclipse.gmf.runtime.diagram.ui.preferences.IPreferenceConstants;
import org.eclipse.gmf.runtime.notation.Routing;
import org.eclipse.jface.preference.IPreferenceStore;

/**
 * @generated
 */
public class DiagramConnectionsPreferencePage extends ConnectionsPreferencePage {

	/**
	 * @generated
	 */
	public DiagramConnectionsPreferencePage() {
		setPreferenceStore(gmf_relational_model.gmf_relational_model.diagram.part.RelationalModelDiagramEditorPlugin
				.getInstance().getPreferenceStore());
	}

	/**
	 * @generated
	 * TODO JLS
	 * 
	 * con este metodo lo que hacemos es que las lineas formen angulos rectos
	 */
	public static void initDefaults(IPreferenceStore preferenceStore) {
		preferenceStore.setDefault(IPreferenceConstants.PREF_LINE_STYLE,
				Routing.RECTILINEAR);

		preferenceStore.setDefault(
				IPreferenceConstants.PREF_PROMPT_ON_DEL_FROM_DIAGRAM, true);

		preferenceStore.setDefault(
				IPreferenceConstants.PREF_PROMPT_ON_DEL_FROM_MODEL, true);

		preferenceStore
				.setDefault(IPreferenceConstants.PREF_SNAP_TO_GRID, true);

		preferenceStore.setDefault(
				IPreferenceConstants.PREF_ENABLE_ANIMATED_ZOOM, true);
	}
}
