/**
 * 
 */
package com.revature.thederelict.models;

/**
 * @author Michael McAuliffe
 *
 */
public class Bridge extends Room {

	private static String desc = "Obvious structural damage has been done to the bridge of the vessel,\n"
			+ "with one entire section walled off by emergency breach containment barriers.\n"
			+ "What remains is badly battered and cast into a menacing mien by the pulsing red\n"
			+ "glow of emergency lighting.";

	public Bridge() {
		super("BRIDGE", desc);
	}

	public Bridge(String name, String description) {
		super(name, description);
		// TODO Auto-generated constructor stub
	}
}
