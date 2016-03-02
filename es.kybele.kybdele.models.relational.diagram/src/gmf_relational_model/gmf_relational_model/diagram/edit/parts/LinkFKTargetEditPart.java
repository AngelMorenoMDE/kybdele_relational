package gmf_relational_model.gmf_relational_model.diagram.edit.parts;

import org.eclipse.draw2d.ArrowLocator;
import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Connection;
import org.eclipse.draw2d.ConnectionLocator;
import org.eclipse.draw2d.PolygonDecoration;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITreeBranchEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class LinkFKTargetEditPart extends ConnectionNodeEditPart implements
		ITreeBranchEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 4004;

	/**
	 * @generated
	 */
	public LinkFKTargetEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(
				EditPolicyRoles.SEMANTIC_ROLE,
				new gmf_relational_model.gmf_relational_model.diagram.edit.policies.LinkFKTargetItemSemanticEditPolicy());
	}

	/**
	 * Creates figure for this edit part.
	 * 
	 * Body of this method does not depend on settings in generation model
	 * so you may safely remove <i>generated</i> tag and modify it.
	 * 
	 * @generated
	 */

	protected Connection createConnectionFigure() {
		return new AttributeFKAttributeFigure();
	}

	/**
	 * @generated
	 */
	public AttributeFKAttributeFigure getPrimaryShape() {
		return (AttributeFKAttributeFigure) getFigure();
	}

	/**
	 * @generated
	 */
	public class AttributeFKAttributeFigure extends PolylineConnectionEx {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureDeletePLabelText;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureModifyPLabelText;

		/**
		 * @generated
		 */
		public AttributeFKAttributeFigure() {
			this.setForegroundColor(ColorConstants.black);

			createContents();
		}

		/**
		 * @generated 
		 * 
		 * TODO JLS
		 * 
		 * Añadimos la flecha al final del link, en target 
		 */
		private void createContents() {

			PolygonDecoration xxx0 = new PolygonDecoration();

			xxx0.setFill(true);
			xxx0.setOutline(false);
			xxx0.setLineWidth(3);
			xxx0.setForegroundColor(ColorConstants.black);

			this.add(xxx0, new ArrowLocator(this, ConnectionLocator.TARGET));

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
		public WrappingLabel getFigureModifyPLabelText() {
			return fFigureModifyPLabelText;
		}

	}

}
