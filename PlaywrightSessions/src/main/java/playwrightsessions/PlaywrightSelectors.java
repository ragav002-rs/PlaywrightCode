package playwrightsessions;

import java.util.List;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class PlaywrightSelectors {

	public static void main (String [] args) {
		
		Playwright playwright = Playwright.create();
		Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		BrowserContext browsercontext = browser.newContext();
		
		Page page = browsercontext.newPage();
		page.navigate("https://www.hul.co.in/");
		
		List<String> linkscontext = page.locator("a:has-text(\"Careers\")").allInnerTexts();
		
		for(int i=0; i<linkscontext.size(); i++) {
			System.out.println(linkscontext.get(i));
		
		}
		
		int carrerscount = page.locator("a:has-text(\"Careers\")").count();
		System.out.println(carrerscount);
		
		
	}
	
	
	
	
}
