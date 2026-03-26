package testCases;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.AccountRegistrationPage;
import pageObjects.HomePage;
import testBase.BaseClass;

public class TC01_AccountRegistrationTest extends BaseClass{
	
	
	@Test(groups= {"Regression","Master"})
	public void test_Account_Registration() {
		try {
			HomePage hp=new HomePage(driver);
			AccountRegistrationPage regpage=new AccountRegistrationPage(driver);
			hp.clickMyAccount();
			hp.clickRegister();
			
			regpage.setFirstName(randomString());
			regpage.setLastName(randomString());
			regpage.setEmail(randomString()+"@gmail.com");
			regpage.setPhoneNumber(randomNumber());
			String password=randomAlphaNumeric();
			regpage.setPassword(password);
			regpage.setConformPassword(password);;
			regpage.clickChkboxPolicy();
			regpage.clickBtnContinue();
			Assert.assertEquals(regpage.getConformMsg(),"Your Account Has Been Created!");
		}
		catch(Exception e) {
			Assert.fail();
		}
		
	}
	
	
	


}
