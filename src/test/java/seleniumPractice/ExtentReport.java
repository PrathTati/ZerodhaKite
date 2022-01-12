package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.FindBy;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;


public class ExtentReport {
	static ExtentReports reports;
	ExtentTest html;
	static ExtentSparkReporter htmlReports;
	public static void main(String[] args) throws InterruptedException {
		
	//	reports= new ExtentReports();
		//htmlReports = new ExtentSparkReporter(System.getProperty("extent.html"));
		
	//	reports.attachReporter(htmlReports);
		
		System.setProperty("webdriver.chrome.driver","G:\\Eclips\\Velocity\\Zerodha\\src\\main\\resources\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		//options.addArguments("--disable-certifications");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://kite.zerodha.com/");
		
		driver.findElement(By.xpath("//input[@id='userid']")).sendKeys("OKP335");
		//htmlReports.getReport();

		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("EDC123456");
		//htmlReports.getReport();

		driver.findElement(By.xpath("//button[@type='")).click();
		//htmlReports.getReport();

		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='pin']")).sendKeys("654321");
		
		//htmlReports.getReport();
		
		reports.flush();

	}

}
