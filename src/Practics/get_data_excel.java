package Practics;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class get_data_excel
{
	public static void main(String[] args) throws IOException
	{
		// 1 column & all rows data fetch
		
		FileInputStream file=new FileInputStream("H:\\Testing Class Practics\\Book1.xlsx");
		 Sheet sh = WorkbookFactory.create(file).getSheet("Sheet1");
		for (int i=0;i<=sh.getLastRowNum();i++)
		{
			Cell val = sh.getRow(i).getCell(0);
			if(val.getCellType()==CellType.STRING)
			{
				System.out.println(val.getStringCellValue());
			}
			else if(val.getCellType()==CellType.NUMERIC)
			{
				System.out.println(val.getNumericCellValue());
			}
			else if(val.getCellType()==CellType.BOOLEAN)
			{
				System.out.println(val.getBooleanCellValue());
			}
			
		} 
		
		// 1 row & all column data fetch
		
				FileInputStream file1=new FileInputStream("H:\\Testing Class Practics\\Book1.xlsx");
				  Row row1 = WorkbookFactory.create(file1).getSheet("Sheet1").getRow(0);
				for (int i=0;i<row1.getLastCellNum();i++)
				{
					Cell val = row1.getCell(i);
					if(val.getCellType()==CellType.STRING)
					{
						System.out.print(val.getStringCellValue() + " ");
					}
					else if(val.getCellType()==CellType.NUMERIC)
					{
						System.out.print(val.getNumericCellValue()+ " ");
					}
					else if(val.getCellType()==CellType.BOOLEAN)
					{
						System.out.print(val.getBooleanCellValue()+ " " );
					}
					
				}
		
	}

}
