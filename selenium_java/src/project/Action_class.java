package project;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Action_class extends Dynamic_Code{

	public static void main(String[] args) throws Exception {
		browser_launch("Chrome");
		Hit_url("https://www.netmeds.com/");
		Thread.sleep(2000);
		Takescreenshot("Netmeds - Homepage");
		
		WebElement searchbox = driver.findElement(By.cssSelector("input#search"));
		Actions act = new Actions(driver);
		act.moveToElement(searchbox).sendKeys("Azithromycin").sendKeys(Keys.ENTER).build().perform();
		Takescreenshot("Netmeds - searched Azithromycin" );

	}

}
