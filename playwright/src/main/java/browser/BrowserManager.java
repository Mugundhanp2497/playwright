package browser;

import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.Tracing;

import constants.ConfigurationProperties;
import constants.Constants;
import filereader.ConfigurationPropertyReader;

import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.BrowserType.LaunchOptions;
import com.microsoft.playwright.Page;

public final class BrowserManager {

	private BrowserManager() {
	}

	private static Page page;
	private static Playwright playwright;
	private static BrowserContext context;
	private static Browser browser;
	
	public static void init() {
		
		LaunchOptions launchoptions = new BrowserType.LaunchOptions();
		if(ConfigurationPropertyReader.get(ConfigurationProperties.Headless).equalsIgnoreCase("Yes")) {
			launchoptions.setHeadless(true);
		} else if (ConfigurationPropertyReader.get(ConfigurationProperties.Headless).equalsIgnoreCase("No")) {
			launchoptions.setHeadless(false);
		} else if (ConfigurationPropertyReader.get(ConfigurationProperties.Headless).equalsIgnoreCase("")) {
			launchoptions.setHeadless(false);
		} 
		
		playwright = Playwright.create();
		browser = playwright.chromium().launch(launchoptions);
		context = browser.newContext(new Browser.NewContextOptions()
									.setRecordVideoDir(Paths.get(Constants.videoPath)));
		context.tracing().start(new Tracing.StartOptions()
				  .setScreenshots(true)
				  .setSnapshots(true)
				  .setSources(true));
		page = browser.newPage();
		page.setDefaultTimeout(100*1000);
		
	}

	public static void closeBrowser() {
		
		context.tracing().stop(new Tracing.StopOptions()
				  .setPath(Paths.get(Constants.tracePath+"Trace.zip")));
		page.close();
		context.close();
		browser.close();
		playwright.close();
		
	}

	public static Page getBrowser() {
		return page;
	}
	
}
