package util1;

import java.io.IOException;
import org.testng.TestNG;
import java.io.InputStream;
import java.util.Properties;

public class ConfigReader 
{
	// below is code to convert the config.properties file as part of .classPath so ther conversion into jar files will be easy
	
	public String readConfig(String valueToBeRead) throws IOException
	{
		Properties prop=new Properties();
		String file="Config/config.properties";
		InputStream inputStream = getClass().getClassLoader().getSystemResourceAsStream(file); // This line of code is used to convert the file content into the .classPath
		prop.load(inputStream);
		String value = prop.getProperty(valueToBeRead);
		return value;
	}
	
	

}
