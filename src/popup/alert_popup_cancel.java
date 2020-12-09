package popup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alert_popup_cancel
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "H:\\Testing Class Practics\\Selenium_soft\\chromedriver.exe");
		
		WebDriver d=new ChromeDriver();
		
		d.get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");
		
		d.findElement(By.xpath("(//button[@class='btn btn-default btn-lg'] )[1]")).click();
	
		Alert alt = d.switchTo().alert();
		
		//d.switchTo().alert().dismiss();
		Thread.sleep(2000);
		
		System.out.println(alt.getText());
		
		
		alt.dismiss();
		
		//d.close();
	
	}

}
