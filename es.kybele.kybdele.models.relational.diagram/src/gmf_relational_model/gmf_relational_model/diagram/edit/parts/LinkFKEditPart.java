package gmf_relational_model.gmf_relational_model.diagram.edit.parts;

import gmf_relational_model.gmf_relational_model.diagram.edit.parts.custom.DefaultSizeNodeFigureWithFixedAnchors;

import java.util.HashMap;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.MarginBorder;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.draw2d.ToolbarLayout;
import org.eclipse.draw2d.geometry.PrecisionPoint;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.ConstrainedToolbarLayoutEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.graphics.Color;

/**
 * @generated
 */
public class LinkFKEditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 2002;

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
	public LinkFKEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(
				EditPolicyRoles.SEMANTIC_ROLE,
				new gmf_relational_model.gmf_relational_model.diagram.edit.policies.LinkFKItemSemanticEditPolicy());
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
		return primaryShape = new LinkFKFigure();
	}

	/**
	 * @generated
	 */
	public LinkFKFigure getPrimaryShape() {
		return (LinkFKFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof gmf_relational_model.gmf_relational_model.diagram.edit.parts.WrappingLabel5EditPart) {
			((gmf_relational_model.gmf_relational_model.diagram.edit.parts.WrappingLabel5EditPart) childEditPart)
					.setLabel(getPrimaryShape().getFigureDeletePLabelEdit());
			return true;
		}
		if (childEditPart instanceof gmf_relational_model.gmf_relational_model.diagram.edit.parts.WrappingLabel6EditPart) {
			((gmf_relational_model.gmf_relational_model.diagram.edit.parts.WrappingLabel6EditPart) childEditPart)
					.setLabel(getPrimaryShape().getFigureModifyPLabelEdit());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof gmf_relational_model.gmf_relational_model.diagram.edit.parts.WrappingLabel5EditPart) {
			return true;
		}
		if (childEditPart instanceof gmf_relational_model.gmf_relational_model.diagram.edit.parts.WrappingLabel6EditPart) {
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
		return getContentPane();
	}

	/**
	 * @generated
	 * 
	 * TODO JLS
	 * 
	 *  
	 * Establecemos para Link fk dos puntos de conexion, norte y sur.
	 */
	protected NodeFigure createNodePlate() {
		HashMap<String, PrecisionPoint> anchorLocations = new HashMap<String, PrecisionPoint>();
		// The anchor's location is a little bit on the left in order to be sure
		// that the edges will be horizontally oriented
		anchorLocations.put("NORTH", new PrecisionPoint(0.5d, 0));
		anchorLocations.put("SOUTH", new PrecisionPoint(0.5d, 1d));
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
				.getType(gmf_relational_model.gmf_relational_model.diagram.edit.parts.WrappingLabel5EditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public class LinkFKFigure extends RectangleFigure {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureModifyPLabelText;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureDeletePLabelText;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureDeletePLabelEdit;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureModifyPLabelEdit;

		/**
		 * @generated
		 */
		public LinkFKFigure() {

			ToolbarLayout layoutThis = new ToolbarLayout();
			layoutThis.setStretchMinorAxis(false);
			layoutThis.setMinorAlignment(ToolbarLayout.ALIGN_TOPLEFT);

			layoutThis.setSpacing(5);
			layoutThis.setVertical(true);

			this.setLayoutManager(layoutThis);

			this.setBorder(new MarginBorder(getMapMode().DPtoLP(5),
					getMapMode().DPtoLP(5), getMapMode().DPtoLP(5),
					getMapMode().DPtoLP(5)));
			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			RectangleFigure deletePRectangle0 = new RectangleFigure();

			deletePRectangle0.setOutline(false);

			this.add(deletePRectangle0);

			ToolbarLayout layoutDeletePRectangle0 = new ToolbarLayout();
			layoutDeletePRectangle0.setStretchMinorAxis(false);
			layoutDeletePRectangle0
					.setMinorAlignment(ToolbarLayout.ALIGN_TOPLEFT);

			layoutDeletePRectangle0.setSpacing(5);
			layoutDeletePRectangle0.setVertical(false);

			deletePRectangle0.setLayoutManager(layoutDeletePRectangle0);

			fFigureDeletePLabelText = new WrappingLabel();

			fFigureDeletePLabelText.setText("D:");
			fFigureDeletePLabelText.setForegroundColor(ColorConstants.black);

			deletePRectangle0.add(fFigureDeletePLabelText);

			fFigureDeletePLabelEdit = new WrappingLabel();

			fFigureDeletePLabelEdit.setText("D:");
			fFigureDeletePLabelEdit.setForegroundColor(ColorConstants.black);

			deletePRectangle0.add(fFigureDeletePLabelEdit);

			RectangleFigure modifyPRectangle0 = new RectangleFigure();

			modifyPRectangle0.setOutline(false);

			this.add(modifyPRectangle0);

			ToolbarLayout layoutModifyPRectangle0 = new ToolbarLayout();
			layoutModifyPRectangle0.setStretchMinorAxis(false);
			layoutModifyPRectangle0
					.setMinorAlignment(ToolbarLayout.ALIGN_TOPLEFT);

			layoutModifyPRectangle0.setSpacing(5);
			layoutModifyPRectangle0.setVertical(false);

			modifyPRectangle0.setLayoutManager(layoutModifyPRectangle0);

			fFigureModifyPLabelText = new WrappingLabel();

			fFigureModifyPLabelText.setText("U:");
			fFigureModifyPLabelText.setForegroundColor(ColorConstants.black);

			modifyPRectangle0.add(fFigureModifyPLabelText);

			fFigureModifyPLabelEdit = new WrappingLabel();

			fFigureModifyPLabelEdit.setText("M:");
			fFigureModifyPLabelEdit.setForegroundColor(ColorConstants.black);

			modifyPRectangle0.add(fFigureModifyPLabelEdit);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureModifyPLabelText() {
			return fFigureModifyPLabelText;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureDeletePLabelText() {
			return fFigureDeletePLabelText;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureDeletePLabelEdit() {
			return fFigureDeletePLabelEdit;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureModifyPLabelEdit() {
			return fFigureModifyPLabelEdit;
		}

	}

}
