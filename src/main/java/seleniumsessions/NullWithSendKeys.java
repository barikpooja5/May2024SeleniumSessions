package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NullWithSendKeys {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		//IllegalArgumentException: Keys to send should be a not null CharSequence
		driver.findElement(By.id("input-email")).sendKeys(null);
		
		//This is not throwing any exception
		String email = "";
		System.out.println(email.length());
		driver.findElement(By.id("input-email")).sendKeys(email);
		

	}

}
