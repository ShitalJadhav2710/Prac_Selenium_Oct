package POM_DDF_Testng_BaseClass_Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLogin1Page 
{
	@FindBy (xpath="//input[@id='userid']") private WebElement Un;
	
	@FindBy (xpath = "//input[@id='password']") private WebElement pwd;
	
	@FindBy (xpath="//button[text()='Login ']") private WebElement login;
	
	
	public KiteLogin1Page(WebDriver d)
	{
		PageFactory.initElements(d, this);
	}
	
	public void setKiteLogin1PageUn(String username)
	{
		Un.sendKeys(username);
	}
	public void setKiteLogin1PagePwd(String pass)
	{
		pwd.sendKeys(pass);
	}
	public void ClickKiteLogin1PageLoginButton()
	{
		login.click();
	}
}
