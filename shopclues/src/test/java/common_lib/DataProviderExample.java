package common_lib;

import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderExample 
{

	@DataProvider
	public Object[][] fetchData()
	{
		Object[][] o = new Object[1][2];
		o[0][0] = "admin1";
		o[0][1] = "password1";
		o[1][0] = "admin2";
		o[1][1] = "password2";
		return o;
	}
	
	@Test(dataProvider = "fetchData")
	public void login(String userName, String password)
	{
		Reporter.log("User name is "+userName, true);
		Reporter.log("Password is "+password, true);
		
	}
}
