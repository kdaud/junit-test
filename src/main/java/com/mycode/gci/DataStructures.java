package com.mycode.gci;

import java.util.ArrayList;
import java.util.List;

public class DataStructures {
	
	public void myCode() {
		List<Character> myGrade = new ArrayList<Character>();
		myGrade.add('A');
		myGrade.add('A');
		myGrade.add('A');
		myGrade.add('A');
		myGrade.add('A');
		myGrade.add('A');
		myGrade.add('A');
		myGrade.add('B');
		for (int i = 0; i < myGrade.size(); i++) {
			System.out.println(myGrade.get(i));
		}
	}
	
}
