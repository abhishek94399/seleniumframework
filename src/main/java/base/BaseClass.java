package base;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import dataProvider.ConfigReader;
import factory.BrowserFactory;

public class BaseClass {
	
	public WebDriver driver;
	@BeforeMethod()
	public void setup() throws IOException {
	
		ConfigReader reader = new ConfigReader();
		
	driver = BrowserFactory.getDriver(reader.getvalue("browser"), reader.getvalue("qaURL"));
	
	}
	
	@AfterMethod()
	public void tearDown() {
	driver.quit();
	}

}
