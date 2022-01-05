package pom;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FundsPage {
	@FindBy(xpath="//a[@href='/funds']") private WebElement fundsTab;
	@FindBy(xpath="//a[text()='Withdraw']") private WebElement withdraw;
	@FindBy(xpath="//input[@name='eqWithdrawalValue']") private WebElement amountBox;
	@FindBy(xpath="//button[text()='Continue ']") private WebElement ContinueFunds;
	@FindBy(xpath="//img[@src='/static/images/close.svg']") private WebElement close;
	@FindBy(xpath="//span[text()='PENDING']")private WebElement pending;
	@FindBy(xpath="/html/body/div[2]/div[2]/div/div/div/div[3]/h3/text()") private WebElement RecentWithdrawls;
	@FindBy(xpath="//button[@type='submit']")private WebElement submit;
	@FindBy(xpath="/html/body/div[2]/div[2]/div/div/div/div[3]/table/tbody/tr[1]/td[3]")private WebElement amount1;
	
	public FundsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void fundsTab1() {
	fundsTab.click();
	}
	public void withdraw1(WebDriver driver,String amount) throws Exception {
	withdraw.click();
	Thread.sleep(10000);
	Set<String> address =driver.getWindowHandles();
	Iterator<String> itr = address.iterator();
	String Main= itr.next();
	String SubWindow = itr.next();
	System.out.println(Main);
	System.out.println(SubWindow);
	
	driver.switchTo().window(SubWindow);
	amountBox.sendKeys(amount);
	
	ContinueFunds.click();
	submit.click();
	Thread.sleep(2000);
	driver.switchTo().window(Main);

	/*Thread.sleep(2000);
	((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true)",RecentWithdrawls);
	
	RecentWithdrawls.click();
	Thread.sleep(2000);
	
	if(pending.getText().equals("PENDING")) 
		System.out.println("Amount Status is Correct");
		else
			System.out.println("Amount Status is false");
	
	System.out.println("Pending amount = " +amount1);
			
	driver.switchTo().window(Main);*/
	
	}

}
