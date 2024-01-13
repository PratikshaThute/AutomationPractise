package test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import SeleniumMavenProject.SeleniumMaven.base_class;

public class NetMeds extends base_class {

	public static void main(String[] args) throws Exception {
		launch_browser("Chrome");
		navigate("https://www.netmeds.com/");

		Actions act = new Actions(driver);
		WebElement element = driver.findElement(By.xpath("(//a[text()='Beauty'])[1]"));
		act.moveToElement(element).build().perform();

		driver.findElement(By.xpath("//input[@id='search']")).sendKeys("Paracetamol");
		takescreenshot("entered name paracetamol");

		driver.findElement(By.xpath("//a[text()=' Medicine']")).click();
		takescreenshot("medicine");

		driver.findElement(By.xpath("//a[text()=' Anaemia (60) ']")).click();
		takescreenshot("Anaemia");

		driver.findElement(By.xpath("//a[text()='RUBIRED Suspension 150ml']")).click();
		takescreenshot("med selected");

		driver.findElement(By.cssSelector("div.text")).click();
		takescreenshot("cart");

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.history.back()");

		takescreenshot("back");

		driver.findElement(By.xpath("//a[text()=' Sign in / Sign up ']")).click();
		takescreenshot("sign in/ sign up");
	}

}
