package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FacebookLogInPage {
	@FindBy (xpath="//input[@id='email']")private WebElement email;
	@FindBy (xpath="//input[@id='pass']")private WebElement password;
	@FindBy (xpath="//button[@name='login']")private WebElement submit;
	@FindBy (xpath="//a[text()='Forgotten password?']")private WebElement forgot;
	@FindBy (xpath="//a[@data-testid='open-registration-form-button']")private WebElement signup;
	@FindBy (xpath="//a[text()='Create a Page']")private WebElement creatapage;
	
	public FacebookLogInPage (WebDriver driver) {
		PageFactory.initElements(driver,this);
		}
	public void enterEmailID(String mail) {
		email.sendKeys(mail);
	}
	public void enterPassword(String pass) {
		password.sendKeys(pass);
	}
	public void ClickOnsubmit() {
		submit.click();
	}
	public void ClickOnforgot() {
		forgot.click();
	}
	public void ClickOnsignup() {
		signup.click();
	}
	public void ClickOncreateapage() {
		creatapage.click();
	}
	
	
		
	}




