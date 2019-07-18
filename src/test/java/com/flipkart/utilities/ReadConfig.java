/**
 * 
 */
package com.flipkart.utilities;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

/**
 * @author ashish
 *
 */
public class ReadConfig {
	
	private Properties property;
	private final String propertyFilePath= "Configuration//config.properties";

	
	public ReadConfig(){
		BufferedReader reader;
		try {
			reader = new BufferedReader(new FileReader(propertyFilePath));
			property = new Properties();
			try {
				property.load(reader);
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			throw new RuntimeException("Configuration.properties not found at " + propertyFilePath);
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
