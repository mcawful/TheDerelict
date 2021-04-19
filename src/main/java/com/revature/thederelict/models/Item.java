/**
 * 
 */
package com.revature.thederelict.models;

import java.util.List;

import com.revature.thederelict.enums.Interaction;

import lombok.Data;
import lombok.NonNull;

/**
 * @author Michael McAuliffe
 *
 */
@Data
public class Item {

	@NonNull
	private String id;
	
	@NonNull
	private String descShort;
	
	@NonNull
	private String descLong;
	
	@NonNull
	private List<Interaction> interactions;
}
