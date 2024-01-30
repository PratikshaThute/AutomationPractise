package dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import project.Dynamic_Code;

public class Dynamic_dropdown extends Dynamic_Code {

	public static void main(String[] args) {

		browser_launch("Chrome");
		Hit_url("https://www.railyatri.in/");

		WebElement from_city = driver.findElement(By.xpath("//input[@class='form-control from stationpicker ui-autocomplete-input']"));
		from_city.sendKeys("Nagpur");

		List<WebElement> from_options = driver.findElements(By.xpath("//ul[@id='ui-id-5']/li"));
		for (int x = 0; x < from_options.size(); x++) {
			if (from_options.get(x).getText().equalsIgnoreCase("NAGPUR MOTI BAGH | MIB")) {
				from_options.get(x).click();
			}
		}

		System.out.println("The city entered in from field is :- " + from_city.getAttribute("value"));

		WebElement to_city = driver.findElement(By.xpath("//input[@class='form-control to stationpicker ui-autocomplete-input']"));
		to_city.sendKeys("Ay");
		List<WebElement> to_options = driver.findElements(By.xpath("//ul[@id='ui-id-6']/li"));
		for (int y = 0; y < to_options.size(); y++) {
			if (to_options.get(y).getText().equalsIgnoreCase("AYODHYA DHAM | AY")) {
				to_options.get(y).click();
			}

		}
		System.out.println("The city entered in to field is :- " + to_city.getAttribute("value"));
	}
}