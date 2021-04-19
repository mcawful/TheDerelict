/**
 * 
 */
package com.revature.thederelict.models;

/**
 * @author Michael McAuliffe
 *
 */
public class Lab extends Room {

	private static String desc = "Once the pride and joy of the ship, the massive science lab is now in tatters.\n"
			+ "Expensive equipment, damaged beyond repair by whatever did in the rest of the vessel\n"
			+ "litters the floor on the half of the lab not locked away behind emergency containment\n"
			+ "barriers.  Under the circumstances, what was once the jewel of the ship may now be the\n"
			+ "most dangerous place to be.";

	public Lab() {
		super("LAB", desc);
	}

	public Lab(String name, String description) {
		super(name, description);
		// TODO Auto-generated constructor stub
	}
}
