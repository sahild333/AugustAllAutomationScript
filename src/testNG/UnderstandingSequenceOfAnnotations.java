package testNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class UnderstandingSequenceOfAnnotations {
	
	//****IMPORTANT****
	//Why don't we use main method when using testNG?
	//@Test acts as a main method
	
	//to get report - refresh package -> test-output -> index.html
	
//	@BeforeTest
//		@BeforeClass
//			@BeforeMethod
//				@Test-1
//			@AfterMethod
//			@BeforeMethod
//				@Test-2
//			@AfterMethod
//		@AfterClass
//	@AfterTest 
	
	//@BeforeTest/@AfterTest - for the whole test run
	//@BeforeClass/@AfterClass - execute before and after each class
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Before method execution");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("After method execution");
	}
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("Before test execution");
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("After test execution");
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("Before each class execution");
	}
	@AfterClass
	public void afterClass() {
		System.out.println("After each class execution");
	}
	
	@Test
	public void test1() {
		System.out.println("First test case");
	}
	
	@Test
	public void test2() {
		System.out.println("Second test case");
	}

}
