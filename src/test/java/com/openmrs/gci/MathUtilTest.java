package com.openmrs.gci;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MathUtilTest {
	
	MathsUtils math = new MathsUtils();
	
	@Test
	public void testAdd() {
		assertEquals(4, math.add(2, 2));
		
	}
	

	@Test
	public void testComputeCircleArea() {
		assertEquals(40, math.computeCircleArea(5.0));
	}
	
}

