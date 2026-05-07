package Utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadData 
{
	public static String ReadPropertyFile(String value) throws IOException
	{
		
		Properties prop=new Properties();
		FileInputStream file=new FileInputStream("C:\\Users\\Dhanaji Jagtap\\eclipse-workspace\\Selenium_Framework\\src\\main\\java\\config\\config.properties");
		prop.load(file);
		return prop.getProperty(value);
	}
	
	


}
