package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAcctPage;
import testBase.BaseClass;

public class TC_002LoginTest extends BaseClass{
	
	@Test(groups= {"Regression" , "Master"})
	public void loginTest() {
		try {
		HomePage hp = new HomePage(driver);
		hp.clickMyAcct();
		hp.clickOnLogin();
		log.info("clickin on login option");
		
		LoginPage lp = new LoginPage(driver);
		lp.inpEmailvalue(prop.getProperty("email"));
		lp.inpPasswordValue(prop.getProperty("password"));
		lp.clkOnLoginbtn();
		log.info("Login successful");
		
		MyAcctPage macc = new MyAcctPage(driver);
		boolean targetPage = macc.isMyAcctPageExists();
		Assert.assertTrue(targetPage);
		macc.clkOnLogout();
		log.info("Log out successful");
		}
		catch(Exception e) {
			Assert.fail();
		}
		
	}
	
}
