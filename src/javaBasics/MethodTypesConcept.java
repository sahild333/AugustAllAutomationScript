package javaBasics;

public class MethodTypesConcept {
	
	// Method types = static & non-static
	// Method types = void keyword - non-returning method/ void is replaced by some data types - returning method
	// Method types = presence of argument 
	
	void test1() { //method with no argument
		
	}
	
	void test2(int i) { // method with one argument
		
	}
	
	void test3(int i, int j, String a) { // method with multiple arguments
		
	}
	
	public static void addition1() {
		int b = 30;
		int c = 50;
		int a = b + c;
		System.out.println(a);
	}
	
	public static void addition2(int b, int c) {
		int a = b + c;
		System.out.println(a);
	}
	
	public int substraction(int a, int b, int c) {
		int x = a-b-c;
		return x;
	}
	
	
	public static void main(String[] args) {
		addition1();
//		addition2(); // not allowed to call method with argument blank
		addition2(100,200);
		addition2(12213,231432);
		
		MethodTypesConcept mtc = new MethodTypesConcept(); //have to create object (static non static)
		
		System.out.println(mtc.substraction(1000, 50, 435));

	}

}
