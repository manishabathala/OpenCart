package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;
import testBase.BaseClass;
import utilities.DataProviderUtility;

public class TC03_LoginDDT extends BaseClass{
	@Test(dataProvider="dp",dataProviderClass=DataProviderUtility.class,groups="DataDriven")
	public void test_LoginDDT(String email,String password,String expResult) {
		try {
			HomePage hp=new HomePage(driver);
			hp.clickMyAccount();
			hp.clickLogin();
			
			LoginPage lp=new LoginPage(driver);
			lp.setEmail(email);
			lp.setPassword(password);
			lp.clickLogin();
			
			MyAccountPage MyAcc=new MyAccountPage(driver);
			boolean msg=MyAcc.isMyAccountPageExist();
			
			if(expResult.equalsIgnoreCase("Valid")) {
				if(msg==true) {
					MyAcc.clickLogout();
					Assert.assertTrue(true);
				}
				else {
					Assert.assertTrue(false);
				}
			}
			if(expResult.equalsIgnoreCase("Invalid")) {
				if(msg==true) {
					MyAcc.clickLogout();
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
		
		
	}

}
