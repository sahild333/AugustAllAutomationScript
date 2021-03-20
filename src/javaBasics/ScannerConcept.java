package javaBasics;

import java.util.Scanner;

public class ScannerConcept {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
//		System.out.println("Provide first name: ");
//		//next() or nextLine() - expecting String values
//		String firstName = scan.nextLine(); 
//		System.out.println("Provide last name: ");
//		String lastName = scan.next();
//		scan.close(); //have to close scan at the end
//		
//		System.out.println("Welcome back "+firstName+" "+lastName+"!");
		
		String DBusername = "mduggal86";
		String DBpassword = "fuckyou123";
		
		System.out.println("Enter username: ");
		String username = scan.next();
		System.out.println("Enter password: ");
		String password = scan.next();
		
		if(username.equals(DBusername) && password.equals(DBpassword)) {
			System.out.println("Welcome "+username+"!");
		}
		else {
			System.out.println("Invalid username or password");
			System.out.println("Please try again");
		}
		
		//Assignment: Login application
		//1. created array for DB credentials
		//2. use scanner to get input credentials
		//3. compare that input credentials with DB credentials in the array
			
	}

}
