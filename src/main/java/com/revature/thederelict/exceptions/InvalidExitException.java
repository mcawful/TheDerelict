/**
 * 
 */
package com.revature.thederelict.exceptions;

/**
 * @author Michael McAuliffe
 *
 */
public class InvalidExitException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7951802008820736471L;

	/**
	 * 
	 */
	public InvalidExitException() {
		System.out.println("\n>> You cannot go that way from here.\n");
	}
	
	/**
	 * @param message
	 */
	public InvalidExitException(String message) {
		System.out.println(message);
	}
}
