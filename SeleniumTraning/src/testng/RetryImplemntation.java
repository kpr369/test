package testng;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryImplemntation implements IRetryAnalyzer {

	public  int count =0;
	
	public int maxRetry=3;
	
	@Override
	public boolean retry(ITestResult result) {
		
		if(count<maxRetry)
		{
			count++;
			return true;
		}
		return false;
	}

}
