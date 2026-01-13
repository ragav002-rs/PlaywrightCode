package com.qa.zepto.pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.microsoft.playwright.Page;

public class LandingPage {

		Logger logger = LogManager.getLogger(LandingPage.class);
		Page page;
		
	private String Signupclick = "//a[text() ='Sign in']";
	
	
	public LandingPage(Page page) {
		this.page = page;
	}
	
	public String getPageURL() {
		String url = page.url();
		logger.debug("URL:" + url);
		return url;
	}
	
	public void sigup() {
		page.click(Signupclick);
	}
	
	public LoginPage navigatetolandingpage() {
		page.click(Signupclick);
		return new LoginPage(page);
		
	}
}
