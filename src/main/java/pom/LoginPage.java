package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	@FindBy(xpath="//div[@class='form-header text-center']") private WebElement heading;
	@FindBy(xpath="//input[@id='userid']")private WebElement userID;
	@FindBy(xpath="//input[@id='password']") private WebElement pass;
	@FindBy(xpath="//button[@type='submit']") private WebElement login;

	//2FA
	
	@FindBy(xpath="//input[@id='pin']") private WebElement pin;
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	
	public String heading1() {
		return heading.getText();
	}
	public void userID1(String userID2) {
		userID.sendKeys(userID2);
	}
	public void pass1(String pass2) {
		pass.sendKeys(pass2);
	}
	public void login() {
		login.click();
	}
	public void pin1(String pin2) {
		pin.sendKeys(pin2);
	}	
	public boolean isPinDisplayed() {
		return pin.isDisplayed();
	}
	public boolean loginIsEnabled() {
		return login.isEnabled();
	}

}
