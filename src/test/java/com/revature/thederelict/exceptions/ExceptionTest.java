package com.revature.thederelict.exceptions;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ExceptionTest {
	
	private IncompatibleActionException impcompatibleActionException;
	
	@Before
	public void setUp(IncompatibleActionException impcompatibleActionException) throws Exception{
		this.impcompatibleActionException = impcompatibleActionException;
	}
	
	@After
	public void tearDown() throws Exception{
		
	}
	
	@Test
	public void whenExceptionThrown_thenAssertionSucceeds() {
		Exception exception = assertThrows(NumberFormatException.class, () ->{
			Integer.parseInt("839@asdf");
		});
		
		String exceptedMessage = "For the action";
		String actualMessage = exception.getMessage();
		
		assertTrue(actualMessage.contains(exceptedMessage));
	}
}
