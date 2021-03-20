package javaBasics;

public class MethodOverloadingConcept { //important
	
	//void - return type (returning nothing)
	//test - method name
	//{ body of method }
	
	
	//METHOD OVERLOADING- creating methods with same name but different number or types of argument
	
	void test() { //method with no argument
		
	}
	
//	void test() { //duplicate methods not allowed in Java
//		}
	
	void test(int a) { // method with same name with an argument is allowerd
		}
	
//	void test(int a) { //duplicate method with same name and type of argument not allowed
//		}
	
	void test(String a) { //method with same name and number of argument is allowed if type of variable is different
	}
	
	void test (int a, String b) {
		}

	public static void main(String[] args) {
		

	}

}
