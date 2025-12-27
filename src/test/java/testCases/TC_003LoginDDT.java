package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAcctPage;
import testBase.BaseClass;
import utilities.DataProviders;

public class TC_003LoginDDT extends BaseClass{
	
	@Test(dataProvider="LoginData", dataProviderClass = DataProviders.class)
	public void Verify_Login(String email, String pwd, String exp) {
		try {
		HomePage hp = new HomePage(driver);
		hp.clickMyAcct();
		hp.clickOnLogin();
		
		LoginPage lp = new LoginPage(driver);
		lp.inpEmailvalue(email);
		lp.inpPasswordValue(pwd);
		lp.clkOnLoginbtn();
		log.info("Login successful");
		
		MyAcctPage macc = new MyAcctPage(driver);
		boolean targetPage = macc.isMyAcctPageExists();
		if(exp.equalsIgnoreCase("valid")) {
			if(targetPage==true) {
				macc.clkOnLogout();
				Assert.assertTrue(true);
			}
			else {
				Assert.assertTrue(false);
			}
		}
		
		if(exp.equalsIgnoreCase("invalid")) {
			if(targetPage==false) {
				macc.clkOnLogout();
				Assert.assertTrue(false);
			}
			else {
				Assert.assertTrue(true);
			}
		}
		}
		catch(Exception e) {
			Assert.fail();
		}
		log.info("Logout successfully");
	}

}
