package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TotalImages {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		
		//find total images
		List<WebElement> imagesList = driver.findElements(By.tagName("img"));
		int imagesCount = imagesList.size();
		System.out.println(imagesCount);
		
		for(WebElement e : imagesList) {
			String srcValue = e.getAttribute("src");
			System.out.println(srcValue);
		}
		System.out.println("*******************************");
		
		//capture all the links
		//print the link text and href values		
		List<WebElement> linksList = driver.findElements(By.tagName("a"));
		int linksCount = linksList.size();
		System.out.println("Total links = " +linksCount);
		
		for(WebElement e : linksList) {
			String text = e.getText();
			String hrefVal = e.getAttribute("href");
			System.out.println(text + " : " +hrefVal);
		}
		
		//web scraping

	}

}
