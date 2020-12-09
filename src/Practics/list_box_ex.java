package Practics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class list_box_ex
{
	public static void main(String[] args) throws InterruptedException 
	
	{
		System.setProperty("webdriver.chrome.driver","H:\\Testing Class Practics\\Selenium_soft\\chromedriver.exe" );
		
		WebDriver dd=new ChromeDriver();
		
		dd.get("https:\\www.facebook.com");
		
		dd.findElement(By.xpath("//a[text()='Create New Account']")).click();
		
		Thread.sleep(2000);
		
		// date selection 
		WebElement date=dd.findElement(By.xpath("//select[@name='birthday_day']"));
		Select sd=new Select(date);
		sd.selectByIndex(27);
		System.out.print(sd.getFirstSelectedOption().getText() + ":");
		
		//month selection
		WebElement month=dd.findElement(By.xpath("//select[@title='Month']"));
		Select s=new Select(month);
		
		//s.selectByValue("5");
		//s.selectByVisibleText("Sep");
		s.selectByIndex(10);
		System.out.print(s.getFirstSelectedOption().getText() + " :");
		
		//year selection 
		WebElement year =dd.findElement(By.xpath("//select[@id='year']"));
		Select s1=new Select(year);
		//s1.selectByIndex(2);
		
		s1.selectByValue("1986");
		System.out.print(s1.getFirstSelectedOption().getText());
		
	}

}
