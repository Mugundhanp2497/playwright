package utilities;

import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.Base64;
import java.util.Date;

import com.aventstack.extentreports.Status;
import com.microsoft.playwright.Page;

import constants.Constants;

public class Screenshots {

	
	private Screenshots(){}
	
	public static String getBase64Image(Page page, Status status) {
		
		String path =null;
		switch(status) {
		case PASS:
			path = Constants.passedScreenshotsFolderPath;
			break;
		case FAIL:
			path = Constants.failedScreenshotsFolderPath;
			break;
			default:
				throw new IllegalArgumentException("Invalid  status for screenshot.");
		}
		SimpleDateFormat date = new SimpleDateFormat("dd MM YYYY hh mm ss");
		String currentTime = date.format(new Date());
		byte[] buffer = page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get(path + 
				"Screenshot "+currentTime+".png")).setFullPage(true));
		return Base64.getEncoder().encodeToString(buffer);	
	}
}
