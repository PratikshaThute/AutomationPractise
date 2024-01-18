package practise;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import SeleniumMavenProject.SeleniumMaven.base_class;

public class Automate extends base_class{

	public static void main(String[] args) throws Exception {
		launch_browser("chrome");
		navigate("https://www.google.com/");
		
		WebElement search = driver.findElement(By.id("APjFqb"));
		Actions act = new Actions(driver);
		act.moveToElement(search).sendKeys("Politics").sendKeys(Keys.ENTER).build().perform();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
		
		 WebElement types = driver.findElement(By.xpath("(//div[@jsname='pcRaIe'])[2]"));
		 act.moveToElement(types).click().build().perform();
		 
		 Thread.sleep(2000);
		 
		 act.click(types).build().perform();
		 js.executeScript("window.scrollBy(0,3752)");
		 
		 driver.get("https://m.economictimes.com/news/politics");
		 js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		 
		 Thread.sleep(2000);
		 js.executeScript("window.history.back()");
		 
		 Thread.sleep(2000);
		 js.executeScript("window.history.back()");
		 
		 Thread.sleep(2000);
		 js.executeScript("window.history.go(0)");
		 
		 Thread.sleep(2000);
		 js.executeScript("window.history.forward()");
		
		
		
	}

}
