package SeleniumMavenProject.SeleniumMaven;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

public class base_class {
	public static WebDriver driver;
	public static String Projectpath = System.getProperty("user.dir");

	public static void launch_browser(String browser) {

		if (browser.equalsIgnoreCase("Chrome")) {
			driver = new ChromeDriver();
			System.out.println("Launched browser is :- " + browser);

		} else if (browser.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
			System.out.println("Launched browser is :- " + browser);

		} else if (browser.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
			System.out.println("Launched browser is :- " + browser);

		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	public static void navigate(String url) {
		driver.get(url);
		System.out.println("Navigate Url is :-" + url);
	}

	public static void takescreenshot(String screenshotname) throws Exception {
		TakesScreenshot tc = (TakesScreenshot) driver;
		File Source = tc.getScreenshotAs(OutputType.FILE);
		File Target = new File(Projectpath + "\\target\\" + screenshotname + ".png");
		FileHandler.copy(Source, Target);
	}
}
