package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.SearchPage;
import testBase.BaseClass;

public class TC05_AddToCartTest extends BaseClass{
	
	@Test
	public void verify_AddToCart() {
		try {
			HomePage hm=new HomePage(driver);
			hm.setSearch("iphone");
			hm.clickSearchBtn();
			
			SearchPage sp=new SearchPage(driver);
			if(sp.isProductExist(p.getProperty("searchProduct"))) {
				sp.selectProducts(p.getProperty("searchProduct"));
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
