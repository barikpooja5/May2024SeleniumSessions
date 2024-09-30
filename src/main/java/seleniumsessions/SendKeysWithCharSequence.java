package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeysWithCharSequence {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		//CharSequence -- Interface
		//ChildClass-
			//String
			//StringBuffer
			//StringBuilder
		
		String name = "Naveen";
		StringBuilder sb = new StringBuilder("Automation");
		StringBuffer sf = new StringBuffer("Lab");
		
		driver.findElement(By.id("input-email")).sendKeys(name," ", sb, " ", sf + "Selenium");
		
//		String lastName = null;
//		driver.findElement(By.id("input-email")).sendKeys(name,lastName);	//any of the char sequence should not be null, else it will give exception
		
		String hostname = "http://www.naveen.com";
		String port = "8080";
		String param = "/index.html";
		
		driver.findElement(By.id("input-email")).sendKeys(hostname,port,param);

	}

}
