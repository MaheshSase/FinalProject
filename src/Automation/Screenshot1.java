package Automation;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot1 {
	public static void takesScreenShot(WebDriver driver,String name) throws IOException{
		String date= Screenshot1.getDate();
		WebDriver drivers = Browser2.openBrowser("https://www.flipkart.com/");
		TakesScreenshot scs = ((TakesScreenshot)drivers);
		File sources = scs.getScreenshotAs(OutputType.FILE);
		File destinations = new File("C:\\New screenshot\\"+name+""+date+".jpg");
		FileHandler.copy(sources, destinations);
		
	}

	private static String getDate() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MMM-dd HH-mm-ss");
		LocalDateTime currentTime = LocalDateTime.now();
		String d = dtf.format(currentTime);
		return d;
	}

}