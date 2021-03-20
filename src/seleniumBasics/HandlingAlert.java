package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAlert {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sahil Duggal\\Desktop\\transfotech\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize(); //to maximize window
		driver.get("http://demo.guru99.com/test/delete_customer.php");
		
		driver.findElement(By.name("cusid")).sendKeys("1234");
		driver.findElement(By.name("submit")).click();
//		driver.findElement(By.name("res")).click(); // UnhandledAlertException
		
		// to handle alert
		//driver.switchTo().alert().getText();
		System.out.println("Alert msg: " +driver.switchTo().alert().getText());
		driver.switchTo().alert().accept(); //click ok
		driver.switchTo().alert().dismiss(); // cancel
		
		
		//CHECK ERRORS
		//to see what line error on-> go to bottom of console
		
		// to handle Frames
		driver.switchTo().frame(driver.findElement(By.id("google_esf")));
		
		
		driver.close();

	}

}
