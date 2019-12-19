package com.development.demojunit;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

public class TestCalculator {
	
	Calculator obj = null;
	
	CalculatorService Service = Mockito.mock(CalculatorService.class);
	
	@Before
	public void setUp() {
		obj = new Calculator(Service);
		
	}
	
	@Test
	public void testPerform() {
		when(Service.add(3, 4)).thenReturn(7);
		assertEquals(14, obj.perfom(3, 4));
		verify(Service).add(3, 4);
		
	}
	
	

}
