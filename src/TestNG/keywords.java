package TestNG;

import org.testng.annotations.Test;

public class keywords 
{
	@Test
	public void xyz() 
	{
		System.out.println("login to system...");
	}
	
	@Test
	public void zzz()
	{
		System.out.println("zzz");
	}
	
	@Test(dependsOnMethods = {"xyz"})
	public void test()
	{
		System.out.println("test...");
	}
	
	
	
	
//	@Test(timeOut = 5000)
//	public void test() throws Exception
//	{
//		Thread.sleep(6000);
//		System.out.println("test");
//	}
	
	
	
	
	
//	@Test(enabled = false)
//	public void test()
//	{
//		System.out.println("test");
//	}
//	
//	@Test
//	public void test1()
//	{
//		System.out.println("test1");
//	}
	
	
	
//	@Test(invocationCount=5)
//	public void test()
//	{
//		System.out.println("Hi..");
//	}
	
	
	
	
	
//	@Test(priority=2)
//	public void test1()
//	{
//		System.out.println("test1");
//	}
//	
//	@Test
//	public void test2()
//	{
//		System.out.println("test2");
//	}
//	@Test(priority=-1)
//	public void test3()
//	{
//		System.out.println("test3");
//	}


}
