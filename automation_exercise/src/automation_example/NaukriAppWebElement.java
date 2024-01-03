package automation_example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.*;

public class NaukriAppWebElement {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium soft\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.Naukri.com");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		
		driver.findElement(By.id("register_Layer")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("name")).sendKeys("Pratiksha Bhaskarrao Thute");
		driver.findElement(By.id("password")).sendKeys("Prati@123");
		driver.findElement(By.id("mobile")).sendKeys("7038300525");
		String path = System.getProperty("user.dir")+"F:\\selenium\\CV Pratiksha Thute.pdf";
//		StringSelect stringselect = new StringSelect(path);
		
//		driver.findElement(By.className("uploadResume resman-btn-primary resman-btn-small")).click();
		
	}

}
