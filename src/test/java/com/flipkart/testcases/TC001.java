package com.flipkart.testcases;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


import com.flipkart.pageobjects.BaseClass;
import com.flipkart.pageobjects.Login_Page;

//@author -ashish
public class TC001 extends BaseClass{
	
	
	
	 
	@Test
	
	void loginTest() {
		driver.get(config.getApplicationURL());
		Login_Page ln=new Login_Page(driver);
		
		ln.setUserName(config.getUserName());
		logger.info("Entered the userName");
		ln.setPassword(config.getPassword());
		logger.info("Entered the password");
		ln.clickSubmit();
		logger.info("clocked on sign in button");
		System.out.println(driver.getTitle());
	}
	
}
