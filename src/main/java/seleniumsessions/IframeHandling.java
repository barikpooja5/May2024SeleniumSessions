package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeHandling {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		//page
		driver.get("https://www.formsite.com/templates/registration-form-templates/vehicle-registration-form/");
		Thread.sleep(3000);
		
		//click on image
		driver.findElement(By.xpath("//div[@id='imageTemplateContainer']")).click();
		Thread.sleep(3000);
		int iframeCount = driver.findElements(By.tagName("iframe")).size();
		System.out.println(iframeCount);
		
		//switch to iframe
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@id, 'frame-one')]")));
		driver.findElement(By.id("RESULT_TextField-1")).sendKeys("Naveen Automation");
		
		//need to come out of iframe, or come to main page:
		driver.switchTo().defaultContent();
		
		//this ele is on the page
		String header = driver.findElement(By.cssSelector("h3.details__form-preview-title")).getText();
		System.out.println(header);

	}

}
