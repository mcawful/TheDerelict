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
	
	private List<Item> keyInv;

	/**
	 * @param name
	 */
	public Player(String name) {
		super();
		this.name = name;
		this.itemInv = new ArrayList<>();
		this.keyInv = new ArrayList<>();
	}
	
	/**
	 * 
	 * @param item
	 */
	public void addItem(Item item) {
		this.itemInv.add(item);
	}
	
	/**
	 * 
	 * @param item
	 */
	public void removeItem(Item item) {
		this.itemInv.remove(item);
	}
	
	/**
	 * 
	 * @param key
	 */
	public void addKey(Item key) {
		this.keyInv.add(key);
	}
}
