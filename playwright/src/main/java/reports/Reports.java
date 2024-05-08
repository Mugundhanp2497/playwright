package reports;

import java.util.Objects;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import constants.Constants;

public final class Reports {
	
	private Reports() {}
	
	private static ExtentReports extent;
	private static ExtentSparkReporter spark;
	public static ExtentTest test;

	public static boolean initReport(String name) {

		String reportPath = Constants.reportsFolderPath ;
		if (extent == null) {
			extent = new ExtentReports();
			spark = new ExtentSparkReporter(reportPath+"report.html");
			extent.attachReporter(spark);
			spark.config().setReportName("Automation Testing");
			spark.config().setDocumentTitle("Partners");
			spark.config().setCss(reportPath);
		}
		return Objects.nonNull(extent);
	}


	public static boolean flushReports() {
		extent.flush();
		ReportManager.unload();
		return Objects.isNull(ReportManager.getExtentTest());
	}
	
	public static void createTest(String testcaseName) {
		ReportManager.setExtentTest(extent.createTest(testcaseName));
	}

}
