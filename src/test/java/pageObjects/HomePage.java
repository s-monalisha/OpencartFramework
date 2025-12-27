package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{
	
	public HomePage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//span[text()='My Account']")
	WebElement clkMyAct;
	
	public void clickMyAcct() {
		clkMyAct.click();
	}
	
	@FindBy(linkText="Register")
	WebElement clkActReg;
	
	public void clickOnAcctReg() {
		clkActReg.click();
	}
	
	@FindBy(xpath="//a[text()='Login']")
	WebElement clkLogin;
	
	public void clickOnLogin() {
		clkLogin.click();
	}
	
	

}
