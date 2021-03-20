package javaBasics;

public class voidKeyword {
	
	// void = return type which is returning nothing - instead of void = String, int, boolean...
	
	public static void test1() {
		int i = 10 + 20;
	}
	
	public static int test2() {
		int i = 10 + 20;
		return i;
	}
	
	public static void test3() {
		int i = 30 + 20;
		System.out.println(i);
	}

	public static void main(String[] args) {
		test1(); //printing nothing and returning nothing
	//	System.out.println(test1()); // error - no return type associated with method
		System.out.println(test2()); // printing nothing but returning value
		test3(); // printing something but returning nothing
	}

}
