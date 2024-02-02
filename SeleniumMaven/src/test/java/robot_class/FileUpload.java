package robot_class;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;

import SeleniumMavenProject.SeleniumMaven.base_class;

public class FileUpload extends base_class {

	public static void main(String[] args) throws Exception {
		launch_browser("chrome");
		navigate("https://www.ilovepdf.com/pdf_to_word");
		driver.findElement(By.xpath("//span[text()='Select PDF file']")).click();
		StringSelection ss = new StringSelection("\"F:\\Thute Pratiksha Resume.pdf\"");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		Robot r = new Robot();
		r.delay(3000);
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}

}
