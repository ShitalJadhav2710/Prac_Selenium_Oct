package TestNG;

import org.testng.annotations.Test;

public class keyword_grouping 
{
	@Test(groups = {"Module1"})
	public void TC1()
	{
		System.out.println("Running TC1");
	}
	
	@Test(groups= {"Module2"})
	public void TC2()
	{
		System.out.println("Running TC2");
	}
	
	@Test(groups= {"Module1"})
	public void TC3()
	{
		System.out.println("Running TC3");
	}

}
