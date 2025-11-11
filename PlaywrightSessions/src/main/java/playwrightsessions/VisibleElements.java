package playwrightsessions;

import java.util.List;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class VisibleElements {

	public static void main (String [] args) {
		
		Playwright playwright = Playwright.create();
		Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		BrowserContext browsercontext = browser.newContext();
		
		Page page = browsercontext.newPage();
		page.navigate("https://www.britannia.co.in/");
		
	// no of links count in a website
		
		int nooflinks = page.locator("a >> visible=true").count();
		System.out.println(nooflinks);
		
	// no of images count in a website
		
//		int nofofimages = page.locator("img >> visible=true").count();
//		System.out.println(nofofimages);
	
	// all links text print in console
		
//		List<String> linksdata = page.locator("a >> visible=true").allInnerTexts();
//		
//		for(int i=0; i<linksdata.size(); i++) {
//			System.out.println(linksdata.get(i));
//		}
		
		List<String> paragraphdata = page.locator("xpath = //h3 >> visible=true").allInnerTexts();
			
		for(int i=0; i<paragraphdata.size(); i++) {
			System.out.println(paragraphdata.get(i));
		}
		
		int paragraphdata1 = page.locator("xpath = //h3 >> visible=true").count();
			System.out.println(paragraphdata1);
		
	}
	
	
}
