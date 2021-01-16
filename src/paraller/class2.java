package paraller;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class class2 
{
	
		@Test
		public void TC2() 
		{
			System.setProperty("webdriver.chrome.driver", "H:\\Testing Class Practics\\Selenium_soft\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("http://www.facebook.com");
		
		}
		
	
	
//	@Test
//	public void TC4()
//	{
//		Reporter.log("TC4");
//		
//	}

}
