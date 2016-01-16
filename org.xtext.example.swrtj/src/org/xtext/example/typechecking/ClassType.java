package org.xtext.example.typechecking;

import java.util.*;

import org.xtext.example.swrtj.*;
import org.xtext.example.swrtj.Class;
import org.xtext.example.utils.*;

/**
 * Represents an inferred type everywhere a class reference appears in an expression.
 * @author Strocco Fabio
 */
public class ClassType extends InterfaceBasedType {
	private Class classType;
	private Lookup lookup = new Lookup();
	
	/**
	 * Creates a new class type.
	 * @param classType the class representing this instance.
	 */
	protected ClassType(Class classType) {
		super("class type " + (classType != null ? classType.getName() : ""));
		this.classType = classType;
	}

	/**
	 * Returns all the compatible interfaces for this class.
	 * @return all the compatible interfaces for this class.
	 */
	@Override
 	public InterfaceMap getCompatibleInterfaces() {
		InterfaceMap compatibleInterfaces = super.getCompatibleInterfaces();
		Collection<Interface> implementsList = lookup.getImplementedInterfaces(classType).values();
		
		for(Interface i : implementsList) {
			compatibleInterfaces.add(i);
			compatibleInterfaces.addAll(lookup.getAllExtendedInterfaces(i));
		}
		
		return compatibleInterfaces;
  	}
}