
package uploadfiledemo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.awt.AWTException;
import java.awt.datatransfer.StringSelection;
import org.openqa.selenium.interactions.Actions;

public class UploadFile {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "F:\\Selenium soft\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[@href='/upload']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='drag-drop-upload']")).click();
		
		String path = System.getProperty("user.dir")+ "F:\\selenium\\CV Pratiksha Thute.pdf";
		StringSelection stringselection = new StringSelection(path);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringselection,null);
		
		Actions action = new Actions(driver);
		WebElement Choosefile = driver.findElement(By.xpath("//div[@id='drag-drop-upload']"));
		action.moveToElement(Choosefile).click().build().perform();
		

//		Robot robot = new Robot();
//		keyRelease(KeyEvent.VK_ENTER);
//		robot.keyPress(KeyEvent.VK_CONTROL);
//		robot.keyPress(KeyEvent.VK_V);
//		robot.keyRelease(KeyEvent.VK_CONTROL);
//		robot.keyRelease(KeyEvent.VK_V);
//		robot.keyPress(KeyEvent.VK_ENTER);
//		robot.keyRelease(KeyEvent.VK_ENTER);
	}

}
