package Practics;

import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class listbox_print {

	public static void main(String[] args) throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver","H:\\Testing Class Practics\\Selenium_soft\\chromedriver.exe" );
		WebDriver dr=new ChromeDriver();
		dr.get("http:\\www.facebook.com");
		
		dr.findElement(By.xpath("//a[text()='Create New Account']")).click();
		
		Thread.sleep(2000);
		
		WebElement month=dr.findElement(By.xpath("//select[@name='birthday_month']"));
		
		Select s=new Select(month);
		
		 java.util.List<WebElement> opt = s.getOptions();
		 
		 System.out.println("Total no. of options=" + opt.size());
		 
		 //print all options
		 for(int i=0;i<=opt.size()-1;i++)
		 {
			 System.out.println(opt.get(i).getText());
			 
		 }
		 
		 //using foreach
		 
		 for(WebElement ele:opt)
		 {
			 
			 System.out.println(ele.getText());
		 }
		
	}

}
