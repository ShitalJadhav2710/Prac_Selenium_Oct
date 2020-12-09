package Practics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webelement_by_xpath
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","H:\\Testing Class Practics\\Selenium_soft\\chromedriver.exe" );
		
		WebDriver d=new ChromeDriver();
		d.get("http:\\www.google.com");
		d.manage().window().maximize();
		
		d.findElement(By.xpath("//a[@class='gb_g']")).click();
		
		d.findElement(By.xpath("(//li[@class='h-c-header__nav-li g-mail-nav-links'])[2]")).click();
				
		d.findElement(By.xpath("//div[text()='Email or phone']")).sendKeys("girishgudi@gmail.com");
		
		
		
	}

}
