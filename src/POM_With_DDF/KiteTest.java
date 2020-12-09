package POM_With_DDF;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class KiteTest
{
	public static void main(String[] args) throws IOException 
	{
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--disable-notifications");
		
		FileInputStream file=new FileInputStream("H:\\Testing Class Practics\\login_detail.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("DDF");
		
		System.setProperty("webdriver.chrome.driver", "H:\\Testing Class Practics\\Selenium_soft\\chromedriver.exe");
		WebDriver d=new ChromeDriver(opt);
		d.get("http://kite.zerodha.com");
		d.manage().window().maximize();
		
		d.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
		KiteLogin1Page login1=new KiteLogin1Page(d);
		
		String un=sh.getRow(0).getCell(0).getStringCellValue();
		login1.setKiteLogin1PageUn(un);
		
		String pwd=sh.getRow(0).getCell(1).getStringCellValue();
		login1.setKiteLogin1PagePwd(pwd);
		
		login1.ClickKiteLogin1PageLoginButton();
		
		
		KiteLogin2Page log2=new KiteLogin2Page(d);
		
		String pin1=sh.getRow(0).getCell(2).getStringCellValue();
		log2.setKiteLogin2PagePin(pin1);
		log2.ClickKiteLogin2PageContinueButton();
		
		KiteHomePage hm=new KiteHomePage(d);
		hm.verifyKiteHomePageProfileName();
	}
	
}
