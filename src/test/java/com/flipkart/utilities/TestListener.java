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
	//Logger localLogger = Logger.getLogger(TestListener.class);

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		//logger.info("onFinish(ITestContext context)");
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		System.out.println("*** Test Suit1e " + context.getName() + " started ***");
		logger.info("onStart(ITestContext context)");
		
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		logger.info("onTestFailedButWithinSuccessPercentage(ITestResult result)");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		logger.info("onTestFailure(ITestResult result)");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		logger.info("onTestSkipped(ITestResult result)");
	}

	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		logger.info("onTestStart(ITestResult result)");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		logger.info("onTestSuccess(ITestResult result)");
	}
	
	
	

}
