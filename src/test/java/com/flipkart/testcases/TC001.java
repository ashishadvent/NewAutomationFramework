package com.flipkart.testcases;


import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;



//import com.flipkart.pageobjects.Login_Page;

//@author -ashish
public class TC001 extends BaseClass{
	
	//public WebDriver driver;
	
	@Test
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
	}
	
	
	/*public WebDriver driver1=driver;
	 
	@Test
	
	public void loginTest() {
		driver1.get(config.getApplicationURL());
		Login_Page ln=new Login_Page(driver1);
		
		ln.setUserName(config.getUserName());
		logger.info("Entered the userName");
		ln.setPassword(config.getPassword());
		logger.info("Entered the password");
		ln.clickSubmit();
		logger.info("clocked on sign in button");
		System.out.println(driver.getTitle());
	}*/
	
}
