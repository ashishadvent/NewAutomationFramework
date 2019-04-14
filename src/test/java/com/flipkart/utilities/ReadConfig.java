/**
 * 
 */
package com.flipkart.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

/**
 * @author ashish
 *
 */
public class ReadConfig {
	
    Properties property;
   public ReadConfig(){
    try {
    	File file=new File("./Configuration/config.properties");
    	FileInputStream inStream=new FileInputStream(file);
    	property.load(inStream);
    }catch(Exception e) {
    	e.getStackTrace();
    }
   }
    public String getApplicationURL() {
    	String url= property.getProperty("testURL");
		return url;
    	
    }
    public String getUserName() {
    	String uname= property.getProperty("userName");
		return uname;
    	
    }
    public String getPassword() {
    	String pwd= property.getProperty("password");
		return pwd;
    	
    }
    public String getchromeDriverPath() {
    	String chromepath= property.getProperty("chormeDriverPath");
		return chromepath;
    	
    }
    
    public String getIEDriverPath() {
    	String IEpath= property.getProperty("IEDriverPath");
		return IEpath;
    	
    }
    
    public String geckoDriverPath() {
    	String ffpath= property.getProperty("geckodriverPath");
		return ffpath;
    	
    }
}
