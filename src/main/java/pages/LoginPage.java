package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	public WebDriver driver;
	
	public LoginPage(WebDriver driver)
	{
		this.driver= driver;
	}
	
	//locators
	private By UName = By.xpath("//input[@type='email']");
	private By Pwd = By.xpath("//input[@type='password']");
	private By SbtButton = By.xpath("//button[@type='submit']");
	
	//Action methods
	public Dashboard validLogin(String Username , String Password) {
		driver.findElement(UName).sendKeys(Username);
		driver.findElement(Pwd).sendKeys(Password);
		driver.findElement(SbtButton).click();
		
		Dashboard dashboard = new Dashboard(driver);
		
		return dashboard;
	}
	
	
}
