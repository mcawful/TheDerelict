/**
 * 
 */
package com.revature.thederelict.models;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;

/**
 * @author Michael McAuliffe
 *
 */
@Data
public class Player {

	private String name;
	
	private List<Item> itemInv;
	
	private List<Key> keyInv;

	/**
	 * @param name
	 */
	public Player(String name) {
		super();
		this.name = name;
		this.itemInv = new ArrayList<>();
		this.keyInv = new ArrayList<>();
	}
	
	
}
