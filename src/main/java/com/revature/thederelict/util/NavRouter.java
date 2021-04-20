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
	 * @param currentRoom
	 * @param exit
	 * @return
	 * @throws InvalidExitException
	 */
	public Room navigate(Room currentRoom, Exit exit) throws InvalidExitException {

		return rooms.stream()
				.filter(room -> currentRoom.getExits().contains(exit) && room.getName().equals(exit.toString()))
				.findFirst().orElseThrow(InvalidExitException::new);

	}
}
