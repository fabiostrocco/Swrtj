package org.xtext.example.swrtj.ui.wizards;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchWizard;

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

public class SwrtjProjectWizard extends Wizard implements INewWizard {
	private SwrtjProjectWizardPage page;
	private ISelection selection;

	/**
	 * Constructor for SwrtjProjectWizard.
	 */
	public SwrtjProjectWizard() {
		super();
		setNeedsProgressMonitor(true);
	}
	
	/**
	 * Adding the page to the wizard.
	 */
	public void addPages() {
		page = new SwrtjProjectWizardPage(selection);
		addPage(page);
	}

	/**
	 * This method is called when 'Finish' button is pressed in
	 * the wizard. We will create an operation and run it
	 * using wizard as execution context.
	 */
	public boolean performFinish() {
		final String containerName = page.getContainerName() + "/";
		IRunnableWithProgress op = new IRunnableWithProgress() {
			public void run(IProgressMonitor monitor) throws InvocationTargetException {
				try {
					doFinish(containerName, monitor);
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
		IProgressMonitor monitor)
		throws CoreException {
		IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();

		IProject project = root.getProject(containerName);
		project.create(monitor);
		project.open(monitor);
		
		IFile cpFile = project.getFile(".classpath");
		cpFile.create(getCpSource(), false, monitor);
		IFile projFile = project.getFile(".project");
		projFile.delete(false, monitor);
		projFile.create(getProjSource(), true, monitor);
		IFolder srcFolder = project.getFolder("src");
		srcFolder.create(false, false, monitor);
		IFolder srcGenFolder = project.getFolder("src-gen");
		srcGenFolder.create(false, false, monitor);
		IFile srcFile = srcFolder.getFile("Fifo.swrtj");
		srcFile.create(getSrc1Source(), false, monitor);
		srcFile = srcFolder.getFile("Main.swrtj");
		srcFile.create(getSrc2Source(), false, monitor);
	}
	
	private InputStream getCpSource() {
		String contents = 
			"<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n"+
			"\t<classpath>\n" +
			"\t<classpathentry kind=\"src\" path=\"src\"/>\n" +
			"\t<classpathentry kind=\"src\" path=\"src-gen\"/>\n" +
			"\t<classpathentry kind=\"con\" path=\"org.eclipse.jdt.launching.JRE_CONTAINER\"/>\n" +
			"\t<classpathentry kind=\"con\" path=\"org.eclipse.pde.core.requiredPlugins\"/>\n" +
			"\t<classpathentry kind=\"output\" path=\"bin\"/>\n" +
			"</classpath>";
		return new ByteArrayInputStream(contents.getBytes());
	}
	
	private InputStream getProjSource() {
		String contents =
		"<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
		"<projectDescription>\n" +
		"\t<name>Project</name>\n" +
		"\t<comment></comment>\n" +
		"\t<projects>\n" +
		"\t</projects>\n" +
		"\t<buildSpec>\n" +
		"\t\t<buildCommand>\n" +
		"\t\t\t<name>org.eclipse.jdt.core.javabuilder</name>\n" +
		"\t\t\t<arguments>\n" +
		"\t\t\t</arguments>\n" +
		"\t\t</buildCommand>\n" +
		"\t\t<buildCommand>\n" +
		"\t\t\t<name>org.eclipse.xtext.ui.shared.xtextBuilder</name>\n" +
		"\t\t\t<arguments>\n" +
		"\t\t\t</arguments>\n" +
		"\t\t</buildCommand>\n" +
		"\t</buildSpec>\n" +
		"\t<natures>\n" +
		"\t\t<nature>org.eclipse.jdt.core.javanature</nature>\n" +
		"\t\t<nature>org.eclipse.xtext.ui.shared.xtextNature</nature>\n" +
		"\t</natures>\n" +
		"</projectDescription>";
		return new ByteArrayInputStream(contents.getBytes());
	}
	
	private InputStream getSrc1Source() {
		String contents =
			"/* Example of an swrtj program by Fabio Strocco */\n" +
			"\n" +
			"interface IQueue {\n" +
			"	boolean isEmpty();\n" +
			"	void enqueue(IObject element);\n" +
			"	IObject dequeue();\n" +
			"}\n" +
			"\n" +
			"trait TQueue is {\n" +
			"	IList l; //Required field\n" +
			"	\n" +
			"	boolean isEmpty() { //Provided method\n" +
			"		return this.l.isEmpty();\n" +
			"	}\n" +
			"	\n" +
			"	void enqueue(IObject element) { //Provided method\n" +
			"		int position = this.l.size();	\n" +
			"		this.l.add(position, element);\n" +
			"	}\n" +
			"	\n" +
			"	IObject dequeue() { //Provided method\n" +
			"		IObject element = this.l.get(0);\n" +
			"		this.l.remove(element);\n" +
			"				\n" +
			"		return element;\n" +
			"	}\n" +
			"}\n" +
			"\n" +
			"record RFifo is {\n" +
			"	IList l; //Provided field\n" +
			"}\n" +
			"\n" +
			"class Queue implements IQueue by RFifo and TQueue {\n" +
			"	Queue() {\n" +
			"		this.l = new CLinkedList();\n" +
			"	}\n" +
			"}\n" +
			"\n" +
			"\n" +
			"interface IFifo {\n" +
			"	boolean isEmpty();\n" +
			"	void enqueue(IObject element);\n" +
			"	void dequeue();\n" +
			"	IObject peek();\n" +
			"}\n" +
			"\n" +
			"trait TFifo is TQueue[exclude dequeue] + \n" +
			"	{\n" +
			"		IList l; //Required field\n" +
			"		\n" +
			"		void dequeue() { //Provided method\n" +
			"			this.l.remove(this.l.get(0));\n" +
			"		}\n" +
			"		\n" +
			"		IObject peek() { //Provided method\n" +
			"			return this.l.get(0);\n" +
			"		}\n" +
			"	}\n" +
			"\n" +
			"class Fifo implements IFifo by RFifo and TFifo {\n" +
			"	Fifo() {\n" +
			"		this.l = new CLinkedList();\n" +
			"	}\n" +
			"}\n";
		return new ByteArrayInputStream(contents.getBytes());
	}
	
	private InputStream getSrc2Source() {
		String contents =
			"/* Example of an swrtj program by Fabio Strocco */\n" +
			"\n" +
			"import \"Fifo.swrtj\"\n" +
			"\n" +
			"interface IReader {\n" +
			"	IString readString(IString message);\n" +
			"}\n" +
			"\n" +
			"class CReader implements IReader by {} and { //Direct anonimous trait definition\n" +
			"	IString readString(IString message) { //Provided method\n" +
			"		out.println(message);\n" +
			"		return in.nextLine();\n" +
			"	}\n" +
			"}\n" +
			"{\n" +
			"	CReader() {}\n" +
			"}\n" +
			"\n" +
			"program Main {\n" +
			"	IReader reader = new CReader();\n" +
			"	IQueue queue = new Queue();\n" +
			"	IFifo fifo = new Fifo();\n" +
			"		\n" +
			"	while(!reader.readString(\"Type ENTER to insert an element or EXIT to terminate the program\")\n" +
			"	             .toLowerCase().equals(\"exit\")) {\n" +
			"		IString element = reader.readString(\"Insert a string\");\n" +
			"		queue.enqueue(element);\n" +
			"		fifo.enqueue(element);\n" +
			"	}\n" +
			"	\n" +
			"	while(!fifo.isEmpty()) {\n" +
			"		out.println(\"Queue dequeue = \".concat((IString)(queue.dequeue())));\n" +
			"		out.println(\"Fifo peek = \".concat((IString)(fifo.peek())));\n" +
			"		out.println(\"Fifo dequeue\");\n" +
			"		fifo.dequeue();\n" +
			"	}\n" +
			"	\n" +
			"	out.println(\"Program terminated\");	\n" +
			"}\n";
		return new ByteArrayInputStream(contents.getBytes());
	}

	@SuppressWarnings("unused")
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