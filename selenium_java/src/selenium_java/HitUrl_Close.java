package selenium_java;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HitUrl_Close {

	public static void main(String[] args) throws Exception {
//		to launch browser
		WebDriver Driver = new ChromeDriver();
		
//		to maximize window
		Driver.manage().window().maximize();
		
//		to give wait to every statement
		Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
//		to hit required url
		Driver.get("https://www.amazon.in/");
		
		Thread.sleep(5000);
		
//		to close tab
		Driver.close();
	}

}
