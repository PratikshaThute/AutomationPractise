package automation_example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowserInvoke {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium soft\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.navigate().to("https://google.co.in/");
		String strActualtitle = driver.getTitle();
		System.out.println("launch page title is"+ " "+ strActualtitle );
		
		if(strActualtitle.equalsIgnoreCase("Google")) {
			System.out.println("Title match");
		}else {
			System.out.println("Title mismatch");
		}
		
	}

}
