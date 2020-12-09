package TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class annotations

{
	@BeforeClass
	public void beforclas()
	{
		System.out.println("..BeforeClass");
	}
	@BeforeMethod
	public void applogin()
	{
		System.out.println("...Before Method...");
	}
//	@BeforeMethod
//	public void applogin1()
//	{
//		System.out.println("..Before Method1..");
//	}
	
	@Test
	public void test()
	{
		
		System.out.println("..Test Method1..");
	}
	
	
	@AfterMethod
	public void logoutme()
	{
		System.out.println("..After Method..");
	}
	@AfterClass
	public void aftercls()
	{
		System.out.println("..After Class...");
	}
}
