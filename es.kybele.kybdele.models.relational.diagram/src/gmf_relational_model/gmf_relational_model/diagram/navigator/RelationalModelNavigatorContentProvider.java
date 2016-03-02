package gmf_relational_model.gmf_relational_model.diagram.navigator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.workspace.util.WorkspaceSynchronizer;
import org.eclipse.gmf.runtime.emf.core.GMFEditingDomainFactory;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonContentProvider;

/**
 * @generated
 */
public class RelationalModelNavigatorContentProvider implements
		ICommonContentProvider {

	/**
	 * @generated
	 */
	private static final Object[] EMPTY_ARRAY = new Object[0];

	/**
	 * @generated
	 */
	private Viewer myViewer;

	/**
	 * @generated
	 */
	private AdapterFactoryEditingDomain myEditingDomain;

	/**
	 * @generated
	 */
	private WorkspaceSynchronizer myWorkspaceSynchronizer;

	/**
	 * @generated
	 */
	private Runnable myViewerRefreshRunnable;

	/**
	 * @generated
	 */
	@SuppressWarnings({ "unchecked", "serial", "rawtypes" })
	public RelationalModelNavigatorContentProvider() {
		TransactionalEditingDomain editingDomain = GMFEditingDomainFactory.INSTANCE
				.createEditingDomain();
		myEditingDomain = (AdapterFactoryEditingDomain) editingDomain;
		myEditingDomain.setResourceToReadOnlyMap(new HashMap() {
			public Object get(Object key) {
				if (!containsKey(key)) {
					put(key, Boolean.TRUE);
				}
				return super.get(key);
			}
		});
		myViewerRefreshRunnable = new Runnable() {
			public void run() {
				if (myViewer != null) {
					myViewer.refresh();
				}
			}
		};
		myWorkspaceSynchronizer = new WorkspaceSynchronizer(editingDomain,
				new WorkspaceSynchronizer.Delegate() {
					public void dispose() {
					}

					public boolean handleResourceChanged(final Resource resource) {
						unloadAllResources();
						asyncRefresh();
						return true;
					}

					public boolean handleResourceDeleted(Resource resource) {
						unloadAllResources();
						asyncRefresh();
						return true;
					}

					public boolean handleResourceMoved(Resource resource,
							final URI newURI) {
						unloadAllResources();
						asyncRefresh();
						return true;
					}
				});
	}

	/**
	 * @generated
	 */
	public void dispose() {
		myWorkspaceSynchronizer.dispose();
		myWorkspaceSynchronizer = null;
		myViewerRefreshRunnable = null;
		myViewer = null;
		unloadAllResources();
		((TransactionalEditingDomain) myEditingDomain).dispose();
		myEditingDomain = null;
	}

	/**
	 * @generated
	 */
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		myViewer = viewer;
	}

	/**
	 * @generated
	 */
	void unloadAllResources() {
		for (Resource nextResource : myEditingDomain.getResourceSet()
				.getResources()) {
			nextResource.unload();
		}
	}

	/**
	 * @generated
	 */
	void asyncRefresh() {
		if (myViewer != null && !myViewer.getControl().isDisposed()) {
			myViewer.getControl().getDisplay()
					.asyncExec(myViewerRefreshRunnable);
		}
	}

	/**
	 * @generated
	 */
	public Object[] getElements(Object inputElement) {
		return getChildren(inputElement);
	}

	/**
	 * @generated
	 */
	public void restoreState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public void saveState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	 * @generated
	 */
	public Object[] getChildren(Object parentElement) {
		if (parentElement instanceof IFile) {
			IFile file = (IFile) parentElement;
			URI fileURI = URI.createPlatformResourceURI(file.getFullPath()
					.toString(), true);
			Resource resource = myEditingDomain.getResourceSet().getResource(
					fileURI, true);
			ArrayList<gmf_relational_model.gmf_relational_model.diagram.navigator.RelationalModelNavigatorItem> result = new ArrayList<gmf_relational_model.gmf_relational_model.diagram.navigator.RelationalModelNavigatorItem>();
			ArrayList<View> topViews = new ArrayList<View>(resource
					.getContents().size());
			for (EObject o : resource.getContents()) {
				if (o instanceof View) {
					topViews.add((View) o);
				}
			}
			result.addAll(createNavigatorItems(
					selectViewsByType(
							topViews,
							gmf_relational_model.gmf_relational_model.diagram.edit.parts.SchemaEditPart.MODEL_ID),
					file, false));
			return result.toArray();
		}

		if (parentElement instanceof gmf_relational_model.gmf_relational_model.diagram.navigator.RelationalModelNavigatorGroup) {
			gmf_relational_model.gmf_relational_model.diagram.navigator.RelationalModelNavigatorGroup group = (gmf_relational_model.gmf_relational_model.diagram.navigator.RelationalModelNavigatorGroup) parentElement;
			return group.getChildren();
		}

		if (parentElement instanceof gmf_relational_model.gmf_relational_model.diagram.navigator.RelationalModelNavigatorItem) {
			gmf_relational_model.gmf_relational_model.diagram.navigator.RelationalModelNavigatorItem navigatorItem = (gmf_relational_model.gmf_relational_model.diagram.navigator.RelationalModelNavigatorItem) parentElement;
			if (navigatorItem.isLeaf() || !isOwnView(navigatorItem.getView())) {
				return EMPTY_ARRAY;
			}
			return getViewChildren(navigatorItem.getView(), parentElement);
		}

		return EMPTY_ARRAY;
	}

	/**
	 * @generated
	 */
	private Object[] getViewChildren(View view, Object parentElement) {
		switch (gmf_relational_model.gmf_relational_model.diagram.part.RelationalModelVisualIDRegistry
				.getVisualID(view)) {

		case gmf_relational_model.gmf_relational_model.diagram.edit.parts.SchemaEditPart.VISUAL_ID: {
			LinkedList<gmf_relational_model.gmf_relational_model.diagram.navigator.RelationalModelAbstractNavigatorItem> result = new LinkedList<gmf_relational_model.gmf_relational_model.diagram.navigator.RelationalModelAbstractNavigatorItem>();
			Diagram sv = (Diagram) view;
			gmf_relational_model.gmf_relational_model.diagram.navigator.RelationalModelNavigatorGroup links = new gmf_relational_model.gmf_relational_model.diagram.navigator.RelationalModelNavigatorGroup(
					gmf_relational_model.gmf_relational_model.diagram.part.Messages.NavigatorGroupName_Schema_1000_links,
					"icons/linksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					gmf_relational_model.gmf_relational_model.diagram.part.RelationalModelVisualIDRegistry
							.getType(gmf_relational_model.gmf_relational_model.diagram.edit.parts.RelationEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					gmf_relational_model.gmf_relational_model.diagram.part.RelationalModelVisualIDRegistry
							.getType(gmf_relational_model.gmf_relational_model.diagram.edit.parts.LinkFKEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					gmf_relational_model.gmf_relational_model.diagram.part.RelationalModelVisualIDRegistry
							.getType(gmf_relational_model.gmf_relational_model.diagram.edit.parts.AttributeIsFKEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					gmf_relational_model.gmf_relational_model.diagram.part.RelationalModelVisualIDRegistry
							.getType(gmf_relational_model.gmf_relational_model.diagram.edit.parts.LinkFKTargetEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			if (!links.isEmpty()) {
				result.add(links);
			}
			return result.toArray();
		}

		case gmf_relational_model.gmf_relational_model.diagram.edit.parts.RelationEditPart.VISUAL_ID: {
			LinkedList<gmf_relational_model.gmf_relational_model.diagram.navigator.RelationalModelAbstractNavigatorItem> result = new LinkedList<gmf_relational_model.gmf_relational_model.diagram.navigator.RelationalModelAbstractNavigatorItem>();
			Node sv = (Node) view;
			gmf_relational_model.gmf_relational_model.diagram.navigator.RelationalModelNavigatorGroup incominglinks = new gmf_relational_model.gmf_relational_model.diagram.navigator.RelationalModelNavigatorGroup(
					gmf_relational_model.gmf_relational_model.diagram.part.Messages.NavigatorGroupName_Relation_2001_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					gmf_relational_model.gmf_relational_model.diagram.part.RelationalModelVisualIDRegistry
							.getType(gmf_relational_model.gmf_relational_model.diagram.edit.parts.RelationCompartmentAttributesEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(
					connectedViews,
					gmf_relational_model.gmf_relational_model.diagram.part.RelationalModelVisualIDRegistry
							.getType(gmf_relational_model.gmf_relational_model.diagram.edit.parts.AttributeEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					gmf_relational_model.gmf_relational_model.diagram.part.RelationalModelVisualIDRegistry
							.getType(gmf_relational_model.gmf_relational_model.diagram.edit.parts.LinkFKTargetEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case gmf_relational_model.gmf_relational_model.diagram.edit.parts.LinkFKEditPart.VISUAL_ID: {
			LinkedList<gmf_relational_model.gmf_relational_model.diagram.navigator.RelationalModelAbstractNavigatorItem> result = new LinkedList<gmf_relational_model.gmf_relational_model.diagram.navigator.RelationalModelAbstractNavigatorItem>();
			Node sv = (Node) view;
			gmf_relational_model.gmf_relational_model.diagram.navigator.RelationalModelNavigatorGroup incominglinks = new gmf_relational_model.gmf_relational_model.diagram.navigator.RelationalModelNavigatorGroup(
					gmf_relational_model.gmf_relational_model.diagram.part.Messages.NavigatorGroupName_LinkFK_2002_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			gmf_relational_model.gmf_relational_model.diagram.navigator.RelationalModelNavigatorGroup outgoinglinks = new gmf_relational_model.gmf_relational_model.diagram.navigator.RelationalModelNavigatorGroup(
					gmf_relational_model.gmf_relational_model.diagram.part.Messages.NavigatorGroupName_LinkFK_2002_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					gmf_relational_model.gmf_relational_model.diagram.part.RelationalModelVisualIDRegistry
							.getType(gmf_relational_model.gmf_relational_model.diagram.edit.parts.AttributeIsFKEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					gmf_relational_model.gmf_relational_model.diagram.part.RelationalModelVisualIDRegistry
							.getType(gmf_relational_model.gmf_relational_model.diagram.edit.parts.LinkFKTargetEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case gmf_relational_model.gmf_relational_model.diagram.edit.parts.AttributeEditPart.VISUAL_ID: {
			LinkedList<gmf_relational_model.gmf_relational_model.diagram.navigator.RelationalModelAbstractNavigatorItem> result = new LinkedList<gmf_relational_model.gmf_relational_model.diagram.navigator.RelationalModelAbstractNavigatorItem>();
			Node sv = (Node) view;
			gmf_relational_model.gmf_relational_model.diagram.navigator.RelationalModelNavigatorGroup outgoinglinks = new gmf_relational_model.gmf_relational_model.diagram.navigator.RelationalModelNavigatorGroup(
					gmf_relational_model.gmf_relational_model.diagram.part.Messages.NavigatorGroupName_Attribute_3001_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					gmf_relational_model.gmf_relational_model.diagram.part.RelationalModelVisualIDRegistry
							.getType(gmf_relational_model.gmf_relational_model.diagram.edit.parts.AttributeIsFKEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case gmf_relational_model.gmf_relational_model.diagram.edit.parts.LinkFKTargetEditPart.VISUAL_ID: {
			LinkedList<gmf_relational_model.gmf_relational_model.diagram.navigator.RelationalModelAbstractNavigatorItem> result = new LinkedList<gmf_relational_model.gmf_relational_model.diagram.navigator.RelationalModelAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			gmf_relational_model.gmf_relational_model.diagram.navigator.RelationalModelNavigatorGroup target = new gmf_relational_model.gmf_relational_model.diagram.navigator.RelationalModelNavigatorGroup(
					gmf_relational_model.gmf_relational_model.diagram.part.Messages.NavigatorGroupName_LinkFKTarget_4004_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			gmf_relational_model.gmf_relational_model.diagram.navigator.RelationalModelNavigatorGroup source = new gmf_relational_model.gmf_relational_model.diagram.navigator.RelationalModelNavigatorGroup(
					gmf_relational_model.gmf_relational_model.diagram.part.Messages.NavigatorGroupName_LinkFKTarget_4004_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					gmf_relational_model.gmf_relational_model.diagram.part.RelationalModelVisualIDRegistry
							.getType(gmf_relational_model.gmf_relational_model.diagram.edit.parts.RelationEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					gmf_relational_model.gmf_relational_model.diagram.part.RelationalModelVisualIDRegistry
							.getType(gmf_relational_model.gmf_relational_model.diagram.edit.parts.LinkFKEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case gmf_relational_model.gmf_relational_model.diagram.edit.parts.AttributeIsFKEditPart.VISUAL_ID: {
			LinkedList<gmf_relational_model.gmf_relational_model.diagram.navigator.RelationalModelAbstractNavigatorItem> result = new LinkedList<gmf_relational_model.gmf_relational_model.diagram.navigator.RelationalModelAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			gmf_relational_model.gmf_relational_model.diagram.navigator.RelationalModelNavigatorGroup target = new gmf_relational_model.gmf_relational_model.diagram.navigator.RelationalModelNavigatorGroup(
					gmf_relational_model.gmf_relational_model.diagram.part.Messages.NavigatorGroupName_AttributeIsFK_4007_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			gmf_relational_model.gmf_relational_model.diagram.navigator.RelationalModelNavigatorGroup source = new gmf_relational_model.gmf_relational_model.diagram.navigator.RelationalModelNavigatorGroup(
					gmf_relational_model.gmf_relational_model.diagram.part.Messages.NavigatorGroupName_AttributeIsFK_4007_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					gmf_relational_model.gmf_relational_model.diagram.part.RelationalModelVisualIDRegistry
							.getType(gmf_relational_model.gmf_relational_model.diagram.edit.parts.LinkFKEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					gmf_relational_model.gmf_relational_model.diagram.part.RelationalModelVisualIDRegistry
							.getType(gmf_relational_model.gmf_relational_model.diagram.edit.parts.AttributeEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}
		}
		return EMPTY_ARRAY;
	}

	/**
	 * @generated
	 */
	private Collection<View> getLinksSourceByType(Collection<Edge> edges,
			String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (Edge nextEdge : edges) {
			View nextEdgeSource = nextEdge.getSource();
			if (type.equals(nextEdgeSource.getType())
					&& isOwnView(nextEdgeSource)) {
				result.add(nextEdgeSource);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getLinksTargetByType(Collection<Edge> edges,
			String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (Edge nextEdge : edges) {
			View nextEdgeTarget = nextEdge.getTarget();
			if (type.equals(nextEdgeTarget.getType())
					&& isOwnView(nextEdgeTarget)) {
				result.add(nextEdgeTarget);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getOutgoingLinksByType(
			Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getSourceEdges(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getIncomingLinksByType(
			Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getTargetEdges(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getChildrenByType(
			Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getChildren(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getDiagramLinksByType(
			Collection<Diagram> diagrams, String type) {
		ArrayList<View> result = new ArrayList<View>();
		for (Diagram nextDiagram : diagrams) {
			result.addAll(selectViewsByType(nextDiagram.getEdges(), type));
		}
		return result;
	}

	// TODO refactor as static method
	/**
	 * @generated
	 */
	private Collection<View> selectViewsByType(Collection<View> views,
			String type) {
		ArrayList<View> result = new ArrayList<View>();
		for (View nextView : views) {
			if (type.equals(nextView.getType()) && isOwnView(nextView)) {
				result.add(nextView);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isOwnView(View view) {
		return gmf_relational_model.gmf_relational_model.diagram.edit.parts.SchemaEditPart.MODEL_ID
				.equals(gmf_relational_model.gmf_relational_model.diagram.part.RelationalModelVisualIDRegistry
						.getModelID(view));
	}

	/**
	 * @generated
	 */
	private Collection<gmf_relational_model.gmf_relational_model.diagram.navigator.RelationalModelNavigatorItem> createNavigatorItems(
			Collection<View> views, Object parent, boolean isLeafs) {
		ArrayList<gmf_relational_model.gmf_relational_model.diagram.navigator.RelationalModelNavigatorItem> result = new ArrayList<gmf_relational_model.gmf_relational_model.diagram.navigator.RelationalModelNavigatorItem>(
				views.size());
		for (View nextView : views) {
			result.add(new gmf_relational_model.gmf_relational_model.diagram.navigator.RelationalModelNavigatorItem(
					nextView, parent, isLeafs));
		}
		return result;
	}

	/**
	 * @generated
	 */
	public Object getParent(Object element) {
		if (element instanceof gmf_relational_model.gmf_relational_model.diagram.navigator.RelationalModelAbstractNavigatorItem) {
			gmf_relational_model.gmf_relational_model.diagram.navigator.RelationalModelAbstractNavigatorItem abstractNavigatorItem = (gmf_relational_model.gmf_relational_model.diagram.navigator.RelationalModelAbstractNavigatorItem) element;
			return abstractNavigatorItem.getParent();
		}
		return null;
	}

	/**
	 * @generated
	 */
	public boolean hasChildren(Object element) {
		return element instanceof IFile || getChildren(element).length > 0;
	}

}
