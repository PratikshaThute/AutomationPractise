package automation_example;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticTable {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium soft\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
				
		driver.get("https://www.agriculturewale.com/current-msp-rate-2022-23/");
		Thread.sleep(2000);
		
		WebElement MspCrop = driver.findElement(By.id("wptb-table-id-2419"));
		
//		List<WebElement> allRows = MspCrop.findElements(By.id("wptb-table-id-2419"));
//		for (WebElement row : allRows) {
//			System.out.println("The rows in the table are :"+ row.findElements(")
//		}
		
		
		
		}
}
		
	


