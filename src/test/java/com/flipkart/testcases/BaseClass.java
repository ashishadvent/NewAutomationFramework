/**
 * 
 */
package com.flipkart.testcases;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.flipkart.utilities.ReadConfig;

/**
 * @author ashish
 *
 */
public class BaseClass {
	//to create reference variable of ReadConfig Class to access variable declared in config.properties file through its methods....
	public static ReadConfig config=new ReadConfig();
	
	//getting the values from config.properties file
	public String testURL=config.getApplicationURL();
	public String userName=config.getUserName();
	public String password=config.getPassword();
	public String chromeDriverPath=System.getProperty("user.dir")+System.getProperty("File.pathSeparator")+config.getchromeDriverPath();
	public String IEDriverPath=System.getProperty("user.dir")+System.getProperty("File.pathSeparator")+config.getIEDriverPath();
	//public String FFDriverPath=config.geckoDriverPath();
	public String FFDriverPath=System.getProperty("user.dir")+System.getProperty("File.pathSeparator")+config.geckoDriverPath();
	public static Logger logger;
	 	                                                     
	//create public reference variable of WebDriver class
   public static WebDriver driver;	
   @Parameters("browser")
   @BeforeTest 
   public void setUp(String br) {
	    logger=Logger.getLogger(BaseClass.class);
	    PropertyConfigurator.configure("log4j.properties");
	   
	   if (br.toLowerCase().equals("chrome")) {
		   System.setProperty("webdriver.chorme.driver",config.getchromeDriverPath());
		   logger.info("Chrome Browser is selected for test execution");
		   driver=new ChromeDriver();
		   
	   }
	   
	   else if(br.toLowerCase().equals("firefox")) {
		   System.setProperty("webdriver.gecko.driver",config.geckoDriverPath());
		   logger.info("firefox Browser is selected for test execution");
		   driver=new FirefoxDriver();
	   }
	   else if(br.toLowerCase().equals("ie")) {
		   System.setProperty("webdriver.ie.driver",config.getIEDriverPath());
		   logger.info("IE Browser is selected for test execution");
		   driver=new InternetExplorerDriver();
	   }
	   
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
   }
   
   @AfterTest
   public void tearDown() {
	   driver.quit();
   }
}
