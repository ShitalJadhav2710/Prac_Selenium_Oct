package Multiple_element;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class get_multiple_link
{
	public static void main(String[] args)
	{
		
		System.setProperty("webdriver.chrome.driver", "H:\\Testing Class Practics\\Selenium_soft\\chromedriver.exe");
		
		WebDriver d=new ChromeDriver();
		
		d.get("http://www.google.com");
		List<WebElement> links = d.findElements(By.xpath("//a"));
		System.out.println("Total No. of links:" + links.size());
		
		for(WebElement ele:links)
		{
			System.out.println(ele.getText());
		}
	}

}
