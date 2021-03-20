package seleniumBasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseKeyboardOperation {

	// MouseKeyboardOperation -> use Action class
	// Have to perform action at the end -> .build().perform()
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sahil Duggal\\Desktop\\transfotech\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); // implicit wait
		
		driver.get("https://www.spicejet.com/");
		
		// To hover over dropdown
		
		// object of action class
		Actions action = new Actions(driver);
		
		WebElement LoginLink = driver.findElement(By.id("ctl00_HyperLinkLogin"));
		
		action.moveToElement(LoginLink).build().perform();
		
		action.moveToElement(driver.findElement(By.linkText("SpiceClub Members"))).build().perform();
		
		action.moveToElement(driver.findElement(By.linkText("Sign up"))).click().build().perform();
		
		System.out.println(driver.getTitle());
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		// Double Click
		
		action.doubleClick();
		
		// Context click
		
		action.contextClick(); 
		
		// Key down, Key up
		
		action.keyDown(Keys.CONTROL); //keeps key down
		action.keyUp(Keys.CONTROL); //releases key
		action.release(); //also releases key
		
		//To scroll down or up in webpage
		
		action.sendKeys(Keys.PAGE_DOWN).build().perform();
		action.sendKeys(Keys.PAGE_UP).build().perform();
		
		
		driver.close();
	}

}
