package POM_DDF_Testng_BaseClass_Utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Utility 
{

	
	public static String getTestData(int row, int col) throws Exception
	{
		FileInputStream file=new FileInputStream("H:\\Testing Class Practics\\login_detail.xlsx");
		 Sheet sh = WorkbookFactory.create(file).getSheet("DDF");
		 String val = sh.getRow(row).getCell(col).getStringCellValue();
		 return val;		 
	}
	
	public static void TakeScreenShot(WebDriver d,int TCID) throws IOException
	{
		File source = ((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
		
		File dest=new File("H:\\Java Practice\\Prac_Selenium_Oct\\ScreenShot\\image_"+TCID+".jpg");
		
		FileHandler.copy(source, dest);	
		
	}
	

}
