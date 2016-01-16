package org.xtext.example.navigation;

import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

import org.xtext.example.swrtj.AnonimousTrait;
import org.xtext.example.swrtj.BaseTrait;
import org.xtext.example.swrtj.NestedTraitExpression;
import org.xtext.example.swrtj.SwrtjPackage;
import org.xtext.example.swrtj.Trait;
import org.xtext.example.swrtj.TraitExpression;
import org.xtext.example.swrtj.TraitName;
import org.xtext.example.utils.ErrorMessage;

/**
 * This class is a trait expression navigator. It allows to collect results while navigating on the
 * expression, binding the correct method.
 * @author Strocco Fabio
 *
 * @param <E> the methods return type.
 */
public class TraitCicleChecker extends Navigator<Collection<ErrorMessage>> {
	private Set<String> traitNames = new HashSet<String>();
	private String traitName;
	private Trait ownerTrait;
	
	/**
	 * Navigates on the trait and collects the results.
	 * @param trait the trait to navigate.
	 * @return the target result.
	 */
	public Collection<ErrorMessage> navigate(Trait trait) {
		if(trait == null) return defaultConstructor();
		
		TraitExpression expression = trait.getExpression();
		if(expression == null) return defaultConstructor();
		if(traitName == null) traitName = trait.getName();
		if(ownerTrait == null) ownerTrait = trait;
		
		return doNavigate(expression);
	}
	
	/**
	 * Starts the navigation.
	 * @param expression the trait expression.
	 * @return the error messages.
	 */
	protected Collection<ErrorMessage> doNavigate(TraitExpression expression) {
		Collection<ErrorMessage> errorList = defaultConstructor();
		Collection<BaseTrait> traitList = expression.getTraitList();
		
		for(BaseTrait trait : traitList) {
			errorList.addAll(doSwitch(trait));
		}
		
		return errorList;
	}
	
	@Override
	public Collection<ErrorMessage> caseAnonimousTrait(AnonimousTrait trait) {
		return defaultConstructor();
	}
	
	@Override
	public Collection<ErrorMessage> caseTraitName(TraitName trait) {
		Collection<ErrorMessage> errorList = defaultConstructor();
		String name = trait.getTrait().getName();
		
		if(!traitNames.add(name))
			return defaultConstructor();
		else if(traitName.equals(name)) {
			errorList.add(new ErrorMessage("Cyclic trait definition", ownerTrait, SwrtjPackage.TRAIT__NAME));
			return errorList;
		} else return navigate(trait.getTrait());		
	}	
	
	@Override
	public Collection<ErrorMessage> caseNestedTraitExpression(NestedTraitExpression trait) {
		return (trait.getExpression() == null ? defaultConstructor() : doNavigate(trait.getExpression()));
	}	

	@Override
	protected Collection<ErrorMessage> defaultConstructor() {
		return new LinkedList<ErrorMessage>();
	}
}
