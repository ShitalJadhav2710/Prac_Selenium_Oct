package POM_DDF_Testng;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import POM_With_DDF.KiteHomePage;
import POM_With_DDF.KiteLogin1Page;
import POM_With_DDF.KiteLogin2Page;

public class KiteLoginTest
{
	WebDriver d;
	Sheet sh;
	KiteLogin1Page login1;
	KiteLogin2Page log2;
	KiteHomePage hm;
	
	@BeforeClass
	public void openbrowser() throws IOException
	{
		
		FileInputStream file=new FileInputStream("H:\\Testing Class Practics\\login_detail.xlsx");
		 sh = WorkbookFactory.create(file).getSheet("DDF");
		
		System.setProperty("webdriver.chrome.driver", "H:\\Testing Class Practics\\Selenium_soft\\chromedriver.exe");
		d=new ChromeDriver();
		d.get("http://kite.zerodha.com");
		d.manage().window().maximize();
	
		d.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		login1=new KiteLogin1Page(d);
		log2=new KiteLogin2Page(d);
		hm=new KiteHomePage(d);
	}
	
	@BeforeMethod
	public void loginApp()
	{
		login1.setKiteLogin1PageUn(sh.getRow(0).getCell(0).getStringCellValue());
		login1.setKiteLogin1PagePwd(sh.getRow(0).getCell(1).getStringCellValue());
		login1.ClickKiteLogin1PageLoginButton();
			
		log2.setKiteLogin2PagePin(sh.getRow(0).getCell(2).getStringCellValue());
		log2.ClickKiteLogin2PageContinueButton();
	}
	
	@Test
	public void verifyProfileName()
	{
		hm.verifyKiteHomePageProfileName();
	}
	
	@AfterMethod
	public void logoutApp()
	{
		
	}
	
	@AfterClass
	public void closebrowser()
	{
		login1=null;
		log2=null;
		hm=null;
		d.close();
	}
	

}
