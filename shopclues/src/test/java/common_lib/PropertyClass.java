package common_lib;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertyClass 
{

	public String getConfigurationValue(String sFile, String sKey)
	{
		Properties prop = new Properties();
		String sValue = "";
		try
		{
			FileInputStream fis = new FileInputStream(sFile);
			prop.load(fis);
			sValue = prop.getProperty(sKey);
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		return sValue;
	}
}
