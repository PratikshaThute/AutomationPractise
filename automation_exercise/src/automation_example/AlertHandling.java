package automation_example;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandling {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium soft\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
				
		driver.get("https://chandanachaitanya.github.io/selenium-practice-site/");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@id='alertBox']")).click();
		Alert alertbox = driver.switchTo().alert();
		Thread.sleep(2000);
		String alertText = alertbox.getText();
		System.out.println("Alert Text is"+ alertText);
		Thread.sleep(2000);
		alertbox.accept();
		
		
		driver.findElement(By.xpath("//button[@id='confirmBox']")).click();
		Alert confirmbox = driver.switchTo().alert();
		Thread.sleep(2000);
		String confirmtext = confirmbox.getText();
		System.out.println("confirm Text is"+" "+ confirmtext);
		Thread.sleep(2000);
		confirmbox.accept();
//		confirmbox.dismiss();
		
		driver.findElement(By.xpath("//button[@id='promptBox']")).click();
		Alert promptbox = driver.switchTo().alert();
		Thread.sleep(2000);
		String prompttext = promptbox.getText();
		System.out.println("prompt Text is"+" " + prompttext);
		Thread.sleep(2000);
		promptbox.accept();
//		promptbox.dismiss();
		
		driver.close();
		
	}

}
