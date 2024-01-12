package applications;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import SeleniumMavenProject.SeleniumMaven.base_class;

public class NetMeds_Action_Class extends base_class {

	public static void main(String[] args) throws Exception {
		launch_browser("Chrome");
		navigate("https://www.netmeds.com/");
		takescreenshot("NetMeds - Homepage");
		
		WebElement wellness = driver.findElement(By.xpath("(//a[text()='Wellness'])[1]"));
		Actions act = new Actions(driver);
		act.moveToElement(wellness).build().perform();
		takescreenshot("NetMeds - Wellness webelement");
		
		
		WebElement Beauty = driver.findElement(By.xpath("(//a[text()='Beauty'])[1]"));
		act.moveToElement(Beauty).build().perform();
		takescreenshot("NetMeds - Beauty webelement");
		
		Thread.sleep(3000);
		WebElement sign = driver.findElement(By.xpath("//a[text()=' Sign in / Sign up ']"));
		act.moveToElement(sign).contextClick().build().perform();
		
		takescreenshot("NetMeds - Right click on Sign in / sign up");
		
	}

}
