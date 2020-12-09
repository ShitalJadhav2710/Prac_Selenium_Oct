package Practics;

import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class print_alphab 
{
	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver","H:\\Testing Class Practics\\Selenium_soft\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.facebook.com");
		
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		
		Thread.sleep(2000);
		WebElement month = driver.findElement(By.xpath("//select[@title='Month']"));
		
		Select s=new Select(month);
		List<WebElement> options = s.getOptions();
		
		TreeSet ts=new TreeSet();
		
		for(WebElement ele:options)
		{
			ts.add(ele.getText());
			
		}
		
		System.out.println(ts);
		
		for(Object obj:ts)
		{
			System.out.println(obj);
		}
	}

}
