package report;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import SeleniumMavenProject.SeleniumMaven.base_class;

public class Report_screenshot extends base_class {
	public static ExtentTest test;

	public static void main(String[] args) throws Exception {

		String Projectpath = System.getProperty("user.dir");

		ExtentSparkReporter report = new ExtentSparkReporter("../SeleniumMaven/Reports/testing");
		report.config().setDocumentTitle("Automation testing");
		report.config().setReportName("Sanity Testing");
		report.config().setTheme(Theme.DARK);

		ExtentReports r = new ExtentReports();
		r.attachReporter(report);
		r.setSystemInfo("OS", "Windows");
		r.setSystemInfo("Browser", "Chrome");
		r.setSystemInfo("Test Engineer", "Pratiksha Thute");
		r.setSystemInfo("Application", "Naukri.com");

		launch_browser("chrome");
		navigate("https://www.naukri.com/");
		takescreenshot("Naukri-Homepage");

		test = r.createTest("Naukri homepage");
		test.log(Status.INFO, "Homepage verification");
		test.log(Status.PASS, "Verification successful");
		test.addScreenCaptureFromPath(Projectpath + "\\ReportEvidences\\Naukri-Homepage.png");

		driver.findElement(By.xpath("//div[text()='Search']")).click();
		takescreenshot("Naukri-Search");

		test = r.createTest("Naukri Search button");
		test.log(Status.INFO, "Search functionality");
		test.log(Status.PASS, "Search clicked successfully");
		test.addScreenCaptureFromPath(Projectpath + "\\ReportEvidences\\Naukri-Search.png");

		r.flush();

	}

}
