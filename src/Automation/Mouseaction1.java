package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Mouseaction1 {
	public static void main(String[] args) {
     WebDriver driver= Browser2.openBrowser("https://www.amazon.in");
     WebElement signIn = driver.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']"));
     Actions action = new Actions(driver);
     action.moveToElement(signIn);
     action.perform();
     
     signIn.click();
     action.perform();
	}

}
