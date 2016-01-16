package org.xtext.example.swrtj.ui.wizards;

import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.core.runtime.*;
import org.eclipse.jface.operation.*;
import java.lang.reflect.InvocationTargetException;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.core.resources.*;
import org.eclipse.core.runtime.CoreException;
import java.io.*;
import org.eclipse.ui.*;
import org.eclipse.ui.ide.IDE;

/**
 * This is a sample new wizard. Its role is to create a new file 
 * resource in the provided container. If the container resource
 * (a folder or a project) is selected in the workspace 
 * when the wizard is opened, it will accept it as the target
 * container. The wizard creates one file with the extension
 * "swrtj". If a sample multi-page editor (also available
 * as a template) is registered for the same extension, it will
 * be able to open it.
 */

public class SwrtjFileWizard extends Wizard implements INewWizard {
	private SwrtjFileWizardPage page;
	private ISelection selection;

	/**
	 * Constructor for SwrtjFileWizard.
	 */
	public SwrtjFileWizard() {
		super();
		setNeedsProgressMonitor(true);
	}
	
	/**
	 * Adding the page to the wizard.
	 */

	public void addPages() {
		page = new SwrtjFileWizardPage(selection);
		addPage(page);
	}

	/**
	 * This method is called when 'Finish' button is pressed in
	 * the wizard. We will create an operation and run it
	 * using wizard as execution context.
	 */
	public boolean performFinish() {
		final String containerName = page.getContainerName();
		final String fileName = page.getFileName();
		IRunnableWithProgress op = new IRunnableWithProgress() {
			public void run(IProgressMonitor monitor) throws InvocationTargetException {
				try {
					doFinish(containerName, fileName, monitor);
				} catch (CoreException e) {
					throw new InvocationTargetException(e);
				} finally {
					monitor.done();
				}
			}
		};
		try {
			getContainer().run(true, false, op);
		} catch (InterruptedException e) {
			return false;
		} catch (InvocationTargetException e) {
			Throwable realException = e.getTargetException();
			MessageDialog.openError(getShell(), "Error", realException.getMessage());
			return false;
		}
		return true;
	}
	
	/**
	 * The worker method. It will find the container, create the
	 * file if missing or just replace its contents, and open
	 * the editor on the newly created file.
	 */
	private void doFinish(
		String containerName,
		String fileName,
		IProgressMonitor monitor)
		throws CoreException {
		// create a sample file
		monitor.beginTask("Creating " + fileName, 2);
		IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
		IResource resource = root.findMember(new Path(containerName));
		if (!resource.exists() || !(resource instanceof IContainer)) {
			throwCoreException("Container \"" + containerName + "\" does not exist.");
		}
		IContainer container = (IContainer) resource;
		final IFile file = container.getFile(new Path(fileName));
		try {
			InputStream stream = openContentStream();
			if (file.exists()) {
				file.setContents(stream, true, true, monitor);
			} else {
				file.create(stream, true, monitor);
			}
			stream.close();
		} catch (IOException e) {
		}
		monitor.worked(1);
		monitor.setTaskName("Opening file for editing...");
		getShell().getDisplay().asyncExec(new Runnable() {
			public void run() {
				IWorkbenchPage page =
					PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
				try {
					IDE.openEditor(page, file, true);
				} catch (PartInitException e) {
				}
			}
		});
		monitor.worked(1);
	}
	
	/**
	 * We will initialize file contents with a sample text.
	 */
	private InputStream openContentStream() {
		String contents =
			"/*Example of an swrtj program by Fabio Strocco*/\n\n" +
			"/* INTERFACES */\n" +
			"interface IWriter {\n" +
			"\tvoid write(IObject obj);\n" +
			"}\n\n" +
			"/* TRAITS */\n" +
			"trait TWriter is {\n" +
			"\tIPrintStream stream;//Required field\n\n" +
			"\tvoid init() { this.stream = out; }//Provided method\n" +
			"\tvoid write(IObject obj) {//Provided method\n" +
			"\t\tthis.stream.println(obj);\n" +
			"\t}\n" +
			"}\n\n" +
			"trait TSyncWriter is TWriter[write renameTo unsyncWrite, init renameTo writerInit] + {\n" +
			"\tILock lock;//Required field\n\n" +
			"\tvoid unsyncWrite(IObject obj);//Required method\n\n" +
			"\tvoid writerInit();//Required method\n\n" +
			"\tvoid write(IObject obj) {//Provided method\n" +
			"\t\tthis.lock.lock();\n" +
			"\t\tthis.unsyncWrite(obj);\n" +
			"\t\tthis.lock.unlock();\n" +
			"\t}\n" +
			"\tvoid init() {\n" +
			"\t\tthis.writerInit();\n" +
			"\t\tthis.lock = new CReentrantLock();\n" +
			"\t}\n" +
			"}\n\n" +
			"/* RECORDS */\n" +
			"record RWriter is {\n" +
			"\tIPrintStream stream;//Provided field\n" +
			"\tILock lock;//Provided field\n" +
			"}\n\n" +
			"/* CLASSES */\n" +
			"class CWriter implements IWriter by RWriter and TWriter {\n" +
			"\tCWriter() {\n" +
			"\t\tthis.init();\n" +
			"\t}\n" +
			"}\n\n" +
			"class CSyncWriter implements IWriter by RWriter and TSyncWriter {\n" +
			"\tCSyncWriter() {\n" +
			"\t\tthis.init();\n" +
			"\t}\n" +
			"}\n\n" +
			"/* MAIN PROGRAM */\n" +
			"program Main {\n" +
			"\tnew CWriter().write(\"Now writing using CWriter\");\n" +
			"\tnew CSyncWriter().write(\"Now writing using CSyncWriter\");\n" +
			"\tout.println(\"Program terminated\");\n" +
			"}";
		return new ByteArrayInputStream(contents.getBytes());
	}

	private void throwCoreException(String message) throws CoreException {
		IStatus status =
			new Status(IStatus.ERROR, "org.xtext.example.swrtj.ui", IStatus.OK, message, null);
		throw new CoreException(status);
	}

	/**
	 * We will accept the selection in the workbench to see if
	 * we can initialize from it.
	 * @see IWorkbenchWizard#init(IWorkbench, IStructuredSelection)
	 */
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		this.selection = selection;
	}
}