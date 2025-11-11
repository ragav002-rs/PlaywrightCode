package playwrightsessions;

import java.nio.file.Paths;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class AutoLogin {

	public static void main(String [] args) {
		
		Playwright playwright = Playwright.create();
		Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		BrowserContext browsercontext = browser.newContext();
		
		Page page = browsercontext.newPage();
		page.navigate("https://www.amazon.in/");
		page.locator("//span[text()='Hello, sign in']").click();
		Locator email = page.locator("#ap_email_login");
		email.fill("ragav002@gmail.com");
		page.locator("//input[@class='a-button-input']").click();
		Locator password = page.locator("#ap_password");
		password.fill("Ragav@1995");
		page.locator("#signInSubmit").click();
	
		
		browsercontext.storageState(new BrowserContext.StorageStateOptions().setPath(Paths.get("PlaywrightSessions/resources/Amazonlogin.json")));
		
	}
	
}
