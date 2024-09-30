package seleniumAssignmentPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import seleniumsessions.BrowserUtil;
import seleniumsessions.ElementUtil;

public class RegistrationPageTest {

	public static void main(String[] args) throws InterruptedException {
		
		BrowserUtil brUtil = new BrowserUtil();
		WebDriver driver = brUtil.initDriver("firefox");
		
		brUtil.launchURL("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		System.out.println(brUtil.getPageTitle());
		
		ElementUtil elUtil = new ElementUtil(driver);
		
		By firstname = By.id("input-firstname");
		By lastname = By.id("input-lastname");
		By email = By.id("input-email");
		By telephone = By.id("input-telephone");
		By password = By.id("input-password");
		By confirmPassword = By.id("input-confirm");
		
		elUtil.doSendKeys(firstname, "Mahendra");
		elUtil.doSendKeys(lastname, "Dhoni");
		elUtil.doSendKeys(email, "msdhoni@gmail.com");
		elUtil.doSendKeys(telephone, "+919040362787");
		elUtil.doSendKeys(password, "msd@123");
		elUtil.doSendKeys(confirmPassword, "msd@123");
		
		Thread.sleep(3000);
		
		brUtil.quitBrowser();

	}

}
