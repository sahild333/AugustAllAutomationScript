package javaBasics;

public class IfElseConditionConcept {

	public static void main(String[] args) {
		// if-else condition - inserting sense into script to verify - verification point (check point)
		// 1. if-condition - condition provided - if match - then script inside if block will execute otherwise it will not
		// 2. else if-condition - condition provided - if if-condition is not fulfilled then it will come to else if block
		// 3. else-condition - no condition provided - will execute only if if-condition and else if-condition fail
		
		int a=10;
		int b=20;
		int c=10;
		
		//if and else block
		if(a==b) {
			System.out.println("a is equal to b, Test passed");
		}
		else {
			System.out.println("a is not equal to b, Test failed");
		} // only else prints because if condition failed
		
		//if only block - condition fulfilled
		
		if (a==c) {
			System.out.println("a is equal to c, Test passed");
		}
		
		//if only block - condition not fulfilled - nothing prints
		
		if(a!=c) {
			System.out.println("a is not equal to c, Test failed");
			}
		
		//multiple conditions - only prints first correct condition
		
		if (a==b ) {
			System.out.println("a is equal to b");
		}
		else if(a==c) {
			System.out.println("a is equal to c");
		}
		else if (b==c) {
			System.out.println("b is equal to c");
		}
		else {
			System.out.println("a,b and c are different");
		}
		
		//string
		
		String x = "Java";
		String y = "Selenium";
		String z = "java";
		
		//condition 1 - sensitive to upper/lower case
		
		if(x.equals(y)) {
			System.out.println("x is equal to z");
		}
		else {
			System.out.println("x is not equal to z");
		}
		
		//condition 2 - not sensitive to upper/lower case
		
		if(x.equalsIgnoreCase(z)) {
			System.out.println("x is equal to z");
		}
		else {
			System.out.println("x is not equal to z");
		}
		
		String name1 = "John";
		int age1 = 30;
		String name2 = "Joe";
		int age2 = 25;
		
		if (name1.equalsIgnoreCase(name2)) {
			System.out.println(name1+ "and" +name2+ "have same name");
		}
		else {
			System.out.println(name1+ " and " +name2+ " are different customers.");
		}
		
		// Customer Tom - username tom12 & password tom@123
		// Registered customer
		// After registration - login credentials - stored in Database
		// Login - username tom12 & password tom@123
		// if-else condition tom12==tom12 && tom@123==tom@123 then login should happen
	
		String inputUsername = "tom12";
		String inputPassword = "tom@123";
		String DBusername = "Tom12";
		String DBpassword = "tom@123";
		
		if(inputUsername.equals(DBusername) && inputPassword.equals(DBpassword)) {
			System.out.println("Credentials are valid");
			System.out.println("Welcome Tom!");
		}
		else {
			System.out.println("Username or password is incorrect");
			System.out.println("Access Denied");
		}
	
	//Assignment: logical operators &&, ||, !
//		1. create conditon for matching username but different password
//		2. create condition for different username but matching password
		// java Basic operators
		
//		String email= "john@gmail.com";
//		String password= "Johnisgreat!";
//		String emailDB= "john@gmail.com";
//		String passwordDB= "JohnisGreat!";
//		
//		if (email.equals(emailDB) && password.equals(passwordDB)) {
//			System.out.println("Login Successful");
//			System.out.println("Welcome John!");
//		}
//		else {
//			System.out.println("Email or Password is incorrect");
//			System.out.println("Please try again.");
//		}
		
		String email= "john@gmail.com";
		String password= "JohnisGreat!";
		String emailDB= "John@gmail.com";
		String passwordDB= "JohnisGreat!";
//		
//		if (email.equals(emailDB) && password.equals(passwordDB)) {
//			System.out.println("Login Successful");
//			System.out.println("Welcome John!");
//		}
//		else  {
//			System.out.println("Email or password is incorrect.");
//			System.out.println("Please try again.");
//		}
		
		if (email.equals(emailDB) && password.equals(passwordDB) || email.equalsIgnoreCase(emailDB) && password.equals(passwordDB)) {
			System.out.println("Login Successful");
			System.out.println("Welcome John");
		}
		else {
			System.out.println("Invalid Email or Password");
			System.out.println("Please try again");
		}
	
	
	
	}

}
