package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;
import testBase.BaseClass;

public class TC02_LoginTest extends BaseClass{
	@Test(groups= {"Sanity","Master"})
	public void test_Login() {
		HomePage hp=new HomePage(driver);
		hp.clickMyAccount();
		hp.clickLogin();
		
		LoginPage lp=new LoginPage(driver);
		lp.setEmail(prop.getProperty("email"));
		lp.setPassword(prop.getProperty("password"));
		lp.clickLogin();
		
		MyAccountPage MyAcc=new MyAccountPage(driver);
		boolean msg=MyAcc.isMyAccountOageExist();
		Assert.assertEquals(msg, true);
		
		
		
	}

}
