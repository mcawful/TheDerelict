/**
 * 
 */
package com.revature.thederelict.models;

/**
 * @author Michael McAuliffe
 *
 */
public class Engine extends Room {

	public Engine(String name, String description) {
		super(name, description);
		// TODO Auto-generated constructor stub
	}

	private String desc = "Exposed wiring and angry warnings prove the engine room to have sustained\n"
	+ "considerable damage, if the containment barriers fully enclosing the engine itself did not\n"
	+ "already prove that to be the case.  Sparks snap from exposed panels, and most of the systems\n"
	+ "here are twisted into little more than heaps of crumpled metal.  The thrum of the evacuation\n"
	+ "warning pulses distractingly through the room.";

	public Engine() {
		super("ENGINE", desc)
	}

}
