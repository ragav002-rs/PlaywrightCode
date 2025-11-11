package playwrightsessions;

import java.nio.file.Paths;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class FacebookLogin {

	
	public static void main (String [] args) throws InterruptedException {
		
		Playwright playwright = Playwright.create();
		Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		BrowserContext browsercontext = browser.newContext();
		
		Page page = browsercontext.newPage();
		Thread.sleep(3000);
		page.navigate("https://automationexercise.com/");

		page.locator("//a[text()=' Signup / Login']").click();
		Locator name = page.getByPlaceholder("Name");
		name.fill("Mark");
		Locator email = page.locator("(//input[@name ='email'])[2]");
		email.fill("mark123@gmail.com");
		Locator signupbtn = page.locator("//button[text() ='Signup']");
		signupbtn.click();
		
		
		browsercontext.storageState(new BrowserContext.StorageStateOptions().setPath(Paths.get("signup.json")));
		
	}
}
