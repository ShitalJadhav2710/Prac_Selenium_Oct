package Practics;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class practi_2010 
{

	public static void main(String[] args) throws InterruptedException 
 {
		System.setProperty("webdriver.chrome.driver","H:\\Testing Class Practics\\Selenium_soft\\chromedriver.exe" );

		WebDriver d=new ChromeDriver();
		d.get("http:\\www.google.com");
		Thread.sleep(2000);
		//d.manage().window().maximize();
		/*String actual=d.getTitle();
		
		String expected="Google";
		if(actual.equals(expected))
		{
			System.out.println("Open correct browser");
		}
		else
		{
			System.out.println("Not Open correct browser");

		}
		System.out.println(d.getCurrentUrl()); */
		
		//org.openqa.selenium.Point p=new org.openqa.selenium.Point(200,500);
		//d.manage().window().setPosition(p);
		
		//Dimension dd=new Dimension(500, 500);
		//d.manage().window().setSize(dd);
		
		d.navigate().to("http:\\www.facebook.com");
		Thread.sleep(2000);
		
		d.navigate().back();
		Thread.sleep(2000);
		
		d.navigate().forward();
		Thread.sleep(2000);
		
		d.navigate().refresh();
		
		//d.close();
		d.quit();
		
	}
		
		
}


