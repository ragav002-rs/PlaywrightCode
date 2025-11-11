package com.qa.zepto.pages;

import com.microsoft.playwright.Page;

public class SearchPage {
		
	Page page;
	
		private String enterproduct = "#js-site-search-input";

		public SearchPage(Page page) {
			this.page = page;
		}
			
		public String SearchPageUrl() {
			String url = page.url();
			System.out.println("URL:" + url);
			return url;
		}
		
		public void performsearch(String apparelname) {
			
		page.fill(enterproduct, apparelname);

		}
	}



