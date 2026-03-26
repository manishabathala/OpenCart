package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.SearchPage;
import testBase.BaseClass;

public class TC04_SearchProductTest extends BaseClass{
	
	@Test
	public void verify_ProductSearch() throws InterruptedException {
		HomePage hp=new HomePage(driver);
		hp.setSearch("Mac");
		hp.clickSearchBtn();
		
		SearchPage sPage=new SearchPage(driver);
		Assert.assertEquals(sPage.isProductExist("MacBook"), true); 
		
		
	}
	

}
