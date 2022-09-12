package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class locators {
	public static void main (String[]args) {
		WebDriver driver = browser1.openBrowser();
		WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
		email.sendKeys("Velocity");
		WebElement forgot = driver.findElement(By.xpath("//a[text()='Forgotten password?')"));
		forgot.click();
		WebElement signUp = driver.findElement(By.xpath("//a[contains(@data-testid,'open registration')]"));
		signUp.click();
	}

}
