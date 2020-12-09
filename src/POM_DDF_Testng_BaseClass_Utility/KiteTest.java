package POM_DDF_Testng_BaseClass_Utility;


import java.io.IOException;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import POM_With_DDF.KiteHomePage;
import POM_With_DDF.KiteLogin1Page;
import POM_With_DDF.KiteLogin2Page;

public class KiteTest extends BaseClass
{

	KiteLogin1Page login1;
	KiteLogin2Page log2;
	KiteHomePage hm;
	int TCID;
	
	@BeforeClass
	public void openbrowser() throws IOException
	{
		BrowserOpen();
		login1=new KiteLogin1Page(d);
		log2=new KiteLogin2Page(d);
		hm=new KiteHomePage(d);
	}
	
	@BeforeMethod
	public void loginApp() throws Exception, IOException
	{
				
		login1.setKiteLogin1PageUn(Utility.getTestData(0, 0));
		login1.setKiteLogin1PagePwd(Utility.getTestData(0, 1));
		login1.ClickKiteLogin1PageLoginButton();
		
		log2.setKiteLogin2PagePin(Utility.getTestData(0, 2));
		log2.ClickKiteLogin2PageContinueButton();
	}
	
	@Test
	public void verifyProfileName() throws Exception
	{
		TCID=550;
		String actText=hm.getKiteHomePageProfileName();
		
		String expText=Utility.getTestData(0, 3);
		
		Assert.assertEquals(actText, expText,"actual & Expected are different");
		
	}
	
	@AfterMethod
	public void logoutApp(ITestResult result) throws IOException
	{
		if(result.getStatus()==ITestResult.FAILURE)
			Utility.TakeScreenShot(d, TCID);
		
		
	}
	
	@AfterClass
	public void closebrowser()
	{
		login1=null;
		log2=null;
		hm=null;
		d.close();
	}
}
