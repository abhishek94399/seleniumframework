package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {

	public WebDriver driver ;
	
	CartPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
// locators
	
By Cart_Price =	By.xpath("//h3[text()=\"Total Price:\"]");





	
}


