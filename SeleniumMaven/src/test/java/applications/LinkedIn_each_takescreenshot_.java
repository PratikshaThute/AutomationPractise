package applications;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

import SeleniumMavenProject.SeleniumMaven.base_class;

public class LinkedIn_each_takescreenshot_ extends base_class {

	public static void main(String[] args) throws Exception {
		launch_browser("Chrome");
		navigate("https://in.linkedin.com/");
		
		TakesScreenshot tc = (TakesScreenshot) driver;
		File Source= tc.getScreenshotAs(OutputType.FILE);
		File Target = new File("../SeleniumMaven/target/homepage.png");
		FileHandler.copy(Source, Target);
		
		driver.findElement(By.cssSelector("input#session_key")).sendKeys("pthute29@gmail.com");
		
		TakesScreenshot tc1 = (TakesScreenshot) driver;
		File Source1 = tc1.getScreenshotAs(OutputType.FILE);
		File Target1 = new File("../SeleniumMaven/target/email.png");
		FileHandler.copy(Source1, Target1);
		
		driver.findElement(By.cssSelector("input#session_password")).sendKeys("Prati@123");
		TakesScreenshot tc2 = (TakesScreenshot) driver;
		File Source2 = tc2.getScreenshotAs(OutputType.FILE);
		File Target2 = new File("../SeleniumMaven/target/password.png");
		FileHandler.copy(Source2, Target2);
		
	}

}
