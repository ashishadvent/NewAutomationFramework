package com.flipkart.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

//@author- Ashish

public class Home_Page extends BaseClass {
	
	WebDriver idriver;
	public Home_Page(WebDriver idriver) {
		idriver=driver;
		PageFactory.initElements(idriver, Home_Page.class);
		
	}
	

}
