package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class identifyingWebElementsHandlingDropDown {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Sahil Duggal\\\\Desktop\\\\transfotech\\\\Drivers\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize(); //to maximize window
		driver.get("http://demo.guru99.com/test/newtours/");
		
//		System.out.println("Title of Home Page: " +driver.getTitle()); //extract title of page
//		System.out.println("Url of the website: "+driver.getCurrentUrl()); // to extract current url for validation
		
		driver.findElement(By.linkText("Flights")).click();
		System.out.println("Title of flight page: " +driver.getTitle());
		
		// handling radio button
		//if no attributes available or have same name or id, right click->copy->xpath/selector
		
		
		//using xpath
		driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/"
				+ "tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/"
				+ "table/tbody/tr[2]/td[2]/b/font/input[2]")).click();
		
		//using css selector
		driver.findElement(By.cssSelector("body > div:nth-child(5) > table > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(4) > td > table > "
				+ "tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(5) > "
				+ "td > form > table > tbody > tr:nth-child(9) > td:nth-child(2) > "
				+ "font > font > input[type=radio]:nth-child(2)")).click();
		
		
		
		// handling dropDownList - have to use Select class (import from Selenium)
		
		WebElement passengerCount = driver.findElement(By.name("passCount"));
		Select select1 = new Select(passengerCount); // creating object of select class to handle dropDowns
		select1.selectByVisibleText("4");
		
		WebElement airlinePreference = driver.findElement(By.name("airline"));
		Select select2 = new Select(airlinePreference);
		select2.selectByIndex(1); // use index count
		
		Select select3 = new Select(driver.findElement(By.name("fromPort")));
		select3.selectByValue("New York");
		
		//to maximize browser
		driver.manage().window().maximize();// usually done in the beginning
		
		
		
		//customize xpath/css selector
		
		
		
		
	}

}
