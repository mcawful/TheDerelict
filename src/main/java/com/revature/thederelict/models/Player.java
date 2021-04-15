/**
 * 
 */
package com.revature.thederelict.models;

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
}
