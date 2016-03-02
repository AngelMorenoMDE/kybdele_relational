package gmf_relational_model.gmf_relational_model.diagram.edit.parts;

import gmf_relational_model.gmf_relational_model.LinkFK;
import gmf_relational_model.gmf_relational_model.impl.AttributeImpl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.draw2d.Figure;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.geometry.Insets;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.Request;
import org.eclipse.gmf.runtime.diagram.core.edithelpers.CreateElementRequestAdapter;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ListCompartmentEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.DragDropEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.figures.ResizableCompartmentFigure;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateUnspecifiedTypeConnectionRequest;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewAndElementRequest;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.runtime.notation.impl.NodeImpl;
import org.eclipse.gmf.tooling.runtime.edit.policies.reparent.CreationEditPolicyWithCustomReparent;

/**
 * @generated
 */
public class RelationCompartmentAttributesEditPart extends
		ListCompartmentEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 7001;

	/**
	 * @generated
	 */
	public RelationCompartmentAttributesEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 *  TODO JLS
	 *  
	 *  cada vez que se modificaun hijo verificamos los
	 *  separadores , comas, de los atributos para que se
	 *  mantenga el formato correcto
	 */
	protected boolean hasModelChildrenChanged(Notification evt) {
		refresh(evt);
		return false;
	}

	/**
	 * @generated
	 *  //TODO JLS   
	 *  
	 *  Siempre que se produce una modificacion,se ordenan los 
	 *  attributos que quedan.
	 *  
	 **/
	public void refresh(Notification evt) {
		refresh();
		orderChildrens(null);
		formatSeparatorChild();
		// TODO Auto-generated method stub
		//super.refresh();
	}

	/**
	 * @generated
	 */
	public String getCompartmentName() {
		return gmf_relational_model.gmf_relational_model.diagram.part.Messages.RelationCompartmentAttributesEditPart_title;
	}

	@Override
	protected void fireChildAdded(EditPart child, int index) {
		//		refresh();
		orderChildrens(null);
		formatSeparatorChild();
		// TODO Auto-generated method stub
		//		super.fireChildAdded(child, index);
	}

	/**
	 * @generated
	 * TODO JLS
	 * 
	 * Format Attribute container
	 * 
	 */
	public IFigure createFigure() {

		ResizableCompartmentFigure result = (ResizableCompartmentFigure) super
				.createFigure();
		result.setTitleVisibility(false);
		result.setBorder(null);
		// Fix the margins
		Insets insets = result.getContentPane().getInsets();
		insets.top = 5;
		insets.bottom = 5;
		insets.left = 5;
		insets.right = 5;
		// Layout behavior modification : data must be represented horizontally
		ConstrainedToolbarLayout layoutMgr = (ConstrainedToolbarLayout) result
				.getContentPane().getLayoutManager();
		layoutMgr.setVertical(false);
		layoutMgr.setStretchMajorAxis(true); // uses all the avalaible space
		layoutMgr.setStretchMinorAxis(true); // uses all the avalaible space
		layoutMgr.setSpacing(0);
		return result;
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(
				EditPolicyRoles.SEMANTIC_ROLE,
				new gmf_relational_model.gmf_relational_model.diagram.edit.policies.RelationCompartmentAttributesItemSemanticEditPolicy());
		installEditPolicy(
				EditPolicyRoles.CREATION_ROLE,
				new CreationEditPolicyWithCustomReparent(
						gmf_relational_model.gmf_relational_model.diagram.part.RelationalModelVisualIDRegistry.TYPED_INSTANCE));
		installEditPolicy(EditPolicyRoles.DRAG_DROP_ROLE,
				new DragDropEditPolicy());
		installEditPolicy(
				EditPolicyRoles.CANONICAL_ROLE,
				new gmf_relational_model.gmf_relational_model.diagram.edit.policies.RelationCompartmentAttributesCanonicalEditPolicy());
	}

	/**
	 * @generated
	 */
	protected void setRatio(Double ratio) {
		// nothing to do -- parent layout does not accept Double constraints as ratio
		// super.setRatio(ratio); 
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
				return this;
			}
			return getParent().getTargetEditPart(request);
		}
		if (request instanceof CreateUnspecifiedTypeConnectionRequest) {
			return getParent().getTargetEditPart(request);
		}
		return super.getTargetEditPart(request);
	}

	/**
	 * @generated
	 *  TODO JLS
	 *  
	 */
	@Override
	protected void handleNotificationEvent(Notification event) {
		//		// TODO Auto-generated method stub
		if (Notification.REMOVE == event.getEventType()) {
			refresh();
			formatSeparatorChild();
			orderChildrens(event);
		} else {
			super.handleNotificationEvent(event);
		}
	}

	/**
	 * @generated
	 *  TODO JLS
	 *  
	 *  @param childrens lista de attributeEditPart del compartment
	 *  
	 *  order attributes
	 */
	protected void orderChildrens(Notification evt) {
		//	protected void orderChildrens() {

		List<AttributeEditPart> lPK = new ArrayList();
		List<AttributeEditPart> lnoPK = new ArrayList();

		List listAux = this.getChildren();

		for (Object p : listAux) {
			AttributeEditPart att = (AttributeEditPart) p;
			if (((AttributeImpl) ((NodeImpl) (att.getModel())).getElement()) == null) {
				break;
			}
			//TODO JLS UN y NN tambien se modifican en wrappingLabeleditpart
			if (((AttributeImpl) ((NodeImpl) (att.getModel())).getElement())
					.isIsNN()) {
				att.setFlagNN(false);
				att.showAsterisk(false);

			} else {
				att.setFlagNN(true);
				att.showAsterisk(true);
			}

			if (((AttributeImpl) ((NodeImpl) (att.getModel())).getElement())
					.isIsUN()) {
				att.setFlagUN(true);
				att.setBold(true);
				att.showAsterisk(false);

			} else {
				att.setFlagUN(false);
				att.setBold(false);
			}

			if (((AttributeImpl) ((NodeImpl) (att.getModel())).getElement())
					.getIsFK() != null) {
				att.setFlagFK(true);
				att.setItalic(true);
				att.showAsterisk(false);
			} else {
				att.setFlagFK(false);
				att.setItalic(false);
				att.showUpperLine(false, false);
			}

			if (((AttributeImpl) ((NodeImpl) (att.getModel())).getElement())
					.getPkReference() != null) {
				att.showUnderLine(true);
				att.setBold(false);
				att.setItalic(false);
				att.setFlagPK(true);
				att.showAsterisk(false);
				lPK.add(att);
			} else {
				att.showUnderLine(false);
				att.setFlagPK(false);
				lnoPK.add(att);
			}
		}

		//TODO JLS ordenamos la lista en funcion de las FK
		List<AttributeEditPart> lnoPKOrder = orderListNoPK(lnoPK);

		if (children != null) {
			children.clear();

			int countPK = 0;
			Iterator itrPK = lPK.iterator();
			while (itrPK.hasNext()) {
				AttributeEditPart elementPK = (AttributeEditPart) itrPK.next();
				elementPK.showUpperLine(false, false);
				children.add(elementPK);
				reorderChild(elementPK, countPK);
				countPK = countPK + 1;
			}

			int countNoPK = countPK;
			Iterator itrNoPK = lnoPKOrder.iterator();
			while (itrNoPK.hasNext()) {
				AttributeEditPart elementNoPK = (AttributeEditPart) itrNoPK
						.next();

				children.add(elementNoPK);
				reorderChild(elementNoPK, countNoPK);
				countNoPK = countNoPK + 1;

			}
			formatSeparatorChild();
		}
	}

	/**
	 * @generated
	 * 
	 * TODO JLS
	 * 
	 * metodo que ordena la lista de atributos no primarios en funcion
	 * de la clave FK
	 */
	private List<AttributeEditPart> orderListNoPK(
			List<AttributeEditPart> listToOrder) {
		// TODO Auto-generated method stub

		List<LinkFK> orderLinkList = new ArrayList<LinkFK>();
		List<AttributeEditPart> orderList = new ArrayList<AttributeEditPart>();

		for (int i = 0; i < listToOrder.size() - 1; i++) {
			AttributeEditPart aep = listToOrder.get(i);
			LinkFK link = ((AttributeImpl) ((NodeImpl) aep.getModel())
					.getElement()).getIsFK();
			if (link != null) {
				orderLinkList.add(link);
			}
		}

		for (AttributeEditPart a : listToOrder) {
			LinkFK link = ((AttributeImpl) ((NodeImpl) a.getModel())
					.getElement()).getIsFK();
			if (link == null) {
				orderList.add(a);
			} else {

				List<AttributeEditPart> listAEPSameLink = extractAttributeEditPartForLinkFK(
						link, listToOrder);
				boolean last = false;

				Iterator itAepSameLink = listAEPSameLink.iterator();
				while (itAepSameLink.hasNext()) {
					AttributeEditPart aep = (AttributeEditPart) itAepSameLink
							.next();
					if (itAepSameLink.hasNext()) {
						aep.showUpperLine(true, false);
					} else {
						aep.showUpperLine(true, true);
					}
				}
				if (listAEPSameLink.size() > 1) {
					listAEPSameLink.get(0).showUpperLine(true, false);

				}
				orderList.addAll(listAEPSameLink);
				listToOrder = deleteAttributeEditPartForLinkFK(link,
						listToOrder);
			}
		}
		return orderList;
	}

	/**
	 * @generated
	 * 
	 * TODO JLS
	 * 
	 * Este metodo devuelve una lista de attributeEditPart a la que se han restado
	 * los attributos que hacen referencia a un link determinado.
	 */
	private List<AttributeEditPart> deleteAttributeEditPartForLinkFK(
			LinkFK linkToCompare, List<AttributeEditPart> listComplete) {
		List<AttributeEditPart> finalList = new ArrayList<AttributeEditPart>();
		for (AttributeEditPart aep : listComplete) {
			LinkFK link = ((AttributeImpl) ((NodeImpl) aep.getModel())
					.getElement()).getIsFK();
			if (link != null) {
				if (link != linkToCompare) {
					finalList.add(aep);
				}
			} else {
				finalList.add(aep);
			}
		}

		// TODO Auto-generated method stub
		return finalList;
	}

	/**
	 * @generated
	 * 
	 * TODO JLS
	 * 
	 * Este metodo recive una lsita de AttributeEditPart y devuelve todos aquellos que 
	 * referencian al mismo link que se pasa como argumento.
	 */
	private List<AttributeEditPart> extractAttributeEditPartForLinkFK(
			LinkFK linkToCompare, List<AttributeEditPart> listComplete) {
		List<AttributeEditPart> finalList = new ArrayList<AttributeEditPart>();
		for (AttributeEditPart aep : listComplete) {
			LinkFK link = ((AttributeImpl) ((NodeImpl) aep.getModel())
					.getElement()).getIsFK();
			if (link != null) {
				if (link == linkToCompare) {
					finalList.add(aep);
				}
			}
		}

		// TODO Auto-generated method stub
		return finalList;
	}

	/**
	 * @generated
	 * 
	 * TODO JLS
	 * 
	 * metodo que formatea la lista de atributos en funcion de su posicion para mostrar 
	 * la coma
	 */
	private void formatSeparatorChild() {
		// TODO Auto-generated method stub
		if (children != null && children.size() > 0) {
			for (int i = 0; i < children.size() - 1; i++) {
				((AttributeEditPart) (children.get(i))).getPrimaryShape()
						.getFigureAttributeSeparator().setText(",");
			}
			((AttributeEditPart) (children.get(children.size() - 1)))
					.getPrimaryShape().getFigureAttributeSeparator()
					.setText("");
		}

	}

}
