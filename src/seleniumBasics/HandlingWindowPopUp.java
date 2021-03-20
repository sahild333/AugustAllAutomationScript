package seleniumBasics;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingWindowPopUp {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize(); 
		driver.get("http://demo.guru99.com/popup.php");
		
		// String parentWindowHandle = driver.getWindowHandle(); // get handle of active window
		// System.out.println("Parent window handle: "+parentWindowHandle);
		
		driver.findElement(By.linkText("Click Here")).click();
		Set<String> handles = driver.getWindowHandles(); // gets handle of all the window opens by the browser
		System.out.println("Number of window opened: "+handles.size());
		
		Iterator<String> it = handles.iterator();
		// switched to parent window
		driver.switchTo().window(it.next());
		String parentWindowHandle = driver.getWindowHandle();
		System.out.println("Parent window Handle: "+parentWindowHandle);
		// switched to child window
		driver.switchTo().window(it.next());
		String childWindowHandle = driver.getWindowHandle();
		System.out.println("Child window handle: "+childWindowHandle);
		driver.close();
		Thread.sleep(5000);
		driver.switchTo().window(parentWindowHandle);
		if(driver.getWindowHandle().equals(parentWindowHandle)) {
		System.out.println("Switched to parent window again.");
		}
		driver.close();
		// driver.close(); // closing parent window only, as it is still the active window
		// driver.quit(); // closes all the window opened by browser instance

	}
	// Assignment:
	// 1. Handle 2 windows
	// 2. Perform operation in child window
	// 3. click here open 3rd window
	// 4. switch back to window one by one and close it
	
}
