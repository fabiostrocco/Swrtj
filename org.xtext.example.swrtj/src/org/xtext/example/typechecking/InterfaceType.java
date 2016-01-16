package org.xtext.example.typechecking;

import org.xtext.example.swrtj.Interface;
import org.xtext.example.utils.Lookup;

/**
 * Represents an inferred type everywhere an interface reference appears in an expression.
 * @author Strocco Fabio
 */
public class InterfaceType extends InterfaceBasedType {
	private Interface interfaceType;
	private Lookup lookup = new Lookup();
	
	/**
	 * Creates a new interface type.
	 * @param interfaceType the interface representing this instance.
	 */
	protected InterfaceType(Interface interfaceType) {
		super((interfaceType != null ? interfaceType.getName() : ""));
		this.interfaceType = interfaceType;
	}
	
	/**
	 * @return all the compatible interfaces, i.e. 
	 * the interface represented by this type and all the interfaces it extends.
	 */
	@Override
	public InterfaceMap getCompatibleInterfaces() {
		InterfaceMap interfaceList = lookup.getAllExtendedInterfaces(interfaceType);
		interfaceList.add(interfaceType);
		
		return interfaceList;
	}
}