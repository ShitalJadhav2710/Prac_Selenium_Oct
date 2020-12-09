package Practics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class get_select_data 
{
	public static void main(String[] args) throws InterruptedException
	{

		System.setProperty("webdriver.chrome.driver", "H:\\Testing Class Practics\\Selenium_soft\\chromedriver.exe");
		
		WebDriver dd=new ChromeDriver();
		dd.get("http://www.facebook.com");
		dd.findElement(By.xpath("//a[text()='Create New Account']")).click();
		
		Thread.sleep(2000);
		WebElement date=dd.findElement(By.xpath("//select[@id='day']"));
		Select s_date=new Select(date);
		System.out.print(s_date.getFirstSelectedOption().getText()+ ":");
		
		WebElement month=dd.findElement(By.xpath("//select[@title='Month']"));
		Select s_month=new Select(month);
		System.out.print(s_month.getFirstSelectedOption().getText() + ":");
		
		WebElement year=dd.findElement(By.xpath("//select[@name='birthday_year']"));
		Select s_year=new Select(year);
		System.out.println(s_year.getFirstSelectedOption().getText());
		
	}

}
