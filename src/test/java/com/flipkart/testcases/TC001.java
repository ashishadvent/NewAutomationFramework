package com.flipkart.testcases;


import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.flipkart.pageobjects.Login_Page;



//import com.flipkart.pageobjects.Login_Page;

//@author -ashish
public class TC001 extends BaseClass{
	
	//public WebDriver driver;
	
	/*@Test
	public void setup1() throws InterruptedException {
		//System.setProperty("webdriver.chorme.driver",chromeDriverPath);
		   logger=Logger.getLogger("TC001");
		   PropertyConfigurator.configure("log4j.properties");
		   driver=new ChromeDriver();
		   logger.info("Chrome Driver initialized");
		   driver.get("http://www.google.com");
		   logger.info("Browser opened");
		   wait(1000);
		   driver.close();
		   logger.info("Chrome browser closed");
	}*/
	
	       
	
	
	 
	@Test
	
	public void loginTest() throws InterruptedException {
		logger=Logger.getLogger(TC001.class);
        PropertyConfigurator.configure("log4j.properties");
		System.out.println("first test cases");
		//driver1.get(testURL);opensourcecms
		driver.get("https://www.s1.demo.opensourcecms.com/wordpress/wp-login.php");
		Login_Page ln=new Login_Page(driver);
		
		ln.setUserName("opensourcecms");
		logger.info("Entered the userName");
		ln.setPassword("opensourcecms");
		logger.info("Entered the password");
		ln.clickSubmit();
		Thread.sleep(10000);
		logger.info("clicked on sign in button");
		System.out.println(driver.getTitle());
	}
	@Test
    public void test1() {
	   System.out.println("Second test cases");
   } 
	
}
