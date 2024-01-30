package tab_parent_child;

import java.awt.Window;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import SeleniumMavenProject.SeleniumMaven.base_class;

public class Handle_Tabs extends base_class {

	public static void main(String[] args) throws Exception {
		launch_browser("Chrome");
		navigate("https://www.naukri.com/");
		takescreenshot("parent window");
		
		// scroll to bottom
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");

		Thread.sleep(3000);
		takescreenshot("Scroll to bottom");
		Thread.sleep(2000);
		
		// locate careers and click
		driver.findElement(By.xpath("//a[text()='Careers']")).click();
		takescreenshot("child window");

		// store the window in set collection
		Set<String> window = driver.getWindowHandles();
		Iterator<String> itr = window.iterator();

		// get the id using next() method
		String parent_win = itr.next();
		System.out.println("The Parent window id is :- " + parent_win);

		String child_win = itr.next();
		System.out.println("The Child window id is :- " + child_win);

		// switch control of driver to child window
		driver.switchTo().window(child_win);

		// locate element People and click on it
		driver.findElement(By.xpath("//a[text()='People']")).click();
		takescreenshot("click on people element from child window");

		// switch control of driver to parent window
		driver.switchTo().window(parent_win);

		// click on login
		driver.findElement(By.xpath("//a[text()='Login']")).click();
		takescreenshot("click on login button from parent window");
	}

}
