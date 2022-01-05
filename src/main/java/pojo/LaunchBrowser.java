package pojo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LaunchBrowser {
	
	public static WebDriver callBrowser() {
	System.setProperty("webdriver.chrome.driver","G:\\Eclips\\Velocity\\Zerodha\\src\\main\\resources\\chromedriver.exe");
	ChromeOptions options = new ChromeOptions();
	options.addArguments("--disable-notifications");
	//options.addArguments("--disable-certifications");
	WebDriver driver = new ChromeDriver(options);
	driver.get("https://kite.zerodha.com/");
	return driver;
	}

}
