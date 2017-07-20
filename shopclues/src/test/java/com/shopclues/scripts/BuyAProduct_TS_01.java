package com.shopclues.scripts;

import org.testng.annotations.Test;

//import com.relevantcodes.extentreports.LogStatus;
import com.shopclues.pages.CheckoutPage;
import com.shopclues.pages.LoginRegisterPage;
import com.shopclues.pages.ProductDisplayPage;
import com.shopclues.pages.ProductSelectionPage;
import com.shopclues.pages.ReviewPage;

import common_lib.ExcelLibrary;
import common_lib.SuperTestScript;

public class BuyAProduct_TS_01 extends SuperTestScript
{

//	@DataProvider
//	public Object[][] fetchData()
//	{
//		Object[][] o = new Object[1][2];
//		o[0][0] = "nanthu31@gmail.com";
//		o[0][1] = "123456";
//		o[1][0] = "admin2";
//		o[1][1] = "password2";
//		return o;
//	}
	@Test
	public void testBuyAProduct_TS_01() throws Exception 
	{
		String path = "./testdata/userdata.xls";
		ExcelLibrary el = new ExcelLibrary(path, "BuyAProduct_TS_01", 1);
		String userName = el.readData(0);
		String password = el.readData(1);
		
		
		LoginRegisterPage lp = new LoginRegisterPage();
		
		ProductSelectionPage psp = new ProductSelectionPage();
		
		ProductDisplayPage pdp = new ProductDisplayPage();
		
		ReviewPage rp = new ReviewPage();
		
		CheckoutPage cp = new CheckoutPage();
		
		lp.login(userName, password);
		lp.mouseHoverRenewGadgetsDropdowm();
		String pAdd = SuperTestScript.driver.getWindowHandle();
		
		psp.clickOnAllRenewGadgets();
		//SuperTestScript.extent.log(LogStatus.INFO, "All Renew Gadgets window is opened");
		
		String cAdd = psp.moveToWindow();
		SuperTestScript.driver.switchTo().window(cAdd);
		psp.clickOnLenovoukZ1();
		
		
		String cAdd1 = psp.moveToWindow();
		SuperTestScript.driver.switchTo().window(cAdd1);
		pdp.selectColorOfMobile();
		pdp.clickOnBuyNowButton();
		
		rp.clickOnProceedToPayments();
		
		cp.clickOnCashOnDelivery();
		Thread.sleep(10000);
		
		SuperTestScript.driver.switchTo().window(pAdd);
		Thread.sleep(10000);
		lp.mouseHoverUserModuleDropDownMenu();
		lp.clickOnSignOutDropDownLink();
		
		
	}
}
