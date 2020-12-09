package webtables;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class get_all_data 
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "H:\\Testing Class Practics\\Selenium_soft\\chromedriver.exe");
		
		WebDriver d=new ChromeDriver();
		
		d.get("file:///H:/Testing%20Class%20Practics/webtable.html");
		
		List<WebElement> row = d.findElements(By.id("1234"));
		
		int cnt_row=row.size();
		for(int i=1;i<=cnt_row;i++)
		{
			
			
			if(i==1)
			{	
				List<WebElement> colm = d.findElements(By.xpath("//table[@id='1234']/tbody/tr["+ i+"]/th"));
				
				 System.out.print(colm + " ");
			}
			else
			{
				int cnt_col=colm.size();
				
				for(int j=1;j<=cnt_col;j++)
				{
					String val = d.findElement(By.xpath("//table[@id='1234']/tbody/tr["+ i +"]/td["+ j +"]")).getText();
					System.out.print(val);
				}
				System.out.println();
			}
		}
	}
	

}
