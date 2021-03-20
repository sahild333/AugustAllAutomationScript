package seleniumBasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SynchronizationConcept {
	
	//******IMPORTANT******

	// Synchronization (waits) - letting automation script to wait for desired element to perform action
	// 3 types -> Static wait => Thread.sleep(4000); - pause the java execution
		// 1. Implicit wait - once element found, will perform action. Does not wait for full duration
			// global wait (define once, applicable for all the elements)
			// driver.manage().timeouts().implicitlyWait(0, null);
			// driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		// 2. Explicit wait - defined for specific element
			// not a global wait
			// once element found, will perform action. Does not wait for full duration
		// 3. Fluent wait - manipulate frequency of searching element (polling)
			// not a global wait
			// variation of explicit wait
	
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sahil Duggal\\Desktop\\transfotech\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); // implicit wait
		
		driver.get("http://www.amazon.com");
		
		// 10 secs
		driver.findElement(By.linkText("Careers")).click(); // NoSuchElementFoundException
		
		// 25 secs
		driver.findElement(By.linkText("Careers2")).click(); // NoSuchElementFoundException
		
		//implicit wait takes longer for elements that take long to load
		
		// 100 elements -> 30 seconds //use implicit wait
		// some elements -> 1 - 50 seconds, 2 - 150 seconds //use explicit wait
		
		// explicit wait *****IMPORTANT*****
		
		WebDriverWait explicitWait = new WebDriverWait(driver, 120);
		WebElement amazonPrimeVideo = driver.findElement(By.name("Amazon Video")); 
		
		explicitWait.until(ExpectedConditions.elementToBeClickable(amazonPrimeVideo)).click();
		explicitWait.until(ExpectedConditions.elementToBeSelected(By.name("Amazon Video")));
		driver.findElement(By.name("Amazon Video")).click();
		
		// Fluent wait ****IMPORTANT****
		//E.g:
		//implicit wait/explicit wait
		//0----10----20----30----40----Frequency every 10 seconds
		//Element1 -> 11 seconds -> 20th seconds (waste = 9 seconds)
		//100 Elements -> 15 seconds -> 20th seconds (waste = 500 seconds)
		
		//Fluent wait -> manipulate frequency (polling)
		//0--2--4--6--8--10--12--14--16--18--20--Polling changed to every 2 seconds
		//Element1 -> 11 seconds -> 12th second (waste = 1 second)
		//100 Elements -> 15 seconds -> 16th second (waste = 100 seconds)
		
		
	}

}
