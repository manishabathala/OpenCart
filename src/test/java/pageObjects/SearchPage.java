package pageObjects;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage {
	public WebDriver driver;
	
	public SearchPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[@id='content']//div[3]//img") List<WebElement> searchProducts;
	
	@FindBy(xpath="//input[@id='input-quantity']") WebElement txtQuantity;
	
	@FindBy(xpath="//button[@id='button-cart']") WebElement btnAddToCart;
	
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']") WebElement conformProductAddedMsg;
	
	
	
	public boolean isProductExist(String productName) {
		boolean flag=false;
		for(WebElement product:searchProducts) {
			if(product.getAttribute("title").equalsIgnoreCase(productName)) {
				flag=true;
				break;
			}
		}
		return flag;
	}
	
	public void selectProducts(String Product) {
		for(WebElement prod:searchProducts) {
			if(prod.getAttribute("title").equalsIgnoreCase(Product)) {
				prod.click();
			}
		}
	}
	
	public void setQuantity(String quantity) {
		txtQuantity.clear();
		txtQuantity.sendKeys(quantity);
	}
	
	public void clickAddToCart() {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();",btnAddToCart);
		//btnAddToCart.click();
	}
	
	public boolean getConformMsg() {
		try {
			return conformProductAddedMsg.isDisplayed();
		}catch(Exception e) {
			return false;
		}
	}
	

}
