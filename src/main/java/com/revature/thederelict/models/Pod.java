/**
 * 
 */
package com.revature.thederelict.models;

/**
 * @author Michael McAuliffe
 *
 */
public class Pod extends Room {

	public Pod(String name, String description) {
		super(name, description);
		// TODO Auto-generated constructor stub
	}

	private String desc = "The ship\'s escape pod is small, intended for only one occupant, but as you are the\n"
	+ "only person on your ship, that should be more than sufficient.  A sealed supply cache set\n"
	+ "into the wall contains food, water, and emergency provisions sufficient to last for almost\n"
	+ "two months - longer if you\'re careful - and will open after the pod is launched.  Sealed\n"
	+ "into another wall is a sleeping pallet, while a third contains basic hygiene necessities.\n"
	+ "All of these panels are locked away behind the lauch sequence to preserve space and can be\n"
	+ "closed or opened as needed once the pod has been ejected from the ship.";

	public Pod() {
		super("POD", desc)
	}

}
