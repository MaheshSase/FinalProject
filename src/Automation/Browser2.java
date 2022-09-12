package Automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser2 {
	public static WebDriver openBrowser(String url) {
		System.setProperty("webdriver.chrome.driver","C:\\Mahesh Selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.navigate().to(url);
		 return driver;

}
}
