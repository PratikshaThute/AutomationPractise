package practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import SeleniumMavenProject.SeleniumMaven.base_class;

public class Slider extends base_class{

	public static void main(String[] args) throws Exception {
		launch_browser("Chrome");
		navigate("https://jqueryui.com/slider/");
		
		WebElement frame = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(frame);
		
		WebElement slider = driver.findElement(By.xpath("//span[@class='ui-slider-handle ui-corner-all ui-state-default']"));
		Actions act = new Actions(driver);
		act.moveToElement(slider).dragAndDropBy(slider, 450, 0).build().perform();
		Thread.sleep(2000);
		act.dragAndDropBy(slider, -200, 0).build().perform();
		
//		another method to use slider
		act.clickAndHold(slider).moveByOffset(350, 0).release().build().perform();
		Thread.sleep(2000);
		act.clickAndHold(slider).moveByOffset(-300, 0).release().build().perform();
		driver.switchTo().defaultContent();
		WebElement resize = driver.findElement(By.xpath("//a[text()='Resizable']"));
		act.moveToElement(resize).click().build().perform();
		
	}

}
