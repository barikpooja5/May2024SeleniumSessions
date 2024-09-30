package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QuitVsClose {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver(); //123
		
		driver.get("https://www.google.com"); //123
		System.out.println(driver.getTitle()); //123
		
		driver.quit(); //123
		
		//driver.getCurrentUrl(); //NoSuchSessionException: Session ID is null. Using WebDriver after calling quit()? //123--null: quit
		
		driver = new ChromeDriver(); //456
		driver.get("https://www.amazon.com"); //456
		System.out.println(driver.getTitle()); //456
		driver.close(); //456
		driver.getCurrentUrl(); //NoSuchSessionException: invalid session id //456

	}

}
