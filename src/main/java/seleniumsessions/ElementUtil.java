package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ElementUtil {
	
	private WebDriver driver;
	
	public ElementUtil(WebDriver driver) {
		this.driver = driver;
	}

	public void doSendKeys(By locator, String value) {
		getElement(locator).sendKeys(value);
	}
	
	public void doSendKeys(By locator, CharSequence... value) {
		getElement(locator).sendKeys(value);
	}
	
	public WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public void doClick(By locator) {
		getElement(locator).click();;
	}
	
	public boolean isElementDisplayed(By locator) {
		try {
			return getElement(locator).isDisplayed();
		} catch (NoSuchElementException e) {
			System.out.println(locator + " element is not displayed");
			return false;
		}
	}	
	
	public boolean isElementSelected(By locator) {
		try {
			return getElement(locator).isSelected();
		} catch (NoSuchElementException e) {
			System.out.println(locator + " element is not present");
			return false;
		}		
	}
	
	public boolean isElementEnabled(By locator) {
		try {
			return getElement(locator).isEnabled();
		} catch (NoSuchElementException e) {
			System.out.println(locator + " element is not present");
			return false;
		}		
	}
	
	public String getElementText(By locator) {
		String elementText = getElement(locator).getText();
		if(elementText != null) {
			return elementText;
		}
		else {
			System.out.println("Element text is null");
			return null;
		}
	}
	
	public String doElementGetAttribute(By locator, String attributeValue) {
		return getElement(locator).getAttribute(attributeValue);
	}

}
