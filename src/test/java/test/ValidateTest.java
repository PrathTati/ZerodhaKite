package test;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pojo.LaunchBrowser;
import pom.DashBoard;
import pom.FundsPage;
import pom.LoginPage;


public class ValidateTest {
	
WebDriver driver;
	
	@BeforeClass()
	public void StartTest() throws InterruptedException {
		System.out.println("Start Test");
		driver = LaunchBrowser.callBrowser();
		
		
		Assert.assertEquals(driver.getCurrentUrl(),"https://kite.zerodha.com/");
		LoginPage loginPage = new LoginPage(driver);
		SoftAssert assertions = new SoftAssert();
		assertions.assertEquals(loginPage.heading1(), "Login to Kite");
		assertions.assertTrue(loginPage.loginIsEnabled());
		loginPage.userID1("OKP335");
		loginPage.pass1("EDC123456");
		loginPage.login();
		Thread.sleep(2000);
		Assert.assertTrue(loginPage.isPinDisplayed());
		loginPage.pin1("654321");
		loginPage.login();

		
		Thread.sleep(2000);
		assertions.assertAll();
	}
	@Test (priority=1)
	public void Test1() throws Exception {		
		DashBoard mainPage = new DashBoard(driver);
		Assert.assertEquals(mainPage.name1(),"Rahul");
		mainPage.search1("TATAMOTORS");
		Thread.sleep(2000);
		mainPage.element1(driver);
		mainPage.buy1();
		mainPage.chart1();
		//mainPage.BuyButton1();
	}
	@Test(enabled= false)
	public void Test2() throws Exception {
		FundsPage FundsPage1 = new FundsPage(driver);
		Thread.sleep(5000);
		FundsPage1.fundsTab1();
		FundsPage1.withdraw1(driver, "600");		
	}

}
