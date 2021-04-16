/**
 * 
 */
package com.revature.thederelict.exceptions;

import com.revature.thederelict.enums.Interaction;

/**
 * @author Michael McAuliffe
 *
 */
public class IncompatibleActionException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3065849505255005339L;

	/**
	 * 
	 * @param action
	 * @param itemName
	 */
	public IncompatibleActionException(Interaction action, String itemName) {
		System.out.println("\n>> Just how do you plan to " + action + "the" + itemName + "...?\n");
	}

	/**
	 * @param message
	 */
	public IncompatibleActionException(String message) {
		System.out.println(message);
	}
}
