package UITests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;

public class NaveenautomationlabsLoginTest extends BaseTest{
	
	@Test(priority = 1)
	public void pageTitleTest() {
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		String actualTitle = driver.getTitle();
		System.out.println(actualTitle);
		Assert.assertEquals(actualTitle, "Account Login");
	}
	
	@Test(priority = 2)
	public void pageURLTest() {
		String actualURL = driver.getCurrentUrl();
		System.out.println(actualURL);
		Assert.assertTrue(actualURL.contains("route=account/login"));
	}

}
