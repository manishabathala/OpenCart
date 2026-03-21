package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountRegistrationPage {
	
	WebDriver driver;
	
	public AccountRegistrationPage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	

	@FindBy(xpath="//input[@id='input-firstname']") WebElement txtFirstName;
	@FindBy(xpath="//input[@id='input-lastname']") WebElement txtLasttName;
	@FindBy(xpath="//input[@id='input-email']") WebElement txtEmail;
	@FindBy(xpath="//input[@id='input-telephone']") WebElement txtTelephone;
	@FindBy(xpath="//input[@id='input-password']") WebElement txtPassword;
	@FindBy(xpath="//input[@id='input-confirm']") WebElement txtConformPassword;
	@FindBy(xpath="//input[@name='agree']") WebElement chkBoxPolicy;
	@FindBy(xpath="//input[@value='Continue']") WebElement btnContinue;
	@FindBy(xpath="//h1[normalize-space()='Your Account Has Been Created!']") WebElement conformMsg;
	//input[@id='input-lastname']
	//input[@id='input-email']
	//input[@id='input-telephone']
	//input[@id='input-password']
	//input[@id='input-confirm']
	//input[@name='agree']
	//input[@value='Continue']
	
	public void setFirstName(String firstName) {
		txtFirstName.sendKeys(firstName);
	}
	
	public void setLastName(String lastName) {
		txtLasttName.sendKeys(lastName);
	}
	
	public void setEmail(String email) {
		txtEmail.sendKeys(email);
	}
	
	public void setPhoneNumber(String phoneNumber) {
		txtTelephone.sendKeys(phoneNumber);
	}
	
	public void setPassword(String password) {
		txtPassword.sendKeys(password);
	}
	
	public void setConformPassword(String password) {
		txtConformPassword.sendKeys(password);
	}
	
	public void clickChkboxPolicy() {
		chkBoxPolicy.click();
	}
	
	public void clickBtnContinue( ) {
		btnContinue.click();
	}
	
	public String getConformMsg() {
		try {
			return conformMsg.getText();
		}
		catch(Exception e) {
			return e.getMessage();
		}
	}

}
