package webtables;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class count_rows
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "H:\\Testing Class Practics\\Selenium_soft\\chromedriver.exe");
		
		WebDriver d=new ChromeDriver();
		
		d.get("file:///H:/Testing%20Class%20Practics/webtable.html");
		
		
		List<WebElement> count_rows = d.findElements(By.xpath("//table[@id='1234']/tbody/tr"));
		
		System.out.println("Total no of rows: " + count_rows.size());
		
		d.close();
	}

}
