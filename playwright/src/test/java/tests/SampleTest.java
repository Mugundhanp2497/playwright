package tests;

import org.testng.annotations.Test;

import base.BaseClass;
import pages.MCOBatchSelectPage;
import pages.MCOHomePage;
import pages.MCOLoginPage;
import pages.MCOUB04Page;
import pages.PageNotFoundPage;
import pages.PageObjectManager;

public class SampleTest extends BaseClass 

{

	
	@Test()
	public void sampleLogin() {
		
		PageObjectManager pom = new PageObjectManager(page);
		PageNotFoundPage pagenotfound = pom.PagenotFoundPage();
		pagenotfound.launchURL();
		pagenotfound.clickMcoLogin();
		MCOLoginPage loginpg = pom.MCOLoginPage();
		loginpg.login();
		MCOHomePage homepg = pom.MCOHomePage();
		homepg.navigateT0UB04();
		MCOUB04Page ub04Page = pom.MCOUB04Page();
		ub04Page.submitUB04();
		homepg.navigateToCheckSelectProcess();
		MCOBatchSelectPage batchPage= pom.MCOBatchSelectPage();
		batchPage.createBatch();
	
	}
	
	@Test()
	public void batch()
	{
		PageObjectManager pom = new PageObjectManager(page);
		PageNotFoundPage pagenotfound = pom.PagenotFoundPage();
		pagenotfound.launchURL();
		pagenotfound.clickMcoLogin();
		MCOLoginPage loginpg = pom.MCOLoginPage();
		loginpg.login();
		MCOHomePage homepg = pom.MCOHomePage();
		homepg.navigateToCheckSelectProcess();
		MCOBatchSelectPage batchPage= pom.MCOBatchSelectPage();
		batchPage.createBatch();
		
		
	}
}
