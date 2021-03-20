package javaBasics;

public class ClassInSamePkg {


	public static void main(String[] args) {
		AccessModifierConcept amc = new AccessModifierConcept();
		System.out.println(amc.a); //if static, better to call with class name
		amc.testMethod(); //if static, better to call with class name
		AccessModifierConcept.testMethod();
		System.out.println(AccessModifierConcept.a); 
		//System.out.println(a); // not the property of this class
		//testmethod(); // not the property of this class
		amc.testMethodTwo(); // since testmethodtwo() is not static, can only call by object name
	}

}
