package Automation;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class browsers {
	public static void main (String[]args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Mahesh Selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.facebook.com/");
		String title=driver.getTitle();//to get the title webpage
		System.out.println(title);
		String url = driver.getCurrentUrl();//to url of page
		System.out.println(url);
		//driver.manage().window().maximize();
		Options op = driver.manage();// returns options interface
		Window w = op.window();//window method option interface returns window interface
		w.maximize();//maximize the method of window interface
		driver.manage().window().maximize();
	}

}
