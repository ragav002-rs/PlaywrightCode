package playwrightsessions;

import java.nio.file.Paths;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class FbAutoLogin {

	public static void main (String [] args) throws InterruptedException {
		
		Playwright playwright = Playwright.create();
		Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		
		BrowserContext browsercontext = browser.newContext(new Browser.NewContextOptions().setStorageStatePath(Paths.get("signup.json")));
		
		Page page = browsercontext.newPage();
		Thread.sleep(3000);
		page.navigate("https://automationexercise.com/");
	}
	
	
}
