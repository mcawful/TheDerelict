/**
 * 
 */
package com.revature.thederelict.exceptions;

/**
 * @author Michael McAuliffe
 *
 */
public class UnknownActionException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1433690639328357567L;

	/**
	 * 
	 */
	public UnknownActionException() {
		System.out.println("\n>> I can't understand what you're trying to do.\n");
	}
	
	/**
	 * 
	 * @param message
	 */
	public UnknownActionException(String message) {
		System.out.println(message);
	}
}
