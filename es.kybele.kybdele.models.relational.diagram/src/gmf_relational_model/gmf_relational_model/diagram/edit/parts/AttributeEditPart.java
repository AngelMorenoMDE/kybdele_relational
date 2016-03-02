package gmf_relational_model.gmf_relational_model.diagram.edit.parts;

import gmf_relational_model.gmf_relational_model.diagram.edit.parts.custom.DefaultSizeNodeFigureWithFixedAnchors;
import gmf_relational_model.gmf_relational_model.impl.AttributeImpl;

import java.util.HashMap;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.FlowLayout;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.MarginBorder;
import org.eclipse.draw2d.PolylineDecoration;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.draw2d.ToolbarLayout;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.PointList;
import org.eclipse.draw2d.geometry.PrecisionPoint;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.impl.EAttributeImpl;
import org.eclipse.emf.ecore.impl.EReferenceImpl;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.FlowLayoutEditPolicy;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.runtime.notation.impl.NodeImpl;
import org.eclipse.jface.resource.FontDescriptor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.FontData;
import org.eclipse.swt.widgets.Display;

/**
 * @generated
 */
public class AttributeEditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 3001;

	/**
	 * @generated
	 * TODO JLS
	 * 
	 * VERIFICADO
	 */
	private boolean flagFK = false;

	/**
	 * @generated
	 * TODO JLS
	 * 
	 * VERIFICADO
	 */
	private boolean flagPK = false;

	/**
	 * @generated
	 * TODO JLS
	 * 
	 * VERIFICADO
	 */
	private boolean flagUN = false;

	/**
	 * @generated
	 * TODO JLS
	 * 
	 * VERIFICADO
	 */
	private boolean flagNN = false;

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
	public AttributeEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(
				EditPolicyRoles.SEMANTIC_ROLE,
				new gmf_relational_model.gmf_relational_model.diagram.edit.policies.AttributeItemSemanticEditPolicy());
		installEditPolicy(EditPolicy.LAYOUT_ROLE, createLayoutEditPolicy());
		// XXX need an SCR to runtime to have another abstract superclass that would let children add reasonable editpolicies
		// removeEditPolicy(org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles.CONNECTION_HANDLES_ROLE);
	}

	/**
	 * @generated
	 */
	protected LayoutEditPolicy createLayoutEditPolicy() {

		FlowLayoutEditPolicy lep = new FlowLayoutEditPolicy() {

			protected Command createAddCommand(EditPart child, EditPart after) {
				return null;
			}

			protected Command createMoveChildCommand(EditPart child,
					EditPart after) {
				return null;
			}

			protected Command getCreateCommand(CreateRequest request) {
				return null;
			}
		};
		return lep;
	}

	/**
	 * @generated
	 */
	protected IFigure createNodeShape() {
		return primaryShape = new AttributeFigure();
	}

	/**
	 * @generated
	 */
	public AttributeFigure getPrimaryShape() {
		return (AttributeFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof gmf_relational_model.gmf_relational_model.diagram.edit.parts.AttributeNameEditPart) {
			((gmf_relational_model.gmf_relational_model.diagram.edit.parts.AttributeNameEditPart) childEditPart)
					.setLabel(getPrimaryShape().getFigureAttributeNameFigure());
			return true;
		}
		if (childEditPart instanceof gmf_relational_model.gmf_relational_model.diagram.edit.parts.WrappingLabelEditPart) {
			((gmf_relational_model.gmf_relational_model.diagram.edit.parts.WrappingLabelEditPart) childEditPart)
					.setLabel(getPrimaryShape().getFigureAttributeFlagFigure());
			return true;
		}
		if (childEditPart instanceof gmf_relational_model.gmf_relational_model.diagram.edit.parts.WrappingLabel2EditPart) {
			((gmf_relational_model.gmf_relational_model.diagram.edit.parts.WrappingLabel2EditPart) childEditPart)
					.setLabel(getPrimaryShape().getFigureAttributeSeparator());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof gmf_relational_model.gmf_relational_model.diagram.edit.parts.AttributeNameEditPart) {
			return true;
		}
		if (childEditPart instanceof gmf_relational_model.gmf_relational_model.diagram.edit.parts.WrappingLabelEditPart) {
			return true;
		}
		if (childEditPart instanceof gmf_relational_model.gmf_relational_model.diagram.edit.parts.WrappingLabel2EditPart) {
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
	 * CONECTA EN EL MISMO PUNTO
	 */
	protected NodeFigure createNodePlate() {
		HashMap<String, PrecisionPoint> anchorLocations = new HashMap<String, PrecisionPoint>();
		// The anchor's location is a little bit on the left in order to be sure
		// that the edges will be horizontally oriented
		anchorLocations.put("NORTH", new PrecisionPoint(0.5d, 0));
		anchorLocations.put("SOUTH", new PrecisionPoint(0.5d, 1d));
		DefaultSizeNodeFigureWithFixedAnchors result = new DefaultSizeNodeFigureWithFixedAnchors(
				40, 40, anchorLocations);
		return result;
	}

	/**
	 * @generated
	 * TODO JLS
	 * 
	 * Controlamos el tipo de letra en funcion del tipo de atributo y 
	 * tambien el tamaño de la linea en caso de ser PK o FK
	 * 
	 */
	protected void handleNotificationEvent(Notification event) {
		Object feature = event.getFeature();

		if (Notification.SET == event.getEventType()
				&& feature.getClass() == EReferenceImpl.class) {
			EReferenceImpl feAux = (EReferenceImpl) feature;
			if ("pkReference".equals(feAux.getName())) {
				if (event.getNewValue() != null) {
					((AttributeImpl) event.getNotifier())
							.setLabelWidth(getWidth());
					showUnderLine(true);
					setBold(false);
					setItalic(false);
					showAsterisk(false);
				} else {
					showUnderLine(false);
				}
			} else if ("isFK".equals(feAux.getName())) {
				if (event.getNewValue() != null) {
					((AttributeImpl) event.getNotifier())
							.setLabelWidth(getWidth());
					setItalic(true);
					showAsterisk(false);
				} else {
					setItalic(false);
				}
			}
		} else if (Notification.SET == event.getEventType()
				&& feature.getClass() == EAttributeImpl.class) {
			EAttributeImpl feAux = (EAttributeImpl) feature;
			if ("isUN".equals(feAux.getName())) {
				if (((AttributeImpl) event.getNotifier()).getPkReference() == null) {
					if (event.getNewBooleanValue() == true) {
						setBold(true);
						if (((AttributeImpl) event.getNotifier()).isIsNN()) {
							showAsterisk(false);
						} else {
							showAsterisk(true);
						}
					} else {
						setBold(false);
					}
				} else {
					setBold(false);
				}

			} else if ("isPK".equals(feAux.getName())) {
				if (event.getNewBooleanValue()) {
					((AttributeImpl) event.getNotifier())
							.setLabelWidth(getWidth());
					showUnderLine(true);
					setBold(false);
					setItalic(false);
					showAsterisk(false);
				} else {
					showUnderLine(false);
				}
			}
		} else {
			super.handleNotificationEvent((event));
		}

		((RelationCompartmentAttributesEditPart) this.getParent()).refresh();
		((RelationCompartmentAttributesEditPart) this.getParent())
				.refresh(null);
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
				.getType(gmf_relational_model.gmf_relational_model.diagram.edit.parts.AttributeNameEditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public class AttributeFigure extends RectangleFigure {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureAttributeNameFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureAttributeFlagFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureAttributeSeparator;
		/**
		 * @generated
		 */
		private RectangleFigure fFigureAttributeHeaderFigure;
		/**
		 * @generated
		 */
		private RectangleFigure fFigureAttributeUnderLineFigure;

		/**
		 * @generated
		 */
		public AttributeFigure() {

			FlowLayout layoutThis = new FlowLayout();
			layoutThis.setStretchMinorAxis(false);
			layoutThis.setMinorAlignment(FlowLayout.ALIGN_CENTER);

			layoutThis.setMajorAlignment(FlowLayout.ALIGN_CENTER);
			layoutThis.setMajorSpacing(5);
			layoutThis.setMinorSpacing(5);
			layoutThis.setHorizontal(false);

			this.setLayoutManager(layoutThis);

			this.setOutline(false);
			this.setBackgroundColor(ColorConstants.white);

			this.setFont(THIS_FONT);

			this.setBorder(new MarginBorder(getMapMode().DPtoLP(10),
					getMapMode().DPtoLP(0), getMapMode().DPtoLP(0),
					getMapMode().DPtoLP(0)));
			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureAttributeHeaderFigure = new RectangleFigure();

			fFigureAttributeHeaderFigure.setOutline(false);
			fFigureAttributeHeaderFigure
					.setBackgroundColor(ColorConstants.white);

			fFigureAttributeHeaderFigure.setBorder(new MarginBorder(
					getMapMode().DPtoLP(0), getMapMode().DPtoLP(5),
					getMapMode().DPtoLP(0), getMapMode().DPtoLP(0)));

			this.add(fFigureAttributeHeaderFigure);

			ToolbarLayout layoutFFigureAttributeHeaderFigure = new ToolbarLayout();
			layoutFFigureAttributeHeaderFigure.setStretchMinorAxis(false);
			layoutFFigureAttributeHeaderFigure
					.setMinorAlignment(ToolbarLayout.ALIGN_TOPLEFT);

			layoutFFigureAttributeHeaderFigure.setSpacing(0);
			layoutFFigureAttributeHeaderFigure.setVertical(false);

			fFigureAttributeHeaderFigure
					.setLayoutManager(layoutFFigureAttributeHeaderFigure);

			fFigureAttributeNameFigure = new WrappingLabel();

			fFigureAttributeNameFigure.setText("Attribute");
			fFigureAttributeNameFigure.setForegroundColor(ColorConstants.black);

			fFigureAttributeHeaderFigure.add(fFigureAttributeNameFigure);

			fFigureAttributeFlagFigure = new WrappingLabel();

			fFigureAttributeFlagFigure.setText("*");
			fFigureAttributeFlagFigure.setForegroundColor(ColorConstants.black);

			fFigureAttributeHeaderFigure.add(fFigureAttributeFlagFigure);

			fFigureAttributeSeparator = new WrappingLabel();

			fFigureAttributeSeparator.setText("");
			fFigureAttributeSeparator.setForegroundColor(ColorConstants.black);

			fFigureAttributeHeaderFigure.add(fFigureAttributeSeparator);

			fFigureAttributeUnderLineFigure = new RectangleFigure();

			fFigureAttributeUnderLineFigure.setFillXOR(true);
			fFigureAttributeUnderLineFigure
					.setForegroundColor(ColorConstants.black);
			fFigureAttributeUnderLineFigure.setMinimumSize(new Dimension(
					getMapMode().DPtoLP(0), getMapMode().DPtoLP(2)));

			fFigureAttributeUnderLineFigure.setBorder(new MarginBorder(
					getMapMode().DPtoLP(1), getMapMode().DPtoLP(0),
					getMapMode().DPtoLP(1), getMapMode().DPtoLP(0)));
			fFigureAttributeUnderLineFigure.setVisible(false);

			this.add(fFigureAttributeUnderLineFigure);

			ToolbarLayout layoutFFigureAttributeUnderLineFigure = new ToolbarLayout();
			layoutFFigureAttributeUnderLineFigure.setStretchMinorAxis(false);
			layoutFFigureAttributeUnderLineFigure
					.setMinorAlignment(ToolbarLayout.ALIGN_CENTER);

			layoutFFigureAttributeUnderLineFigure.setSpacing(0);
			layoutFFigureAttributeUnderLineFigure.setVertical(false);

			fFigureAttributeUnderLineFigure
					.setLayoutManager(layoutFFigureAttributeUnderLineFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureAttributeNameFigure() {
			return fFigureAttributeNameFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureAttributeFlagFigure() {
			return fFigureAttributeFlagFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureAttributeSeparator() {
			return fFigureAttributeSeparator;
		}

		/**
		 * @generated
		 */
		public RectangleFigure getFigureAttributeHeaderFigure() {
			return fFigureAttributeHeaderFigure;
		}

		/**
		 * @generated
		 */
		public RectangleFigure getFigureAttributeUnderLineFigure() {
			return fFigureAttributeUnderLineFigure;
		}

	}

	/**
	 * @generated
	 */
	static final Font THIS_FONT = new Font(Display.getCurrent(), "verdana", 12,
			SWT.NORMAL);

	/**
	 * @generated
	 * TODO JLS
	 * 
	 *  en este metodo hacemos la linea de subrayado de PK visible
	 *  en funcion del booleano que recibe. Obtenemos el tamaño almacenado
	 *  de AttributeNameFigure para igualarlo.
	 * 
	 */
	public void showUnderLine(boolean underLine) {
		try {
			this.getPrimaryShape().fFigureAttributeUnderLineFigure
					.setVisible(underLine);
			int wAux = 0;
			if (((NodeImpl) this.getModel()).getElement().getClass() == AttributeImpl.class) {
				wAux = ((AttributeImpl) ((NodeImpl) this.getModel())
						.getElement()).getLabelWidth();
			}
			if (wAux == 0) {
				wAux = 75;
			}

			this.getPrimaryShape().fFigureAttributeUnderLineFigure.getInsets().left = wAux;
			this.getPrimaryShape().fFigureAttributeUnderLineFigure.repaint();
		} catch (Exception e) {
			/*e.printStackTrace();
			throw (e);*/
		}

	}

	/**
	 * @generated
	 * TODO JLS
	 * 
	 *  en este metodo hacemos la linea superior de FK visible
	 *  en funcion del booleano que recibe. Diferenciamos del primer y el ultimo
	 *  atributo para poder pintar solo una linea y determinar el tamaño para que
	 *  no se junten dos atributos dediferente FK bajo la misma linea
	 *  
	 *  ultimo = background rojo
	 *  resto = background amarillo
	 *  primero = background verde
	 *  
	 *  tiene sentido usar la propiedad background para controlar en AttributeIsFKEditPart
	 *  la posicion que tendra cada linea y lo comentado anteriormente de la visibilidad
	 *  del link.
	 * 
	 */
	public void showUpperLine(boolean upperLine, boolean last) {
		try {

			PolylineDecoration pld = new PolylineDecoration();

			if (this.getSourceConnections().size() > 0) {
				if (this.getSourceConnections().get(0).getClass() == AttributeIsFKEditPart.class) {
					if (((AttributeIsFKEditPart) this.getSourceConnections()
							.get(0)).getFigure().getChildren().size() > 0) {
						pld = (PolylineDecoration) ((AttributeIsFKEditPart) this
								.getSourceConnections().get(0)).getFigure()
								.getChildren().get(0);
					}
				}
			}

			PointList points = new PointList(2);
			points = pld.getPoints();

			if (upperLine) {
				pld.setOutline(true);
			} else {
				pld.setOutline(false);
			}

			if (last) {
				pld.setForegroundColor(ColorConstants.gray);
				pld.setBackgroundColor(ColorConstants.red);
			} else {
				pld.setForegroundColor(ColorConstants.gray);
				pld.setBackgroundColor(ColorConstants.yellow);
			}
			if (flagPK) {
				pld.setForegroundColor(ColorConstants.gray);
				pld.setBackgroundColor(ColorConstants.green);
			}
		} catch (Exception e) {
			/*e.printStackTrace();
			throw (e);*/
		}

	}

	/**
	 * @generated
	 * TODO JLS
	 * 
	 *  en este metodo hacemos visible el asterisco de fFigureAttributeFlagFigure
	 *  en funcion del booleano que recivimos.
	 * 
	 */
	public void showAsterisk(boolean asterisk) {
		try {
			if (this.getPrimaryShape() != null)
			{
				if (this.getPrimaryShape().fFigureAttributeFlagFigure != null)
				{
					this.getPrimaryShape().fFigureAttributeFlagFigure
					.setVisible(asterisk);
				}
				
			}
			
		} catch (Exception e) {
			//e.printStackTrace();
			//throw (e);
		}

	}

	/**
	 * @generated
	 * TODO JLS
	 * 
	 * Establecemos la letra de AttibuteNameFigure como negrita
	 * 
	 */
	public void setBold(boolean bold) {
		try {
			FontData fontData;
			if (bold) {
				fontData = new FontData("verdana", 12, SWT.BOLD);
			} else {
				fontData = new FontData("verdana", 12, SWT.NORMAL);
			}

			Font newFont = getResourceManager().createFont(
					FontDescriptor.createFrom(fontData));
			if (this.getPrimaryShape() != null)
			{
				if (this.getPrimaryShape().fFigureAttributeNameFigure != null)
				{
					this.getPrimaryShape().fFigureAttributeNameFigure
					.setFont(newFont);
				}
				
			}

		} catch (Exception e) {
			//e.printStackTrace();
			//throw (e);
		}

		if (bold) {
			flagUN = true;
		} else {
			flagUN = false;
		}
	}

	/**
	 * @generated
	 * TODO JLS
	 * 
	 * Establecemos la letra de AttibuteNameFigure como cursiva
	 * 
	 */
	public void setItalic(boolean italic) {

		try {
			FontData fontData;
			if (italic) {
				if (flagPK) {
					fontData = new FontData("verdana", 12, SWT.NORMAL);
				} else {
					fontData = new FontData("verdana", 12, SWT.ITALIC);
				}
			} else {
				if (flagUN) {
					fontData = new FontData("verdana", 12, SWT.BOLD);
				} else {
					fontData = new FontData("verdana", 12, SWT.NORMAL);
				}
			}

			Font newFont = getResourceManager().createFont(
					FontDescriptor.createFrom(fontData));
			if (this.getPrimaryShape() != null)
			{
				if (this.getPrimaryShape().fFigureAttributeNameFigure != null)
				{
					this.getPrimaryShape().fFigureAttributeNameFigure
					.setFont(newFont);
				}
				
			}

		} catch (Exception e) {
			/*e.printStackTrace();
			throw (e);*/
		}
		if (italic) {
			flagFK = true;
		} else {
			flagFK = false;
		}
	}

	/**
	 * @generated
	 * TODO JLS
	 * 
	 * Metodo que devuelve el ancho de attributenamefigur almacenado
	 * posteriormente
	 * 
	 * @return
	 */
	private int getWidth() {
		// TODO Auto-generated method stub
		int wAux = this.getPrimaryShape().getSize().width;
		return wAux;
	}

	public boolean isFlagFK() {
		return flagFK;
	}

	public void setFlagFK(boolean flagFK) {
		this.flagFK = flagFK;
	}

	public boolean isFlagPK() {
		return flagPK;
	}

	public void setFlagPK(boolean flagPK) {
		this.flagPK = flagPK;
	}

	public boolean isFlagUN() {
		return flagUN;
	}

	public void setFlagUN(boolean flagUN) {
		this.flagUN = flagUN;
	}

	public boolean isFlagNN() {
		return flagNN;
	}

	public void setFlagNN(boolean flagNN) {
		this.flagNN = flagNN;
	}

	public void setContentPane(IFigure contentPane) {
		this.contentPane = contentPane;
	}

	public void setPrimaryShape(IFigure primaryShape) {
		this.primaryShape = primaryShape;
	}

}
