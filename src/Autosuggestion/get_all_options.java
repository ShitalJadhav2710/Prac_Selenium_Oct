package Autosuggestion;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class get_all_options 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "H:\\Testing Class Practics\\Selenium_soft\\chromedriver.exe");
		
		WebDriver d=new ChromeDriver();
		
		d.get("http://www.google.com");
		
		d.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("oneplus");
		
		Thread.sleep(2000);
		List<WebElement> options = d.findElements(By.xpath("//ul[@class='erkvQe']/li"));
	
		System.out.println("Total no of options: "+ options.size());
		
		for(WebElement ele:options)
		{
			System.out.println(ele.getText());
		}

	}

}
