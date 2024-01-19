package drop_down;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import SeleniumMavenProject.SeleniumMaven.base_class;

public class Practise_Dropdown extends base_class {
	public static void main(String[] args) throws Exception {
		
		launch_browser("chrome");
		navigate("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
		
		 WebElement products = driver.findElement(By.xpath("(//select[@class='col-lg-3'])[1]"));
		 Select sc = new Select(products);
		 sc.selectByVisibleText("Google");
		 Thread.sleep(2000);
		 takescreenshot("Product as Google");
		 
		 WebElement Animals = driver.findElement(By.xpath("(//select[@class='col-lg-3'])[2]"));
		 Select sc1 = new Select(Animals);
		 sc1.selectByValue("avatar");
		 takescreenshot("Animals as Avatar");
		 Thread.sleep(2000);
		 
		 sc.selectByIndex(3);
		 takescreenshot("Product as Yahoo");
		 
	}
}
