package Framework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DDF
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream file=new FileInputStream("H:\\Testing Class Practics\\login_detail.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("DDF");
		
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--disable-notifications");
		
		System.setProperty("webdriver.chrome.driver", "H:\\Testing Class Practics\\Selenium_soft\\chromedriver.exe");
		WebDriver d=new ChromeDriver(opt);
		d.get("http://kite.zerodha.com");
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		 String Un = sh.getRow(0).getCell(0).getStringCellValue();
		d.findElement(By.xpath("//input[@id='userid']")).sendKeys(Un);
		
		String psw=sh.getRow(0).getCell(1).getStringCellValue();
		d.findElement(By.xpath("//input[@id='password']")).sendKeys(psw);
		
		d.findElement(By.xpath("//button[text()='Login ']")).click();
		
		String pi=sh.getRow(0).getCell(2).getStringCellValue();
		d.findElement(By.xpath("//input[@id='pin']")).sendKeys(pi);
		
		d.findElement(By.xpath("//button[text()='Continue ']")).click();
		
		 boolean result = d.findElement(By.xpath("//span[text()='KV']")).isDisplayed();
		 if(result)
			 System.out.println("pass");
		 else
			 System.out.println("fail");
	}

}
