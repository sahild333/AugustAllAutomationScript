package javaBasics;

public class ObjectConcept {
	
	static int legs = 4; //state
	static int eyes = 2;
	static String name = "Tom";
	
	public static void bark () {
		System.out.println(name+ " can bark. ");
	}
	
	public static void run () {
		System.out.println(name+" with "+legs+" legs and "+eyes+" eyes can run. ");
	}

	public static void main(String[] args) {
		// java - programming language - Object Oriented Programming language (OOPS language)
		// Object - something that has state and behavior
		          // state - variables and behavior - methods/functions
		//Object, Dog - types of dogs behavior - bark/walk/run/eat
		                
						//  object
		ObjectConcept oc = new ObjectConcept(); // object of the class
		//referring class referenceName = new (keyword) object();
		
		System.out.println(oc.name);
		oc.bark();
		oc.run();
		

	}

}
