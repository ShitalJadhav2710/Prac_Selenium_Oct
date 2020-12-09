package Mouse_Actions;

import java.awt.Desktop.Action;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouse_move 
{
	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", "H:\\Testing Class Practics\\Selenium_soft\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("http://www.flipKart.com");
		d.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement closebutton = d.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		if(closebutton.isDisplayed())
		{
			closebutton.click();
		}
		Thread.sleep(2000);
		
		WebElement loginbutton = d.findElement(By.xpath("//a[text()='Login']"));
	
		Actions act=new Actions(d);
		//act.moveToElement(loginbutton).perform();
		
		//approch 1		
		//act.click().perform();
	  
		// approch 2		
		//act.moveToElement(loginbutton).click().build().perform();
	
		//approach-3
		act.click(loginbutton).perform();
	
	}

}
