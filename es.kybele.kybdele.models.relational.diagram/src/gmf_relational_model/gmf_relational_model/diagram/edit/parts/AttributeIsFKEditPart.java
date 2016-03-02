package gmf_relational_model.gmf_relational_model.diagram.edit.parts;

import gmf_relational_model.gmf_relational_model.impl.AttributeImpl;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Connection;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.PolygonDecoration;
import org.eclipse.draw2d.PolylineDecoration;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.PointList;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITreeBranchEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.runtime.notation.impl.NodeImpl;

/**
 * @generated
 */
public class AttributeIsFKEditPart extends ConnectionNodeEditPart implements
		ITreeBranchEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 4007;

	/**
	 * @generated
	 */
	public AttributeIsFKEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(
				EditPolicyRoles.SEMANTIC_ROLE,
				new gmf_relational_model.gmf_relational_model.diagram.edit.policies.AttributeIsFKItemSemanticEditPolicy());
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
		 * al ser la clave ajena no necesitamos flecha,se suprime
		 * añadimos una linea para determinar horizontal sobre el attributo
		 * la posicion se determina en figureMoved en esta misma clase
		 * 
		 */
		private void createContents() {

			//PolygonDecoration xxx0 = new PolygonDecoration();

			//			xxx0.setFill(true);
			//			xxx0.setOutline(false);
			//			xxx0.setLineWidth(3);
			//			xxx0.setForegroundColor(ColorConstants.black);

			//			this.add(xxx0, new ArrowLocator(this, ConnectionLocator.TARGET));

			PolylineDecoration pld = new PolylineDecoration();
			pld.setLineWidth(3);
			pld.setLineStyle(Graphics.LINE_DOT);
			pld.setForegroundColor(ColorConstants.gray);
			pld.setBackgroundColor(ColorConstants.red);
			pld.setOutline(true);
			this.add(pld);

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

		/**
		 * @generated
		 * 
		 * TODO JLS
		 * 
		 * en este metodo damos la posicion de la linea de FK en funcion de un 
		 * punto inicial y un punto final, calculados apartir de la posicion en la que 
		 * acaba el link. para las X seria posLink - size/2 , y posLink + size /2
		 * mientras que para las Y tendriamos que calcular la altura a la que queremos que
		 * aparezca la linea pues a el punto de conexion puede ser sobre o debajo del label.
		 */
		@Override
		protected void fireFigureMoved() {
			// TODO Auto-generated method stub
			Point p = this.getEnd();
			if (this.getChildren().size() > 0) {
				PolylineDecoration pld = (PolylineDecoration) this
						.getChildren().get(0);
				int x = this.getStart().x;
				int y = this.getStart().y;
				int width = 0;

				AttributeEditPart aep = (AttributeEditPart) getSource();
				if (aep != null) {
					//					width = ((AttributeImpl)((NodeImpl) aep.getModel()).getElement()).getLabelWidth();
					width = aep.getSize().width;
					y = getStart().y;
				}

				//si es rojo es el ultimo
				if (pld.getBackgroundColor().equals(ColorConstants.red)) {
					PointList points = new PointList(2);
					points.addPoint(x - (width / 2), y);
					points.addPoint(x + (width / 2) - 10, y);
					pld.setPoints(points);
					pld.setForegroundColor(ColorConstants.gray);
					this.setOutline(true);
					//si es amarillo del resto
				} else if (pld.getBackgroundColor().equals(
						ColorConstants.yellow)) {
					PointList points = new PointList(2);
					points.addPoint(x - (width / 2), y);
					points.addPoint(x + (width / 2), y);
					pld.setPoints(points);
					pld.setForegroundColor(ColorConstants.gray);
					this.setOutline(false);
					//si es PK , mostramos linea
				} else if (pld.getBackgroundColor()
						.equals(ColorConstants.green)) {
					this.setOutline(true);
				}
			}
			super.fireFigureMoved();
		}

	}

}
