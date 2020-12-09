package POM_DDF_Testng_BaseClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteHomePage 
{
	@FindBy (xpath = "//span[text()='KV']") private WebElement proname;
	
	public KiteHomePage(WebDriver d)
	{
		PageFactory.initElements(d, this);
	}

	public void verifyKiteHomePageProfileName()
	{
		boolean result = proname.isDisplayed();
		if(result)
			System.out.println("Pass");
		else
			System.out.println("Fail");
	}
}
