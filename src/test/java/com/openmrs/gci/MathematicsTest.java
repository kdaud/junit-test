package com.openmrs.gci;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MathematicsTest {
	
	Mathematics Object = new Mathematics("Pure Mathematics");
	
	@Test
	public void testMath() {
		assertEquals("Pure Mathematics", Object.getSubject(), " This test should pass");
		
	}
	
}
