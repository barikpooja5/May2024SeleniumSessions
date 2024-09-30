package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPageTest {

	public static void main(String[] args) throws InterruptedException {
		
		BrowserUtil BrUtil = new BrowserUtil();
		
		WebDriver driver = BrUtil.initDriver("chrome");
		BrUtil.launchURL("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		System.out.println(BrUtil.getPageTitle());
		
		By email = By.id("input-email");
		By password = By.id("input-password");
		
		ElementUtil elUtil = new ElementUtil(driver);
		elUtil.doSendKeys(email, "test123@gmail.com");
		elUtil.doSendKeys(password, "test@123");
		
		Thread.sleep(1000);
		
		BrUtil.quitBrowser();

	}

}
