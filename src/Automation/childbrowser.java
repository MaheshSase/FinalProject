package Automation;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class childbrowser {
	public static void main(String[] args) {
		WebDriver driver = Browser2.openBrowser("https://vctcpune.com/#");
		//String handle = driver.getWindowHandle();
		//System.out.println(handle);
		WebElement practice = driver.findElement(By.xpath("//a[@target='_blank'][1]"));
		practice.click();
		
		Set<String> handles = driver.getWindowHandles();
	    Iterator <String> i = handles.iterator();
		
		while(i.hasNext()) {
			String handle = i.next();
			driver.switchTo().window(handle);
			String currentTitle = driver.getTitle();
			if(currentTitle.equals("Practice Page")) {
				WebElement radio = driver.findElement(By.xpath("//input[@name='radio'][1]"));
				radio.click();
			}
			
		}
		
		
				
		
		}

}
