package testNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FirstTestNGFramework {

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
	
	@Test
	public void clickSignOnLink() {
		driver.findElement(By.linkText("SIGN-ON")).click();
		System.out.println(driver.getTitle());
	}
	
	@Test
	public void clickRegisterLink() {
		driver.findElement(By.linkText("REGISTER")).click();
		System.out.println(driver.getTitle());
	}
	
	@Test
	public void clickSupportLink() {
		driver.findElement(By.linkText("SUPPORT")).click();
		System.out.println(driver.getTitle());
	}
	
	// Assignment:
//		1. any application
//		2. use @BeforeMethod @AfterMethod @Test
//		3. create 10 smoke automation test cases
//		4. get title of the page, print out
//		5. get report and send the report in lms/whatsapp
	

	}


