package com.developer;

interface A {
	
	void show(String name, String lName);
}

//class xvm implements A {
//	
//	public void show() {
//		System.out.println("Hello Google Code In Mentor");
//		
//	}
//	
//}
public class LambdaDemo {
	
	public static void main(String[] args) {
		//		new A() {
		//			public void show() {
		//				System.out.println("Hello Junior Java Developer");
		//				
		//			}
		//		}.show();
		A obj;
		obj = (name, lName) -> System.out.println("Hello " + name + " " + lName);
		
		obj.show("Daud", "Kakumirizi");
		

	}
	
}
