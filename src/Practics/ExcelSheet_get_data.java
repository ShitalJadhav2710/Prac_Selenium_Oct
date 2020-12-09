package Practics;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExcelSheet_get_data 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		System.setProperty("webdriver.chrome.driver", "H:\\Testing Class Practics\\Selenium_soft\\chromedriver.exe");
		
		
		FileInputStream file=new FileInputStream("H:\\Testing Class Practics\\Book1.xlsx");
		
		//String value = WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
		
		//System.out.println(value);
		
		//String value1 = WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getCell(1).getStringCellValue();
		
		//System.out.println(value1);
		
		//double no=WorkbookFactory.create(file).getSheet("Sheet1").getRow(1).getCell(0).getNumericCellValue();
		//System.out.println(no);
		
		 //boolean val = WorkbookFactory.create(file).getSheet("Sheet1").getRow(2).getCell(0).getBooleanCellValue();
		//System.out.println(val);
	
	String val = WorkbookFactory.create(file).getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
		System.out.println(val);
	}
	

}
