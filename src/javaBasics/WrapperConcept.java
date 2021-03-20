package javaBasics;

import java.util.Scanner;

public class WrapperConcept {

	public static void main(String[] args) {
		// Wrapper Concept - converting one datatype to different
		//Eg. taking in salary data in String - 9000, 9000.24, $9000, 900 dollars
		// Convert salary into integer/numerical dataTypes - math
		//Eg. DOB - String 06/16/1990, 06-06-1990
		
		int a = 100;
		String b = "200";
		
		System.out.println(a+b); // doesn't add because one in string one is int
		
		//use .parseInt() to convert string to int
		
		int integerB = Integer.parseInt(b); //converting string to int
		System.out.println(a+integerB);
		
		//use .valueOf() to convert int/boolean/float/double to String
		String convertedA = String.valueOf(a);
		System.out.println("Number of characters in 100: "+convertedA.length());
	
		long c = 8574663722934475L;
		String convertedC = String.valueOf(c);
		int numberofIndexC = convertedC.length();
		if(numberofIndexC==16) {
			System.out.println("Valid credit card");
		}
		else {
			System.out.println("Invalid credit card");
		}
		//Assignment: - use scanner concept to get the value
		//8574663722934475 convert into 8574-6637-2293-4475
		//DOB - 01011999 convert into 01/01/1999
		//time - 145524 convert into 14:55:24
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Provide CC number: ");
		
		
	}

}
