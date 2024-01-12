package project;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

public class Dynamic_Code {
	
	public static WebDriver driver;
	public static String path = System.getProperty("user.dir");
	
	public static void browser_launch(String browser) {
		
		if(browser.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		}else if ( browser.equalsIgnoreCase("firefox")) {
			driver= new FirefoxDriver();
		}else if ( browser.equalsIgnoreCase("edge")) {
			driver= new EdgeDriver();
		}
		
		System.out.println("The browser launched is "+ browser);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
	
	public static void Hit_url(String url) {
		driver.get(url);
		System.out.println("The current url is "+ url);
	}
	
	public static void Takescreenshot (String imagename) throws Exception {
		TakesScreenshot ts = (TakesScreenshot) driver;
		 File From = ts.getScreenshotAs(OutputType.FILE);
		 File To = new File(path+"\\Screenshot\\"+ imagename + ".png");
		 FileHandler.copy(From, To);
	}
	
	

}
