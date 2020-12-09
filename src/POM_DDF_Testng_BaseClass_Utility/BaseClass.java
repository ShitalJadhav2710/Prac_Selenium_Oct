package POM_DDF_Testng_BaseClass_Utility;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass 
{
	WebDriver d;
	
	
	public void BrowserOpen()
	{
		System.setProperty("webdriver.chrome.driver", "H:\\Testing Class Practics\\Selenium_soft\\chromedriver.exe");
		d=new ChromeDriver();
		d.get("http://kite.zerodha.com");
		d.manage().window().maximize();
	
		d.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

}
