package Practics;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class get_count_row_column_excel 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream file=new FileInputStream("H:\\Testing Class Practics\\Book1.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet1");
		
		System.out.println("No of rows into sheet=" + sh.getLastRowNum());
		
		System.out.println("No of elements into column"+ sh.getRow(0).getLastCellNum());
	}

}
