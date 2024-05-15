package appfeaturesStef1;

import java.io.FileInputStream;
import org.testng.TestNG;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

import driverfactoryClass1.RemoteDriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import util1.ConfigReader;

public class AppHooks 
{
	WebDriver driver;
//	DriverFactory df;
	RemoteDriverFactory rdf;
	@Before
	public void initBrowser() throws IOException
	{
		ConfigReader cr=new ConfigReader();
		String browsername=cr.readConfig("browser");
		
		// nullPointer Exception avoid in future writing the below code
		
		String maven_browserName = System.getProperty("clibrowser");
		if(maven_browserName!=null)
		{
			browsername=maven_browserName;
		}
		
		rdf = new RemoteDriverFactory();
		driver = rdf.initBrowser(browsername);
		// maximize 
		driver.manage().window().maximize();
	}
	
	@After
	public void tearDown()
	{
		driver.quit();
	}

}
