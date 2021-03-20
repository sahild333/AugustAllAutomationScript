package javaBasics;

public class LoopConcept {

	public static void main(String[] args) {
		// Loop Concept: - 3 requirements - initialization: condition: increment/decrement
		// 1. for loop(initialization: condition: increment/decrement) - all requirements placed inside the paranthesis
		// 2. while loop - initialization: (condition): increment/decrement will be inside the body
		
		//requirement print from 0 to 10
		
		//using for loop (use more)
		
//		for(int i=0; i<=10; i=i+1) {  //( i=i+1 can be replaced by i++ )
//			System.out.println(i);
//		}
		
		//using while loop
		
//		int i=0;
//		while(i<=10) {
//			System.out.println(i);
//			i=i+1;
//		}
		
		//requirement print even numbers from 0-20
		
		int a=0;
//		
//		//using for loop
//		for (int i=a; i<=20; i=i+2) {
//			System.out.println(i);
//		}
//		
		//using while loop
		while(a<=20) {
			System.out.println(a);
			a=a+2;
		}
		
		//requirement print all the numbers from 10-0
		
//		for(int i=10; i>=0; i=i-1) {
//			System.out.println(i);
//		}
		
//		int i=10;
//		while(i>=0) {
//			System.out.println(i);
//			i=i-1; //i=i-1 can be replaced by i--
//		}
		
//		for(int i=0; i>=0; i++) { //infinite loop
//			System.out.println(i);
//		}
		
//		int i=0;
//		while (i>=0) { // infinite loop
//			System.out.println(i);
//			i++;
//		}
		
//		Assignment
//		1. Print all even numbers from 0-100
//		2. Print all odd numbers from 100-0
		
//		for (int i=0; i<=100; i=i+2) {
//			System.out.println(i);
//		}
		
//		int i=0;
//		while (i<=100) {
//			System.out.println(i);
//			i=i+2;
//		}

		
//		for (int i=100; i>=0; i--) {
//		if (i % 2 !=0)
//				System.out.println(i);
//			}
		
//		int i=100;
//		while (i>=0) {
//		if (i % 2 !=0)
//			System.out.println(i);
//			i--;
//		}
		
//		for (int i=200; i<=1000; i=i+2) {
//			if (i == 555)
//				System.out.println("Pass");
//			else if (i == 888)
//				System.out.println("Fail");
//		}
		
		
	}

}
