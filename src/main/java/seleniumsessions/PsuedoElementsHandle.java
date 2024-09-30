package seleniumsessions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PsuedoElementsHandle {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		//JSPath
		String contentJsPath = "return window.getComputedStyle(document.querySelector('label[for=\"input-firstname\"]'), '::before').getPropertyValue('content')";
		String colourJsPath = "return window.getComputedStyle(document.querySelector('label[for=\"input-firstname\"]'), '::before').getPropertyValue('color')";
		
		//JSexecutor
		JavascriptExecutor js = (JavascriptExecutor)driver;
		 String contetnt = js.executeScript(contentJsPath).toString();	//JS text--> String
		 String colour = js.executeScript(colourJsPath).toString();
		 System.out.println("Content is: " +contetnt + ", " + "Colour is: " +colour);
		 if(contetnt.contains("*") && colour.equals("rgb(255, 0, 0)")) {
			 System.out.println("FN is mandatory");
		 }
		
		

	}

}
