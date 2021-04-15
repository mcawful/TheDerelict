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
public class Key {

	private int id;
	
	private String descShort;
	
	private String descLong;
	
	private int size;
	
	private Color color;
}
