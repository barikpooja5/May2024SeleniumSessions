package seleniumAssignmentPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeVehicleRegistrationForm {

public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		//page
		driver.get("https://www.formsite.com/templates/registration-form-templates/vehicle-registration-form/");
		Thread.sleep(3000);
		//click on image
		driver.findElement(By.xpath("//div[@id='imageTemplateContainer']")).click();
		Thread.sleep(3000);
		
		//switch to iframe
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@id, 'frame-one')]")));
		driver.findElement(By.id("RESULT_TextField-1")).sendKeys("Naveen Automation");
		driver.findElement(By.id("RESULT_TextField-3")).sendKeys("Banglore");
		driver.findElement(By.id("RESULT_TextField-4")).sendKeys("05/15/2024");
		driver.findElement(By.id("RESULT_TextArea-5")).sendKeys("Selenium Training");
		driver.findElement(By.id("RESULT_TextField-8")).sendKeys("Naveen");
		driver.findElement(By.id("RESULT_TextField-9")).sendKeys("Karkala");
		driver.findElement(By.id("RESULT_TextField-10")).sendKeys("Whitefield");
		driver.findElement(By.id("RESULT_TextField-12")).sendKeys("Banglore");
		
		List<WebElement> optionsList = driver.findElements(By.xpath("//select[@id='RESULT_RadioButton-13']/option"));
		for(WebElement e : optionsList) {
			String text = e.getText();
			System.out.println(text);
			if(text.equals("Ohio")) {
				e.click();
				break;
			}
		}
		
		driver.findElement(By.id("RESULT_TextField-14")).sendKeys("410029");
		driver.findElement(By.id("RESULT_TextField-15")).sendKeys("(902) 345-6789");
		driver.findElement(By.id("RESULT_TextField-16")).sendKeys("Naveen.auto@gmail.com");
		driver.findElement(By.id("FSsubmit")).click();
		
		Thread.sleep(3000);
		
		driver.switchTo().defaultContent();
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@id,'frame-one')]")));
		String text = driver.findElement(By.tagName("h1")).getText();
		System.out.println(text);

	}

}
