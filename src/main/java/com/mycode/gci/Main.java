package com.mycode.gci;

import java.util.Arrays;
import java.util.List;

public class Main {
	
	public static void main(String[] args) {
		//		Thread myThread = new Thread(DataStructures::myCode);
		//		myThread.start();
		List< String> myList = Arrays.asList("Java", "PHP","Python","C++","C#","Swift");
		
		myList.forEach(s -> System.out.println(s));
		System.out.println("------");
		myList.forEach(System.out::println);
	}
}
