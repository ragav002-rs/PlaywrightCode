package com.qa.zepto.base;

import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.microsoft.playwright.Page;
import com.qa.zepto.factory.PlaywrightFactory;
import com.qa.zepto.pages.HomePage;
import com.qa.zepto.pages.LandingPage;
import com.qa.zepto.pages.LoginPage;
import com.qa.zepto.pages.SearchPage;

public class BaseTest {

	PlaywrightFactory pf;
	protected Page page;
	protected HomePage homepage;
	protected Properties prop;
	protected SearchPage searchpage;
	protected LoginPage loginpage;
	protected LandingPage landingpage;
	
		@Parameters({"baseURLKey"})
		@BeforeTest
		public void setup(String baseURLKey) throws IOException {
			
		pf = new PlaywrightFactory();
		prop = pf.init_prop();
		page = pf.initBrowser(prop, baseURLKey);
		homepage = new HomePage(page);
		searchpage = new SearchPage(page);
		loginpage = new LoginPage(page);
		landingpage = new LandingPage(page);
		
	}	
		@AfterTest
		public void TearDown() {
			page.context().browser().close();
		}	
	
}
