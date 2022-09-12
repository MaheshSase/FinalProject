package Automation;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;

public class BrowserSIZE {
	public static void main (String[]args) {
		WebDriver driver= browser1.openBrowser();
		Dimension d = new Dimension(600,900);//(width(x),height(y))
		driver.manage().window().setSize(d);
	}

}
