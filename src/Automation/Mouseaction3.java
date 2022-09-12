package Automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Mouseaction3 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = Browser2.openBrowser("https://www.globalsqa.com/demo-site/draganddrop");
		WebElement iframe = driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
		driver.switchTo().frame(iframe);
		List<WebElement> source = driver.findElements(By.xpath("(//li[@class='ui-widget-content ui-corner-tr ui-draggable ui-draggable-handle'])[1]"));
		int s = source.size();
		WebElement destination = driver.findElement(By.xpath("//div[@id='trash']"));
		Actions action = new Actions(driver);
		for (int i =0;i<s;i++) {
			WebElement image = source.get(i);
			action.dragAndDrop(destination, image);
			action.perform();
			Thread.sleep(2000);
		}
	}

}
