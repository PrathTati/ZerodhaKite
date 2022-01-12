package seleniumPractice;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class GenerateExtentReport {
	
	ExtentReports extent;
	ExtentTest test;
	ExtentHtmlReporter htmlReporter;
	
	@BeforeTest
	public void startReprt() {
		extent = new ExtentReports();
		htmlReporter = new ExtentHtmlReporter("G:\\Eclips\\Velocity\\Zerodha\\test-output\\Report.html");
		extent.attachReporter(htmlReporter);
		extent.setSystemInfo("Host Name ","Local Host");
		extent.setSystemInfo("Environement ","UAT");
		extent.setSystemInfo("User Name","Prathamesh");
		extent.config();
	}
	
	@Test
	public void DemoReportPass() {
		test = extent.createTest("Test");
		Assert.assertTrue(true);
		test.log(Status.PASS, "Test Pass");
	
	}
	@Test
	public void DemoReportFail() {
		test = extent.createTest("Test");
		Assert.assertTrue(false);
		test.log(Status.FAIL, "Test Fail");
	
	}
	
	@AfterTest
	public void endreport() {
		extent.flush();
	}
	
	

}
