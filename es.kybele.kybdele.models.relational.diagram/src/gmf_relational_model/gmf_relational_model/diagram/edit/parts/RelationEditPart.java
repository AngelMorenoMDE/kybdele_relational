package gmf_relational_model.gmf_relational_model.diagram.edit.parts;

import gmf_relational_model.gmf_relational_model.diagram.edit.parts.custom.DefaultSizeNodeFigureWithFixedAnchors;

import java.util.HashMap;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.FlowLayout;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.MarginBorder;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.draw2d.ToolbarLayout;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.PrecisionPoint;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gmf.runtime.diagram.core.edithelpers.CreateElementRequestAdapter;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.ConstrainedToolbarLayoutEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewAndElementRequest;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.edit.policies.reparent.CreationEditPolicyWithCustomReparent;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.widgets.Display;

/**
 * @generated
 */
public class RelationEditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 2001;

	/**
	 * @generated
	 */
	protected IFigure contentPane;

	/**
	 * @generated
	 */
	protected IFigure primaryShape;

	/**
	 * @generated
	 */
	public RelationEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		installEditPolicy(
				EditPolicyRoles.CREATION_ROLE,
				new CreationEditPolicyWithCustomReparent(
						gmf_relational_model.gmf_relational_model.diagram.part.RelationalModelVisualIDRegistry.TYPED_INSTANCE));
		super.createDefaultEditPolicies();
		installEditPolicy(
				EditPolicyRoles.SEMANTIC_ROLE,
				new gmf_relational_model.gmf_relational_model.diagram.edit.policies.RelationItemSemanticEditPolicy());
		installEditPolicy(EditPolicy.LAYOUT_ROLE, createLayoutEditPolicy());
		// XXX need an SCR to runtime to have another abstract superclass that would let children add reasonable editpolicies
		// removeEditPolicy(org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles.CONNECTION_HANDLES_ROLE);
	}

	/**
	 * @generated
	 */
	protected LayoutEditPolicy createLayoutEditPolicy() {

		ConstrainedToolbarLayoutEditPolicy lep = new ConstrainedToolbarLayoutEditPolicy() {

			protected EditPolicy createChildEditPolicy(EditPart child) {
				if (child.getEditPolicy(EditPolicy.PRIMARY_DRAG_ROLE) == null) {
					if (child instanceof ITextAwareEditPart) {
						return new gmf_relational_model.gmf_relational_model.diagram.edit.policies.RelationalModelTextSelectionEditPolicy();
					}
				}
				return super.createChildEditPolicy(child);
			}
		};
		return lep;
	}

	/**
	 * @generated
	 */
	protected IFigure createNodeShape() {
		return primaryShape = new RelationFigure();
	}

	/**
	 * @generated
	 */
	public RelationFigure getPrimaryShape() {
		return (RelationFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof gmf_relational_model.gmf_relational_model.diagram.edit.parts.RelationNameEditPart) {
			((gmf_relational_model.gmf_relational_model.diagram.edit.parts.RelationNameEditPart) childEditPart)
					.setLabel(getPrimaryShape().getFigureRelationNameFigure());
			return true;
		}
		if (childEditPart instanceof gmf_relational_model.gmf_relational_model.diagram.edit.parts.RelationCompartmentAttributesEditPart) {
			IFigure pane = getPrimaryShape().getFigureContainer();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(((gmf_relational_model.gmf_relational_model.diagram.edit.parts.RelationCompartmentAttributesEditPart) childEditPart)
					.getFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof gmf_relational_model.gmf_relational_model.diagram.edit.parts.RelationNameEditPart) {
			return true;
		}
		if (childEditPart instanceof gmf_relational_model.gmf_relational_model.diagram.edit.parts.RelationCompartmentAttributesEditPart) {
			IFigure pane = getPrimaryShape().getFigureContainer();
			pane.remove(((gmf_relational_model.gmf_relational_model.diagram.edit.parts.RelationCompartmentAttributesEditPart) childEditPart)
					.getFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected void addChildVisual(EditPart childEditPart, int index) {
		if (addFixedChild(childEditPart)) {
			return;
		}
		super.addChildVisual(childEditPart, -1);
	}

	/**
	 * @generated
	 */
	protected void removeChildVisual(EditPart childEditPart) {
		if (removeFixedChild(childEditPart)) {
			return;
		}
		super.removeChildVisual(childEditPart);
	}

	/**
	 * @generated
	 */
	protected IFigure getContentPaneFor(IGraphicalEditPart editPart) {
		if (editPart instanceof gmf_relational_model.gmf_relational_model.diagram.edit.parts.RelationCompartmentAttributesEditPart) {
			return getPrimaryShape().getFigureContainer();
		}
		return getContentPane();
	}

	/**
	 * @generated
	 * 
	 * TODO JLS
	 * 
	 *  
	 * CONECTA EN EL MISMO PUNTO
	 */
	protected NodeFigure createNodePlate() {
		HashMap<String, PrecisionPoint> anchorLocations = new HashMap<String, PrecisionPoint>();
		// The anchor's location is a little bit on the left in order to be sure
		// that the edges will be horizontally oriented
		anchorLocations.put("WEST", new PrecisionPoint(0, 0.5d));
		anchorLocations.put("EAST", new PrecisionPoint(1d, 0.5d));
		DefaultSizeNodeFigureWithFixedAnchors result = new DefaultSizeNodeFigureWithFixedAnchors(
				40, 40, anchorLocations);
		return result;
	}

	/**
	 * Creates figure for this edit part.
	 * 
	 * Body of this method does not depend on settings in generation model
	 * so you may safely remove <i>generated</i> tag and modify it.
	 * 
	 * @generated
	 */
	protected NodeFigure createNodeFigure() {
		NodeFigure figure = createNodePlate();
		figure.setLayoutManager(new StackLayout());
		IFigure shape = createNodeShape();
		figure.add(shape);
		contentPane = setupContentPane(shape);
		return figure;
	}

	/**
	 * Default implementation treats passed figure as content pane.
	 * Respects layout one may have set for generated figure.
	 * @param nodeShape instance of generated figure class
	 * @generated
	 */
	protected IFigure setupContentPane(IFigure nodeShape) {
		if (nodeShape.getLayoutManager() == null) {
			ConstrainedToolbarLayout layout = new ConstrainedToolbarLayout();
			layout.setSpacing(5);
			nodeShape.setLayoutManager(layout);
		}
		return nodeShape; // use nodeShape itself as contentPane
	}

	/**
	 * @generated
	 */
	public IFigure getContentPane() {
		if (contentPane != null) {
			return contentPane;
		}
		return super.getContentPane();
	}

	/**
	 * @generated
	 */
	protected void setForegroundColor(Color color) {
		if (primaryShape != null) {
			primaryShape.setForegroundColor(color);
		}
	}

	/**
	 * @generated
	 */
	protected void setBackgroundColor(Color color) {
		if (primaryShape != null) {
			primaryShape.setBackgroundColor(color);
		}
	}

	/**
	 * @generated
	 */
	protected void setLineWidth(int width) {
		if (primaryShape instanceof Shape) {
			((Shape) primaryShape).setLineWidth(width);
		}
	}

	/**
	 * @generated
	 */
	protected void setLineType(int style) {
		if (primaryShape instanceof Shape) {
			((Shape) primaryShape).setLineStyle(style);
		}
	}

	/**
	 * @generated
	 */
	public EditPart getPrimaryChildEditPart() {
		return getChildBySemanticHint(gmf_relational_model.gmf_relational_model.diagram.part.RelationalModelVisualIDRegistry
				.getType(gmf_relational_model.gmf_relational_model.diagram.edit.parts.RelationNameEditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public EditPart getTargetEditPart(Request request) {
		if (request instanceof CreateViewAndElementRequest) {
			CreateElementRequestAdapter adapter = ((CreateViewAndElementRequest) request)
					.getViewAndElementDescriptor()
					.getCreateElementRequestAdapter();
			IElementType type = (IElementType) adapter
					.getAdapter(IElementType.class);
			if (type == gmf_relational_model.gmf_relational_model.diagram.providers.RelationalModelElementTypes.Attribute_3001) {
				return getChildBySemanticHint(gmf_relational_model.gmf_relational_model.diagram.part.RelationalModelVisualIDRegistry
						.getType(gmf_relational_model.gmf_relational_model.diagram.edit.parts.RelationCompartmentAttributesEditPart.VISUAL_ID));
			}
		}
		return super.getTargetEditPart(request);
	}

	/**
	 * @generated
	 */
	public class RelationFigure extends RectangleFigure {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureRelationNameFigure;
		/**
		 * @generated
		 */
		private RectangleFigure fFigureContainer;

		/**
		 * @generated
		 */
		public RelationFigure() {

			ToolbarLayout layoutThis = new ToolbarLayout();
			layoutThis.setStretchMinorAxis(false);
			layoutThis.setMinorAlignment(ToolbarLayout.ALIGN_CENTER);

			layoutThis.setSpacing(5);
			layoutThis.setVertical(false);

			this.setLayoutManager(layoutThis);

			this.setOutline(false);
			this.setBackgroundColor(ColorConstants.white);

			this.setFont(THIS_FONT);

			this.setMaximumSize(new Dimension(getMapMode().DPtoLP(0),
					getMapMode().DPtoLP(60)));
			this.setMinimumSize(new Dimension(getMapMode().DPtoLP(100),
					getMapMode().DPtoLP(10)));
			this.setBorder(new MarginBorder(getMapMode().DPtoLP(0),
					getMapMode().DPtoLP(10), getMapMode().DPtoLP(0),
					getMapMode().DPtoLP(5)));
			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureRelationNameFigure = new WrappingLabel();

			fFigureRelationNameFigure.setText("Rel");
			fFigureRelationNameFigure.setForegroundColor(ColorConstants.black);

			this.add(fFigureRelationNameFigure);

			WrappingLabel relationAttributeContainerStartLabel0 = new WrappingLabel();

			relationAttributeContainerStartLabel0.setText("(");
			relationAttributeContainerStartLabel0
					.setForegroundColor(ColorConstants.black);

			this.add(relationAttributeContainerStartLabel0);

			FlowLayout layoutRelationAttributeContainerStartLabel0 = new FlowLayout();
			layoutRelationAttributeContainerStartLabel0
					.setStretchMinorAxis(false);
			layoutRelationAttributeContainerStartLabel0
					.setMinorAlignment(FlowLayout.ALIGN_LEFTTOP);

			layoutRelationAttributeContainerStartLabel0
					.setMajorAlignment(FlowLayout.ALIGN_LEFTTOP);
			layoutRelationAttributeContainerStartLabel0.setMajorSpacing(5);
			layoutRelationAttributeContainerStartLabel0.setMinorSpacing(5);
			layoutRelationAttributeContainerStartLabel0.setHorizontal(true);

			relationAttributeContainerStartLabel0
					.setLayoutManager(layoutRelationAttributeContainerStartLabel0);

			fFigureContainer = new RectangleFigure();

			fFigureContainer.setOutline(false);
			fFigureContainer.setLineWidth(0);
			fFigureContainer.setBackgroundColor(ColorConstants.white);

			this.add(fFigureContainer);

			ToolbarLayout layoutFFigureContainer = new ToolbarLayout();
			layoutFFigureContainer.setStretchMinorAxis(false);
			layoutFFigureContainer
					.setMinorAlignment(ToolbarLayout.ALIGN_TOPLEFT);

			layoutFFigureContainer.setSpacing(5);
			layoutFFigureContainer.setVertical(false);

			fFigureContainer.setLayoutManager(layoutFFigureContainer);

			// Process FigureRef details

			this.add(fFigureContainer);

			WrappingLabel relationAttributeContainerEndLabel0 = new WrappingLabel();

			relationAttributeContainerEndLabel0.setText(")");
			relationAttributeContainerEndLabel0
					.setForegroundColor(ColorConstants.black);

			this.add(relationAttributeContainerEndLabel0);

			FlowLayout layoutRelationAttributeContainerEndLabel0 = new FlowLayout();
			layoutRelationAttributeContainerEndLabel0
					.setStretchMinorAxis(false);
			layoutRelationAttributeContainerEndLabel0
					.setMinorAlignment(FlowLayout.ALIGN_RIGHTBOTTOM);

			layoutRelationAttributeContainerEndLabel0
					.setMajorAlignment(FlowLayout.ALIGN_RIGHTBOTTOM);
			layoutRelationAttributeContainerEndLabel0.setMajorSpacing(5);
			layoutRelationAttributeContainerEndLabel0.setMinorSpacing(5);
			layoutRelationAttributeContainerEndLabel0.setHorizontal(true);

			relationAttributeContainerEndLabel0
					.setLayoutManager(layoutRelationAttributeContainerEndLabel0);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureRelationNameFigure() {
			return fFigureRelationNameFigure;
		}

		/**
		 * @generated
		 */
		public RectangleFigure getFigureContainer() {
			return fFigureContainer;
		}

	}

	/**
	 * @generated
	 */
	static final Font THIS_FONT = new Font(Display.getCurrent(), "verdana", 13,
			SWT.NORMAL);

}
