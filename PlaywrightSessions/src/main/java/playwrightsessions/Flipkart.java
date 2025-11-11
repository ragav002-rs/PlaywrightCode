package playwrightsessions;

import java.nio.file.Paths;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.Tracing;
import com.microsoft.playwright.options.AriaRole;

public class Flipkart {
	 public static void main(String[] args) {
		    try (Playwright playwright = Playwright.create()) {
		      Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		      BrowserContext context = browser.newContext();
		      context.tracing().start(new Tracing.StartOptions()
		    		  .setScreenshots(true)
		    		  .setSnapshots(true)
		    		  .setSources(true));
		      
		     Page page = context.newPage();
		      page.navigate("https://www.flipkart.com/");
		      page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Login Login")).click();
		      page.locator("form").filter(new Locator.FilterOptions().setHasText("Enter Email/Mobile numberBy")).getByRole(AriaRole.TEXTBOX).click();
		      page.locator("form").filter(new Locator.FilterOptions().setHasText("Enter Email/Mobile numberBy")).getByRole(AriaRole.TEXTBOX).fill("ragav002@gmail.com");
		      page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("New to Flipkart? Create an")).click();		   
		      page.locator("form").filter(new Locator.FilterOptions().setHasText("Enter Mobile numberBy")).getByRole(AriaRole.TEXTBOX).click();
		      page.locator("form").filter(new Locator.FilterOptions().setHasText("Enter Mobile numberBy")).getByRole(AriaRole.TEXTBOX).fill("9898989898");
		      page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Flipkart").setExact(true)).click();
		      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("✕")).click();
		      
		      
		      context.tracing().stop(new Tracing.StopOptions()
		    		  .setPath(Paths.get("trace.zip")));
		      
		      
		    }
		  }
		}

