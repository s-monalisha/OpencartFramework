package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ActRegPage extends BasePage{
	
	public ActRegPage(WebDriver driver) {
		super(driver);
	}
	@FindBy(id="input-firstname")
	WebElement txtFName;
	
	public void inpFNameBox(String fname) {
		txtFName.sendKeys(fname);
	}
	
	@FindBy(css ="input#input-lastname")
	WebElement txtLName;
	
	public void inpLName(String lname) {
		txtLName.sendKeys(lname);
	}
	
	@FindBy(css="input#input-email")
	WebElement txtEMail;
	
	public void inpEMail(String email) {
		txtEMail.sendKeys(email);
	}
	
	@FindBy(name="telephone")
	WebElement txtPhn;
	
	public void inpPhn(String num) {
		txtPhn.sendKeys(num);
	}
	
	@FindBy(xpath="//input[@id='input-password']")
	WebElement txtPassword;
	
	public void inpPassword(String pwd) {
		txtPassword.sendKeys(pwd);
	}
	
	@FindBy(xpath="//input[@id='input-confirm']")
	WebElement txtConPwd;
	
	public void inConfirmPwd(String pwd) {
		txtConPwd.sendKeys(pwd);
	}
	
	@FindBy(xpath="//input[@type='checkbox']")
	WebElement chkBox;
	
	public void clkchkBox() {
		chkBox.click();
	}
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement btnContinue;
	
	public void clkContinue() {
		btnContinue.click();
	}
	
	@FindBy(xpath="//h1[text()='Your Account Has Been Created!']")
	WebElement showConMsg;
	
	public String getConfirmMsg() {
		try {
			return (showConMsg.getText());
		}
		catch(Exception e) {
			return (e.getMessage());
		}
		
		
		
	}




}
