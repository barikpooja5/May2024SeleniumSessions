package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandle {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.londonfreelance.org/courses/frames/index.html");
		Thread.sleep(1000);
		
		int frameCount = driver.findElements(By.tagName("frame")).size();
		System.out.println(frameCount);
		
		//switch driver to frame:
		//driver.switchTo().frame(2);	//frame(index) method used
		//driver.switchTo().frame("main"); //frame(nameOrId) method
		driver.switchTo().frame(driver.findElement(By.name("main")));	//frame(WebElement element) method
		
		String header = driver.findElement(By.tagName("h2")).getText();
		System.out.println(header);

	}

}
