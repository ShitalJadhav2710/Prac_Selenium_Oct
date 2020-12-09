package POM_With_DDF;

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

	public String getKiteHomePageProfileName()
	{
		String act = proname.getText();
		return act;
		
	}
}
