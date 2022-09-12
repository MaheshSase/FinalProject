package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class Frame {
	public static void main(String[] args) {
		WebDriver driver = Browser2.openBrowser("https://vctcpune.com/selenium/practice.html");
		//driver.switchTo().frame(0);
		//driver.switchTo().frame("iframe-name");
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='courses-iframe']")));
		WebElement course =  driver.findElement(By.xpath("(//a[text()='Courses'])[1]"));
		course.click();
		driver.switchTo().defaultContent();
		WebElement alert = driver.findElement(By.xpath("//input[@id='alertbtn']"));
		alert.click();
		
	}   

}
