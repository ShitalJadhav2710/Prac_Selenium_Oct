package pom_with_Iframe;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class KiteTest
{
	public static void main(String[] args) throws Exception 
	{
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--disable-notifications");
		
		System.setProperty("webdriver.chrome.driver", "H:\\Testing Class Practics\\Selenium_soft\\chromedriver.exe");
		
		WebDriver d=new ChromeDriver(opt);
		d.get("http://kite.zerodha.com");
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		kiteLogin1page login1=new kiteLogin1page(d);
		login1.setkiteLogin1pageUn();
		login1.setkiteLogin1pagePWD();
		login1.clickkiteLogin1pageloginbutton();
		
		kiteLogin2page login2=new kiteLogin2page(d);
		login2.setkiteLogin2pagePin();
		login2.ClickkiteLogin2pageContbutton();
		
		kiteHomePage home=new kiteHomePage(d);
		home.verifykiteHomePageProfileName();
		
		Thread.sleep(2000);
		
		d.close();
		
	}

}
