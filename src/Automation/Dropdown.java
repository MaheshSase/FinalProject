package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {
	public static void main(String[] args) {
		WebDriver driver = Browser2.openBrowser("https://www.facebook.com/");
		WebElement product = driver.findElement(By.xpath("//select[@id='first']"));
		Select select =new Select(product);
		//select.selectByIndex(2);
		select.selectByValue("Microsoft");
		WebElement product1 = driver.findElement(By.xpath("//select[@id='animals']"));
		Select select1 =new Select(product1);
		//select1.selectByIndex(3);
		//select1.selectByValue("babycat");
		select1.selectByVisibleText("Big Baby Cat");
		
		
	}

}
