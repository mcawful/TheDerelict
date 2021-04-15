/**
 * 
 */
package com.revature.thederelict.models;

import java.util.List;

import com.revature.thederelict.enums.Exit;

import lombok.Data;

/**
 * @author Michael McAuliffe
 *
 */
@Data
public abstract class Room {

	private String name;
	
	private String description;
	
	private List<Item> inventory;
	
	private List<Exit> exits;
}
