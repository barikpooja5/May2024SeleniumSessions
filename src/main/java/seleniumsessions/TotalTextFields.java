package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TotalTextFields {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		List<WebElement> textFieldList = driver.findElements(By.className("form-control"));
		int textFieldCount = textFieldList.size();
		System.out.println("Total text fields count = " +textFieldCount);
		
		for(WebElement e : textFieldList) {
			String fieldName = e.getAttribute("name");
			String placeholderValue = e.getAttribute("placeholder");
			System.out.println("Placeholder for " + fieldName + " field " + " is: " + placeholderValue);
		}

	}

}
