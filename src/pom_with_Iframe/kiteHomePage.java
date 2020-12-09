package pom_with_Iframe;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class kiteHomePage
{
	@FindBy (xpath = "//span[text()='KV']") private WebElement profile_name;
	
	kiteHomePage(WebDriver d)
	{
		PageFactory.initElements(d, this);
	}
	public void verifykiteHomePageProfileName()
	{
		boolean result = profile_name.isDisplayed();
		if(result)
			System.out.println("Pass");
		else
			System.out.println("Fail");
	}

}
