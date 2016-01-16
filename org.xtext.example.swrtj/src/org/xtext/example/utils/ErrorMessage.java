package org.xtext.example.utils;

import org.eclipse.emf.ecore.*;

/**
 * This class Represent an error message.
 * @author Strocco Fabio
 */
public class ErrorMessage {
  	private String message;
  	private String errorType;
  	private EObject source;
  	private Integer feature;
  	private boolean isWarning;
  	
  	/**
  	 * Creates a new object of this class.
  	 * @param message the error message.
  	 * @param errorType the error type used for the quickfix.
  	 * @param source the source in which highlight the error.
  	 * @param feature the feature to highlight.
  	 * @param isWarning indicates if this is a warning message.
  	 */
  	public ErrorMessage(String message, String errorType, EObject source, Integer feature, boolean isWarning) {
  		this.message = message;
  		this.errorType = errorType;
  		this.source = source;
  		this.feature = feature;
  		this.isWarning = isWarning;
  	}
  	
  	/**
  	 * Creates a new object of this class.
  	 * @param message the error message.
  	 * @param errorType the error type used for the quickfix.
  	 * @param feature the feature to highlight.
  	 * @param isWarning indicates if this is a warning message.
  	 */
  	public ErrorMessage(String message, Integer feature, boolean isWarning) {
  		this(message, null, null, feature, isWarning);
  	}
  	
  	/**
  	 * Creates a new object of this class.
  	 * @param message the error message.
  	 * @param source the source in which highlight the error.
  	 * @param isWarning indicates if this is a warning message.
  	 */
  	public ErrorMessage(String message, EObject source) {
  		this(message, null, source, null, false);
  	}
  	
  	/**
  	 * Creates a new object of this class.
  	 * @param message the error message.
  	 * @param source the source in which highlight the error.
  	 * @param feature the feature to highlight.
  	 * @param isWarning indicates if this is a warning message.
  	 */
  	public ErrorMessage(String message, EObject source, Integer feature) {
  		this(message, null, source, feature, false);
  	}
  	
  	/**
  	 * Creates a new object of this class.
  	 * @param message the error message.
  	 * @param errorType the error type used for the quickfix.
  	 * @param source the source in which highlight the error.
  	 * @param feature the feature to highlight.
  	 */
  	public ErrorMessage(String message, String errorType, EObject source, Integer feature) {
  		this(message, errorType, source, feature, false);
  	}
  	
  	/**
  	 * Creates a new object of this class.
  	 * @param message the error message.
  	 * @param feature the feature type.
  	 */
  	public ErrorMessage(String message, Integer feature) {
  		this(message, null, null, feature, false);
  	}
  	  	
  	/**
  	 * Creates a new object of this class.
  	 * @param message the error message.
  	 * @param feature the feature type.
  	 */
  	public ErrorMessage(String message) {
  		this(message, null, null);
  	}

	/**
	 * Returns the error message.
	 * @return the error message.
	 */
	public String getMessage() {
		return message;
	}
	
	/**
	 * Returns the error type used for the quickfix.
	 * @return the error type used for the quickfix.
	 */
	public String getErrorType() {
		return errorType;
	}
	
	/**
	 * Returns the source in which highlight the error.
	 * @return the source in which highlight the error.
	 */
	public EObject getSource() {
		return source;
	}

	/**
	 * Returns the feature to highlight.
	 * @return the feature to highlight.
	 */
	public Integer getFeature() {
		return feature;
	}
	
	/**
	 * Checks if the current error message is a warning.
	 * @return <code>true</code> if this error message is a warning, <code>false</code> otherwise.
	 */
	public boolean isWarning() {
		return isWarning;
	}
}