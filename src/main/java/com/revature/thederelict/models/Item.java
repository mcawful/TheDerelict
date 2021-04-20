/**
 * 
 */
package com.revature.thederelict.models;

import java.util.List;

import com.revature.thederelict.enums.Interaction;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

/**
 * @author Michael McAuliffe
 *
 */
@Data
@NoArgsConstructor
@RequiredArgsConstructor
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
