package seleniumBasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropOperation {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sahil Duggal\\Desktop\\transfotech\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); // implicit wait
		driver.get("http://demo.guru99.com/test/drag_drop.html");
		
		WebElement bankToBeDragged = driver.findElement(By.xpath("//div[@id='products']/div/ul/li[5]"));
		WebElement bankDropLocation = driver.findElement(By.id("bank"));
		WebElement fiveThousandToBeDropped = driver.findElement(By.xpath("//div[@id='products']/div/ul/li[4]"));
		WebElement fiveThousandDropLocation = driver.findElement(By.id("amt7"));
		
		Actions action = new Actions(driver);
		
		action.dragAndDrop(bankToBeDragged, bankDropLocation).build().perform();
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		action.dragAndDrop(fiveThousandToBeDropped, fiveThousandDropLocation);
		
		//option 2 - drag and drop without using dragAndDrop()
		
		action.clickAndHold(bankToBeDragged).moveToElement(bankDropLocation).release().build().perform();
		action.clickAndHold(fiveThousandToBeDropped).moveToElement(fiveThousandDropLocation).release().build().perform();
		
		driver.close();

	}

}
