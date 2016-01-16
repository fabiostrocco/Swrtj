/**
 * 
 */
package org.xtext.example.typechecking;

import java.util.Collection;
import java.util.HashMap;

import org.xtext.example.swrtj.Interface;

/**
 * This class represent a set of mapping from interface name to interface object.
 * @author Strocco Fabio
 */
public class InterfaceMap extends HashMap<String, Interface> {
	private static final long serialVersionUID = -3166038067219438193L;
	
	/**
	 * Creates a new InterfaceMap.
	 */
	public InterfaceMap() {
		super();
	}
	
	/**
	 * Creates a new Interface map from the given collection.
	 * @param interfaceList the initial values of this map.
	 */
	public InterfaceMap(Collection<Interface> interfaceList) {
		super();
		addAll(interfaceList);
	}
	
	/**
	 * Creates a new Interface map from the given collection.
	 * @param interfaceList the initial values of this map.
	 */
	public InterfaceMap(InterfaceMap interfaceList) {
		super();
		addAll(interfaceList);
	}
	
	/**
	 * Adds an interface to the map.
	 * @param i the interface to add
	 * @return <code>true</code> if an interface with the same name doesn't exists,
	 * <code>false</code> otherwise.
	 */
	public boolean add(Interface i) {
		return (put(i.getName(), i) == null);
	}
	
	/**
	 * Adds all the interfaces given as parameter to the map.
	 * @param interfaceList the interface list to add.
	 * @return <code>true</code> if no duplicate exists, <code>false</code> otherwise.
	 */
	public boolean addAll(Collection<Interface> interfaceList) {
		boolean result = true;
		
		for(Interface i : interfaceList) {
			if(!add(i)) result = false;
		}
		
		return result;
	}
	
	/**
	 * Adds all the interfaces given as parameter to the map.
	 * @param interfaceMap the interface list to add.
	 * @return <code>true</code> if no duplicate exists, <code>false</code> otherwise.
	 */
	public boolean addAll(InterfaceMap interfaceMap) {
		return addAll(interfaceMap.values());
	}
	
	/**
	 * Removes the interface with the name of the given argument.
	 * @param i the interface to remove.
	 * @return <code>true</code> if the interface has been removed,
	 * <code>false</code> otherwise.
	 */
	public boolean remove(Interface i) {
		return (super.remove(i.getName()) == null);
	}
	
	/**
	 * Checks if the given interface exists in the map.
	 * @param i the interface to check.
	 * @return <code>true</code> if the interface with the name of one given as parameter exists,
	 * <code>false</code> otherwise.
	 */
	public boolean contains(Interface i) {
		return containsKey(i.getName());
	}
}
