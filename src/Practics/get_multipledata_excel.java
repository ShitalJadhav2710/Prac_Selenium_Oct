package Practics;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class get_multipledata_excel
{

	public static void main(String[] args) throws IOException
	{
		FileInputStream file=new FileInputStream("H:\\Testing Class Practics\\Book1.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet1");
		for(int i=0;i<=sh.getLastRowNum();i++)
		{
			for(int j=0;j<sh.getRow(i).getLastCellNum();j++)
			{
				Cell val = sh.getRow(i).getCell(j);
				if(val.getCellType()==CellType.STRING)
				{
					System.out.print(val.getStringCellValue() + " ");
				}
				else if(val.getCellType()==CellType.NUMERIC)
				{
					System.out.print(val.getNumericCellValue() + " ");
				}
				else if(val.getCellType()==CellType.BOOLEAN)
				{
					System.out.print(val.getBooleanCellValue() + "" );
				}
			}
			System.out.println();
		}
		
	}
}
