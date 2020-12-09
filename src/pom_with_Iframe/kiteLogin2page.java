package pom_with_Iframe;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class kiteLogin2page 
{
	@FindBy(xpath = "//input[@id='pin']") private WebElement pin;
	
	@FindBy(xpath = "//button[text()='Continue ']") private WebElement cont;
	
	kiteLogin2page (WebDriver d)
	{
		PageFactory.initElements(d, this);
	}
	
	public void setkiteLogin2pagePin()
	{
		pin.sendKeys("959594");
	}
	public void ClickkiteLogin2pageContbutton()
	{
		cont.click();
	}

}
