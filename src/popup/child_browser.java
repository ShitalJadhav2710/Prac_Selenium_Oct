package popup;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class child_browser 
{
	
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "H:\\Testing Class Practics\\Selenium_soft\\chromedriver.exe");
		
		WebDriver d=new ChromeDriver();
		
		d.get("https://skpatro.github.io/demo/links/");
		
		String main_page_id = d.getWindowHandle();
		System.out.println(main_page_id);
		d.findElement(By.xpath("//input[@name='NewWindow']")).click();
		Thread.sleep(2000);
		Set<String> ids = d.getWindowHandles();
		
		ArrayList<String> al=new ArrayList<String>(ids);
		d.switchTo().window(al.get(1));
		//d.close();
		d.quit();
		
	}

}
