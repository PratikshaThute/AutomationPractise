package applications;

import org.openqa.selenium.JavascriptExecutor;

import SeleniumMavenProject.SeleniumMaven.base_class;

public class Railyatri extends base_class {

	public static void main(String[] args) throws Exception {
	launch_browser("Chrome");
	navigate("https://www.railyatri.in/");
	
	takescreenshot("RailYatri- Homepage");
	
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(0,500)");
	
	takescreenshot("RailYatri- After scroll at 500 coordinate");
	
	js.executeScript("window.scrollBy(0,1200)");
	takescreenshot("RailYatri- After scroll at 1200 coordinate");
	
	js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	takescreenshot("RailYatri- Scroll at bottom");
	
	}

}
