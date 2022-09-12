package Automation;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Facebook {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
	WebDriver driver = Browser2.openBrowser("https://www.facebook.com/");	
    String emailID = Parameterization.getData("Paresh", 0, 0);
    String pass = Parameterization.getData("Paresh", 1, 0);
    WebElement email = driver.findElement(By.xpath("//input[@type='text']"));
    email.sendKeys(emailID);
    WebElement password = driver.findElement(By.xpath("//input[@id='pass']"));
    password.sendKeys(pass);
		
	}

}
