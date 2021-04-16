/**
 * 
 */
package com.revature.thederelict.util;

import com.revature.thederelict.enums.Interaction;
import com.revature.thederelict.exceptions.UnknownActionException;

/**
 * @author Michael McAuliffe
 *
 */
public class InputParser {

	public void parse(String input) throws Exception {
		
		String[] actionItem = input.toUpperCase().split("\s");
		
		if(actionItem.length == 0)
			throw new UnknownActionException("\n>> Please use your words...\n");
		
		try {
			Interaction.valueOf(actionItem[0]);
		} catch (IllegalArgumentException e) {
			throw new UnknownActionException();
		}
	}
}
