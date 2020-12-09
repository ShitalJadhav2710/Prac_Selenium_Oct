package Practics;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class take_screenshot
{
	public static void main(String[] args) throws InterruptedException, IOException
	{
		System.setProperty("webdriver.chrome.driver", "H:\\Testing Class Practics\\Selenium_soft\\chromedriver.exe");
		WebDriver dd=new ChromeDriver();
		dd.get("http://www.facebook.com");
		
		//dd.findElement(By.xpath("//a[text()='Create New Account']")).click();
		
		//Thread.sleep(2000);
		
		File source = ((TakesScreenshot)dd).getScreenshotAs(OutputType.FILE);
		
		String str=RandomString.make(2);
		File dest=new File("H:\\Testing Class Practics\\Screen_Shot\\"+str +".jpg");
	
		
		FileHandler.copy(source, dest);
	}

}
