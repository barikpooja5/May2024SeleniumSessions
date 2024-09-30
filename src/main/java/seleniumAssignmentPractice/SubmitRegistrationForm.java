package seleniumAssignmentPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import seleniumsessions.BrowserUtil;
import seleniumsessions.ElementUtil;

public class SubmitRegistrationForm {

	public static void main(String[] args) throws InterruptedException {
		
		BrowserUtil brUtil = new BrowserUtil();
		WebDriver driver = brUtil.initDriver("chrome");
		
		brUtil.launchURL("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		ElementUtil elUtil = new ElementUtil(driver);
		
		By header = By.tagName("h1");
		By successPageHeader = By.tagName("h1");
		By firstname = By.id("input-firstname");
		By lastname = By.id("input-lastname");
		By email = By.id("input-email");
		By telephone = By.id("input-telephone");
		By password = By.id("input-password");
		By confirmPassword = By.id("input-confirm");
		By subscribeButton = By.xpath("//*[@id=\"content\"]/form/fieldset[3]/div/div/label[2]/input");
		By agreeCheckbox = By.name("agree");
		By continueButton = By.cssSelector("#content > form > div > div > input.btn.btn-primary");
		
		String registerPage = elUtil.getElementText(header);
		if(registerPage.equals("Register Account")) {
			System.out.println("Page header is: " +registerPage);
		}
		else
			System.out.println("Incorrect Page");
		
		elUtil.doSendKeys(firstname, "John");
		elUtil.doSendKeys(lastname, "Cena");
		elUtil.doSendKeys(email, "john.c1@gmail.com");
		elUtil.doSendKeys(telephone, "9040567823");
		elUtil.doSendKeys(password, "johnC@123");
		elUtil.doSendKeys(confirmPassword, "johnC@123");
		elUtil.doClick(subscribeButton);
		elUtil.doClick(agreeCheckbox);
		elUtil.doClick(continueButton);
		
		String successPage = elUtil.getElementText(successPageHeader);
		if(successPage.equals("Your Account Has Been Created!")) {
			System.out.println("Account is created successfully");
		}
		else
			System.out.println("Please try again with correct details");
		
		Thread.sleep(4000);
		
		brUtil.quitBrowser();

	}
	
	

}
