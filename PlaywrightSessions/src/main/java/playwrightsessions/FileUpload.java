package playwrightsessions;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Base64;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.options.FilePayload;

public class FileUpload {

	
	public static void main(String [] args) throws IOException {

		String minimalGifBase64 = "R0lGODlhAQABAIAAAP///wAAACH5BAEAAAAALAAAAAABAAEAAAICRAEAOw==";
		byte[] imageBytes = Base64.getDecoder().decode(minimalGifBase64.getBytes(StandardCharsets.UTF_8));
		
		
		Playwright playwright = Playwright.create();
		Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		BrowserContext browsercontext = browser.newContext();
		
		Page page = browsercontext.newPage();
		page.navigate("https://www.file.io/");
		
	//Single File	
	//	page.setInputFiles("#select-files-input", Paths.get("/home/ragavkumar/Documents/seleniumcommands"));
		
	//Multiple Files		
	//	page.setInputFiles("#select-files-input", new Path[] { Paths.get("/home/ragavkumar/Documents/seleniumcommands"), 
	//															Paths.get("/home/ragavkumar/Documents/image.jpeg")});
	
		
	//Text file run time upload
	//	page.setInputFiles("#select-files-input", new FilePayload("ragav.text", "text/plain", "This is Ragav Text File".getBytes(StandardCharsets.UTF_8)));
		
	//PDF file run time upload
	//	page.setInputFiles("#select-files-input", new FilePayload("ragav.pdf","application/pdf","This is Ragav PDF File".getBytes(StandardCharsets.UTF_8)));
		
	//Image(jpeg) file run time upload	
	//	page.setInputFiles("#select-files-input", new FilePayload("ragav.jpeg", "image/jpeg", imageBytes));
		page.locator("//span[text()='Open File']").click();
		
		
		
	}

	
}
