/**
 * 
 */
package com.revature.thederelict.exceptions;

/**
 * @author Michael McAuliffe
 *
 */
public class ItemNotFoundException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2751715014771661213L;

	/**
	 * 
	 */
	public ItemNotFoundException() {
		System.out.println("\n>> I don't know what that thing is.\n");
	}

	/**
	 * 
	 * @param message
	 */
	public ItemNotFoundException(String message) {
		System.out.println(message);
	}
}
