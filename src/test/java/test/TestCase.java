package test;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.Dashboard;
import pages.LoginPage;




public class TestCase extends BaseClass {
	
	
	
	@Test()
	public void wlcMsgValidation() {
	LoginPage login = new LoginPage(driver);
	Dashboard dashboard =login.validLogin("abhishek94399@gmail.com", "abhi@123");
	Assert.assertTrue(dashboard.ValidateWlcMsg());	
	}
		
}