package testNG;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
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

public class UnderstandingPropertyFile {

	// Properties class => bring global variable datas from config.properties file
	
WebDriver driver;
Properties prop;

	@BeforeMethod
	public void launchBrowser() throws IOException {
		
		// Connecting config.properties file
		// Create global variable of Properties class
		// Create object of FileInputStream() class
			// Insert location of config.properties file (right click ->properties->copy url)
		// prop.load(file)
		// Throw declaration where needed
		// Use prop.getProperty to replace
		
		prop = new Properties();
		FileInputStream file = new FileInputStream("C:\\Users\\Sahil Duggal\\Desktop\\Java Work Space\\August2ndBatch\\src\\testNG\\config.properties");
		prop.load(file);
		
		System.setProperty(prop.getProperty("chromeDriverKey"), prop.getProperty("chromeDriverPath"));
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); // implicit wait
		driver.get(prop.getProperty("url"));
	}
	
	@AfterMethod
	public void closeBroswer() {
		driver.close();
	}
	
	//
	@Test (dataProvider="Positive data for sign in functionality test")
	public void positiveSignInFunctionality() {
		driver.findElement(By.name("userName")).sendKeys(prop.getProperty("userName"));
		driver.findElement(By.name("password")).sendKeys(prop.getProperty("password"));
		driver.findElement(By.name("submit")).click();
		
		Assert.assertTrue(driver.findElement(By.xpath("//table[@width='492']/tbody/tr/td/h3")).isDisplayed());
		
	}
	@Test (dataProvider="Negative data for sign in functionality test")
	public void negativeSignInFunctionality() {
		driver.findElement(By.name("userName")).sendKeys(prop.getProperty("invalidUserName"));
		driver.findElement(By.name("password")).sendKeys(prop.getProperty("invalidPassword"));
		driver.findElement(By.name("submit")).click();
		
		Assert.assertTrue(driver.findElement(By.xpath("//td[@width='112']/span")).isDisplayed());
	}
}
