package Practics;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class practics_xpath 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","H:\\Testing Class Practics\\Selenium_soft\\chromedriver.exe");
		
		WebDriver dd=new ChromeDriver();
		
		dd.get("http:\\www.google.com");
		
		Thread.sleep(1000);
		dd.manage().window().maximize();
		
		Thread.sleep(2000);
		
		dd.navigate().to("http:\\www.google.com");
		Thread.sleep(1000);
		Dimension d=new Dimension(500, 500);
		dd.manage().window().setSize(d);
		
		Thread.sleep(2000);
		
		dd.navigate().back();
		
		Thread.sleep(1000);
						
		dd.navigate().forward();
		
		Thread.sleep(2000);
		
		dd.navigate().refresh();
		Thread.sleep(1000); 
		
			

	}

}
