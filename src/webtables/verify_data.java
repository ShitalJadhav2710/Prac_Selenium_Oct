package webtables;

import java.util.List;

import javax.print.DocFlavor.STRING;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class verify_data 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "H:\\Testing Class Practics\\Selenium_soft\\chromedriver.exe");
		
		WebDriver d=new ChromeDriver();
		
		d.get("file:///H:/Testing%20Class%20Practics/webtable.html");
		
		List<WebElement> row = d.findElements(By.xpath("//table[@id='1234']/tbody/tr"));
	
		int cnt_row=row.size();
		String exp="sql";
		
		for(int i=2;i<=cnt_row;i++)
		{
			int col=d.findElements(By.xpath("//table[@id='1234']/tbody/tr["+i+"]/td")).size();
			
			for(int j=1;j<=col;j++)
			{
				
				String act=d.findElement(By.xpath("//table[@id='1234']/tbody/tr["+i+"]/td["+j+"]")).getText();
				
				if(exp.equals(act))
				{
					System.out.println("given element "+ exp +" fount at index :"+ i + " , "+ j );
					break;
				}
			}
			d.close();
		}
	
	}

}
