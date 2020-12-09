package pom_with_Iframe;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookTest
{
	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", "H:\\Testing Class Practics\\Selenium_soft\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("http://www.facebook.com");
		d.manage().window().maximize();
		
		d.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		FacebookLoginPage login=new FacebookLoginPage(d);
		login.setFacebookLoginPageEmail_Id();
		login.setFacebookLoginPagePassword();
		login.ClickFacebookLoginPageLoginButton();
		
		Thread.sleep(2000);
		
		FacebookLogin1Page login1=new FacebookLogin1Page(d);
		login1.ClickFacebookLogin1PageForgottenPassword();
		
		//d.close();
		
	}

}
