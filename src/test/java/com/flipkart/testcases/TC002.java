package com.flipkart.testcases;



import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC002 {

	@Test
	public void testcase1() {
		 Logger logger=Logger.getLogger("TC001");
		   PropertyConfigurator.configure("log4j.properties");
		   logger.info("test1 started");
		   System.out.println("first test excution is successful");
		   logger.info("test2 started");
		   Assert.assertEquals("test", "test");
		   logger.info("test3 started");
	}
}
