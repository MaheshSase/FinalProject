package Automation;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class Parameterization {
	public static String getData(String sheetName,int row,int cell) throws EncryptedDocumentException, IOException   {
		FileInputStream file = new FileInputStream("C:\\New project\\Test case.xlsx"); 
		String value = WorkbookFactory.create(file).getSheet(sheetName).getRow(row).getCell(cell).getStringCellValue();
		return value;
		
	}
	//public static double getNumericdata(String sheetName,int row,int cell) throws EncryptedDocumentException, IOException{
		//FileInputStream file = new FileInputStream("C:\\New project\\Test case.xlsx");
	    //Double value = WorkbookFactory.create(file).getSheet(sheetName).getRow(row).getCell(cell).getNumericCellValue();
	    //return value;
}
