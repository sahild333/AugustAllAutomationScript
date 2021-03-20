package javaBasics;

public class StringManipulationConcept {

	public static void main(String[] args) {
		String a = "java coding";
		String b = "is fun";
		System.out.println(a); //ln means next line
		System.out.println(b);
		
		System.out.print(a); // no ln after print prints on same line
		System.out.print(b);
		
		// String concatenation function - joining strings
		String c = a+b; // +  -> concatenation operator
		System.out.println(a+b);
		
		// to create space between coding and is
		c = a+" "+b; 
		System.out.println(c);
		System.out.println(a+"/"+b);
		
		int x = 100;
		int y = 200;
		System.out.println(x+y);
		System.out.println(a+x);
		System.out.println(x+a);
		System.out.println(x+y+a); //java code executes left to right
		System.out.println(a+x+y); //since 1st variable is string, integers don't add (left to right)
		System.out.println(a+(x+y)); //pemdas
		
		String firstString = "java coding";
		String secondString = " is fun";
		
		// concatenation with concat() method
		String concatenatedString = firstString.concat(secondString); // . brings up functions
		System.out.println(concatenatedString);
		
		// .length () - gives size of string
		
		System.out.println("Size of firstString :" +firstString.length()); 
		System.out.println("Size of secondString:" +secondString.length());
		
		// Uppercase/Lowercase
		String upperCasedFirstString = firstString.toUpperCase();
		System.out.println(upperCasedFirstString);
		System.out.println(secondString.toUpperCase());
		String lowerCasedFirstString = upperCasedFirstString.toLowerCase();
		System.out.println(lowerCasedFirstString);
		
		// compareTo() - comparison mthod - output will be int - if zero then strings are equal
		System.out.println("comparing firstString to upperCasedFirstString: " +firstString.compareTo(upperCasedFirstString));
		System.out.println("comparing firstString to lowerCasedFirstString: " +firstString.compareTo(lowerCasedFirstString));
		
		// compareToIgnoreCase() - not sensitive to upper/lower case
		System.out.println("comparing firstString to upperCasedFirstString despite upper or lower: " +firstString.compareToIgnoreCase(upperCasedFirstString));

		
		//equals() - comparison method - output will be boolean
		boolean comparingFirstStringToUpperCased = firstString.equals(upperCasedFirstString);
		System.out.println("Comparing firstString to upperCasedFirstString: " +comparingFirstStringToUpperCased);
		System.out.println("Comparing firstString to lowerCasedFirstString: " +firstString.equals(lowerCasedFirstString));
		
		// equalsIgnoreCase() - is not upper/lower case sensitive
		System.out.println("Comparing firstString to upperCasedFirstString despite upper or lower: " +firstString.equalsIgnoreCase(upperCasedFirstString));
		
		// charAt() - location of character at specific location (indexing - count starts with 0 (0,1,2,3,4...))
		// indexOf () - position of character in a string (identifies character)
		
		System.out.println("Character at 7th position: " +firstString.charAt(7));
		System.out.println("Position of g: " +firstString.indexOf('g'));
		
		String customerName = "    Tom Johns    ";
		String customerAddress = "NY";
		System.out.println(customerName+" lives in "+customerAddress);
		System.out.println("Welcome "+ customerName+"!");
		
		// trim() - to get red of extra blank spaces in front/back of a string
		
		String trimmedCustomerName = customerName.trim();
		System.out.println(trimmedCustomerName+" lives in "+customerAddress);
		System.out.println("Welcome "+ trimmedCustomerName+"!");
		
		// contains() - check if character is present - boolean output
		
		System.out.println("CustomerName contains o: "+trimmedCustomerName.contains("o"));
		System.out.println("CustomerName contains a: "+trimmedCustomerName.contains("a"));
		System.out.println("CustomerName contains tom: "+trimmedCustomerName.contains("tom")); //false because T is uppercase in customerName
		
		// lastIndexOf - last position of a character
		System.out.println( "Location of o: " +trimmedCustomerName.indexOf('o'));
		System.out.println( "Location of last o: " +trimmedCustomerName.lastIndexOf('o'));
		
		// replace() - replacing a character by new character
		String replacedCustomerName = trimmedCustomerName.replace(" ", "-");
		System.out.println("Space replaced by - : "+replacedCustomerName);
		
		// replaceAll() - replacing all the specified condition by provided replacement
		String name = "H A R R Y";
		System.out.println(name.replaceAll(" ", ""));
		System.out.println(name.replaceAll(" ", "/"));
		
		// split() - breaking string into multiple strings
		String location = "N e w Y o r k";
		
		
		// Assignment - practice all methods of String manipulation
		// Create different variables - registration functions
		// print output - create some sense using data manipulation methods
		
		
		

	}

}
