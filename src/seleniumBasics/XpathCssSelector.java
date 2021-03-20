package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class XpathCssSelector {
	

//	<input type="submit" name="submit" value="Submit" style="background-color">
//	Absolute Xpath "/" : /html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[4]/td/table/tbody/tr[4]/td[2]/div/input
//	Absolute Css selector ">" : body > div:nth-child(5) > table > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(4) > td > table > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(2) > td:nth-child(3) > form > table > tbody > tr:nth-child(4) > td > table > tbody > tr:nth-child(4) > td:nth-child(2) > div > input[type=submit]
//	Should not use Absolute Xpath/Css Selector (very long/will not always work)
//	Answer: Customization of Xpath or Css selector
//	Difference between Xpath and Css selector - Xpath has / in between tags and Css has >
	
//	Customization of Xpath & Css selector
	//	Common syntax for Xpath		   = //tagName[@attribute='value'] or //*[@attribute='value']
	//	Common syntax for Css selector = tagName[attribute='value'] or [attribute='value']

//E.g <input type="submit" name="submit" value="Submit" style="background-color">
	// Customized Xpath = //input[@name='submit'] or //input[@value='Submit'] or //*[@name='submit] or //*[@value='Submit']
	// Customized Css = input[name='submit] or [name='submit'] or input[value='Submit'] or [value='Submit']
	
	
//***IMPORTANT***
	
	// To check if right element is identified before using
		// Check customized Xpath or Css in chropath in 'inspect' of chrome
		// Or go into Console in 'inspect' (Browser develepment tool)
			// for Xpath -> $x("//input[@name='submit']")
			// for Css -> $("input[name='submit]")
	
	// Using more than 1 attribute for customization
		// 1. <input type="submit" value="Submit" style="background-color">
		// 2. <input type="submit" style="background-color">
		// 3. <input value="Submit" style="background-color">
			// Xpath = //input[@value='Submit'] //can't use because 1 and 3 have same value
				// Using more than 1 attribute -> //input[@value='Submit][@type='submit']....
				// For Css                     -> input[value='Submit'][type='submit'].....
	
	// using text as an attribute (can only use Xpath)
		//<font face="Arial, Helvetica, sans-serif" size="2" xpath="1">Registered 
    	//users can <b>sign-in here</b> to find the lowest fare on participating
    	//airlines.</font>
//		***	// Xpath => //font[text()='Registered users can sign-in here to find the lowest fare on participating airlines']  //don't need '@'
	
	// For long attribute values
		// For Xpath use 'Contains' keyword
		// For Css use '*'
			//E.g <input type="submitisgoingtoclicksubmitbutton" value="submitisgoingtoclicksubmitbutton"
				// Xpath - //input[contains(@type,'clicksubmitbutton')]
				// Css - input[type*='clicksubmitbutton']
	
	// Can only use Xpath for text****
	
	// Using parent/child tag for customization
		// Xpath => //font[text()='Registered users can sign-in here to find the lowest fare on participating airlines']
		// Xpath using contains => //font[contains(text(),'Registered users can sign-in')]
		// using parent tag add parent tags in front of xpath
			//tr/td/font[contains(text(),'Registered users can sign-in')]
			//tr/td/font[text()='Registered users can sign-in here to find the lowest fare on participating airlines']
		//using child tag  start with parent xpath
			//table[@width='100%']/tr[1]/td/font
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Sahil Duggal\\\\Desktop\\\\transfotech\\\\Drivers\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize(); //to maximize window
		driver.get("http://demo.guru99.com/test/newtours/");
		
		
	
	//*****IMPORTANT
		
	//Using Ebay
		
	//Using xpath to identify child element but with xpath of both parent and child
		//parentXpath/childXpath
		//Eg //div[@class='textbox=123]/input[@value='Search']
		// //li[@id='gh-p-2']/a[@class='gh-p']
		
		
	// Find parent element by using child xpath --- cannot be done with css selector
	// Unique for Xpath ONLY
		// use childXpath/parent::parenttagName at end of child xpath to get attention to parent element
		// Eg //li[@id='gh-p-2']/parent::ul
		
	// Find sibling element 
		//following-sibling gives you following siblings
		//preceding-sibling gives you before siblings
		// siblingxpath/following-sibling::tagName[1,2..] //index count 1,2,3...
		// siblingxpath/preceding-sibling::tagName[1,2..] //index count 1,2,3...
		//Eg //li[@id'gh-p-1']/following-sibling::li[1]
	
	
	// UNIQUE FOR CSS ONLY
		// if id - tagName#id or #id
		// if class - tagName.className or .className
		
		
		
	
	//Assignment
		
		//Specials Table on homepage
			driver.findElement(By.xpath("//table[@width='270']/tbody/tr/td]"));
				
		//'Atlanta to Las Vegas' in Specials table
			driver.findElement(By.xpath("//font[@face='Arial, Helvetica, sans-serif, Verdana'][@size='2'][@xpath='1']"));
				
				
		//'City' field in Register page
			driver.findElement(By.cssSelector("input[maxlength=60][name='city]")); //too many elements found
			driver.findElement(By.xpath("//table[@cellpadding='2']/tbody/tr[8]/td[2]/input")).sendKeys("New York");
				
				
		//Handling dropDowns
			driver.findElement(By.linkText("Flights")).click();
				
			Select select = new Select(driver.findElement(By.name("fromPort")));
			select.selectByVisibleText("New York");
			//OR
			WebElement departingFrom = driver.findElement(By.name("fromPort"));
			Select select1 = new Select(departingFrom);
			select1.selectByVisibleText("New York");
		
		
	
	}
	
	//Assignment:
//		1. Homepage,Flights page, Register page
//		2. Identify all elements with customized xpath or css selector
	

}
