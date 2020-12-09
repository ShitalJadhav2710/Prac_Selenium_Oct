package IFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class basic 
{
	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver","H:\\Testing Class Practics\\Selenium_soft\\chromedriver.exe");
		
		WebDriver d=new ChromeDriver();
		d.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
		Thread.sleep(2000);
		//d.switchTo().frame("iframeResult"); // using string id
		//d.switchTo().frame("iframeResult");//using string name
		//d.switchTo().frame(1);
		d.switchTo().frame(d.findElement(By.xpath("//iframe[@id='iframeResult']")));
		d.findElement(By.xpath("//button[contains(text(),'Click')]")).click();
		
		//d.switchTo().parentFrame();
		d.switchTo().defaultContent();
		d.findElement(By.xpath("//a[@id='tryhome']")).click();
	}

}
