/**
 * 
 */
package com.revature.thederelict.util;

import java.util.HashSet;
import java.util.Set;

import com.revature.thederelict.enums.Exit;
import com.revature.thederelict.exceptions.InvalidExitException;
import com.revature.thederelict.models.Room;

import lombok.experimental.UtilityClass;

/**
 * @author Michael McAuliffe
 *
 */
@UtilityClass
public class NavRouter {

	/**
	 * 
	 */
	private Set<Room> rooms = new HashSet<>();

	/**
	 * 
	 * @param room
	 * @return
	 */
	public void addRoom(Room room) {
		rooms.add(room);
	}

	/**
	 * 
	 * @param exit
	 * @return
	 * @throws InvalidExitException
	 */
	public Room navigate(Room currentRoom, Exit exit) throws InvalidExitException {
		
		if(currentRoom.getExits().contains(exit)) {
			for(Room room : rooms)
				if(room.getName().equals(exit.toString()))
					return room;
		}
		else
			throw new InvalidExitException();
		
		return currentRoom;
	}
}
