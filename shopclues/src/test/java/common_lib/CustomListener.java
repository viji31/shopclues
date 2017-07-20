package common_lib;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import atu.testng.reports.ATUReports;
import atu.testng.reports.logging.LogAs;
import atu.testng.selenium.reports.CaptureScreen;
import atu.testng.selenium.reports.CaptureScreen.ScreenshotOf;

public class CustomListener implements ITestListener
{

	public void onTestSuccess(ITestResult res)
	{
		String mn = res.getName();
		Utility u1 = new Utility();		
		u1.takeScreenshot(mn);
		ATUReports.add("INfo Step", LogAs.INFO, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
		ATUReports.add("Pass Step", LogAs.PASSED, new CaptureScreen(ScreenshotOf.DESKTOP));	
		
	}

	public void onTestFailure(ITestResult res)
	{
		String mn = res.getName();
		Utility u1 = new Utility();		
		u1.takeScreenshot(mn);
		ATUReports.add("Fail Step", LogAs.FAILED, new CaptureScreen(ScreenshotOf.DESKTOP));
	}

	
	public void onFinish(ITestContext arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext arg0) {
		
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	
	public void onTestSkipped(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onTestStart(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	

	
}
