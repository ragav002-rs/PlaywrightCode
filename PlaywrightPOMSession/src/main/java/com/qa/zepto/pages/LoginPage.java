package com.qa.zepto.pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.microsoft.playwright.Page;

public class LoginPage {
	
	Logger logger= LogManager.getLogger(LoginPage.class);
	Page page;
	
	private String emailid = "#username";
	private String password = "#password";
	private String Singin_btn = "button[type='submit']";
	
	
	public LoginPage(Page page) {
		this.page = page;
	}
	
	public String getPageURl() {
		String url = page.url();
		logger.debug("URL:" + url);
		return url;
	}
	
	
	public void performSignin(String email, String pass) {
		page.fill(emailid, email);
		page.fill(password, pass);
		page.click(Singin_btn);
		
	}
	
}
