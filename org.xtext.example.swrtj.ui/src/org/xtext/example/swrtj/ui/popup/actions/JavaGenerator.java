package org.xtext.example.swrtj.ui.popup.actions;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IActionDelegate;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;

import templates.SwrtjStandaloneCompiler;

public class JavaGenerator implements IObjectActionDelegate {

	private Shell shell;
	private String fileName;
	private String workingPath;
	private String uriPrefix;
	
	/**
	 * Constructor for Action1.
	 */
	public JavaGenerator() {
		super();
	}

	/**
	 * @see IObjectActionDelegate#setActivePart(IAction, IWorkbenchPart)
	 */
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		shell = targetPart.getSite().getShell();
	}

	/**
	 * @see IActionDelegate#run(IAction)
	 */
	public void run(IAction action) {
		SwrtjStandaloneCompiler compiler = new SwrtjStandaloneCompiler(fileName);
		boolean errors = !(compiler.compile(workingPath, workingPath + "../src-gen/", uriPrefix));
		
		try {
			ResourcesPlugin.getWorkspace().getRoot().refreshLocal(IResource.DEPTH_INFINITE, null);
		} catch (CoreException e) {
			e.printStackTrace();
		}
		
		if(errors) {
			MessageDialog.openError(shell, "Compilation informations", "The file was compiled with errors: " + compiler.getErrorReport());
		} else {
			MessageDialog.openInformation(shell, "Compilation informations", "The file was succesfully compiled");
		}
	}

	/**
	 * @see IActionDelegate#selectionChanged(IAction, ISelection)
	 */
	public void selectionChanged(IAction action, ISelection selection) {
		fileName = toFileName(selection.toString());
		workingPath = toWorkingPath(selection.toString());
		uriPrefix = toUriPrefix(selection.toString());
	}
	
	/* SERVICE METHODS */
	
	private String toFileName(String name) {
		int idx = getLastSeparatorIndex(name);
		
		if(idx == -1) return "";
		
		return name.substring(idx + 1, name.length() - 1);
	}
	
	private String toWorkingPath(String name) {
		IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
		String path = root.getLocation().toString() + "/";
		
		int idx = getLastSeparatorIndex(name);
		if(idx == -1) return "";
		
		return path + name.substring(3, idx) + "/";
	}
	
	private String toUriPrefix(String name) {
		int idx = name.indexOf('/');
		if(idx == -1) return "";
		
		return "platform:/resource" + name.substring(idx, name.lastIndexOf('/')) + "/";
	}
	
	private int getLastSeparatorIndex(String name) {
		int idx = name.length() - 1;
		
		while(name.charAt(idx) != '/') {
			idx--;
			if(idx < 0) return -1;
		}
		
		return idx;
	}
}
