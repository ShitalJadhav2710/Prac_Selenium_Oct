package Practics;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class verify_type_of_cell
{
	public static void main(String[] args) throws IOException 
	{
		
		FileInputStream file=new FileInputStream("H:\\Testing Class Practics\\Book1.xlsx");
	
		Cell value = WorkbookFactory.create(file).getSheet("Sheet1").getRow(1).getCell(1);
		
		if(value.getCellType()==CellType.STRING)
		{
			System.out.println(value.getStringCellValue());
		}
		else if(value.getCellType()==CellType.NUMERIC)
		{
			System.out.println(value.getNumericCellValue());
		}
		else if(value.getCellType()==CellType.BOOLEAN)
		{
			System.out.println(value.getBooleanCellValue());
		}
	}
	
	

}
