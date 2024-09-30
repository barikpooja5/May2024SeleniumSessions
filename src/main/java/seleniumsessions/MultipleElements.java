package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleElements {

	public static void main(String[] args) {
		
		// single element -- FE ---> WebElement
		// multiple elements -- FEs -- > List<WebElement>
		
		// find total links		
		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		List<WebElement> linksList = driver.findElements(By.tagName("a"));
		int totalLinks = linksList.size();
		System.out.println("Total links= " +totalLinks);
		
		// print the text of each link and ignore the blank text
		//index based for loop
		int nonBlankLinkCount = 0;
		for(int i=0; i<totalLinks; i++) {
			String text = linksList.get(i).getText();
			if(text.length() != 0) {
				System.out.println(i+ " = " +text);
				nonBlankLinkCount++;
			}
		}
		System.out.println("Number od non-blank links = " +nonBlankLinkCount);
		System.out.println("Number od blank links = " + (totalLinks-nonBlankLinkCount));
		
		System.out.println("*******************");
		
		//with for each loop:
		int count = 0;
		for(WebElement e : linksList) {
			String text = e.getText();
			if(text.length() != 0) {
				System.out.println(count+ " = " +text);
			}
			count++;
		}

	}

}
