package seleniumBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingIframe {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sahil Duggal\\Desktop\\transfotech\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize(); //to maximize window
		driver.get("https://www.softwaretestinghelp.com/");
		
		List<WebElement> iframes = driver.findElements(By.tagName("iframe"));
		System.out.println("Number of iframes: " +iframes.size());
		
		//To get all values store in list use looping
		
	for (int i=0; i<iframes.size(); i++) {
		System.out.println("Values of frames in list: " +iframes.get(i));
	}
	// if element is present inside iframe
	// driver.findElement(By.linkText("Buy now")).click(); // directly accessing element will error - NoSuchElementFoundException
	// after switching to iframe - then element will be accesible
	// System.out.println(driver.switchTo().frame(iframes.get(1)).getTitle());
	// driver.findElement(By.linkText("Buy now")).click();
	System.out.println(driver.switchTo().frame(iframes.get(1)).getTitle());
		
		driver.close();

	}
	// Assignment:
	// 1. Select any 2-3 websites
	// 2. check if iframes are present
	// 3. if present perform action on the element of the iframe

}
