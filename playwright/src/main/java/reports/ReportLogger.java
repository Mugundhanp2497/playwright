package reports;

import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.microsoft.playwright.Page;

import constants.ConfigurationProperties;
import filereader.ConfigurationPropertyReader;
import utilities.Screenshots;

public final class ReportLogger {

	private ReportLogger () {}
	
	public static void log(Page page, Status status, String logmessage) {
		
		String passedstepsscreenshots = ConfigurationPropertyReader.get(ConfigurationProperties.passedstepsscreenshots);
		String failedstepsscreenshots = ConfigurationPropertyReader.get(ConfigurationProperties.failedstepsscreenshots);

		ReportManager.getExtentTest().log(status, logmessage);
		if(status.toString().equals("PASS") && (passedstepsscreenshots.equalsIgnoreCase("YES") || passedstepsscreenshots.equals("Y"))) {
			ReportManager.getExtentTest().log(status, MediaEntityBuilder.createScreenCaptureFromBase64String(Screenshots.getBase64Image(page, status)).build());
		}
		if(status.toString().equals("FAIL") && (failedstepsscreenshots.equalsIgnoreCase("YES") || failedstepsscreenshots.equals("Y"))) {
			ReportManager.getExtentTest().log(status, MediaEntityBuilder.createScreenCaptureFromBase64String(Screenshots.getBase64Image(page, status)).build());
		}
	}
}
