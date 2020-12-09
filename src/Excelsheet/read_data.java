package Excelsheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

import org.apache.poi.hssf.usermodel.HSSFDateUtil;
import org.apache.poi.ss.format.CellFormatType;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;

public class read_data
{
	

	public static void main(String[] args) throws IOException, NullPointerException
	{
		
		FileInputStream file=new FileInputStream("H:\\Testing Class Practics\\data.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet2");
		for(int i=0;i<=sh.getLastRowNum();i++)
		{
			for(int j=0;j<sh.getRow(i).getLastCellNum();j++)
			{
				Cell val = sh.getRow(i).getCell(j);
				if(val.getCellType()==CellType.STRING)
				{
					//System.out.print(val.getStringCellValue() + " ");
					System.out.print(val + " ");
				}
				else if(val.getCellType()==CellType.NUMERIC)
				{
					//System.out.print(val.getNumericCellValue() + " ");
					System.out.print(val + " ");
				}
				else if(val.getCellType()==CellType.BOOLEAN)
				{
					//System.out.print(val.getBooleanCellValue()+ " ");
					System.out.print(val + " ");
				}
				
			}
			System.out.println();
		}
		
		
		
		//if(sh.getRow(5).getCell(1).getCellType()==CellType.BLANK)
		//{
		//	System.out.println("cell is blank");
		//}
		//System.out.println(sh.getRow(5).getCell(1).getCellType());
		
	}

}
