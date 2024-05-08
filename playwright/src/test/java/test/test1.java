package test;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class test1 {

	public static void main(String[] args) {
		try(Playwright playwrigt = Playwright.create()){
			Browser browser = playwrigt.chromium().launch(new BrowserType.LaunchOptions()
					.setHeadless(false));
			BrowserContext context = browser.newContext();
			context.setDefaultTimeout(100*1000);
			Page page = context.newPage();
			page.navigate("http://10.10.1.202:900");
		}
	}
	
}
