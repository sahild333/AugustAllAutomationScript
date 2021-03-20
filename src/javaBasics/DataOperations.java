package javaBasics;

public class DataOperations {

	public static void main(String[] args) {
		// Data operation with integers int
		 
		int a = 10;
		int b = 30;
		
	//addition
		int c = a+b;
		System.out.println(c);
		
		System.out.println("Additon of a & b ="+c); // + will be taken as place
	
	//subtraction
		//int c = b-a; //duplicate locate variable
		c=b-a;
		System.out.println(c);
		
		System.out.println("Subtraction of b & a = "+c);
		
		System.out.println("Adding: "+(a+b)); // 2nd + will be taken as addition
		
	//division
		c=a/b;  // original variables saved as int which can not hold decimals
		System.out.println(c); //answer 0
		
		//have to store as float or double
		
		double x = 10;
		double y = 30;
		double z =x/y;
		
		System.out.println("Division of x and y ="+z); //gives decimals
		
		System.out.println(a+x); //still gives out decimals if using int and double
	
	//multiplation	
		z=x*y;
		System.out.println("Multiplication of x and y="+z);
		
	//modulus 
		int f = 40;
		int g = 80;
		int h = 80;
		
		System.out.println("g can be divided by f ="+(g%f)); //if able to divide will give 0
		System.out.println("f can be divided by g ="+(f%g)); // if not able to divide, will give some number
		
	//comparative operation - output of comparison will be either true or false (boolean)
	//one = sign used to assign value, 2 == used to compare
		
	// == - equals to
		System.out.println(f==h); 
		System.out.println(g==h);
		boolean i = (f==h);
		System.out.println("comparing f to h: "+i);
	
	// != - not equal to
		System.out.println(f!=g); //true
		System.out.println(g!=h); //false
	
	// <= - less than or equal to
		System.out.println(f<=g);
		
	// >= - greater than or equal to
		System.out.println(f>=g);
		

	}

}
