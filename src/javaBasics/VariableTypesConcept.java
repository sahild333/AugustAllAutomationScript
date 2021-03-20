package javaBasics;

public class VariableTypesConcept {
	static int a=50; //class variable - data assigned
	static int b; // class variable - data not assigned
	int c; // instance variable - data not assigned
	int d=20; // instance variable - data assigned

	//variables types - 3 types - location where it is being created
		// 1. Class variable/Static variable - created inside the class but outside any method, static keyword
		// 2. Instance variable - created inside the class but outside any method, no static keyword
		// 3. Local variable - variable created inside a method
		// Arguments - variable without data, created inside round bracket of method
	
	public static void test() {
		
		int a = 10; // local variable; test and main are 2 separate methods; can have same variable (int a=10)
		
	}
	
	//Argument
	public static void test1 (int a) {
		a=10; //a will point towards argument if available, if not it will point towards class variable
		
	}
	
	public static void main(String[] args) {
		
		int a = 10; //variable or assigning variable or creating variable or creating dataType
		int b; // local variable - data not assigned
		//int d = 20;
		
		System.out.println(a); //point towards local variable
		System.out.println(a); // if local variable is not available, class variable will be used (class int a = 50, method int a = 10)
		
		//System.out.println(d); //if local variable is not available - cannot make static reference, variable d is instance variable not class variable

	}

}
