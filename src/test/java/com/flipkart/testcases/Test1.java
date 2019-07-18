package com.flipkart.testcases;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;

import com.flipkart.utilities.ReadConfig;

public class Test1 {
	
public static ReadConfig config=new ReadConfig();
	
	//getting the values from config.properties file
  	//public String testURL=config.getApplicationURL();
  	public String userName=config.getUserName();
	public String password=config.getPassword();
	public String chromeDriverPath=config.getchromeDriverPath();
	public String IEDriverPath=config.getIEDriverPath();
	public String FFDriverPath=config.geckoDriverPath();
	
	
	@Test
	public void test12() {
		System.out.println("Welecome to test ng its working now");
		//System.out.println(testURL);
		System.out.println(userName);
		System.out.println(password);
		System.out.println(chromeDriverPath);
		System.out.println(IEDriverPath);
		System.out.println(FFDriverPath);
	}

}
