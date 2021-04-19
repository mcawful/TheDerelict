/**
 * 
 */
package com.revature.thederelict.models;

/**
 * @author Michael McAuliffe
 *
 */
public class Hall extends Room {

	public Hall(String name, String description) {
		super(name, description);
		// TODO Auto-generated constructor stub
	}

	private String desc = "The main corridor through the ship is in little better\n"
	+ "shape than the bridge, though fortunately, there is less detritus decorating\n"
	+ "the floors.  Most of the main exits appear to have been blocked off by the\n"
	+ "emergency containment systems.  Emergency lighting near the floor indicates\n"
	+ "the location of the escape pod.";

	public Hall() {
		super("HALL", desc)
	}

}
