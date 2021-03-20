package seleniumBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class UsingTagName {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Sahil Duggal\\\\Desktop\\\\transfotech\\\\Drivers\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize(); //to maximize window
		driver.get("http://demo.guru99.com/test/newtours/");
		
		//find how many links in the page
		//use findElements() - to identify more than one element with that locater
		//links have common tagName "a"
		//buttons have common tagName "input"
		//images tagName "img"

//		driver.findElements(By.tagName("a"));
		
		List<WebElement> tagsInHomePage = driver.findElements(By.tagName("a"));
		System.out.println("Number of links in HomePage: " +tagsInHomePage.size());
		
		List<WebElement> inputInHomePage = driver.findElements(By.tagName("input"));
		System.out.println("Number of input field: " +inputInHomePage.size());
		
		
		
		//Assignment:
//			1. Use tagName to identify multiple elements & store as List
//			2. Get size
//			3. Get all the values stored (use looping) (arraylist)
		
		List<WebElement> imgsInHomePage = driver.findElements(By.tagName("img"));
		System.out.println(imgsInHomePage.size());
		

		
		driver.close();
		
	}

}
