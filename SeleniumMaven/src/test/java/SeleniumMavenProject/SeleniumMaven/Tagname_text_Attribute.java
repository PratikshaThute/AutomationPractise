package SeleniumMavenProject.SeleniumMaven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Tagname_text_Attribute extends base_class {

	public static void main(String[] args) {
		launch_browser("chrome");
		driver.get("https://www.amazon.in/");
		WebElement Todays_deals = driver.findElement(By.xpath("//a[text()=\"Today's Deals\"]"));
		System.out.println("The tagname of Todays deals link is attribute is :- "+ Todays_deals.getTagName());
		System.out.println("the attribute value of class is :- " + Todays_deals.getAttribute("class"));
		System.out.println("The link name is :- " + Todays_deals.getText());
		Todays_deals.click();
		
		WebElement searchbox = driver.findElement(By.cssSelector("input[id=\"twotabsearchtextbox\"]"));
		searchbox.sendKeys("Mobiles");
		System.out.println("The entered Text in the search box is :- " + searchbox.getAttribute("value"));
		searchbox.click();
	}

}
