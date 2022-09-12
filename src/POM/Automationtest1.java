package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import Automation.Browser2;

public class Automationtest1 {
	@Test
	public void vctc() {
		WebDriver driver = Browser2.openBrowser("https://vctcpune.com/selenium/practice.html");
		WebElement hide = driver.findElement(By.xpath("//input[@id='hide-textbox']"));
		hide.click();
		WebElement textbox = driver.findElement(By.xpath("//input[@id='displayed-text']"));
		boolean result = textbox.isDisplayed();
		
		//Assert.assertEquals(result, false);//hard assertion
		Assert.assertFalse(result);
		String title = driver.getTitle();
		Assert.assertEquals(title,"Practice Page");//hard assertion
		System.out.println("thank you");
	}

}
