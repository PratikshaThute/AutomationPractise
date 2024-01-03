package selenium_java;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindwebElement {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.metrorailnagpur.com/");
		driver.findElement(By.xpath("//button[@style='margin-right:-37px;margin-top:-10px;width:30px;height:30px;background: #fff;opacity: 1;']")).click();
		
		
	}

}
