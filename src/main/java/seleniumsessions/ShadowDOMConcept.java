package seleniumsessions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShadowDOMConcept {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://selectorshub.com/iframe-in-shadow-dom/");
		Thread.sleep(4000);
		
		//Browser --Page --> iframe --> Shadow DOM --> Shadow DOM --> input#pizza
		
		
		//JSPath
		String jsPath = "return document.querySelector(\"#userName\").shadowRoot.querySelector(\"#app2\").shadowRoot.querySelector(\"#pizza\")";
		
		JavascriptExecutor js = (JavascriptExecutor)driver;			
		WebElement pizza = (WebElement)js.executeScript(jsPath); //htmlelement -->convert--> WebElement
		pizza.sendKeys("Margarita");
		
		//shadow DOM:
		//xpath is not supported
		//only CSS with JSPath
	}

}
