package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Automation.Browser2;
 public class Automationtest {
	public void loginWithCredentialsTest() {
		WebDriver driver= Browser2.openBrowser("https://www.facebook.com");
		WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
		email.sendKeys("Sudhirshinde");
		WebElement pass = driver.findElement(By.xpath("//input[@id='pass']"));
		pass.sendKeys("56987");
		WebElement submit = driver.findElement(By.xpath("//button[@name='login']"));
		submit.click();
		
		
	}
		public void loginWithOnlyEmail() {
			WebDriver driver = Browser2.openBrowser("https://www.facebook.com");
			WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
			email.sendKeys("Sudhirshinde");
			WebElement submit = driver.findElement(By.xpath("//button[@name='login']"));
			submit.click();
			}
		public static void main(String[]args) {
			LogInTest mahesh = new LogInTest();
			mahesh.loginWithCredentialsTest();
			mahesh.loginWithOnlyEmail();
		}

}
