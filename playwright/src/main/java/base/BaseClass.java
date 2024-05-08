package base;

import java.lang.reflect.Method;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.model.Report;
import com.microsoft.playwright.Page;

import browser.BrowserManager;
import reports.Reports;

/**
 * @author Alphi-MohamedRazul
 * 
 * @version 1.0
 * @since 1.0
 */
@Listeners(listners.Listener.class)
public class BaseClass {

	protected Page page;
	
	/**
	 * @author Alphi-MohamedRazul
	 * @since 1.0
	 */
	@BeforeTest
	public void browserLaunch() {

		BrowserManager.init();
		page = BrowserManager.getBrowser();
	}
	
	/**
	 * @author Alphi-MohamedRazul
	 * @since 1.0
	 */
	@BeforeMethod
	public void beforeMethod(Method method) {

		Reports.createTest(method.getName());
		
	}
	
	/**
	 * @author Alphi-MohamedRazul
	 * @since 1.0
	 */
	@AfterTest
	public void close() {
		
		BrowserManager.closeBrowser();

	}
	
}
