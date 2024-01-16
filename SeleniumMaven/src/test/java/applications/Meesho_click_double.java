package applications;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import SeleniumMavenProject.SeleniumMaven.base_class;

public class Meesho_click_double extends base_class{

	public static void main(String[] args) throws Exception {
		launch_browser("Chrome");
		navigate("https://www.meesho.com/");
		takescreenshot("Meesho_Homepage");
		
		WebElement Search = driver.findElement(By.xpath("(//input[@font-weight='book'])[1]"));
		Search.sendKeys("Saree");
		Actions act = new Actions(driver);
		act.doubleClick(Search).build().perform();
		
		takescreenshot("Meesho - doubleclick on text entered");
		
		WebElement cart = driver.findElement(By.xpath("//span[text()='Cart']"));
		act.click(cart).build().perform();
		takescreenshot("Meesho - after clicking on cart");
		
		
	}

}
