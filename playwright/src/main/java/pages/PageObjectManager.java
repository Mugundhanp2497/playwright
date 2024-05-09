package pages;

import com.microsoft.playwright.Page;

public class PageObjectManager {

	private Page page;
	private PageNotFoundPage pageNotFoundPage;
	private  MCOLoginPage mcoLoginPage;
	private MCOHomePage mcoHomePage;
	private MCOCMS1500Page mcocms1500page;
	private MCOUB04Page mcoub04Page;
	private MCOBatchSelectPage batchPage;
	
	public PageObjectManager(Page page) {
		
		this.page = page;
	}
	
	public PageNotFoundPage PagenotFoundPage() {
		return (pageNotFoundPage == null) ? pageNotFoundPage = new PageNotFoundPage(page):pageNotFoundPage;
	}
	
	public MCOLoginPage MCOLoginPage() {
		return (mcoLoginPage == null) ? mcoLoginPage = new MCOLoginPage(page):mcoLoginPage;
	}
	
	public MCOHomePage MCOHomePage() {
		return (mcoHomePage == null) ? mcoHomePage = new MCOHomePage(page) : mcoHomePage;
	}
	
	public MCOCMS1500Page MCOCMS1500Page() {
		return (mcoHomePage == null) ? mcocms1500page = new MCOCMS1500Page(page) : mcocms1500page;
	}
	
	public MCOUB04Page MCOUB04Page() {
		return (mcoub04Page == null) ? mcoub04Page = new MCOUB04Page(page) : mcoub04Page;
	}
	
	public MCOBatchSelectPage MCOBatchSelectPage()
	{
		return(batchPage == null) ? batchPage = new MCOBatchSelectPage(page) : batchPage;
	}
	
	
}
