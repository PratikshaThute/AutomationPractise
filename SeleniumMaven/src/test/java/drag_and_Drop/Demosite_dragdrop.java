package drag_and_Drop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import SeleniumMavenProject.SeleniumMaven.base_class;

public class Demosite_dragdrop extends base_class {

	public static void main(String[] args) throws Exception {
		launch_browser("Chrome");
		navigate("https://www.globalsqa.com/demo-site/draganddrop/");
		Thread.sleep(2000);
		takescreenshot("Demosite - homepage");

		WebElement frame = driver.findElement(By.cssSelector("iframe.demo-frame.lazyloaded"));
		driver.switchTo().frame(frame);
		
		WebElement img1 = driver.findElement(By.xpath("//h5[text()='High Tatras']"));
		WebElement img2 = driver.findElement(By.xpath("//h5[text()='High Tatras 2']"));
		WebElement img3 = driver.findElement(By.xpath("//h5[text()='High Tatras 3']"));
		WebElement img4 = driver.findElement(By.xpath("//h5[text()='High Tatras 4']"));
		
		WebElement target = driver.findElement(By.xpath("//span[text()='Trash']"));
		Actions act = new Actions(driver);
		
		act.clickAndHold(img1).moveToElement(target).release().build().perform();
		Thread.sleep(2000);
		takescreenshot("Demosite - dropped img1");
		
		act.clickAndHold(img2).moveToElement(target).release().build().perform();
		Thread.sleep(2000);
		takescreenshot("Demosite - dropped img2");
		
		act.clickAndHold(img3).moveToElement(target).release().build().perform();
		Thread.sleep(2000);
		takescreenshot("Demosite - dropped img3");
		
		act.clickAndHold(img4).moveToElement(target).release().build().perform();
		Thread.sleep(2000);
		takescreenshot("Demosite - dropped img4");
		
		driver.switchTo().defaultContent();
		WebElement Sortable = driver.findElement(By.xpath("//span[text()='Sortable']"));
		act.moveToElement(Sortable).click().build().perform();
		takescreenshot("Demosite - click on sortable");

		
	}

}
