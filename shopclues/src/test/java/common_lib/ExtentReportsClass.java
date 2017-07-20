package common_lib;

//import java.util.concurrent.TimeUnit;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.ie.InternetExplorerDriver;
//import org.testng.annotations.Test;
//
//import com.relevantcodes.extentreports.ExtentReports;
//import com.relevantcodes.extentreports.LogStatus;

public class ExtentReportsClass {}
//{
//	//private static final Class<?> ExtentReportsClass.class = null;
//	public static ExtentReports extent;
//	//public static ExtentTest logger;
//	public static WebDriver driver;
//	
////	@BeforeSuite
////	public void startReport()
////	{
////		extent = ExtentReports.get(ExtentReportsClass.class);
////		extent.init("D:\\viji-maven\\shopclues\\reports\\myreport.html", true);
////		extent.startTest("Verify Page Title");
////		//extent = new ExtentReports("D://MyExtentReport.html",false);
////		//extent.loadConfig(new File("./reports/extent.xml"));
////	}
////	
////	@BeforeMethod
////	public void beforeMethod(Method method)
////	{
//////		logger = extent.startTest(this.getClass());
//////		logger.assignAuthor("viji");
//////		logger.assignCategory("Maven");
////		
////	}
////	
//	@Test
//	public void preCond()
//	{
//	 extent = ExtentReports.get(ExtentReportsClass.class);
//		extent.init("D:\\viji-maven\\shopclues\\reports\\myreport.html", true);
//		extent.startTest("Verify Page Title");
//		String path = "./testdata/userdata.xls";
//		ExcelLibrary el = new ExcelLibrary(path, "Config", 1);
//		String browserType = el.readData(0);
//		String url = el.readData(1);
//		if (browserType.equals("GC"))
//		{
//		
//			System.setProperty("Webdriver.chrome.driver", "./exefiles/chrome.exe");
//			driver = new ChromeDriver();
//		}
//		
//		else if (browserType.equals("IE"))
//		{
//			System.setProperty("Webdriver.IE.driver", "./exefiles/IEdriver.exe");
//			driver = new InternetExplorerDriver();
//		}
//		
//		else
//		{
//		
//			driver = new FirefoxDriver();
//		}
//		extent.log(LogStatus.PASS, "Browser Launched Successfully");
//		//ExtentReportsClass.logger.log(LogStatus.PASS, "Browser Launched Successfully");
// 		
//		driver.get(url);
//		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//		driver.manage().window().maximize();
//		extent.log(LogStatus.PASS, "URL Launched Successfully");
//		//ExtentReportsClass.logger.log(LogStatus.PASS, "URL Launched Successfully");
//	}
//	
//}
