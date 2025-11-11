package playwrightsessions;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class XpathLocators {

	
	public static void main (String [] args) {
		
		Playwright playwright = Playwright.create();
		Browser browser = playwright.webkit().launch(new BrowserType.LaunchOptions().setHeadless(false));
		BrowserContext browsercontext = browser.newContext();
		
		Page page = browsercontext.newPage();
		page.navigate("https://www.ajio.com/");
		
//		Locator searchbar = page.locator("//input[@name='searchVal']");
//		searchbar.fill("shirt");
	
//		Locator customercare = page.locator("(//a[text() ='Customer Care'])[last()]");
//		customercare.click();
		
//		Locator loginform = page.locator("//span[contains(@class,'login-form')]");
//		loginform.click();
	
		Locator Mens = page.locator("//ul[@class=\"ftr-items\"]//a[text()='Men']");
		Mens.click();
	
	}

}
