package com.qa.zepto.pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.microsoft.playwright.Page;

public class HomePage {

	Logger logger = LogManager.getLogger(HomePage.class);
	Page page;
	
	private String loginclick ="#createScrapbook";
	private String VerifyTitle = "//div[text()='sign in']";
	private String enter_num = "#emph";
	private String clicknext = "//div[@class='mb10 pR']";

	
	public HomePage(Page page) {
		this.page = page;		
	}
	
	public String HomepageTitle() {
		String title = page.title();
		logger.debug("Title:" + title);
		return title;
	}
	
	public String HomepageUrl() {
		String url = page.url();
		logger.debug("URL:" + url);
		return url;
		
	}
	
	public String ProfileLogin(String mobilenumber) throws InterruptedException {
		page.click(loginclick);
		Thread.sleep(2000);
		String title = page.textContent(VerifyTitle);
		logger.debug("Title is :" + title);
		Thread.sleep(2000);
		page.fill(enter_num, mobilenumber);
		Thread.sleep(2000);
		page.click(clicknext);
		return title;
		
	}


	
}
