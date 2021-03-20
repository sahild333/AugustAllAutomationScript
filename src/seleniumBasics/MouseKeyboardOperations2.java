package seleniumBasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseKeyboardOperations2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sahil Duggal\\Desktop\\transfotech\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); // implicit wait
		driver.get("http://demo.guru99.com/test/newtours/index.php");
		
		WebElement userNameTxtField = driver.findElement(By.name("userName"));
		
		userNameTxtField.sendKeys("test123");
		Actions action = new Actions(driver);
		
		
//		action.doubleClick().build().perform(); // does not work because attention is not in text field
		action.moveToElement(userNameTxtField).doubleClick().build().perform(); // move attention to text field
//		action.keyDown(Keys.DELETE).build().perform(); //IllegalArgumentException: Key Down / Up events only make sense for modifier keys
//		action.keyUp(Keys.DELETE).build().perform();
//		action.release().build().perform();
		//or
		userNameTxtField.sendKeys(Keys.DELETE);
		
		//To scroll down or up in webpage
		action.sendKeys(Keys.PAGE_DOWN).build().perform();
		action.sendKeys(Keys.PAGE_UP).build().perform();
		
		
		
		driver.close();
	}

}
