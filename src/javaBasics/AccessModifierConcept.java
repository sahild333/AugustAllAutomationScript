package javaBasics;

public class AccessModifierConcept {
	
	//same class all modifiers are accessible
	//different class in same package - can access all modifiers EXCEPT private
	//class in different package - can access only public
	
	//	4 types - Access Modifiers - Restricting access of a class
	//	Default - Visible to the package, the default. No modifiers are needed. - can be accessed in same class/class in same package but not in class different package
	//	Private - Visible to the class only (private). - can only be accessed within the class
	//	Public - Visible to the world (public). can be accessed in same class/class in same package/class in different package
	//	Protected - Visible to the package and all subclasses (protected).

	//default vs protected - protected property can also be accessed in subClasses/ default can't be accessed in subClasses
	
	
	public static String a = "Hi";
	public String b = "Hello";
	static String c = "Welcome";
	private static String d = "Bye";
	protected static String e = "Goodnight";
	
	public static void testMethod() {
		System.out.println("Hello World");
	}
	
	public static void testMethodTwo() {
		System.out.println("Hello World");
	}
	
	static void testMethodThree() {
		System.out.println("I am in default method");
	}
	
	private static void testMethodFour() {
		System.out.println("I am in private method");
	}
	
	protected static void testMethodFive() {
		System.out.println("I am in protected method");
	}
			
	public static void main(String[] args) {
		System.out.println(a);
		testMethod();
		testMethodTwo();
		testMethodThree();
		testMethodFour();
		testMethodFive();
		
	}

}
