package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FetchTextFieldValue {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		driver = new ChromeDriver();
//		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
//		
//		driver.findElement(By.id("input-email")).sendKeys("naveen12@gmail.com");
//		String text = driver.findElement(By.id("input-email")).getAttribute("value");
//		System.out.println(text);
		
		//sometimes value attribute is hidden in the web element
		driver.get("https://thinking-tester-contact-list.herokuapp.com/");
		
//		driver.findElement(By.id("email")).sendKeys("test@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("test@123");
//		
//		String emailValue = driver.findElement(By.id("email")).getAttribute("value");
//		String passwordValue = driver.findElement(By.id("password")).getAttribute("value");
//		
//		System.out.println("Email : " + emailValue + " and Password : " + passwordValue);
		
		//with wrapper/generic function:
		By email = By.id("email");
		By password = By.id("password");
		By hereLink = By.partialLinkText("here");
		
		doSendKeys(email, "naveen.auto@gmail.com");
		doSendKeys(password, "Naveen.auto@123");
		
		String emailEnteredValue = doElementGetAttribute(email, "value");
		String passwordEnteredValue = doElementGetAttribute(password, "value");
		
		System.out.println("Email : " + emailEnteredValue + " and Password : " + passwordEnteredValue);
		
		System.out.println("**********");
		String hrefValue = doElementGetAttribute(hereLink, "href");
		System.out.println("href of Here link is : " +hrefValue);

	}
	
	public static String doElementGetAttribute(By locator, String attributeValue) {
		return getElement(locator).getAttribute(attributeValue);
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static void doSendKeys(By locator, String value) {
		getElement(locator).sendKeys(value);
	}
	
	//WE: FE
	//WEs: FEs
	//text: getText
	//attribute: getAttribute
	//type: sendkeys
	//click: click
	//isDisplayed, isEnabled, isSelected

}
