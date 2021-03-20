package javaBasics;

public class ConstructorConcept {
	
	//Constructor - method that carries name of the class
	///does not need return type
	//can not be called
	//class is instantiated, constructor will execute first
	//Constructor used when you need code executed without having to call it
	//default constructed created by java if not defined
	
	ConstructorConcept() { // Constructor overloading
		System.out.println("I am in constructor with no parameter");
	}
	
	ConstructorConcept(String a) {
		System.out.println("I am in constructor with parameter");
	}
	
	private void test() { // Method overloading
		System.out.println("I am test method");
	}
	
	private void test(String a) {
		System.out.println("I am in test method with argument: "+a);
	}
	
	public static void main(String[] args) {
		ConstructorConcept cc = new ConstructorConcept(); //object of class with no parameter-constructor with no parameter will be called
		
		ConstructorConcept cc1 = new ConstructorConcept("Hello World"); //object of class with parameter-constructor with parameter will be called
		
		cc1.test();
		
		cc1.test("Good day");

	}

}
