/**
 * 
 */
package com.flipkart.utilities;

import java.util.HashMap;
import java.util.Map;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

/**
 * @author ashish
 *
 */
public class ExtentTestManager {
	
	 static Map<Integer,ExtentTest> extentTestMap=new HashMap<Integer,ExtentTest>();
	 static ExtentReports extentreport=ExtentManager.getExtentInstance();
	 
	 public static synchronized ExtentTest getTest() {
			return (ExtentTest) extentTestMap.get((int) (long) (Thread.currentThread().getId()));
		}

		public static synchronized void endTest() {
			extentreport.flush();
		}

		public static synchronized ExtentTest startTest(String testName) {
			ExtentTest test = extentreport.createTest(testName);
			extentTestMap.put((int) (long) (Thread.currentThread().getId()), test);
			return test;
		}
	 
	 

}
