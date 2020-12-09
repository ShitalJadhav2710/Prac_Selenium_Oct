package Practics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class web_element_example 
{
	public static void main(String[] args) throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver", "H:\\Testing Class Practics\\Selenium_soft\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http:\\www.facebook.com");
		
		driver.manage().window().maximize();
		
		//driver.findElement(By.id("u_0_2")).click();
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		
		Thread.sleep(2000);
		WebElement female=driver.findElement(By.xpath("(//input[@class='_8esa'])[1]"));
		
		 boolean result=female.isSelected();
		 System.out.println(result);
		 
		 if(result==true)
		 {
			 System.out.println("Radio button is selected");
			 
		 }
		 else
		 {
			 System.out.println("radio button is not selected ");
			 
		 }
	}

}
