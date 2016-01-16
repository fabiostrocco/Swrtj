package org.xtext.example.navigation;

import org.xtext.example.swrtj.util.SwrtjSwitch;

/**
 * This class represent a general navigator.
 * @author Strocco Fabio
 * @param <E> the result target type.
 */
public abstract class Navigator<E> extends SwrtjSwitch<E> {
	/**
	 * Prepare the navigator for another navigation.
	 * This method must be overridden if the navigator needs to reset local parameters every time.
	 */
	public void clear() {}
	
	/**
	 * Evaluate the given parameter.
	 * @param object the parameter to evaluate.
	 * @return a new default object(with defaultConstructor) if this parameter is
	 * null, the parameter otherwise.
	 */
	protected E evaluate(E object) {
		return (object == null ? defaultConstructor() : object);
	}

	/**
	 * Creates a new default instance for the type E. For instance if E is a List the default constructor
	 * can be new LinkedList() or new ArrayList().
	 * This is used when the start expression is null, and to have null safe object creations.
	 * @return the default insance
	 */
	protected abstract E defaultConstructor();
}
