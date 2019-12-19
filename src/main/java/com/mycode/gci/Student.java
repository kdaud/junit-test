package com.mycode.gci;


public class Student {
	public static void main(String[] args) {
		Google obj;
		obj = (name) -> System.out.println(name + " is a Google Code In Mentor 2019");
		obj.codes("Kakumirizi Daud");
		System.out.println();
		printMessage();
		Thread tt = new Thread(() -> printMessage());
		tt.start();
		Thread ts = new Thread(Student::printMessage);
		ts.start();
		
		//		String mycountry="Uganda";
		//		mycountry -> System.out.println(mycountry);
	}
	
	public static void printMessage() {
		System.out.println("Google Summer OF Code 2020");
	}
	
}
