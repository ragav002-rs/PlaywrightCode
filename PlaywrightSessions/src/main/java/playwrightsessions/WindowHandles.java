package playwrightsessions;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class WindowHandles {

	public static void main (String [] args) {
		
		Playwright playwright = Playwright.create();
		Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		
//		BrowserContext browsercontext1 = browser.newContext();
//		BrowserContext browsercontext2 = browser.newContext();
//		
//		Page page1 = browsercontext1.newPage();
//		Page page2 = browsercontext1.newPage();
//		
//		page1.navigate("https://www.perplexity.ai/");
//		page2.navigate("https://google.com");
		
		BrowserContext browsercontext = browser.newContext();
		
		Page page = browsercontext.newPage();

		page.navigate("https://www.zepto.com/");
		
		Page tab = page.waitForPopup(() -> {
			
			Locator instalink = page.locator("(//img[@fetchpriority='low'])[52]");
			instalink.click();
			
			
		});
		page.waitForLoadState();
		
		String url = tab.url();
		System.out.println("Childtab url:" + url);

		
		String parenttitle = page.title();
		System.out.println("Parent TabTitle :" + parenttitle);
	
	
//				Page tab = page.waitForPopup(() -> {
//					
//					
//					Locator newtab = page.locator("a[target='_blank']").first();
//					newtab.click();
//			
//					});
//				tab.waitForLoadState();
//				
//				tab.navigate("https://zepto.com/");
//				System.out.println("NewTab Title : " + tab.title());
			
		
		
	}
	
	
}
