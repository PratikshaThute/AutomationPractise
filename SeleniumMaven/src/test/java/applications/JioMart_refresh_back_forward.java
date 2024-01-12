package applications;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import SeleniumMavenProject.SeleniumMaven.base_class;

public class JioMart_refresh_back_forward extends base_class {

	public static void main(String[] args) throws Exception {
		launch_browser("Chrome");
		navigate("https://www.jiomart.com/");

		takescreenshot("JioMart-homepage");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.history.go(0)");
		takescreenshot("JioMart - after refresh");
		
		driver.findElement(By.xpath("(//a[text()='Premium Fruits'])[2]")).click();
		takescreenshot("JioMart - click on premium fruits");
		
		js.executeScript("window.history.back()");
		takescreenshot("JioMart - back to homepage");
		
		js.executeScript("window.history.forward()");
		takescreenshot("JioMart - forward to premium fruits");
	}

}
