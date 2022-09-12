package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Scroll {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = Browser2.openBrowser("https://demoqa.com/text-box");
		WebElement submit= driver.findElement(By.xpath("(//button[@type='button'])[1]"));
		//((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true)",submit);
		
		Thread.sleep(2000);
		((JavascriptExecutor)driver).executeScript("window.scrollBy(200,500)");
		
	}

}
