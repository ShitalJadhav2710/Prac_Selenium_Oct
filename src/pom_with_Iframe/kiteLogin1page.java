package pom_with_Iframe;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class kiteLogin1page
{
	@FindBy(xpath = "//input[@id='userid']")
	private WebElement Un;
	
	@FindBy(xpath = "//input[@id='password']")
	private WebElement PWD;
	
	@FindBy(xpath = "//button[text()='Login ']") private WebElement log;
	
	kiteLogin1page(WebDriver d)
	{
		PageFactory.initElements(d, this);
	}
	
	 
	public void setkiteLogin1pageUn()
	{
		Un.sendKeys("DV1510");
	}
	public void setkiteLogin1pagePWD()
	{
		PWD.sendKeys("Vijay@123");
	}
	public void clickkiteLogin1pageloginbutton()
	{
		log.click();
	}
}
