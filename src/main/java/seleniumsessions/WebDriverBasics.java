package seleniumsessions;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverBasics {

	public static void main(String[] args) {
		
		//open chrome browser
		ChromeDriver driver = new ChromeDriver();
		//EdgeDriver driver = new EdgeDriver();
		//FirefoxDriver driver = new FirefoxDriver();
		
		// enter url
		driver.get("https://www.google.com");
		// get the title
		String title = driver.getTitle();
		System.out.println(title);
		
		// act vs exp: validation/checkpoint
		if(title.equals("Google")) {
			System.out.println("Correct title --PASS");
		}
		else
			System.out.println("Incorrect title --FAIL");
		
		// close browser
		driver.quit();

	}

}
