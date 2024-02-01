package report;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import SeleniumMavenProject.SeleniumMaven.base_class;

public class Generate_Report extends base_class {

	public static void main(String[] args) {
		
// use 3 class-- ExtentSparkReporter , ExtentReports , ExtentTest
		
//		create projectpath
		String projectpath = System.getProperty("user.dir");

//		create one folder in project with certain name
//		create object of class ExtentSparkReporter and pass argument as projectpath and folder name and reportname
		ExtentSparkReporter report = new ExtentSparkReporter(projectpath + "\\Reports\\Testing Report");
		
//		with the help of ref.var configure and set certain information related to report
		report.config().setDocumentTitle("Automation report");
		report.config().setReportName("Functional Testing Report");
//		theme if standard then ahs background white and if set as dark then background of report is black
		report.config().setTheme(Theme.STANDARD);
		
//		create object of ExtentReports class,
//		with the help of ref.var use attachReporter method and pass argument as ref.var of ExtentSparkReporter 
		ExtentReports r = new ExtentReports();
		r.attachReporter(report);
		
//		with the ref.var of ExtentReports, we can add information related to reports using setSystemInfo method()
		r.setSystemInfo("Operating System", "Windows");
		r.setSystemInfo("Browser", "Chrome");
		r.setSystemInfo("Software Test Engineer", "Pratiksha Thute");
		r.setSystemInfo("Web Application", "Facebook");
		
//		specify your block of code
		launch_browser("chrome");
		navigate("https://www.facebook.com/");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("pthute29@gmail.com");
		
//		with the ref.var of ExtentReports use createTest method store it in ref.var , its return type is ExtentTest
		ExtentTest test = r.createTest("Enter username");
		
//		with the ref.var of ExtentTest, you can add info related to test created using log method.
		test.log(Status.INFO, "username to be entered");
		test.log(Status.PASS, "testcase pass");
		
		WebElement pass = driver.findElement(By.xpath("//input[@id='pass']"));
		pass.sendKeys("12345");
		ExtentTest test1 = r.createTest("Enter password");
		test1.log(Status.INFO, "Password to be entered");
		test1.log(Status.PASS, "testcase pass");
		
		driver.findElement(By.xpath("//a[text()='Forgotten password?']")).click();
		ExtentTest test2 = r.createTest("Forgot password");
		test2.log(Status.INFO, "Forgot Password buttton to be click");
		test2.log(Status.PASS, "testcase pass");
		
//		to stop the monitoring use flush method using ref.var of ExtentReports 
//		if flush method is not use it will not generate report
		r.flush();
	}

}
