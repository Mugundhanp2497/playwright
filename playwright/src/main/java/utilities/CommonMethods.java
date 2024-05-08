package utilities;

import java.nio.file.Path;
import java.util.List;

import com.aventstack.extentreports.Status;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

import browser.BrowserManager;
import exception.LocatorsException;
import reports.ReportLogger;

public class CommonMethods {

	public static Page page = BrowserManager.getBrowser();
	
/**
 * 
 * @param locator
 * @return
 */
	private static boolean isEditable(Locator locator) {
		if(locator.isEditable()) {
			return true;
		} else {
		throw new LocatorsException("Field is not editable");
	}	
	}
	
	
	/**
	 * 
	 * @param locator
	 * @return
	 */
	private static boolean isDisplayed(Locator locator) {
		
		if(locator.isVisible()) {
			return true;
		} else {
			throw new LocatorsException("Locator is not visible/Displayed");
		}
	}
		
	/**
	 * 
	 * @param locator
	 * @param dataToSend
	 */
	public static void enterData(Locator locator, String dataToSend, String fieldName) {
		if(isEditable(locator)) {
			locator.fill(dataToSend);
			ReportLogger.log(page, Status.INFO, "Data entered in the "+fieldName+" field "
					+ "is : "+dataToSend);
		}
	}
	
	/**
	 * 
	 * @param element
	 */
	public static void click(Locator locator, String fieldName) {
		if(isDisplayed(locator)) {
		locator.click();
		ReportLogger.log(page, Status.INFO, "Clicked on "+fieldName+" field.");
	}
	}
	
	/**
	 * 
	 * @param element
	 * @return
	 */
	public static String getText(Locator locator, String fieldName) {
		if(isDisplayed(locator)) {
			String text =  locator.textContent();
			System.out.println(text);
			ReportLogger.log(page, Status.INFO, "Text obtained from "+fieldName+" field is :" +text+".");
			return text;
		}
		return null;
	}
	
	/**
	 * 
	 * @param element
	 * @return
	 */
	public static String getAttributeByValue(Locator locator, String attributevalue, String fieldName) {
		if(isDisplayed(locator)) {
		 String value = locator.getAttribute(attributevalue);
	     ReportLogger.log(page, Status.INFO, "Attribute value obtained from "+fieldName+" field is :" +value+".");
         return value;
	}
        return null;
	}
	
/**
 * 
 * @param locator
 */
	public static void check(Locator locator, String fieldName) {
		if(isDisplayed(locator)) {
			locator.check();
		     ReportLogger.log(page, Status.INFO, "Check the "+fieldName+" checkbox.");
		}

	}
	
	/**
	 * 
	 * @param locator
	 */
	public static void uncheck(Locator locator, String fieldName) {
		if(isDisplayed(locator)) {
			locator.uncheck();
		     ReportLogger.log(page, Status.INFO, "Uncheck the "+fieldName+" checkbox.");
		}
	}
	
	/**
	 * 
	 * @param locator
	 */
	public void doubleClick(Locator locator, String fieldName) {
		if(isDisplayed(locator)) {
		locator.dblclick();
	     ReportLogger.log(page, Status.INFO, "Double click the "+fieldName+" field.");
	}
	}

	/**
	 * 
	 * @param locator
	 * @param filepath
	 */
	public void fileUpload(Locator locator, List<Path> filepath, String fieldName) {
		Path[] path = (Path[])filepath.toArray();
		if(isDisplayed(locator)) {
		 locator.setInputFiles(path);
		 ReportLogger.log(page, Status.INFO, "Upload a file in "+fieldName+" field.");
		}
	}
	
	/**
	 * 
	 * @param locator
	 */
	public void dragAndDrop(Locator locator, String fieldName) {
		
		if(isDisplayed(locator)) {
        locator.dragTo(locator);	
		 ReportLogger.log(page, Status.INFO, "Drag and drop a file from "+fieldName+" field.");
		}
	}
	

}
