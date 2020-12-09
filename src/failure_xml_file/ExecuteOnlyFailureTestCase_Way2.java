package failure_xml_file;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ExecuteOnlyFailureTestCase_Way2
{
	// using suit 
	
	@Test
	public void TC4()
	{
		Reporter.log("Running TC4");
	}
	@Test
	public void TC5()
	{
		Reporter.log("Running TC5");
	}
	@Test
	public void TC6()
	{
		Assert.fail();
		Reporter.log("Running TC6");
	}


}
