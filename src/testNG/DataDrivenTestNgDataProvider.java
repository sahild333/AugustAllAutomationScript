package testNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataDrivenTestNgDataProvider {
	
	// Data Driven -> basic codes to run with multiple sets of data
	
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
	public void positiveSignInFunctionality(String username, String password) {
		driver.findElement(By.name("userName")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.name("submit")).click();
		
		Assert.assertTrue(driver.findElement(By.xpath("//table[@width='492']/tbody/tr/td/h3")).isDisplayed());
		
	}
	
	@Test (dataProvider="Negative data for sign in functionality test")
	public void negativeSignInFunctionality(String invalidUserName, String invalidPassword) {
		driver.findElement(By.name("userName")).sendKeys(invalidUserName);
		driver.findElement(By.name("password")).sendKeys(invalidPassword);
		driver.findElement(By.name("submit")).click();
		
		Assert.assertTrue(driver.findElement(By.xpath("//td[@width='112']/span")).isDisplayed());
	}
	
	@DataProvider (name="Positive data for sign in functionality test")
	public Object[][] positiveSignInDatas() {
		Object[][] datas = {{"test123","123"},{"test","test"}};
		return datas;
	}
	
	@DataProvider (name="Negative data for sign in functionality test")
	public Object[][] negativeSignInDatas() {
		Object[][] datas = {{"tom123","123"},{"john123","123"}};
		return datas;
	}
	//use name of data provider and provide it next to @Test to use that data
	//E.g @Test (dataProvider = "name of DataProvider")
	
	
}
