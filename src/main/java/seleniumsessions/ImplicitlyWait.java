package seleniumsessions;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitlyWait {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); //This method is deprecated now; used to get used in sel 3.x
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); ////sel 4.x
		
		//global wait:
		//it will be applied on all the web elements by default
		//it can not be applied for the specific web elements
		//it can not be applied for the non webelements: title, url, windows, JS pop ups
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		//login page: 10 secs
		driver.findElement(By.id("input-email")).sendKeys("Test9@gmail.com"); //max wait 10 secs
		//10 secs (max timeout): 2 secs (elem visible): 2 secs (actual timeout)
		//10 secs (max timeout): 12 secs (elem visible): NSE timeout
		//10 secs (max timeout): 5 secs (elem visible): 5 secs (actual timeout)		
		
		driver.findElement(By.id("input-password")).sendKeys("test123"); //10
		driver.findElement(By.xpath("//input[@value='Login']")).click(); //10
		
		//home page: 20 secs
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); //overriding implicit wait
		//e4 
		//e5
		//e6
		
		
		

	}

}
