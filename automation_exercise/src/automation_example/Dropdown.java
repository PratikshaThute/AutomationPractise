package automation_example;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium soft\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
				
		driver.get("https://omayo.blogspot.com");
		WebElement Model = driver.findElement(By.id("multiselect1"));
		Select carModel = new Select(Model);
		
		List<WebElement>Models = carModel.getOptions();
		System.out.println("The available options for carModel are");
		for (WebElement cm1 : Models) {
			System.out.println(cm1.getText());
		}
		
		carModel.selectByVisibleText("Hyundai");
		Thread.sleep(2000);
//		carModel.deselectByVisibleText("Hyundai");
		
		carModel.selectByIndex(3);
		Thread.sleep(2000);
//		carModel.deselectByIndex(3);
		carModel.selectByIndex(1);
		Thread.sleep(2000);
//		carModel.deselectByIndex(1);
//		carModel.deselectAll();
		
		System.out.println("The dropdown can select multiple option is : " + " " +carModel.isMultiple());
		
		WebElement Model1 = carModel.getFirstSelectedOption();
		String SelectedOption = Model1.getText();
		System.out.println("The First Selected option is" +" "+ SelectedOption );
		
		List<WebElement>Model2 = carModel.getAllSelectedOptions();
		for(WebElement model3 : Model2){
			System.out.println("The available selected options includes"+ " "+ model3.getText());
		}
		System.out.println("---------------------------------");
		
		WebElement Newsletter = driver.findElement(By.name("SiteMap"));
		Select OlderNewsletter = new Select(Newsletter);
		List<WebElement>Newsletter1 = OlderNewsletter.getOptions();
		System.out.println("The available options for OlderNewsletter are");
		for (WebElement NL1 :Newsletter1 ) {
			System.out.println(NL1.getText());
		}
			System.out.println("The dropdown can select multiple option is : " + " " +OlderNewsletter.isMultiple());
			OlderNewsletter.selectByVisibleText("doc 1");
			Thread.sleep(2000);
			
			WebElement NL2 = OlderNewsletter.getFirstSelectedOption();
			String NL3 = NL2.getText();
			System.out.println("The First Selected option is" +" "+ NL3 );
			
			driver.close();
			
		}
		
	
	
		
	
	}


