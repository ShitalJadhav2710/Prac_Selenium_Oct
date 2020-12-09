package Practics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class select_ismultiple 
{
	public static void main(String[] args) throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver", "H:\\Testing Class Practics\\Selenium_soft\\chromedriver.exe");
		
		WebDriver dd=new ChromeDriver();
		
		dd.get("http://www.facebook.com");
		
		//dd.manage().window().maximize();
		
		dd.findElement(By.xpath("//a[text()='Create New Account']")).click();
		
		Thread.sleep(2000);
		WebElement month = dd.findElement(By.xpath("//select[@id='month']"));
		
		Select s=new Select(month);
		
		boolean result=s.isMultiple();
		
		if(result==false)
		{
			System.out.println("Listbox is single selectable");
		}
		else
		{
			System.out.println("Listbox is multi selectable");

		}
		
	}

}
