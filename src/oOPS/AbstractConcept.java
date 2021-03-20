package oOPS;

public abstract class AbstractConcept {

	// Abstraction - is the quality of dealing with ideas rather than events / different than usual
	
	// Abstract class VS class
	// 1. class can't have abstract method
	// 2. abstract class can have at least one abstract method
	// 3. abstract class can have non-abstract methods
	// 4. can not create object of abstract class
	// 5. if abstract class is being inherited, then abstract method needs to be implemented
	
	public void test1() { //non-abstract method
		System.out.println("test1");
	}
	
	public void test2() {
		System.out.println("test2");
	}
	
	abstract void test3(); // abstract method (no curly braces/body required)
	
	
	
	public static void main(String[] args) {
		//AbstractConcept ac = new AbstractConcept(); //can't instantiate (create object) abstract class 

	}

}
