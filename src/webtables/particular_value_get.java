package webtables;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class particular_value_get
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "H:\\Testing Class Practics\\Selenium_soft\\chromedriver.exe");

		WebDriver d=new ChromeDriver();
		
		d.get("file:///H:/Testing%20Class%20Practics/webtable.html");
		
		String text = d.findElement(By.xpath("//table[@id='1234']/tbody/tr[3]/td[3]")).getText();
	
		System.out.println(text);
	}

}
