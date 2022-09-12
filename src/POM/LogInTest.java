package POM;

import org.openqa.selenium.WebDriver;

import Automation.Browser2;
import POM.FacebookLogInPage;

public class LogInTest {
	public void loginWithCredentialsTest() {
	WebDriver driver= Browser2.openBrowser("https://www.facebook.com");
	FacebookLogInPage facebookloginpage = new FacebookLogInPage(driver);
	facebookloginpage.enterEmailID("Sudhirshinde");
	facebookloginpage.enterPassword("56987");
	facebookloginpage.ClickOnsubmit();
}
	public void loginWithOnlyEmail() {
		WebDriver driver = Browser2.openBrowser("https://www.facebook.com");
		FacebookLogInPage facebookloginpage = new FacebookLogInPage(driver);
		facebookloginpage.enterEmailID("Sudhirshinde");
		facebookloginpage.ClickOnsubmit();
	}
	public static void main(String[]args) {
		LogInTest mahesh = new LogInTest();
		mahesh.loginWithCredentialsTest();
		mahesh.loginWithOnlyEmail();
	}
}