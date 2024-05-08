package reports;

import java.util.Objects;

import com.aventstack.extentreports.ExtentTest;

public class ReportManager {

	private ReportManager() {}
		
		private static ThreadLocal<ExtentTest> extentTest = new ThreadLocal<>();
		
	public static ExtentTest getExtentTest() {
			return extentTest.get();
	}
	
	static void setExtentTest(ExtentTest test) {
		if(Objects.nonNull(test)) {
			extentTest.set(test);
		}
	}
	
	static void unload() {
		extentTest.remove();
	}
}
