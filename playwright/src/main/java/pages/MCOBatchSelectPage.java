package pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

import utilities.CommonMethods;

public class MCOBatchSelectPage extends CommonMethods 
{
	
	private Page page;
	private Locator loading;
	private Locator create;
	private Locator alreadyExist;
	private Locator okButton;
	private Locator delete;
	private Locator dateTpye;
	private Locator claimDos;
	private Locator fromDate;
	private Locator toDate;
	private Locator save;
	private Locator getId;
	private Locator expand;
	private Locator details;
	private Locator checkWrite;

	
	MCOBatchSelectPage(Page page)
	{
		this.page = page;
		this.loading = this.page.getByText("Loading").first();
		this.create=this.page.locator("//span[text()='Create ']");
		this.alreadyExist=this.page.locator("//h2[contains(text(),' already exists')]");
		this.okButton= this.page.locator("//button[text()='Ok']");
		this.delete=this.page.locator("//span[text()='Delete']");
		this.dateTpye= this.page.locator("//mat-select[@formcontrolname='dt_typ']");
		this.claimDos=this.page.locator("//span[text()=' Claim DOS ']");
		this.fromDate=this.page.locator("//input[@formcontrolname='from_dt']");
		this.toDate=this.page.locator("//input[@formcontrolname='to_dt']");
		this.save= this.page.locator("//span[text()=' Save ']");
		this.getId= this.page.locator("//td[@class='mat-cell cdk-cell cdk-column-batch_num mat-column-batch_num ng-tns-c327-5 ng-star-inserted']");
		this.expand=this.page.locator("//td[text()=' 2290 ']");
		this.details=this.page.locator("//span[text()='Details']");
		this.checkWrite=this.page.locator("//span[text()='Check Write']");
		
	}
	
	public void createBatch()
	{
		if(loading.isVisible())
			page.waitForURL("**/finance/checkSelectprocess");
		if(loading.isVisible())
			page.waitForTimeout(10000);
		click(create,"create");
		if(loading.isVisible())
			page.waitForTimeout(10000);
		if(alreadyExist.isVisible())
		{
			click(okButton,"okButton");
			if(loading.isVisible())
				page.waitForTimeout(5000);
			String batchNo= getText(getId,"getId");
			if(loading.isVisible())
				page.waitForTimeout(5000);
			this.expand=this.page.locator("//td[contains(text(),'"+batchNo+"')]");
			if(loading.isVisible())
				page.waitForTimeout(5000);
			click(expand,"expand");
			if(loading.isVisible())
				page.waitForTimeout(5000);
			click(delete, "delete");
			if(loading.isVisible())
				page.waitForTimeout(5000);
			click(okButton,"okButton");
			if(loading.isVisible())
				page.waitForTimeout(5000);
			click(create,"create");
			if(loading.isVisible())
				page.waitForTimeout(5000);
		}
		click(dateTpye,"dateTpye");
		click(claimDos,"claimDos");
		enterData(fromDate,"04/01/2024","fromDate");
		enterData(toDate,"04/04/2024","toDate");
		click(save,"save");
		
		if(loading.isVisible())
			page.waitForTimeout(25000);
		String batchNo= getText(getId,"getId");
		System.out.println(batchNo);
		this.expand=this.page.locator("//td[contains(text(),'"+batchNo+"')]");
		
		click(expand,"expand");
		if(loading.isVisible())
			page.waitForTimeout(5000);
		click(details,"details");
		if(loading.isVisible())
			page.waitForTimeout(5000);
		click(checkWrite,"checkWrite");
		if(loading.isVisible())
			page.waitForTimeout(5000);
		
	}
	

}
