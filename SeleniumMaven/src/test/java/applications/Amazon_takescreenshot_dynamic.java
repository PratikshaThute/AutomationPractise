package applications;

import org.openqa.selenium.By;

import SeleniumMavenProject.SeleniumMaven.base_class;

public class Amazon_takescreenshot_dynamic extends base_class {

	public static void main(String[] args) throws Exception {
		
		launch_browser("Chrome");
		navigate("https://www.amazon.in/");
		
		takescreenshot("Amazon Homepage");
		
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Home Decor items");
		takescreenshot("Product Name entered");
		
		driver.findElement(By.id("nav-search-submit-button")).click();
		takescreenshot("Product searched");
		
		driver.findElement(By.xpath("(//i[@class='a-icon a-icon-extender-expand'])[1]")).click();
		takescreenshot("see more popular shopping ideas");
		
		driver.findElement(By.xpath("//a[text()='Gift Ideas	']")).click();
		takescreenshot("Gift ideas");
		
		driver.findElement(By.xpath("//span[text()='Handmade products']")).click();
		takescreenshot("hand made gifts product");
		
		driver.findElement(By.xpath("//button[text()='Home decor']")).click();
		takescreenshot("Home decor handloom product");
		
		driver.findElement(By.xpath("(//div[@class='sc-1myhuh-0 jAcwUT' and @height='164'])[3]")).click();
		takescreenshot("Select product");
		
		driver.findElement(By.xpath("(//input[@aria-labelledby='a-autoid-7-announce'])[4]")).click();
		takescreenshot("roll over image of view product");
		
		driver.findElement(By.cssSelector("input#add-to-cart-button")).click();
		takescreenshot("add to cart");
		
	
	}

}
