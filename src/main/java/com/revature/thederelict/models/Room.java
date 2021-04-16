/**
 * 
 */
package com.revature.thederelict.models;

import java.util.ArrayList;
import java.util.List;

import com.revature.thederelict.enums.Exit;

import lombok.Data;

/**
 * @author Michael McAuliffe
 *
 */
@Data
public abstract class Room {

	private final String name;
	
	private final String description;
	
	private List<Item> inventory;
	
	private List<Exit> exits;

	/**
	 * @param name
	 * @param description
	 */
	protected Room(String name, String description) {
		super();
		this.name = name;
		this.description = description;
		this.inventory = new ArrayList<>();
		this.exits = new ArrayList<>();
	}
	
	
}
