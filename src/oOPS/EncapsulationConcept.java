package oOPS;

public class EncapsulationConcept {

	// Encapsulation - a mechanism of wrapping the data (variables) and code acting on the data (methods) together as a single unit.
	// data inside a capsule / data hiding
			
	// To achieve encapsulation in Java - 
		// 1. Declare the variables of a class as private.
		// 2. Provide public setter and getter methods to modify and view the variables values.
		// 3. Every variable must have 2 methods - get and set method	
	
	private String ssn;
	private String dob;
	
	public String getSSN() {
		return ssn;
	}
	public void setSSN(String SSN) {
		ssn = SSN;
	}
	
	public String getDOB() {
		return dob;
	}
	public void setDOB(String DOB) {
		dob = DOB;
	}
	
	
	
	public static void main(String[] args) {
		
		
		
		
		
	}

}
