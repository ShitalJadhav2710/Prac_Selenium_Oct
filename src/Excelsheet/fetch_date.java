package Excelsheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class fetch_date 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		
		FileInputStream file=new FileInputStream("H:\\Testing Class Practics\\data.xlsx");
	
		 Cell val = WorkbookFactory.create(file).getSheet("Sheet2").getRow(1).getCell(3);
		 
		 System.out.println(val);
		
		
		 
//		if(DateUtil.isCellDateFormatted(val))
//		{
//			DateFormat df=new SimpleDateFormat("dd/MM/yyyy");
//			//Date d = val.getDateCellValue();
//			String cellval = df.format(val.getDateCellValue()) ;
//			System.out.println(cellval);
//		}
		
//		Cell val1 = WorkbookFactory.create(file).getSheet("Sheet2").getRow(2).getCell(3);
//		System.out.println(val1.getStringCellValue());
	}
	

}
