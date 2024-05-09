package pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;
import utilities.CommonMethods;

public class MCOHomePage extends CommonMethods {

	private Page page;
	private Locator loading;
	private Locator financeModuleLink;
	private Locator cms1500;
	private Locator ub04;
	private Locator CheckSelectProcess;
	
	
	MCOHomePage(Page page) {
		this.page = page;
		this.loading = this.page.getByText("Loading").first();
		this.financeModuleLink = this.page.locator("//span[text()='Finance']");
		this.cms1500 = this.page.getByText("CMS");
		this.ub04 = this.page.getByText("UB-");
		this.CheckSelectProcess= this.page.locator("//a[text()=' Check Select Process']");
	}
	
	
	private void clickFinanceModuleLink() {
		if(loading.isVisible())
			page.waitForTimeout(5000);
		click(financeModuleLink, "Finance Module");
	}
	
	public void navigateToCMS1500() {
		
		if(!cms1500.isVisible()) {
		clickFinanceModuleLink();
		} 
		click(cms1500, "CMS1500 Module");
	}
	
	public void navigateT0UB04() {
		if(loading.isVisible())
			page.waitForURL("**/home");
		if(!cms1500.isVisible()) {
		clickFinanceModuleLink();
		} 
		click(ub04, "UB04 Module");
	}
	
	public void navigateToCheckSelectProcess()
	{
		if(loading.isVisible())
			page.waitForTimeout(5000);
		if(!cms1500.isVisible()) {
			clickFinanceModuleLink();
			}
		click(CheckSelectProcess, "CheckSelectProcess");
	}
}
