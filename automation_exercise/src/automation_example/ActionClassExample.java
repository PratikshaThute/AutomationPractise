package automation_example;

import org.openqa.selenium.By;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClassExample {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "F:\\Selenium soft\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
				
		driver.get("https://demoqa.com/droppable");
		Thread.sleep(2000);
		
		Actions actions = new Actions(driver);
		WebElement Drag = driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement Drop = driver.findElement(By.xpath("//div[@class='drop-box ui-droppable'][1]"));
		actions.dragAndDrop(Drag, Drop).build().perform();
		Thread.sleep(2000);
		
		actions.sendKeys(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(2000);
		
		actions.sendKeys(Keys.PAGE_UP).build().perform();
		Thread.sleep(2000);
		
	}

}
