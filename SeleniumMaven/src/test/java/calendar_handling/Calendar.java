package calendar_handling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import SeleniumMavenProject.SeleniumMaven.base_class;

public class Calendar extends base_class {

	public static void main(String[] args) {
		launch_browser("chrome");
		navigate("https://www.railyatri.in/");

		WebElement calendar = driver.findElement(By.xpath("//input[@id='datepicker_train']"));
		calendar.click();

		 
		
		while (true) {
			
			String M_Y = driver.findElement(By.xpath("(//th[@class='datepicker-switch'])[1]")).getText();
			System.out.println(M_Y);
			if (!(M_Y.contains("May 2024"))) {
				driver.findElement(By.xpath("(//th[@class='next'])[1]")).click();
			} else {
				break;
			}
		}
		driver.findElement(By.xpath("//td[text()='16']")).click();
		System.out.println("The entered date is :- " + calendar.getAttribute("value"));
	}
}
