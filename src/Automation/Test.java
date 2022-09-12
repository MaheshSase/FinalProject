package Automation;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

public class Test {
	public static void main(String[] args) throws IOException  {
		WebDriver driver = Browser2.openBrowser("https://www.flipkart.com/");
		Screenshot1.takesScreenShot(driver,"DRS");
	}

}
