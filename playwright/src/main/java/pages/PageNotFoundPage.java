package pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;

import utilities.CommonMethods;

public class PageNotFoundPage extends CommonMethods {

	private Page page;
	
	private Locator mcoLoginLink ;
	private Locator portalLoginLink;
	
	
	 PageNotFoundPage(Page page) {
		
		this.page = page;
		this.mcoLoginLink = this.page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Click here")).first();
		this.portalLoginLink = this.page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Click here")).nth(1);
	}

	public void launchURL(){
		page.navigate("http://10.10.1.202:900");
	}
	
	public void clickMcoLogin() {
		
		click(mcoLoginLink, "MCO-Login Link");
		page.waitForURL("**/login");
		
	}
	
     public void clickPortalLogin() {
		
		click(portalLoginLink, "PORTAL-Login Link");
	}
	
	
	
	
	
	
	
}
