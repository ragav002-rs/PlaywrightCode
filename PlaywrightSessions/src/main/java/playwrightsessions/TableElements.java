package playwrightsessions;

import java.util.List;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class TableElements {

	public static void main (String [] args) {
		
		Playwright playwright = Playwright.create();
		Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		BrowserContext browsercontext = browser.newContext();
		
		Page page = browsercontext.newPage();
//		page.navigate("https://www.espncricinfo.com/series/icc-women-s-world-cup-2025-26-1478193/india-women-vs-bangladesh-women-28th-match-1490440/full-scorecard");
		page.navigate("https://www.espncricinfo.com/series/england-in-new-zealand-2025-26-1491677/new-zealand-vs-england-2nd-odi-1491721/full-scorecard");
		
		
//		Locator rows = page.locator("table.ci-scorecard-table tr");
//		List<String> tablerows = rows.locator(":scope").allInnerTexts();
//		
//		for(int i =0; i<tablerows.size(); i++); {
//			
//			System.out.println(tablerows);
//		}
	
	Locator row = page.locator("table.ci-scorecard-table tr");
	row.locator(":scope", new Locator.LocatorOptions().setHasText("c Foulkes b Smith")).locator("(//span[text()= 'Jacob Bethell'])[1]").click();
//	row.locator(":scope", new Locator.LocatorOptions().setHasText("18")).locator("//span[text()= 'c Foulkes b Smith']").click();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
