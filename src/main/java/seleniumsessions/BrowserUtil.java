package seleniumsessions;

import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class BrowserUtil {
	
	WebDriver driver;
	
	/**
	 * This method is used to initialize the driver on the basis of given browser name
	 * @param browserName
	 * @return this returns driver
	 */
	public WebDriver initDriver(String browserName) {
		
		System.out.println("Brwoser name: " +browserName);
		
		switch (browserName.toLowerCase().trim()) {
		case "chrome":
			driver = new ChromeDriver();
			break;
			
		case "edge":
			driver = new EdgeDriver();
			break;
			
		case "firefox":
			driver = new FirefoxDriver();
			break;
			
		case "safari":
			driver = new SafariDriver();
			break;

		default:
			System.out.println("Please pass correct browser...");
			throw new BrowserException("===INVALID BROWSER===");
		}
		
		return driver;		
	}
	
	/**
	 * This method is used to launch the url when String type url is passed by calling class
	 * @param url
	 */
	public void launchURL(String url) {
		if(url.indexOf("http") != 0 || url.length() == 0) {
			throw new BrowserException("http(s) is missing or incorrect URL");
		}		
		driver.get(url);
	}
	
	/*
	 *This method is used to launch the url when URL type url is passed by calling class
	 * @param url 
	 */
	public void launchURL(URL url) {
		driver.navigate().to(url);
	}
	
	/**
	 * This method is used to get the Title of the page
	 * @return this returns the title
	 */
	public String getPageTitle() {
		return driver.getTitle();
	}
	
	/**
	 * This method is used to get the URL of the page
	 * @return this returns URL
	 */
	public String getPageURL() {
		return driver.getCurrentUrl();
	}
	
	/**
	 * This method is used to quit the browser
	 */
	public void quitBrowser() {
		driver.quit();;
	}

}
