package Framework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WDDF 
{
	public static void main(String[] args) 
	{
		//use to disable notification
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--disable-notifications");
		
		
		
		System.setProperty("webdriver.chrome.driver", "H:\\Testing Class Practics\\Selenium_soft\\chromedriver.exe");
		
		WebDriver d=new ChromeDriver(option);
		d.get("https://kite.zerodha.com/");
		d.manage().window().maximize();
		
		d.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//		d.findElement(By.id("email")).sendKeys("shital27");
//		d.findElement(By.xpath("//input[@id='pass']")).sendKeys("shital");
//		d.findElement(By.xpath("//button[text()='Log In']")).click();
		
		d.findElement(By.xpath("//input[@id='userid']")).sendKeys("DV1510");
		
		d.findElement(By.xpath("//input[@id='password']")).sendKeys("Vijay@123");
		
		d.findElement(By.xpath("//button[text()='Login ']")).click();
		
		d.findElement(By.xpath("//input[@id='pin']")).sendKeys("959594");
		d.findElement(By.xpath("//button[text()='Continue ']")).click();
		
		 boolean result = d.findElement(By.xpath("//span[text()='KV']")).isDisplayed();
		 System.out.println(result);
		 
		 if(result)
		 {
			 System.out.println("pass");
		 }
		 else
		 {
			 System.out.println("fail");
		 }
		 
	}

}
