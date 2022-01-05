package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashBoard {
	@FindBy(xpath ="//span[text()='Dashboard']") private WebElement dashboard;
	@FindBy(xpath="//span[@class='nickname']") private WebElement name;
	@FindBy(xpath="//input[@icon='search']") private WebElement search;
	@FindBy(xpath="(//li[@class='search-result-item'])[2]") private WebElement hover;
	@FindBy(xpath="(//button[@class='button-blue'])[1]") private WebElement buy;
	@FindBy(xpath="(//button[@type=\"button\"])[3]") private WebElement close;
	@FindBy(xpath="//span[text()='Buy']") private WebElement BuyButton;
	@FindBy(xpath="//span[@class='icon icon-trending-up']") private WebElement chart;
	@FindBy(xpath="")private WebElement xyz;
	
public DashBoard(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
public String dashboard1() {
	return dashboard.getText();
}
public String name1() {
	return name.getText();
}

public void search1(String search2) {
	search.sendKeys(search2);
}
public void element1(WebDriver driver) {
	Actions actions = new Actions(driver);
	actions.moveToElement(hover).perform();
}

public void close1() {
	close.click();
}
public void chart1() {
	chart.click();
}
public void buy1() {
	buy.click();
}
public void BuyButton1() {
	BuyButton.click();
}


}
