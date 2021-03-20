package seleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchingBrowser {

	public static void main(String[] args) {
		
		//IMPORTANT 1ST THREE STEPS
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sahil Duggal\\Desktop\\transfotech\\Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.gmail.com");

	}

}
