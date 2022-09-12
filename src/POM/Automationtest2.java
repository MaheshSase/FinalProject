package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Automation.Browser2;

public class Automationtest2 {
	@Test
	public void vctc() {
		WebDriver driver = Browser2.openBrowser("https://vctcpune.com/selenium/practice.html");
		WebElement hide = driver.findElement(By.xpath("//input[@id='hide-textbox']"));
		hide.click();
		WebElement textbox= driver.findElement(By.xpath("//input[@id='displayed-text']"));
		boolean result=textbox.isDisplayed();
		SoftAssert softassert = new SoftAssert();
		softassert.assertTrue(result);//soft assert
		String title = driver.getTitle();
		softassert.assertEquals(title, "Practice Page");//soft assert
		System.out.println("Thank you");
		softassert.assertAll();//it prints the assertion result at the end.
	}

}
