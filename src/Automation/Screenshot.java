package Automation;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot {
	public static void main(String[]args) throws IOException {
		WebDriver driver = Browser2.openBrowser("https://www.flipkart.com/");
		TakesScreenshot sc=((TakesScreenshot)driver);
		File source = sc.getScreenshotAs(OutputType.FILE);
		File destination=new File("C:\\Users\\dellj\\OneDrive\\Desktop\\mahesh java\\screenshot\\mds.jpg");
	    FileHandler.copy(source, destination);
	}

}
