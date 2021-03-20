package javaBasics;

public class DataTypesConcept {

	public static void main(String[] args) {
//	    notes (line commenting)
//		comment
//		notes

		/*these (block commenting)
		 * are 
		 * block
		 * notes */
		
		//main()-method/function- java looks for main method for execution
		
	// There are two data types available in Java
		//Primitive Data Types (byte,short,int,long,float,double,boolean,char)
        //Reference/Object Data Types (String-stores words or sentences)
	// int- Integer - numerical values - default 0
	//creating variables
		int firstNumber = 10;
		System.out.println(firstNumber);
	//long - big numbers	
		long bigNumber = 10000000L;
		System.out.println(bigNumber);
	//float - small decimal number
		float smallDecimal=10.06f;
		System.out.println(smallDecimal);
	//double - big decimal number
		double bigDecimal=10.00099339d;
		System.out.println(bigDecimal);
	//char - alphabetic (upper/lower case) or single numerical value ' '
		char characterData= 'a';
		System.out.println(characterData);
	//boolean - true or false
		boolean earthisRound = true;
		boolean earthisFlat = false;
		System.out.println(earthisRound);
		System.out.println(earthisFlat);
	
	//String - alphanumeric value inside " ", default null
		String a = "We are taking a java class";
		System.out.println(a);
	
	

	}

}
