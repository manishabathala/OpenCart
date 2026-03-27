package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.SearchPage;
import testBase.BaseClass;

public class TC05_AddToCartTest extends BaseClass{
	
	@Test(groups="Master")
	public void verify_AddToCart() {
		try {
			HomePage hm=new HomePage(driver);
			hm.setSearch(prop.getProperty("searchProduct"));
			hm.clickSearchBtn();
			
			SearchPage sp=new SearchPage(driver);
			
			if(sp.isProductExist(prop.getProperty("searchProduct"))) {
				sp.selectProducts(prop.getProperty("searchProduct"));
				sp.setQuantity("3");
				sp.clickAddToCart();
			
				Assert.assertEquals(sp.getConformMsg(), true);
				
			}
		}
		catch(Exception e) {
			Assert.fail();
		}
		
	}

}
