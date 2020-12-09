package Multiple_element;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex_get_all_links 
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "H:\\Testing Class Practics\\Selenium_soft\\chromedriver.exe");
		
		WebDriver d=new ChromeDriver();
		d.get("http://www.facebook.com");
		List<WebElement> links = d.findElements(By.xpath("//script"));
		System.out.println("Total no. of links: "+ links.size());
		for(WebElement ele:links)
		{
			System.out.println(ele.getText());
		}
	}

	
}
