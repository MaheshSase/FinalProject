package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class locator {
	public static void main(String[] args)
	{
		WebDriver driver = browser1.openBrowser();
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("Velocity");
		WebElement password = driver.findElement(By.name("pass"));
		password.sendKeys("Katraj");
		WebElement login = driver.findElement(By.tagName("button"));
		login.click();
		WebElement forgot = driver.findElement(By.className("_6ltj"));
		forgot.click();
		WebElement signUp = driver.findElement(By.cssSelector("a[data-testid='open-registration-form-button']"));
		signUp.click();
		WebElement createpage = driver.findElement(By.partialLinkText("create a"));
		createpage.click();
	}

}
