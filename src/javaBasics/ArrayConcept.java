package javaBasics;

public class ArrayConcept {
	
	// Array -> [] - store values like in a table with single column with multiple rows defined

	public static void main(String[] args) {
//		int a = 1;
//		int b = 2;
//		int c = 3;
//		int d = 4;
//		int e = 5;
	
		// One dimensional array - 1D array
		
		int[] x = new int[5];
		x[0]=1;
		x[1]=2;
		x[2]=3;
		x[3]=4;
		x[4]=5;
		
		System.out.println("Number in third row = " +x[2]);
		System.out.println("Number in fifth row = " +x[4]);
		System.out.println("Size of array = " +x.length);
		
		for(int i=0; i<x.length; i++) {
		//	System.out.println(x[i]);
			System.out.println("Number in "+i+" position = " +x[i]);
		}
		
		String names[] = new String [4];
		names[0] = "Tom";
		names[1] = "Harry";
		names[2] = "Joe";
		names[3] = "John";
//		names[4] = "Jack"; //Array out of bound exception - can't have 5 values
		
		System.out.println(names.length);
		System.out.println(names[2]);
		
		for (int i=names.length-1; i>=0; i--) { //loop will still work even if there is an increase in array
			System.out.println(names[i]);
		}
		
		String names1[] = {"Tom", "Harry", "Joe", "John", "Jack", "David"};
		System.out.println(names1.length);
		for (int a=0; a<names1.length; a++) {
			System.out.print(names1[a]+" ");
		}
		
		
		
		
	}

}
