/**
 * 
 */
package com.revature.thederelict;

import com.revature.thederelict.enums.Exit;
import com.revature.thederelict.models.Bridge;
import com.revature.thederelict.models.Engine;
import com.revature.thederelict.models.Hall;
import com.revature.thederelict.models.Lab;
import com.revature.thederelict.models.Pod;
import com.revature.thederelict.models.Room;
import com.revature.thederelict.util.NavRouter;

import lombok.experimental.UtilityClass;

/**
 * @author Michael McAuliffe
 *
 */
@UtilityClass
public class MainGameLoop {

	// Room initialization
	private Room bridge = new Bridge("name", "description");
	private Room hall = new Hall("name", "description");
	private Room lab = new Lab("name", "description");
	private Room engine = new Engine("name", "description");
	private Room pod = new Pod("name", "description");
	
	// TODO: make keys and player object
	
	public void startGameLoop() {
		
		// Exits to the Hall
		bridge.addExit(Exit.HALL);
		pod.addExit(Exit.HALL);
		lab.addExit(Exit.HALL);
		engine.addExit(Exit.HALL);
		
		// Hall exits
		hall.addExit(Exit.BRIDGE);
		hall.addExit(Exit.POD);
		hall.addExit(Exit.LAB);
		hall.addExit(Exit.ENGINE);
		
		// Load Room objects into the NavRouter
		NavRouter.addRoom(bridge);
		NavRouter.addRoom(hall);
		NavRouter.addRoom(lab);
		NavRouter.addRoom(engine);
		NavRouter.addRoom(pod);
		
		// TODO: add initializers  that take place BEFORE the game loop
		
		/*
		 * Indicates if the game loop should continue
		 */
		boolean continueLoop = true;
		
		while(continueLoop) {
			// TODO: game loop logic should live in here
		}
		
		// TODO: add initializers that take place AFTER the game loop
	}
}
