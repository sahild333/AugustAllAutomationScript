package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementConcept {
	
	// WebElements/WebObject/GUI(Graphical User Interface) object - elements in the web application
		
		//Types of webElements
	
		// 1. Text field/Text area - user can type something -> can perform action -> click and type -> letters can be visible or masked
		// 2. Button - enter on keyboard or click "button" (Submit button, Continue button...) -> enabled or disabled
		// 3. Link/hyperlink - click action -> take user to page of same application or foreign application
		// 4. CheckBox - click action -> one click, object gets selected, double click object gets deselected (filter like "under $100")
		// 5. RadioButton - click action -> user can only select one option (required to select one) (one-way, round-trip) -> default selection
		// 6. List Box/DropDown Box - click action -> more options will be displayed and can be selected with click action
		// 7. Table - interactive table (click or type actions) or informative table
		// 8. Menu - click action - what the application offers (book a flight, deals...)
		// 9. Images - interactive image (click action) or informative image
	
		// WebElement locating strategy - 
			// 1. Name - 1st choice, most common, mostly unique in nature
			// 2. ID - 1st choice, most common, mostly unique in nature
			// 3. ClassName - not unique, used with some other attribute
			// 4. LinkText - for links
			// 5. Partial LinkText - part of link if linkText is very long
			// 6. Xpath - common and very useful strategy if other strategies don't work, customizable
			// 7. Css selector - common and very useful strategy if other strategies don't work, customizable
			// 8. TagName - not specific, used to identify group of elements (how many links/images on page)
	
		// Each webElement will have -
			// 1. TagName
			// 2. Attributes
			// 3. Attributes will have values
			// 4. Text (not all the time)
	
	
	//Right click Website, click cursor and click on element
	//input - TagName
	//Eg. for userName Text field = <input type="text" name="userName" size="10">
	// type, name, size = Attributes
	// values in quotations -> "text", "userName", "10"
	// use name attribute to locate WebElement
	
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sahil Duggal\\Desktop\\transfotech\\Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.guru99.com/test/newtours/");
		
		// using name to locate
		
		driver.findElement(By.name("userName")).click();
		
		driver.findElement(By.name("password")).click();
		
		//sending values into the text field = sendKeys() method
		
		driver.findElement(By.name("userName")).sendKeys("test123");
		driver.findElement(By.name("password")).sendKeys("123");
		driver.findElement(By.name("submit")).click();
//		
//		//using id
//		
//		driver.findElement(By.id("test")).click();
//		
//		// using className
//		
//		driver.findElement(By.className("test")).click();
//		
//		// using tagName
//		
//		driver.findElement(By.tagName("img")).click();
//		
//		// using xpath
//		
//		driver.findElement(By.xpath("xpath")).click();
//		
//		// using css
//		
//		driver.findElement(By.cssSelector("css")).click();
		
//		// using linkText
//		
//		driver.findElement(By.linkText("REGISTER")).click();
//		
//		//using partialLinkText
//		
//		driver.findElement(By.linkText("vacation destinations")).click();
		
		
		// Assignment:
			// Pre-requisite - setProperty, browser object, load url
			// 1. load any 2-3 applications - different class for different application
			// 2. locate 5-10 elements - textField/buttons/linkText
			// 3. perform action - click() and sendKeys()
		

	}

}
