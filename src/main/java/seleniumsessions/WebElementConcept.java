package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementConcept {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		//1st approach:
//		driver.findElement(By.id("input-email")).sendKeys("test@gmail.com");
//		driver.findElement(By.id("input-password")).sendKeys("test@123");
//		
//		//driver.findElement(By.id("input-email")).sendKeys("Pooja@gmail.com");
//		
//		//2nd approach:	create webelement once and store is in a variable, use it whenever required	
//		WebElement email = driver.findElement(By.id("input-email"));
//		WebElement password = driver.findElement(By.id("input-password"));
//		
//		email.sendKeys("test@gmail.com");
//		password.sendKeys("test@123");
//		
//		//reusable-
//		email.sendKeys("john@gmail.com");
		
		//3rd approach: create By locator and store in a variable, use it as required; no need to create WE unless required
//		By email = By.id("input-email");		//created By locator
//		By password = By.id("input-password");
//		
//		WebElement email_element = driver.findElement(email);		//Created WebElement
//		WebElement pwd_element = driver.findElement(password);
//		
//		email_element.sendKeys("test@gmail.com");
//		pwd_element.sendKeys("test@123");
		
		//4th approach: By locator + generic method for WebElement (generic wrapper function)
//		By email = By.id("input-email");		//created By locator
//		By password = By.id("input-password");
//		
//		getElement(email).sendKeys("veera@gmail.com");	//called generic wrapper function
//		getElement(password).sendKeys("veera@987");		////called generic wrapper function- reusable
		
		//5th approach: By locator + generic method for WebElement and action
//		By email = By.id("input-email");		//created By locator
//		By password = By.id("input-password");
//		By search = By.className("form-control");
//		
//		doSendKeys(email, "anjana@gmail.com");
//		doSendKeys(password, "anjana@123");
//		doSendKeys(search, "Automation");
		
		//6th approach: By locator + generic method for WebElement and action in ElementUtil class (utility)
		By email = By.id("input-email");		
		By password = By.id("input-password");
		By search = By.className("form-control");
		
		ElementUtil elUtil = new ElementUtil(driver);
		elUtil.doSendKeys(email, "test05@gmail.com");
		elUtil.doSendKeys(password, "test@123");
		elUtil.doSendKeys(search, "Automation");		
		
	}
	
	public static void doSendKeys(By locator, String value) {
		getElement(locator).sendKeys(value);
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	

}
