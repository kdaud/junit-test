package com.openmrs.gci;

import java.util.Arrays;
import java.util.List;

public class ArrayDemo {
	
	protected void myArray() {
		List<Integer> myGrade = Arrays.asList(82, 88, 85, 84, 89, 76, 85, 90);
				//ArrayDemo.};
				for (int i = 0; i < myGrade.size(); i++) {
			System.out.println(myGrade.get(i));
					
				}
		for (int i : myGrade) {
			System.out.print(i + " ");
		}
		
	}
	
}
