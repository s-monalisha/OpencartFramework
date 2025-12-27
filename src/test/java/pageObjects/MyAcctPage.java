package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAcctPage extends BasePage{
	
	public MyAcctPage(WebDriver driver) {
		super(driver);
	}
	
	
	@FindBy(xpath="//h2[text()='My Account']")
	WebElement showMyAcct;
	
	public boolean isMyAcctPageExists() {
		try {
			return (showMyAcct.isDisplayed());
		}
		catch(Exception e) {
			return false;
		}
	
	}
	
	@FindBy(linkText="Logout")
	WebElement lnkLogout;
	
	public void clkOnLogout() {
		lnkLogout.click();
	}
	

}
