package Automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Table1 {
	public static void main(String[] args) {
		WebDriver driver = Browser2.openBrowser("http://demo.guru99.com/test/web-table-element.php");
		List<WebElement> currentprice = driver.findElements(By.xpath("//table[1]//tbody[1]//tr//td[4]"));
		double max = 0;
	    for(int j=1;j<currentprice.size();j++) {
	    	WebElement column = currentprice.get(j);
	    	String price = column.getText();
	    	double value = Double.parseDouble(price);

	    if (value > max)
	    {
	       max = value;
	       }
	    }
	    System.out.println("current max price is"+max);
	      }
	}


