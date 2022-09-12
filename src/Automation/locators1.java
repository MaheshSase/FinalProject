package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class locators1 {
	public static void main(String[] args) {
		WebDriver driver = browser1.openBrowser();
		WebElement email= driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div[2]/div/div/form/div/div/input"));
		email.sendKeys("Velocity");
		WebElement signUp = driver.findElement(By.cssSelector("a[rel='nofollow']"));
		signUp.click();
	}

}
