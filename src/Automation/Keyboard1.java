package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Keyboard1 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = Browser2.openBrowser("https://demoqa.com/text-box");
		WebElement firstname = driver.findElement(By.xpath("//input[@type= 'text']"));
		firstname.sendKeys("Mahesh");
		Actions action = new Actions(driver);
		action.sendKeys(Keys.TAB);
	
		action.sendKeys("sureshraina@gmail.com");
	
		action.sendKeys(Keys.TAB);
		action.sendKeys("Akurdi pune");
		
		action.keyDown(Keys.CONTROL);
		action.sendKeys("a");
		action.keyUp(Keys.CONTROL);
	    action.keyDown(Keys.CONTROL);
		action.sendKeys("c");
		action.keyUp(Keys.CONTROL);
		
		action.sendKeys(Keys.TAB);
		action.keyDown(Keys.CONTROL);
		action.sendKeys("v");
		action.keyUp(Keys.CONTROL);
		action.build().perform();
		WebElement submit= driver.findElement(By.xpath("//button[@id='submit']"));
		Thread.sleep(2000);
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true)",submit);
		submit.click();
		
		//Thread.sleep(2000);
		//((JavascriptExecutor)driver).executeScript("window.scrollBy(200,500)");
	}

}
