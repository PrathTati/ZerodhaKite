package pojo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parametrization {
	
	WebDriver driver;

	
	@Parameters({"Browser","url","url1"})
	@Test
	public void launchBrowser(String Browser, String url, String url1) {
		System.out.println("Running Browser :"+Browser);
		
		if(Browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "G:\\Eclips\\Velocity\\Zerodha\\src\\main\\resources\\chromedriver.exe");
			driver = new ChromeDriver();
			//driver.get(url);
		}
		else if(Browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "G:\\Eclips\\Velocity\\Zerodha\\src\\main\\resources\\geckodriver.exe");
			WebDriver driver = new FirefoxDriver();
			driver.get(url);
		}
		else if (Browser.equals("safari")) {
			System.out.println("Safari Launched");
			System.out.println(url);
		}
		else if (Browser.equalsIgnoreCase("IE")) {
			
			System.out.println("Internet Explorer");
			System.out.println(url);
		}
		
		driver.get(url1);
	}
	@Parameters({"id","pass"})
	@Test (priority =2)
	public void crm(String id, String pass) {
		System.out.println("user id is " +id);
		System.out.println("password is" +pass);
	}
	
	

}
