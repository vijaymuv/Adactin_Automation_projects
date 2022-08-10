package org.testNg;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Rerun_class implements IRetryAnalyzer {
	
	int start = 1;
	int end = 2;

	@Override
	public boolean retry(ITestResult result) {
if (start<=end) {
	start++;
	return true;
	
}
		
		return false;
	}
	
	

}
