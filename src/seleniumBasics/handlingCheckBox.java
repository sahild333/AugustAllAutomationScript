package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class handlingCheckBox {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Sahil Duggal\\\\Desktop\\\\transfotech\\\\Drivers\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize(); //to maximize window
		driver.get("https://www.spicejet.com/");
		
		driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).click();
		Thread.sleep(4000);// adds pause in milliseconds (4 seconds)
		driver.findElement(By.id("ctl00_mainContent_chk_SeniorCitizenDiscount")).click();
		Thread.sleep(4000);
		driver.findElement(By.id("ctl00_mainContent_chk_StudentDiscount")).click();
		Thread.sleep(4000);
		driver.findElement(By.id("ctl00_mainContent_chk_StudentDiscount")).click();
		Thread.sleep(4000);

		
		
		
		driver.close();

	}

}
