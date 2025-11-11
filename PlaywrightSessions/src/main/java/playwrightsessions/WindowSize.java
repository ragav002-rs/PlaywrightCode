package playwrightsessions;

import java.awt.Dimension;
import java.awt.Toolkit;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class WindowSize {

	
	public static void main (String [] args) {
		
		Playwright playwright = Playwright.create();
		Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		BrowserContext browsercontext = browser.newContext(new Browser.NewContextOptions().setViewportSize(1920, 902));
				
			int screenresolution =	Toolkit.getDefaultToolkit().getScreenResolution();
				System.out.println(screenresolution);
				
			Dimension screensize = Toolkit.getDefaultToolkit().getScreenSize();
				int width = screensize.width;
				int height = screensize.height;
				System.out.println(width +":"+height);
				
			
			Page page = browsercontext.newPage();
			page.navigate("https://www.maxfashion.in/in/en/");
				
				
				
				
	}
	
	
	
}
