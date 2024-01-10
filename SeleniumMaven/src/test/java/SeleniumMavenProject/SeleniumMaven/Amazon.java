package SeleniumMavenProject.SeleniumMaven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import SeleniumMavenProject.SeleniumMaven.base_class;

public class Amazon extends base_class{

	public static void main(String[] args) {
		launch_browser("Chrome");
		driver.get("https://www.amazon.in/");
		WebElement search = driver.findElement(By.cssSelector("input[id=\"twotabsearchtextbox\"]"));
//		search.sendKeys("Girls Wallet");
//		System.out.println("The entered text in the search box is :- "+ search.getAttribute("value"));
		System.out.println("The x-coordinate of search box is :- "+ search.getLocation().x);
		System.out.println("The y-coordinate of search box is :- "+ search.getLocation().y);
		System.out.println("The size of searchbox is :- "+ search.getSize());

	}

}
