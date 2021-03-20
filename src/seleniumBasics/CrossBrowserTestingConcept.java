package seleniumBasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class CrossBrowserTestingConcept {

	public static void main(String[] args) {
		// Selenium suite - Selenium RC, Selenium IDE, Selenium WebDriver, Selenium Grid
		// Environment where application will be accessed -> browser/OS/Devices => Cross browser/Multi-platform testing
		// Cross browser testing -> testing application in various browsers (Chrome,IE,Firefox,Safari)
		
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sahil Duggal\\Desktop\\transfotech\\Drivers\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); // implicit wait
//		driver.get("http://demo.guru99.com/test/newtours/index.php");
		
		WebDriver driver; //set global variable for driver
		
		String browserName = "chrome"; //changing name will test in different browsers
		//E.g String browserName = "ie";
		
		if(browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sahil Duggal\\Desktop\\transfotech\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("https://www.amazon.com/");
		}
		else if(browserName.equalsIgnoreCase("ie")) {
			System.setProperty("webdriver.ie.driver", "Provide path of ie driver");
			driver = new InternetExplorerDriver();
			driver.get("https://www.amazon.com/");
		}
		else if(browserName.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "Provide path of firefox driver");
			driver = new FirefoxDriver();
			driver.get("https://www.amazon.com/");
		}
		else {
			System.out.println("No drivers found");
		}
		
		
	}

}
