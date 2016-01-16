package org.xtext.example.typechecking;

import java.util.Collection;
import java.util.LinkedList;

import org.eclipse.emf.ecore.EObject;
import org.xtext.example.swrtj.AnonimousTrait;
import org.xtext.example.swrtj.Class;
import org.xtext.example.swrtj.Element;
import org.xtext.example.swrtj.Field;
import org.xtext.example.swrtj.FieldName;
import org.xtext.example.swrtj.Method;
import org.xtext.example.swrtj.MethodName;
import org.xtext.example.swrtj.This;
import org.xtext.example.swrtj.TraitElement;
import org.xtext.example.utils.Lookup;

/**
 * Represents an infered type everywhere a this reference appears in an expression within a trait.
 * @author Strocco Fabio
 */
public class ThisType extends ExpressionType {
	private This thisType;
	private Lookup lookup = new Lookup();
	
	/**
	 * Creates a new instance of this class.
	 * @param thisType the this rule associated with this type.
	 */
	protected ThisType(This thisType) {
		super("this type");
		this.thisType = thisType;
	}
	
	/**
	 * Returns all the fields invokable by the specified type.
	 * @return a list containing all the fields provided by the specified interface.
	 */
	@Override
	public Collection<FieldName> getInvokableFields() {
		EObject owner = lookup.getOwner(thisType);
		
		if(owner instanceof AnonimousTrait) {
			AnonimousTrait trait = (AnonimousTrait)owner;
			Collection<FieldName> fieldNames = new LinkedList<FieldName>();
			Collection<TraitElement> elements = trait.getDefinitionList();
			
			for(TraitElement element : elements) {
				if(element instanceof Field) {
					fieldNames.add(((Field)element).getFieldRef());
				}
			}
			return fieldNames;
		}
		
		Element container = (Element)owner;
		
		//'this' is in a trait
		/*if(container.getConstruct().equals("trait")) {
			Trait ownerTrait = (Trait)container;
			return lookup.getRequiredFields(ownerTrait).values();
		}*/
		
		//'this' is in a constructor
		if(container.getConstruct().equals("class")) {
			Class ownerClass = (Class)container;
			return lookup.getProvidedFields(ownerClass.getRecordExpression()).values();
		}

		return new LinkedList<FieldName>();
	}
	
	/**
	 * Returns all the methods invokable by the specified type.
	 * @return a list containing all the methods provided by the specified interface.
	 */
	@Override
	public Collection<MethodName> getInvokableMethods() {
		EObject owner = lookup.getOwner(thisType);
		
		if(owner instanceof AnonimousTrait) {
			AnonimousTrait trait = (AnonimousTrait)owner;
			Collection<MethodName> methodNames = new LinkedList<MethodName>();
			Collection<TraitElement> elements = trait.getDefinitionList();
			
			for(TraitElement element : elements) {
				if(element instanceof Method) {
					methodNames.add(((Method)element).getMethodRef());
				}
			}
			return methodNames;
		}
		
		Element container = (Element)lookup.getOwner(thisType);
		
		//'this' is in a trait
		/*if(container.getConstruct().equals("trait")) {
			Trait ownerTrait = (Trait)container;
			return lookup.getMethods(ownerTrait).values();
		}*/
		
		//'this' is in a constructor
		if(container.getConstruct().equals("class")) {
			Class ownerClass = (Class)container;
			return lookup.getProvidedMethods(ownerClass.getTraitExpression()).values();
		}

		return new LinkedList<MethodName>();
	}
	
	/**
	 * Checks if <code>this</code> is subtype of the given infered type. If the types are not comparable
	 * they will not be considered in subtype relation.
	 * @param type the type to compare.
	 * @return always <code>true</code> because this in trait can be subtype of every interfaces(a constraint will
	 * be collected)
	 * @throws IllegalStateException if this is not in a trait or class.
	 * @see TypeChecker
	 */
	@Override
	public boolean isSubtype(ExpressionType type) {	
		EObject owner = lookup.getOwner(thisType);
		if(type.isThis()) return true;
		
		if(owner instanceof AnonimousTrait) {
			return (type.isInvokable());
		}
		
		Element container = (Element)owner;
		
		if(container.getConstruct().equals("trait")) {
			return (type.isInvokable());
		}
		else if(container.getConstruct().equals("class")) {
			ExpressionType equivalentThisType = ExpressionType.createInstance((Class)container);
			return equivalentThisType.isSubtype(type);
		}
		
		return false;
	}
	
	/**
	 * Checks if <code>this</code> can be converted to the type given as parameter.
	 * @param type the type to cast this type.
	 * @return <code>true</code> if this expression type is convertible to the type given as
	 * parameter, <code>false</code> otherwise.
	 */
	@Override
	public boolean canCastTo(ExpressionType type) {
		EObject owner = lookup.getOwner(thisType);
		
		if(owner instanceof Element && ((Element)owner).getConstruct().equals("class")) {
			return super.canCastTo(type);
		}
		
		return false;
	}

	/**
	 * Returns null since this type is not primitive.
	 * @return <code>null</code>
	 */
	public String getPrimitiveType() {
		return null;
	}
	
	/**
	 * Checks if this expression type represent this.
	 * @return <code>true</code>.
	 */
	@Override
	public boolean isThis() {
		return true;
	}
}