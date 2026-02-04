package com.qa.zepto.pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.microsoft.playwright.Page;

public class SearchPage {
		
	Logger logger = LogManager.getLogger(SearchPage.class);
	Page page;
	
		private String enterproduct = "#js-site-search-input";

		public SearchPage(Page page) {
			this.page = page;
		}
			
		public String SearchPageUrl() {
			String url = page.url();
			logger.debug("URL:" + url);
			return url;
		}
		
		public void performsearch(String productname) {
			
		page.fill(enterproduct, productname);

		}
	}



