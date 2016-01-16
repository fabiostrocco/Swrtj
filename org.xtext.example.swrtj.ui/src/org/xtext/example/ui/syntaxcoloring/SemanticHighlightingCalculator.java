package org.xtext.example.ui.syntaxcoloring;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.parsetree.AbstractNode;
import org.eclipse.xtext.parsetree.CompositeNode;
import org.eclipse.xtext.parsetree.LeafNode;
import org.eclipse.xtext.parsetree.NodeAdapter;
import org.eclipse.xtext.parsetree.NodeUtil;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightedPositionAcceptor;
import org.eclipse.xtext.ui.editor.syntaxcoloring.ISemanticHighlightingCalculator;
import org.xtext.example.swrtj.FieldAccess;
import org.xtext.example.swrtj.File;
import org.xtext.example.swrtj.SwrtjPackage;

/**
 * Performs semantic highlighting (highlight differently field names
 * in all field selections expressions)
 * @author Strocco Fabio
 */
public class SemanticHighlightingCalculator implements
		ISemanticHighlightingCalculator {

	public void provideHighlightingFor(final XtextResource resource,
			IHighlightedPositionAcceptor acceptor) {
		if (resource == null)
			return;
		if(resource.getContents().isEmpty())
			return;
		File program = (File) resource.getContents().get(0);

		// retrieve all the field selections in a program
		List<FieldAccess> fieldSelections = EcoreUtil2.getAllContentsOfType(
				program, FieldAccess.class);
		for (FieldAccess fieldSelection : fieldSelections) {
			// retrieve the node representing the field name in field selection
			LeafNode nodeToHighlight = getFirstFeatureNode(fieldSelection,
					SwrtjPackage.Literals.FIELD_ACCESS__FIELD.getName());
			if(nodeToHighlight == null) return;
			// highlight the field reference (field name in a field selection)
			acceptor.addPosition(nodeToHighlight.getOffset(), nodeToHighlight
					.getLength(), SemanticHighlightingConfiguration.FIELD_REF);
		}
	}

	/**
	 * Taken from {@link http://blogs.itemis.de/stundzig/archives/467}.
	 * 
	 * Adapted from Sebastian Zarnekow's semantic highlighting implementation
	 * navigate to the parse node corresponding to the semantic object and fetch
	 * the leaf node that corresponds to the first feature with the given name.
	 * 
	 * @param semantic
	 * @param feature
	 * @return
	 */
	public LeafNode getFirstFeatureNode(EObject semantic, String feature) {
		NodeAdapter adapter = NodeUtil.getNodeAdapter(semantic);
		if (adapter != null) {
			CompositeNode node = adapter.getParserNode();
			if (node != null) {
				if (feature == null)
					return null;
				for (AbstractNode child : node.getChildren()) {
					if (child instanceof LeafNode) {
						if (feature.equals(((LeafNode) child).getFeature())) {
							return (LeafNode) child;
						}
					}
				}
			}
		}
		return null;
	}

}