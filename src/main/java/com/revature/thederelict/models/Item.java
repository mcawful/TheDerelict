/**
 * 
 */
package com.revature.thederelict.models;

import java.util.List;

import com.revature.thederelict.enums.Interaction;

import lombok.Data;

/**
 * @author Michael McAuliffe
 *
 */
@Data
public abstract class Item {

	private String id;
	
	private String descShort;
	
	private String descLong;
	
	private List<Interaction> interactions;
}
