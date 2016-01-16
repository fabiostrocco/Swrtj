package org.xtext.example.swrtj.ui.wizards;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
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
import org.eclipse.xpand2.XpandExecutionContextImpl;
import org.eclipse.xpand2.XpandFacade;
import org.eclipse.xpand2.output.Outlet;
import org.eclipse.xpand2.output.OutputImpl;
import org.eclipse.xtend.type.impl.java.JavaBeansMetaModel;
import org.eclipse.xtend.typesystem.emf.EmfMetaModel;
import org.xtext.example.swrtj.SwrtjPackage;

import ProjectWizard.ProjectInfo;
import ProjectWizard.ProjectType;
import ProjectWizard.ProjectWizardFactory;
import ProjectWizard.ProjectWizardPackage;

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

public abstract class SwrtjExampleWizard extends Wizard implements INewWizard {
	private SwrtjProjectWizardPage page;
	protected ProjectType projectName;
	private ISelection selection;

	/**
	 * Constructor for SwrtjProjectWizard.
	 */
	public SwrtjExampleWizard() {
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
		
		OutputImpl output = new OutputImpl();
		output.addOutlet(new Outlet(false, ResourcesPlugin.getWorkspace().getRoot().getDefaultCharset(), null, true, project.getLocation().makeAbsolute().toOSString()));

		XpandExecutionContextImpl execCtx = new XpandExecutionContextImpl(output, null);
		execCtx.getResourceManager().setFileEncoding("UTF-8");
		execCtx.registerMetaModel(new JavaBeansMetaModel());
		execCtx.registerMetaModel(new EmfMetaModel(ProjectWizardPackage.eINSTANCE));

		ProjectInfo info = ProjectWizardFactory.eINSTANCE.createProjectInfo();
		info.setExampleType(projectName);
		XpandFacade facade = XpandFacade.create(execCtx);
		facade.evaluate("org::xtext::example::swrtj::ui::wizards::SwrtjNewProject::main", info);

		project.refreshLocal(IResource.DEPTH_INFINITE, monitor);
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
	
	/**
	 * We will accept the selection in the workbench to see if
	 * we can initialize from it.
	 * @see IWorkbenchWizard#init(IWorkbench, IStructuredSelection)
	 */
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		this.selection = selection;
	}
}