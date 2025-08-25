package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Dashboard {

	public WebDriver driver;
	
	public Dashboard(WebDriver driver)
	{
		this.driver= driver;
	}
	
	//Locator
	
	By PgeTitle = 	By.xpath("//title[text()='Learn Automation Courses']");
	By WlcMsg = 	By.xpath("//h4[contains(text(),\"Welcome \")]");
	By CartBtn =	By.xpath("//button[text()='Cart']");
	
	
	//Action Methods
	public boolean ValidateWlcMsg() 
	{
		boolean status = driver.findElement(WlcMsg).isDisplayed();
		
		return status;
	}
	
	public CartPage clickOnCartBtn()
	{
		driver.findElement(CartBtn).click();
		
		CartPage cartPage = new CartPage(driver);
		
		return cartPage;
	}
	
	
	
	
	
	
}
