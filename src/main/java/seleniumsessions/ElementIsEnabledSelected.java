package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementIsEnabledSelected {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		driver = new ChromeDriver();
//		driver.get("https://seleniumpractise.blogspot.com/2016/09/how-to-work-with-disable-textbox-or.html");
//		
//		//isEnabled():
//		boolean f1 = driver.findElement(By.id("fname")).isDisplayed();
//		System.out.println(f1);
//		
//		boolean f2 = driver.findElement(By.id("fname")).isEnabled();
//		System.out.println(f2);
//		
//		boolean f3 = driver.findElement(By.id("pass")).isDisplayed();
//		System.out.println(f3);
//		
//		boolean f4 = driver.findElement(By.id("pass")).isEnabled();
//		System.out.println(f4);
//		
//		//"Show me" button is working fine
//		boolean f5 = driver.findElement(By.xpath("//*[@id=\"post-body-1040668042848852462\"]/div[1]/form/input[4]")).isEnabled();
//		System.out.println(f5);
		

		//getting NoSuchElementException; need to check with Naveen ??--> it is not working because of iframe
//		boolean f6 = driver.findElement(By.xpath("//span[@class='RveJvd snByac' and text()='Sign in with Google']")).isEnabled();
//		System.out.println(f6);
		
		//isSelected():
//		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
//		boolean t1 = driver.findElement(By.name("agree")).isSelected();
//		System.out.println("Is Privacy Policy button selected: " +t1);
//		
//		driver.findElement(By.name("agree")).click();
//		boolean t2 = driver.findElement(By.name("agree")).isSelected();
//		System.out.println("Is Privacy Policy button selected: " +t2);
//		
//		boolean t3 = driver.findElement(By.xpath("//*[@id=\"content\"]/form/fieldset[3]/div/div/label[2]/input")).isSelected();
//		System.out.println("Is Subcribe = No selected: " +t3);
//		
//		boolean t4 = driver.findElement(By.id("input-firstname")).isSelected();
//		System.out.println("Is firstName textbox selected: " +t4);
//		
//		//Why is it returning false even after selection ??
//		driver.findElement(By.id("input-firstname")).click();
//		boolean t5 = driver.findElement(By.id("input-firstname")).isSelected();
//		System.out.println("Is firstName textbox selected: " +t5);		
//		
//		//Why is isSelected() method not throwing exception for links ??
//		boolean t6 = driver.findElement(By.linkText("Login")).isSelected();
//		System.out.println(t6);
		
		//IsSelected with wrapper/generic method:
//		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
//		By agreeButton = By.name("agree");
//		if(isElementSelected(agreeButton)) {
//			System.out.println(agreeButton + " is selected");
//		}
//		else 
//			System.out.println(agreeButton + " is not selected");
		
		//IsEnabled with wrapper/generic method:
		driver.get("https://seleniumpractise.blogspot.com/2016/09/how-to-work-with-disable-textbox-or.html");
		By password = By.id("pass11");
		if(isElementEnabled(password)) {
			System.out.println(password + " field is enabled");
		}
		else
			System.out.println(password + " field is disabled");
		
	}
	
	public static boolean isElementSelected(By locator) {
		try {
			return getElement(locator).isSelected();
		} catch (NoSuchElementException e) {
			System.out.println(locator + " element is not present");
			return false;
		}		
	}
	
	public static boolean isElementEnabled(By locator) {
		try {
			return getElement(locator).isEnabled();
		} catch (NoSuchElementException e) {
			System.out.println(locator + " element is not present");
			return false;
		}		
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

}
