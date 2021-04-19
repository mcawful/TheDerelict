package com.revature.thederelict.exceptions;

import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ExceptionTest {
	
	private IncompatibleActionException impcompatibleActionException;
	private InvalidExitException invalidExitException;
	private ItemNotFoundException itemNotFoundException;
	private UnknownActionException unknownActionException;
	
	@Before
	public void setUp(IncompatibleActionException impcompatibleActionException) throws Exception{
		this.impcompatibleActionException = impcompatibleActionException;
	}
	
	@Before
	public void setUp(InvalidExitException invalidExitException) throws Exception{
		this.invalidExitException = invalidExitException;
	}
	
	@Before
	public void setUp(ItemNotFoundException itemNotFoundException) throws Exception{
		this.itemNotFoundException = itemNotFoundException;
	}
	
	@Before
	public void setUp(UnknownActionException unknownActionException) throws Exception{
		this.unknownActionException = unknownActionException;
	}
	
	
	@After
	public void tearDown() throws Exception{
		
	}
	
	@Test
	public void whenExceptionThrown_thenAssertionSucceeds() {
		NumberFormatException impcompatibleActionException = assertThrows(NumberFormatException.class, () ->{
			Integer.parseInt("839@asdf");
		});
		
		String exceptedMessage = "For the action";
		String actualMessage = impcompatibleActionException.getMessage();
		
		assertTrue(actualMessage.contains(exceptedMessage));
	}
}
