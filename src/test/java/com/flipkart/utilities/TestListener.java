/**
 * 
 */
package com.flipkart.utilities;

import org.apache.log4j.Logger;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.flipkart.testcases.BaseClass;

/**
 * @author ashish
 *
 */
public class TestListener  extends BaseClass implements ITestListener{
	
	//Logger localLogger = BaseClass.getLogger(TestListener.class);
	Logger localLogger = Logger.getLogger(TestListener.class);

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		localLogger.info("HELLO");
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		System.out.println("*** Test Suite " + context.getName() + " started ***");
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		
	}
	
	
	

}
