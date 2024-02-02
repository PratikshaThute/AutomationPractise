package SeleniumMavenProject.SeleniumMaven;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class base_class {
	public static WebDriver driver;
	public static String Projectpath = System.getProperty("user.dir");
	public static ExtentSparkReporter report;
	public static ExtentTest test;

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
		System.out.println("The title of webpage is : " + driver.getTitle());
	}

	public static void takescreenshot(String screenshotname) throws Exception {
		TakesScreenshot tc = (TakesScreenshot) driver;
		File Source = tc.getScreenshotAs(OutputType.FILE);
		File SaveTo = new File(Projectpath + "\\ReportEvidences\\" + screenshotname + ".png");
		FileHandler.copy(Source, SaveTo);
	}

	public static void create_Report(String ReportName) {

		ExtentSparkReporter report = new ExtentSparkReporter("../SeleniumMaven/Reports/" + ReportName);
		report.config().setDocumentTitle("Testing Report");
		report.config().setReportName("Functional Testing");
		report.config().setTheme(Theme.STANDARD);

		ExtentReports r = new ExtentReports();
		r.attachReporter(report);

		r.setSystemInfo("OS", "Windows");
		r.setSystemInfo("Browser", "Chrome");
		r.setSystemInfo("Test Engineer", "Pratiksha Thute");
		r.setSystemInfo("Application", "Flipkart");

		ExtentTest test = r.createTest("Functionality");
		test.log(Status.INFO, "Fb- functionality");
		test.log(Status.PASS, "Functionality verified");
		test.addScreenCaptureFromPath(Projectpath + "\\ReportEvidences\\fb.png");

		r.flush();

	}
	
	public static void database_testing (String database, String sql, String col1, String col2) throws Exception{
		String host = "localhost";
		String Portnumber = "3306";
		Connection connect = DriverManager.getConnection("jdbc:mysql://" + host+ ":"+ Portnumber +"/"+ database,"root", "Mysql1998");
		Statement s = connect.createStatement();
		ResultSet result = s.executeQuery(sql);
		result.next();
		System.out.println("The username is :- " + result.getString(col1));
		System.out.println("The password is :- " + result.getString(col2));
	}
	
	public static void Upload_File(String Filepath) throws Exception {
		StringSelection ss = new StringSelection(Filepath);
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
