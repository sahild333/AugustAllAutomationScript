package javaBasics;

public class StaticVsNonStaticConcept {
	
	static int a = 10; //class variable/static variable
	static int b = 20;
	int c = 30; // instance variable/non-static variable
	int d = 40;
	
	public static void addition() { // static method
		System.out.println("Addition of a and b: " +(a+b)); //option 1
		//System.out.println(c+d);//not allowed - static non-static mismatch
		int c = StaticVsNonStaticConcept.a+StaticVsNonStaticConcept.b; //option 2
		System.out.println("Addition of a and b using class name: " +c);
		
		StaticVsNonStaticConcept snc = new StaticVsNonStaticConcept(); //object of class
		int e = snc.a+snc.b; //option 3
		System.out.println("Addition of a and b with objectRefName: " +e);
		
		//System.out.println(c+d); // not allowed - direct calling
		//StaticVsNonStaticConcept.c+StaticVsNonStaticConcept.d; // not allowed - calling with class name
		int f = snc.c+snc.d;  // only option allowed
		System.out.println("Addition of c and d with objectRefName: " +f);
		
		
		//in order to print anything from this method, have to refer "addition()" in main string

				
	}
	
	public void subtraction() { // non-static method
		
	}

	public static void main(String[] args) { //main method - default static method
		
		// static method/variable - can be called directly or can be called with use of className or can be called with the use of objectReferenceName
		// non-static method/variable - can only be called by objectReferenceName
		// if not followed - static and non-static mismatch error or warning will be displayed
		
		addition(); //option 1
		StaticVsNonStaticConcept.addition(); //option 2
		
		
		
	}

}
