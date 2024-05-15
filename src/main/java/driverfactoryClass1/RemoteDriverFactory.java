package driverfactoryClass1;

import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class RemoteDriverFactory
{
	static WebDriver driver;
	Capabilities capabilities;
	String host="localhost";
	public WebDriver initBrowser(String browserName) throws MalformedURLException
	{
		if(browserName.equals("Chrome"))
		{
			capabilities=new ChromeOptions();
		}
		else if(browserName.equals("Firefox"))
		{
			capabilities=new FirefoxOptions();
		}
		
		if(System.getProperty("HUB_HOST")!=null)
		{
			host=System.getProperty("HUB_HOST");
		}
		
		driver=new RemoteWebDriver(new URL("http://"+host+"/wd/hub"),capabilities);
		
		return driver;
	}
	
	public static WebDriver getDriver()
	{
		return driver;
	}
	
	// ENTRYPOINT java -cp "libs/*" org.testng.TestNG testng1.xml
}
