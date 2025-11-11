package playwrightsessions;

import java.nio.file.Paths;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class VideoRecord {

	public static void main(String [] args) {
		
		Playwright playwright = Playwright.create();
		Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		BrowserContext browsercontext = browser.newContext(new Browser.NewContextOptions().setRecordVideoDir(Paths.get("/home/ragavkumar/Desktop")));
		
		Page page = browsercontext.newPage();
		page.navigate("https://www.flipkart.com/");
		page.fill(".Pke_EE", "mouse");
		
		
		
	}
	
	
}
