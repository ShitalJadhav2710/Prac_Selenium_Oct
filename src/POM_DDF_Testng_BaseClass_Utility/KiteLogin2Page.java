package POM_DDF_Testng_BaseClass_Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLogin2Page 
{
	@FindBy (xpath = "//input[@id='pin']") private WebElement pin;
	
	@FindBy (xpath="//button[text()='Continue ']") private  WebElement cont;
	
	public KiteLogin2Page(WebDriver d)
	{
		PageFactory.initElements(d, this);
	}
	
	public void setKiteLogin2PagePin(String pin1)
	{
		pin.sendKeys(pin1);
	}
	public void ClickKiteLogin2PageContinueButton()
	{
		cont.click();
	}
}
