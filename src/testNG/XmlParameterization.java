package testNG;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class XmlParameterization {
	
	
	
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
		
		//
		@Test (dataProvider="Positive data for sign in functionality test")
		public void positiveSignInFunctionality() {
			driver.findElement(By.name("userName")).sendKeys("userName");
			driver.findElement(By.name("password")).sendKeys("password");
			driver.findElement(By.name("submit")).click();
			
			Assert.assertTrue(driver.findElement(By.xpath("//table[@width='492']/tbody/tr/td/h3")).isDisplayed());
			
		}
		@Test (dataProvider="Negative data for sign in functionality test")
		public void negativeSignInFunctionality() {
			driver.findElement(By.name("userName")).sendKeys("invalidUserName");
			driver.findElement(By.name("password")).sendKeys("invalidPassword");
			driver.findElement(By.name("submit")).click();
			
			Assert.assertTrue(driver.findElement(By.xpath("//td[@width='112']/span")).isDisplayed());
		}
	

}
