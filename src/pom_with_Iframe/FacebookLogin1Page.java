package pom_with_Iframe;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FacebookLogin1Page 
{
	@FindBy(xpath = "//a[text()='Forgotten password?']") private WebElement link_Forgotten_Password;
	
	
	FacebookLogin1Page (WebDriver d)
	{
		PageFactory.initElements(d, this);
	}
	
	public void ClickFacebookLogin1PageForgottenPassword()
	{
		link_Forgotten_Password.click();
	}
}
