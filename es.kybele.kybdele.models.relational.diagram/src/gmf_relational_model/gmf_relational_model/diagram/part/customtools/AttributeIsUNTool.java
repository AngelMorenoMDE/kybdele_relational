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
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.graphics.Cursor;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Display;



/*
 * 
 * TODO JLS
 */
public class AttributeIsUNTool  extends TargetingTool{
	
	@Override
	protected Cursor getDefaultCursor() {
		Cursor c = super.getDefaultCursor();
//		c = new Cursor(Display.getDefault(), SWT.CURSOR_HAND);
		Image cursorPK = new Image(Display.getDefault(),AttributeIsPKTool.class.getResourceAsStream("/pointers/pointerUN.png"));
		c = new Cursor(Display.getDefault(), cursorPK.getImageData(), 0, 0);
		return c;
	}

	@Override
	protected String getCommandName() {
		// TODO Auto-generated method stub
		return "AttributeIsUNCreateCommand";
	}

	public AttributeIsUNTool() {
		// TODO Auto-generated constructor stub
		super();
	}
	
	@Override
	public void mouseDown(MouseEvent me, EditPartViewer viewer) {
		// TODO Auto-generated method stub
		EditPart p  = viewer.findObjectAt(new Point (me.x,me.y));
		if (p.getClass() == AttributeEditPart.class || p.getParent().getClass() == AttributeEditPart.class){
			EObject model = ((View) p.getModel()).getElement();
			TransactionalEditingDomain ted =  TransactionUtil.getEditingDomain(model);
			boolean flagBoolean = !((AttributeImpl)model).isIsUN();
			
			Command setVariable = SetCommand.create(ted, model,Gmf_relational_modelPackage.Literals.ATTRIBUTE__IS_UN, flagBoolean);
			
			ted.getCommandStack().execute(setVariable);
			//Si es UN, seteamos NN a true para eliminar inconsistencias. Si no lo dejamos como esta.
			if (flagBoolean){
				Command setVariableNN = SetCommand.create(ted, model,Gmf_relational_modelPackage.Literals.ATTRIBUTE__IS_NN, flagBoolean);
				ted.getCommandStack().execute(setVariableNN);
			}
			
		}
		
		super.mouseDown(me, viewer);
	}
}
