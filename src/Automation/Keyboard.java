package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Keyboard {
	public static void main(String[] args) {
		WebDriver driver = Browser2.openBrowser("https://demoqa.com/text-box");
		WebElement firstname = driver.findElement(By.xpath("//input[@id='userName']"));
	    firstname.sendKeys("Mahesh");
	    Actions action = new Actions(driver);
	    action.sendKeys(Keys.TAB);
	    action.perform();
	    action.sendKeys("sureshraina@gmail.com");
	    action.perform();
	    action.sendKeys(Keys.TAB);
	    action.perform();
	    action.sendKeys("Akurdipune");
	    action.perform();
	    action.keyDown(Keys.CONTROL);
	    action.sendKeys("a");
	    action.keyUp(Keys.CONTROL);
	    action.perform();
	    action.keyDown(Keys.CONTROL);
	    action.sendKeys("c");
	    action.keyUp(Keys.CONTROL);
	    action.perform();
	    action.sendKeys(Keys.TAB);
	    action.keyDown(Keys.CONTROL);
	    action.sendKeys("v");
	    action.keyUp(Keys.CONTROL);
	    action.perform();
	    
	    
		
	}

}
