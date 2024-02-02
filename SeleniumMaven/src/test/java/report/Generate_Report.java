package report;

import com.aventstack.extentreports.ExtentTest;

import SeleniumMavenProject.SeleniumMaven.base_class;

public class Generate_report extends base_class{

	public static void main(String[] args) throws Exception {
	launch_browser("chrome");
	navigate("https://www.facebook.com/");
	takescreenshot("fb");
	create_Report("Testing report");
	}

}
