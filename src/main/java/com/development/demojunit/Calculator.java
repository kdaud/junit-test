package com.development.demojunit;


public class Calculator {
	
	CalculatorService service;
	
	public Calculator(CalculatorService service) {
		this.service = service;
	}
	
	public int perfom(int a, int z) {
		return service.add(a, z) * 2;
		//return (a + z) * 2;
	}
	
}
