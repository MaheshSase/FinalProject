package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MethodsofWebElement1 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = Browser2.openBrowser("https://vctcpune.com/selenium/practice.html#serviceid");
		WebElement text = driver.findElement(By.xpath("//input[@name='show-hide']"));
		text.sendKeys("Velocity");
		boolean status = text.isDisplayed();
		System.out.println(status);
		Thread.sleep(2000);
		WebElement hide = driver.findElement(By.xpath("//input[@id='hide-textbox']"));
		hide.click();
		boolean newstatus = text.isDisplayed();
		System.out.println(newstatus);
		
	}

}
