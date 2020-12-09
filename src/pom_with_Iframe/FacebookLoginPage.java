package pom_with_Iframe;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FacebookLoginPage
{
	@FindBy(xpath = "//input[@name='email']") private WebElement email_id;
	
	@FindBy(xpath = "//input[@name='pass']") private WebElement password;
	
	@FindBy(xpath = "//button[text()='Log In']") private WebElement Login;
	

	FacebookLoginPage(WebDriver d)
	{
		PageFactory.initElements(d, this);
	}
	
	public void setFacebookLoginPageEmail_Id()
	{
		email_id.sendKeys("455645454");
	}
	public void setFacebookLoginPagePassword()
	{
		password.sendKeys("xcvfg");
	}
	public void ClickFacebookLoginPageLoginButton()
	{
		Login.click();
	}
}
