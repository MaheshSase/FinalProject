package Automation;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Table2 {
	public static void main(String[]args) {
		WebDriver driver = Browser2.openBrowser("http://demo.guru99.com/test/web-table-element.php");
		List<WebElement> currentprice =driver.findElements(By.xpath("//table[1]//tbody[1]//tr//td[4]"));
		//System.out.println(currentprice.size());
		
		double min = 986;
		for(int i = 1;i<currentprice.size();i++) {
			WebElement column=currentprice.get(i);
			String price= column.getText();
			double value = Double.parseDouble(price);
			
			if (value<min) {
				min=value;
			}
		}
		System.out.println("current min price is"+ min);
	}

}
