package pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;

import utilities.CommonMethods;

public class MCOCMS1500Page extends CommonMethods {

	private Page page;
	private Locator createButton;
	
	
 MCOCMS1500Page(Page page) {
		this.page = page;
    this.createButton = page.locator("button").filter(new Locator.FilterOptions().setHasText("Create"));
	}
	
	
	public void clickCreateButton() {
		
		click(createButton, "Create button");
	}
	
	
	
	
	
	
	
	
	
}
