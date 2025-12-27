package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{
	
	public LoginPage(WebDriver driver){
		super(driver);
	}
	
	@FindBy(css="input#input-email")
	WebElement txtEmail;
	
	public void inpEmailvalue(String email) {
		txtEmail.sendKeys(email);
	}
	
	@FindBy(xpath="//input[@name='password']")
	WebElement txtPwd;
	
	public void inpPasswordValue(String pwd) {
		txtPwd.sendKeys(pwd);
	}
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement btnLogin;
	
	public void clkOnLoginbtn() {
		btnLogin.click();
	}
	
	
	
	

}
