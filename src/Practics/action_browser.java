package Practics;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.beust.jcommander.internal.Console;

public class action_browser
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "H:\\Testing Class Practics\\Selenium_soft\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http:\\www.amazon.com");
	String title=driver.getTitle();
	System.out.println(title);
	String exp="Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more";
	if(title.contains(exp))
	{
		System.out.println("Open Correct Page");
		
	}
	else
	{
		System.out.println("Not open correct Page");
		
	}
	Thread.sleep(2000); 
	
	driver.manage().window().maximize();
	Thread.sleep(2000);
	
	driver.navigate().to("http:\\www.google.com");
	Thread.sleep(2000);
	
	String url=driver.getCurrentUrl();
	System.out.println(url);
	
	driver.navigate().back();
	Thread.sleep(2000);
	
	driver.navigate().forward();
	Thread.sleep(2000);
	
	Point p=new Point(200, 300);
	driver.manage().window().setPosition(p);
	Thread.sleep(2000);
	
	Dimension d= new Dimension(500, 400);
	driver.manage().window().setSize(d);
	
	//driver.close();
	
	driver.quit();
	

	}

}
