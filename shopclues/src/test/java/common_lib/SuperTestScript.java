package common_lib;

import java.util.*;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.io.Zip;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;

//import com.relevantcodes.extentreports.ExtentReports;
//import com.relevantcodes.extentreports.LogStatus;

import atu.testng.reports.ATUReports;

import java.io.*;
//import java.awt.AWTException;
//import java.io.IOException;
//import java.sql.SQLException;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.interactions.Actions;
// 
//import org.testng.Assert;
//import org.testng.annotations.AfterMethod;
//import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.Listeners;
//import org.testng.annotations.Test;
// 
//import atu.testng.reports.ATUReports;
import atu.testng.reports.listeners.ATUReportsListener;
import atu.testng.reports.listeners.ConfigurationListener;
import atu.testng.reports.listeners.MethodListener;
//import atu.testng.reports.logging.LogAs;
//import atu.testng.selenium.reports.CaptureScreen;
//import atu.testng.selenium.reports.CaptureScreen.ScreenshotOf;
 
@Listeners({CustomListener.class, ATUReportsListener.class, ConfigurationListener.class,
		MethodListener.class })


//@Listeners({ })//,ATUReportsListener.class, ConfigurationListener.class,MethodListener.class })
public class SuperTestScript 
{

	
	public static WebDriver driver;
	//public static ExtentReports extent;
	Date d1= new Date();
	String currentDateAndTime = d1.toString().replace(":", "_");
	
//	@BeforeSuite
//	public void extentReport()
//	{
//		
//		extent = ExtentReports.get(SuperTestScript.class);
//		extent.init("./reports/"+currentDateAndTime+".html", true);
//		//extent.startTest("Verify Page Title");
//	}
	
	
	@BeforeMethod
	public void preCond()
	{
//		String path = "./testdata/userdata.xls";
//		ExcelLibrary el = new ExcelLibrary(path, "Config", 1);
//		String browserType = el.readData(0);
//		String url = el.readData(1);
		System.setProperty("atu.reporter.config", "./atu.properties");
		String sFile ="./config.properties"; 
		PropertyClass pc = new PropertyClass();
		
		 ATUReports.setWebDriver(driver);
	     ATUReports.indexPageDescription = "Test Project";
	
		
		String browserType = pc.getConfigurationValue(sFile, "browser");
		String url = pc.getConfigurationValue(sFile, "url");
		
		if (browserType.equals("GC"))
		{
		
			System.setProperty("Webdriver.chrome.driver", "./exefiles/chrome.exe");
			driver = new ChromeDriver();
		}
		
		else if (browserType.equals("IE"))
		{
			System.setProperty("Webdriver.IE.driver", "./exefiles/IEdriver.exe");
			driver = new InternetExplorerDriver();
		}
		
		else
		{
		
			driver = new FirefoxDriver();
		}
		//extent.startTest("Verify Page Title");
		//ExtentReportsClass.logger.log(LogStatus.PASS, "Browser Launched Successfully");
		//extent.log(LogStatus.INFO, "Browser Launched Successfully");
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		//ExtentReportsClass.logger.log(LogStatus.PASS, "URL Launched Successfully");
		//extent.log(LogStatus.INFO, "URL Launched Successfully");
		//extent.startTest((this.getClass().getSimpleName()+"::"+method.getName()), method.getName());
	}
	
	
	
	
	@AfterMethod
	public void postCond()
	{
		
		driver.quit();
		//extent.endTest();
	}
	
	@AfterSuite
	public void backUp()
	{
		
		File src = new File("./test-output");
		File tar = new File("./reports/"+currentDateAndTime+".zip");
		Zip z1 = new Zip();
		
		try
		{
			z1.zip(src,tar);
		}
		catch (Exception e)
		{
			
		}
		
	}
}

//https://TYSS-4F-046/svn/viji
