package webtables;

import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class count_column 
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "H:\\Testing Class Practics\\Selenium_soft\\chromedriver.exe");
		
		WebDriver d=new ChromeDriver();
		
		d.get("file:///H:/Testing%20Class%20Practics/webtable.html");
		
	java.util.List<WebElement> count_col = d.findElements(By.xpath("//table[@id='1234']/tbody/tr/th"));
	
	System.out.println("Total no. of Coluns in row 1 : " + count_col.size());
	
	d.close();
	}

}
