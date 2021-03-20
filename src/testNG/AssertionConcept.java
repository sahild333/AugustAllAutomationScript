package testNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

// Verification vs Validation ???
	// Verification - If-Else condition -> does not tell you if test case passed or failed
	// Validation -> Assertion -> checks condition -> tell pass/fail
	// Assertion: 
		// 1. assertEquals() -> compare "expected result" vs "actual result"
		// 2. assertTrue() -> checks if output of the condition is true or not
		// 3. assertFalse() -> checks if output of the condition is false or not

//Keywords -> 1. priority => help to manipulate test execution sequence
//2. enabled => false (test executing) / true (will execute)
//3. dependsOnMethods => create dependency between test cases
//4. dataProvider => data driven using @DatProvider annotation
//5. groups => can group test cases into specific groups e.g Smoke Test group, Regression Test group, End-to-End Test group


// Sequence of Test Case execution - Alphabetical order
// use (priority = 0,1,2,3...) to make custom sequence
// @Test (priority = 0)

// use (enabled = false) to not execute a test
// @Test (priority = 0, enabled = false)

// use (enabled = true) to execute test (will execute if no enable given)

// use dependsOnMethods if wanting to execute test only if initial test passes
// @Test (priority = 0, enabled = true, dependsOnMethods = "nameOfInitialTest"
// ( Eg. no need to run sign out test if sign in test fails)

//***Important***
//groups={} - used to designate tests to groups 
//executes in XML
//E.g groups={"Smoke Test"} or groups={"Regression Test"}


public class AssertionConcept {
	
	WebDriver driver;
	
	@BeforeMethod
	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sahil Duggal\\Desktop\\transfotech\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); // implicit wait
		driver.get("http://demo.guru99.com/test/newtours/index.php");
	}
	
	@AfterMethod
	public void closeBroswer() {
		driver.close();
	}
	
	@Test (priority = 0, enabled = false, groups= {"Smoke test"})
	public void clickSignOnLink() {
		driver.findElement(By.linkText("SIGN-ON")).click();
		
		String ActualSignOnPageTitle = driver.getTitle();
		String ExpectedSignOnPageTitle = "Sign on: Mercury Tours"; // from requirement docs (BRDs/FRDs)
		
		Assert.assertEquals(ActualSignOnPageTitle, ExpectedSignOnPageTitle);
		
	}
	
	@Test (priority = 1, enabled = true, groups = {"Regression test","End-to-end test"})
	public void clickRegisterLink() {
		driver.findElement(By.linkText("REGISTER")).click();
		String ActualRegisterPageTitle = driver.getTitle();
		String ExpectedRegisterPageTitle = "Register: Mercury Tours";
		System.out.println(driver.getTitle());
		
		Assert.assertEquals(ActualRegisterPageTitle, ExpectedRegisterPageTitle);
	}
	
	@Test (priority = 2, enabled = true, groups= {"End-to-end test"})
	public void clickSupportLink() {
		driver.findElement(By.linkText("SUPPORT")).click();
		String ActualSupportPageTitle = driver.getTitle();
		String ExpectedSupportPageTitle = "Support: Mercury Tours";
		System.out.println(driver.getTitle());
		
		Assert.assertEquals(ActualSupportPageTitle, ExpectedSupportPageTitle);
	}
	
	@Test (priority = 3, enabled = true, groups= {"Smoke test"})
	public void submitBtnEnable() {
		WebElement submitBtn = driver.findElement(By.name("submit"));
		submitBtn.isEnabled();
		
		//requirement= submit needs to be enabled all the time
		Assert.assertTrue(submitBtn.isEnabled());
		
	}
	
		//requirement= submit needs to be enabled only after typing username and password
	
	@Test (priority = 4, enabled = true)
	public void submitBtnEnableAfterCredentials() {
		WebElement submitBtn = driver.findElement(By.name("submit"));
		Assert.assertFalse(submitBtn.isEnabled());
		
		driver.findElement(By.name("userName")).sendKeys("test123");
		driver.findElement(By.name("password")).sendKeys("123");
		
		Assert.assertTrue(submitBtn.isEnabled());
	}
	//Assignemnt:
	// 1. Test demo tours/ any app
	// 2. create 10 -> test cases based on TestNG framework
	// 3. execute them using keywords
	// 4. generate report, post report
	// 5. use annotations
	

}
