/**
 * 
 */
package com.flipkart.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * @author ashish
 *
 */
public class Login_Page {
	
	WebDriver rdriver;

	public Login_Page(WebDriver idriver) {
	    rdriver=idriver;
	    PageFactory.initElements(idriver, this);
	    
	}
	
	@FindBy (id="user_login")
	WebElement txtusername;
	
	@FindBy (id="user_pass")
	WebElement txtpassword;
	
	@FindBy (id="wp-submit")
	WebElement submitButton;
	
	public void setUserName(String userName) {
		
		txtusername.sendKeys(userName);
		
		
	}
	
	public void setPassword(String pwd) {
		txtpassword.sendKeys(pwd);
		
	}
	
	public void clickSubmit() {
		submitButton.click();
		
	}
	
	public Home_Page loginToHomePage(String userName , String pwd) {
		setUserName(userName);
		setPassword(pwd);
		submitButton.click();
		return null;
		
	}
	

}
