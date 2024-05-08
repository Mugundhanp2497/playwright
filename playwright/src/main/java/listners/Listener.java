package listners;

import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.Status;

import browser.BrowserManager;
import exception.ReportFileException;
import reports.ReportLogger;
import reports.ReportManager;
import reports.Reports;

public class Listener implements ITestListener, ISuiteListener {
	
	@Override
	public void onStart(ISuite suite) {
		
		if(!Reports.initReport(suite.getName())){
			
			throw new ReportFileException("Report is be initialized "
					+ "before suite execution");
			
		}
		
	}
	
	
	@Override
	public void onFinish(ISuite suite) {
		
		if(!Reports.flushReports()) {
			
			throw new ReportFileException("Report Cannot be flushed after"
					+ "suite execution is completed");
			
		}
		
	}
	
	
	@Override
	public void onTestStart(ITestResult result) {
		
		Reports.createTest(result.getMethod().getMethodName());
		ReportLogger.log(BrowserManager.getBrowser(), Status.INFO, "Test : " + 
				result.getMethod().getMethodName() + " is satarted");
	
	}
	
	@Override
	public void onTestSuccess(ITestResult result) {
				
		ReportLogger.log(BrowserManager.getBrowser(), Status.PASS,"Test : "
				+ result.getMethod().getMethodName() +" is successfully passed");
		
		ReportManager.getExtentTest().assignCategory("Passed Tests");
		
	}
	
	@Override
	public void onTestFailure(ITestResult result) {
				
		ReportLogger.log(BrowserManager.getBrowser(), Status.FAIL, "Test : " + 
				result.getMethod().getMethodName()+" is failed");
		
		ReportManager.getExtentTest().assignCategory("Failed Tests");
		
	}
	
	@Override
	public void onTestSkipped(ITestResult result) {
				
		ReportLogger.log(BrowserManager.getBrowser(), Status.SKIP, "Test : " + 
				result.getMethod().getMethodName() + " is skipped");
		
		ReportManager.getExtentTest().assignCategory("Skipped Tests");
		
	}
	
	@Override
	public void onStart(ITestContext context) {
		
	}
	
	@Override
	public void onFinish(ITestContext context) {
		
	}
	
}
