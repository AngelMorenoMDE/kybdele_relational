package gmf_relational_model.gmf_relational_model.diagram.part.customtools;

import gmf_relational_model.gmf_relational_model.Gmf_relational_modelPackage;
import gmf_relational_model.gmf_relational_model.diagram.edit.parts.AttributeEditPart;
import gmf_relational_model.gmf_relational_model.impl.AttributeImpl;

import org.eclipse.draw2d.geometry.Point;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartViewer;
import org.eclipse.gef.tools.TargetingTool;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.graphics.Cursor;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Display;


/*
 * 
 * TODO JLS
 */
public class AttributeIsPKTool extends TargetingTool{
	
	@Override
	protected Cursor getDefaultCursor() {
		Cursor c = super.getDefaultCursor();
//		c = new Cursor(Display.getDefault(), SWT.CURSOR_HAND);
		Image cursorPK = new Image(Display.getDefault(),AttributeIsPKTool.class.getResourceAsStream("/pointers/pointerPK.png"));
		c = new Cursor(Display.getDefault(), cursorPK.getImageData(), 0, 0);
		return c;
	}

	@Override
	protected String getCommandName() {
		// TODO Auto-generated method stub
		return "AttributeIsPKCreateCommand";
	}
	
	public AttributeIsPKTool() {
		// TODO Auto-generated constructor stub
		super();
	}

	@Override
	public void mouseDown(MouseEvent me, EditPartViewer viewer) {
		// TODO Auto-generated method stub
		EditPart p  = viewer.findObjectAt(new Point (me.x,me.y));
		if (p.getClass() == AttributeEditPart.class || 
				p.getParent().getClass() == AttributeEditPart.class){
			EObject model = ((View) p.getModel()).getElement();
			TransactionalEditingDomain ted =  TransactionUtil.getEditingDomain(model);
			boolean flagBoolean = !((AttributeImpl)model).isIsPK();
			
			Command setVariable = SetCommand.create(ted, model,
					Gmf_relational_modelPackage.Literals.ATTRIBUTE__IS_PK, flagBoolean);
			ted.getCommandStack().execute(setVariable);
		}
		super.mouseDown(me, viewer);
	}
}
