package gmf_relational_model.gmf_relational_model.diagram.part;

import gmf_relational_model.gmf_relational_model.diagram.part.customtools.AttributeIsNNTool;
import gmf_relational_model.gmf_relational_model.diagram.part.customtools.AttributeIsPKTool;
import gmf_relational_model.gmf_relational_model.diagram.part.customtools.AttributeIsUNTool;

import java.util.Collections;

import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteDrawer;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.tooling.runtime.part.DefaultLinkToolEntry;
import org.eclipse.gmf.tooling.runtime.part.DefaultNodeToolEntry;

/**
 * @generated
 */
public class RelationalModelPaletteFactory {

	/**
	 * @generated
	 */
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createCreateTools1Group());
		paletteRoot.add(createPropertiesTools2Group());
	}

	/**
	 * Creates "Create Tools" palette tool group
	 * @generated
	 */
	private PaletteContainer createCreateTools1Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				gmf_relational_model.gmf_relational_model.diagram.part.Messages.CreateTools1Group_title);
		paletteContainer.setId("createCreateTools1Group"); //$NON-NLS-1$
		paletteContainer
				.setDescription(gmf_relational_model.gmf_relational_model.diagram.part.Messages.CreateTools1Group_desc);
		paletteContainer.add(createRelation1CreationTool());
		paletteContainer.add(createAttribute2CreationTool());
		paletteContainer.add(createLinkFK3CreationTool());
		return paletteContainer;
	}

	/**
	 * Creates "Properties Tools" palette tool group
	 * @generated
	 * 
	 * TODO JLS: ocultamos la herramienta que linka atributo con relacion
	 */
	private PaletteContainer createPropertiesTools2Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				gmf_relational_model.gmf_relational_model.diagram.part.Messages.PropertiesTools2Group_title);
		paletteContainer.setId("createPropertiesTools2Group"); //$NON-NLS-1$
		paletteContainer
				.setDescription(gmf_relational_model.gmf_relational_model.diagram.part.Messages.PropertiesTools2Group_desc);
		//paletteContainer.add(createAttributeReferencePK1CreationTool());
		paletteContainer.add(createAttributeIsPK2CreationTool());
		paletteContainer.add(createAttributeIsFK3CreationTool());
		paletteContainer.add(createReferredRelation4CreationTool());
		paletteContainer.add(createAttributeIsUN5CreationTool());
		paletteContainer.add(createAttributeIsNN6CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createRelation1CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				gmf_relational_model.gmf_relational_model.diagram.part.Messages.Relation1CreationTool_title,
				gmf_relational_model.gmf_relational_model.diagram.part.Messages.Relation1CreationTool_desc,
				Collections
						.singletonList(gmf_relational_model.gmf_relational_model.diagram.providers.RelationalModelElementTypes.Relation_2001));
		entry.setId("createRelation1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(gmf_relational_model.gmf_relational_model.diagram.part.RelationalModelDiagramEditorPlugin
				.findImageDescriptor("/gmf_relational_model.edit/icons/full/obj16/iconRelation.gif")); //$NON-NLS-1$
		entry.setLargeIcon(gmf_relational_model.gmf_relational_model.diagram.part.RelationalModelDiagramEditorPlugin
				.findImageDescriptor("/gmf_relational_model.edit/icons/full/obj32/iconRelation.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createAttribute2CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				gmf_relational_model.gmf_relational_model.diagram.part.Messages.Attribute2CreationTool_title,
				gmf_relational_model.gmf_relational_model.diagram.part.Messages.Attribute2CreationTool_desc,
				Collections
						.singletonList(gmf_relational_model.gmf_relational_model.diagram.providers.RelationalModelElementTypes.Attribute_3001));
		entry.setId("createAttribute2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(gmf_relational_model.gmf_relational_model.diagram.part.RelationalModelDiagramEditorPlugin
				.findImageDescriptor("/gmf_relational_model.edit/icons/full/obj16/iconAttribute.gif")); //$NON-NLS-1$
		entry.setLargeIcon(gmf_relational_model.gmf_relational_model.diagram.part.RelationalModelDiagramEditorPlugin
				.findImageDescriptor("/gmf_relational_model.edit/icons/full/obj32/iconAttribute.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createLinkFK3CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				gmf_relational_model.gmf_relational_model.diagram.part.Messages.LinkFK3CreationTool_title,
				gmf_relational_model.gmf_relational_model.diagram.part.Messages.LinkFK3CreationTool_desc,
				Collections
						.singletonList(gmf_relational_model.gmf_relational_model.diagram.providers.RelationalModelElementTypes.LinkFK_2002));
		entry.setId("createLinkFK3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(gmf_relational_model.gmf_relational_model.diagram.part.RelationalModelDiagramEditorPlugin
				.findImageDescriptor("/gmf_relational_model.edit/icons/full/obj16/iconLinkFK.gif")); //$NON-NLS-1$
		entry.setLargeIcon(gmf_relational_model.gmf_relational_model.diagram.part.RelationalModelDiagramEditorPlugin
				.findImageDescriptor("/gmf_relational_model.edit/icons/full/obj32/iconLinkFK.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createAttributeReferencePK1CreationTool() {
		ToolEntry entry = new ToolEntry(
				gmf_relational_model.gmf_relational_model.diagram.part.Messages.AttributeReferencePK1CreationTool_title,
				gmf_relational_model.gmf_relational_model.diagram.part.Messages.AttributeReferencePK1CreationTool_desc,
				null, null) {
		};
		entry.setId("createAttributeReferencePK1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(gmf_relational_model.gmf_relational_model.diagram.part.RelationalModelDiagramEditorPlugin
				.findImageDescriptor("/gmf_relational_model.edit/icons/full/obj16/iconPK.gif")); //$NON-NLS-1$
		entry.setLargeIcon(gmf_relational_model.gmf_relational_model.diagram.part.RelationalModelDiagramEditorPlugin
				.findImageDescriptor("/gmf_relational_model.edit/icons/full/obj32/iconPK.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createAttributeIsPK2CreationTool() {
		ToolEntry entry = new ToolEntry(
				gmf_relational_model.gmf_relational_model.diagram.part.Messages.AttributeIsPK2CreationTool_title,
				gmf_relational_model.gmf_relational_model.diagram.part.Messages.AttributeIsPK2CreationTool_desc,
				null, null) {
		};
		entry.setId("createAttributeIsPK2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(gmf_relational_model.gmf_relational_model.diagram.part.RelationalModelDiagramEditorPlugin
				.findImageDescriptor("/gmf_relational_model.edit/icons/full/obj16/iconPK.gif")); //$NON-NLS-1$
		entry.setLargeIcon(gmf_relational_model.gmf_relational_model.diagram.part.RelationalModelDiagramEditorPlugin
				.findImageDescriptor("/gmf_relational_model.edit/icons/full/obj32/iconPK.gif")); //$NON-NLS-1$
		entry.setToolClass(AttributeIsPKTool.class);
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createAttributeIsFK3CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				gmf_relational_model.gmf_relational_model.diagram.part.Messages.AttributeIsFK3CreationTool_title,
				gmf_relational_model.gmf_relational_model.diagram.part.Messages.AttributeIsFK3CreationTool_desc,
				Collections
						.singletonList(gmf_relational_model.gmf_relational_model.diagram.providers.RelationalModelElementTypes.AttributeIsFK_4007));
		entry.setId("createAttributeIsFK3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(gmf_relational_model.gmf_relational_model.diagram.part.RelationalModelDiagramEditorPlugin
				.findImageDescriptor("/gmf_relational_model.edit/icons/full/obj16/iconFK.gif")); //$NON-NLS-1$
		entry.setLargeIcon(gmf_relational_model.gmf_relational_model.diagram.part.RelationalModelDiagramEditorPlugin
				.findImageDescriptor("/gmf_relational_model.edit/icons/full/obj32/iconFK.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createReferredRelation4CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				gmf_relational_model.gmf_relational_model.diagram.part.Messages.ReferredRelation4CreationTool_title,
				gmf_relational_model.gmf_relational_model.diagram.part.Messages.ReferredRelation4CreationTool_desc,
				Collections
						.singletonList(gmf_relational_model.gmf_relational_model.diagram.providers.RelationalModelElementTypes.LinkFKTarget_4004));
		entry.setId("createReferredRelation4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(gmf_relational_model.gmf_relational_model.diagram.part.RelationalModelDiagramEditorPlugin
				.findImageDescriptor("/gmf_relational_model.edit/icons/full/obj16/iconCK.gif")); //$NON-NLS-1$
		entry.setLargeIcon(gmf_relational_model.gmf_relational_model.diagram.part.RelationalModelDiagramEditorPlugin
				.findImageDescriptor("/gmf_relational_model.edit/icons/full/obj32/iconCK.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createAttributeIsUN5CreationTool() {
		ToolEntry entry = new ToolEntry(
				gmf_relational_model.gmf_relational_model.diagram.part.Messages.AttributeIsUN5CreationTool_title,
				gmf_relational_model.gmf_relational_model.diagram.part.Messages.AttributeIsUN5CreationTool_desc,
				null, null) {
		};
		entry.setId("createAttributeIsUN5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(gmf_relational_model.gmf_relational_model.diagram.part.RelationalModelDiagramEditorPlugin
				.findImageDescriptor("/gmf_relational_model.edit/icons/full/obj16/iconUN.gif")); //$NON-NLS-1$
		entry.setLargeIcon(gmf_relational_model.gmf_relational_model.diagram.part.RelationalModelDiagramEditorPlugin
				.findImageDescriptor("/gmf_relational_model.edit/icons/full/obj32/iconUN.gif")); //$NON-NLS-1$
		entry.setToolClass(AttributeIsUNTool.class);
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createAttributeIsNN6CreationTool() {
		ToolEntry entry = new ToolEntry(
				gmf_relational_model.gmf_relational_model.diagram.part.Messages.AttributeIsNN6CreationTool_title,
				gmf_relational_model.gmf_relational_model.diagram.part.Messages.AttributeIsNN6CreationTool_desc,
				null, null) {
		};
		entry.setId("createAttributeIsNN6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(gmf_relational_model.gmf_relational_model.diagram.part.RelationalModelDiagramEditorPlugin
				.findImageDescriptor("/gmf_relational_model.edit/icons/full/obj16/iconNN.gif")); //$NON-NLS-1$
		entry.setLargeIcon(gmf_relational_model.gmf_relational_model.diagram.part.RelationalModelDiagramEditorPlugin
				.findImageDescriptor("/gmf_relational_model.edit/icons/full/obj32/iconNN.gif")); //$NON-NLS-1$
		entry.setToolClass(AttributeIsNNTool.class);
		return entry;
	}

}
