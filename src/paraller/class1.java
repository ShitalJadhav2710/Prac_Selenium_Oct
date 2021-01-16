package paraller;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class class1
{
	@Test
	public void TC1() 
	{
		System.setProperty("webdriver.chrome.driver", "H:\\Testing Class Practics\\Selenium_soft\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.google.com");
	
	}
	
//	@Test
//	public void TC2() 
//	{
//		Reporter.log("TC2");
//	}

}
