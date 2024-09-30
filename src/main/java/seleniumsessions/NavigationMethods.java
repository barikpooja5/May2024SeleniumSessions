package seleniumsessions;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationMethods {

	public static void main(String[] args) throws InterruptedException, MalformedURLException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
		
		/*
		 * difference betwn get() & to()- both perform same action; only difference is to() is a overloaded method to(Strin url), to(URL url)
		 */
		Thread.sleep(1000);
		driver.navigate().to("https://www.amazon.com");	//to() method calls get() internally
		//driver.get("https://www.amazon.com");	//both navigate.to() and get() are used to launch url & can be used to perform back and forward
		System.out.println(driver.getTitle());
		
		Thread.sleep(1000);
		driver.navigate().back();
		System.out.println(driver.getTitle());
		
		Thread.sleep(1000);
		driver.navigate().forward();
		System.out.println(driver.getTitle());
		
		Thread.sleep(1000);
		driver.navigate().back();
		System.out.println(driver.getTitle());
		
		driver.quit();
		System.out.println("***********");
		
		
		driver = new ChromeDriver();
		//driver.get("https://google.com");
		//driver.navigate().to("https://www.amazon.com");
		driver.navigate().to(new URL("https://google.com"));
		
		Thread.sleep(1000);
		driver.navigate().refresh();
		
		driver.quit();

	}

}
