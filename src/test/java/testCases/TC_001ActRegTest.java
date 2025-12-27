package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.ActRegPage;
import pageObjects.HomePage;
import testBase.BaseClass;

public class TC_001ActRegTest extends BaseClass{
	
	
	@Test(groups= {"Sanity" ,"Master"})
	public void VerifyActReg() throws Exception {
		try {
		HomePage hp = new HomePage(driver);
		hp.clickMyAcct();
		log.info("clicking on my account");
		hp.clickOnAcctReg();
		
		ActRegPage acp = new ActRegPage(driver);
		acp.inpFNameBox(randomString());
		acp.inpLName(randomString());
		acp.inpEMail(randomString()+"@gmail.com");
		acp.inpPhn(randomNumber());
		String password = randomAlphanumeric(); 
		acp.inpPassword(password);
		acp.inConfirmPwd(password);
		acp.clkchkBox();
		Thread.sleep(1000);
		acp.clkContinue();
		log.info("Login succesful");
		
		String confMsg = acp.getConfirmMsg();
		Assert.assertEquals(confMsg, "Your Account Has Been Created!");
	
	}
	catch(Exception e) {
		log.error("Test failed");
		log.debug("Debug logs");
		Assert.fail();
	}
	}
	
	
}
