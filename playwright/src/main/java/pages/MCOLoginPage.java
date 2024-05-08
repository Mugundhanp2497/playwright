package pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;

import utilities.CommonMethods;

public class MCOLoginPage extends CommonMethods {

	private Page page;
	private Locator userName;
	private Locator password;
	private  Locator loginButton;
	
	
	 MCOLoginPage(Page page) {
		this.page = page;
		this.userName = this.page.getByLabel("User Name");
		this.password = this.page.getByLabel("Password");
		this.loginButton = this.page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Login"));
	}
	

	public void login() {
		
		enterData(userName, "pbhm/AutomationTest", "User Name");
		enterData(password, "Letmein@2", "Password");
		click(loginButton, "Login Button");	
	}
	
}


