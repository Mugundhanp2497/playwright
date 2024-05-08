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
	
	
	MCOHomePage(Page page) {
		this.page = page;
		this.loading = this.page.getByText("Loading").first();
		this.financeModuleLink = this.page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("󰁰 Finance 󰅀"));
		this.cms1500 = this.page.getByText("CMS");
		this.ub04 = this.page.getByText("UB-");
	}
	
	
	private void clickFinanceModuleLink() {
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
	
}
