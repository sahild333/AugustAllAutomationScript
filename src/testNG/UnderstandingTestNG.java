package testNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UnderstandingTestNG {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sahil Duggal\\Desktop\\transfotech\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); // implicit wait
		driver.get("http://www.facebook.com");
		
		//Login functionality:
		// 1. Positive login test - passed
		
		// 2. Negative login test both invalid credential - passed
		
		// 3. Negative login with invalid username and valid password - failed! execution stops
		
		// 4. Negative login test valid username and invalid password

		
		
		// TestNG -> automation framework ****important****
			// Advantages: 
			// 1. All test cases will execute whether earlier case fail
			// 2. Clarity in automation script, clear demarcation 
			// 3. Automation report
			// 4. Annotations - starts with @Test, @BeforeTest, @AfterTest, @DataProvider
			// 5. XML file - multiple test classes can be executed in one click, parallel testing, manipulation execution, group of test case execution
			// 6. Validation point - "Assertions"
		
		
	}

}
