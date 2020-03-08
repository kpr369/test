package testng;

import org.testng.Assert;
import org.testng.annotations.Test;


public class RetryFailedTestcases  {
	
	@Test(retryAnalyzer=RetryImplemntation.class)
	void failTest()
	{
		Assert.assertEquals(true, false);
	}

	@Test
		void passTest()
		{		Assert.assertEquals(true, false);
		}
}
