package drag_and_Drop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import SeleniumMavenProject.SeleniumMaven.base_class;

public class Drag_Drop extends base_class {

	public static void main(String[] args) throws Exception {
		launch_browser("Chrome");
		navigate("https://jqueryui.com/droppable/");
		takescreenshot("Drag & Drop Homepage");

		WebElement frame = driver.findElement(By.cssSelector("iframe.demo-frame"));
		driver.switchTo().frame(frame);
		WebElement drag = driver.findElement(By.cssSelector("div#draggable"));
		WebElement drop = driver.findElement(By.cssSelector("div#droppable"));

		Actions act = new Actions(driver);
		act.dragAndDrop(drag, drop).build().perform();
		takescreenshot("Drag & Drop - After dragging");
		
		driver.switchTo().defaultContent();
		WebElement Selectable = driver.findElement(By.linkText("Selectable"));
		act.moveToElement(Selectable).click().build().perform();
		takescreenshot("Drag and Drop - Selectable");
	}

}
