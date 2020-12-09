package Practics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath_contains {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","H:\\Testing Class Practics\\Selenium_soft\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		
		d.get("http:\\www.facebook.com");
		
		d.manage().window().maximize();
		
		//xpath by attribute
		d.findElement(By.xpath("//input[@name='email']")).sendKeys("abcd"); 
		
		d.findElement(By.xpath("//input[@type='password']")).sendKeys("abcd");
		
		//xpath by text
		//d.findElement(By.xpath("//button[text()='Log In']")).click();
		
		//xpath by contains using attribute
		//d.findElement(By.xpath("//button[contains(@name,'log')]")).click();
		
		//xpath by contains using text
		
		d.findElement(By.xpath("//button[contains(text(),'In')]")).click();
	}

}
