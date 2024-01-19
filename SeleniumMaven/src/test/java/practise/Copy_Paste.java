package practise;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import SeleniumMavenProject.SeleniumMaven.base_class;

public class Copy_Paste extends base_class {

	public static void main(String[] args) throws Exception {
		launch_browser("Chrome");
		navigate("https://www.naukri.com/");
		takescreenshot("Naukri - homepage");

		WebElement Login = driver.findElement(By.id("login_Layer"));

		Actions act = new Actions(driver);

		act.moveToElement(Login).click().build().perform();
	
		WebElement email = driver.findElement(By.xpath("//input[@placeholder='Enter your active Email ID / Username']"));
		email.sendKeys("pthute29@gmail.com");
		takescreenshot("naukri - enter username");

		act.moveToElement(email).keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
		act.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();

		takescreenshot("Naukri - select the username");
		act.sendKeys(Keys.TAB).build().perform();
	
		takescreenshot("Naukri - password");
		act.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();

		takescreenshot("Naukri - enter password");

	}

}
