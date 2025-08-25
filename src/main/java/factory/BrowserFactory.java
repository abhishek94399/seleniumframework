package factory;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class BrowserFactory {
	
	public static WebDriver getDriver(String browser, String url)
	{
		WebDriver driver = null;
		
		if(browser.equalsIgnoreCase("chrome"))
		{
			driver = new ChromeDriver();
		}		
		else if(browser.equalsIgnoreCase("firefox"))
		{
			driver = new FirefoxDriver();
		}
		else if(browser.equalsIgnoreCase("Edge"))
		{
			driver = new EdgeDriver();
		}
		else if(browser.equalsIgnoreCase("safari"))
		{
			driver = new SafariDriver();
		}
		else 
		{
		System.out.println("Sorry!! Currently we are not supporting this browser");	
		}
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));

		driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(10));
		
		driver.manage().window().maximize();
		driver.get(url);
		
		return driver;
		
	}

}
