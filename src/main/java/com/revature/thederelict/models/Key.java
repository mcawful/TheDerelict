/**
 * 
 */
package com.revature.thederelict.models;

import com.revature.thederelict.enums.Color;

import lombok.Data;

/**
 * @author Michael McAuliffe
 *
 */
@Data
public class Key extends Item {
	
	private int size;
	
	private Color color;

	public Key(String id, String descShort, String descLong, List<Interaction> interactions, int size, Color color) {
		super(id, descShort, descLong, interactions);
		this.size = size;
		this.color = color;
	}
}
