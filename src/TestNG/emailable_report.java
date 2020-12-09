package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class emailable_report 
{
	@Test
	public void TC1() 
	{
		Reporter.log("Running TC1", true);
	}
	@Test
	public void TC2() 
	{
		Reporter.log("Running TC2...", true);
	}
	
	

}
