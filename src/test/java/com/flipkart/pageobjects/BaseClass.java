/**
 * 
 */
package com.flipkart.pageobjects;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.flipkart.utilities.ReadConfig;

/**
 * @author ashish
 *
 */
public class BaseClass {
	//to create reference variable of ReadConfig Class to access variable declared in config.properties file through its methods....
	ReadConfig config=new ReadConfig();
	
	//getting the values from config.properties file
	public String testURL=config.getApplicationURL();
	public String userName=config.getUserName();
	public String password=config.getPassword();
	public String chromeDriverPath=config.getchromeDriverPath();
	public String IEDriverPath=config.getIEDriverPath();
	public String FFDriverPath=config.geckoDriverPath();
	
	//create public reference variable of WebDriver class
   public WebDriver driver;	
   @Parameters("browser")
   @BeforeClass 
   void setUp(String br) {
	    Logger logger=Logger.getLogger("BaseClass");
	    PropertyConfigurator.configure("Log4j.properties");
	   
	   if (br.toLowerCase().equals("chrome")) {
		   System.setProperty("webdriver.chorme.driver",config.getchromeDriverPath());
		   driver=new ChromeDriver();
	   }
	   
	   else if(br.toLowerCase().equals("firefox")) {
		   System.setProperty("webdriver.gecko.driver",config.geckoDriverPath());
		   driver=new FirefoxDriver();
	   }
	   else if(br.toLowerCase().equals("ie")) {
		   System.setProperty("webdriver.ie.driver",config.getIEDriverPath());
		   driver=new InternetExplorerDriver();
	   }
	   
   }
}
