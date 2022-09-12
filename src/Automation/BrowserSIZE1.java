package Automation;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;

public class BrowserSIZE1 {
	public static void main(String[] args) {
		WebDriver driver = Browser2.openBrowser("https://www.facebook.com");
	    Point p = new Point(300,600);
	    driver.manage().window().setPosition(p);

}
}