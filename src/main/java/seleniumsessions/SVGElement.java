package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SVGElement {
	
	//SVG: special xpath
	//parent svg: local-name()
	//child: g,path : name()
	// browser ---> page -- iframe --> svg --> g --> path
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://petdiseasealerts.org/forecast-map");
		Thread.sleep(3000);
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@id,'map-instance')]")));
		String svgXpath = "(//*[name()='svg' and @id='map-svg'])//*[name()='g' and @class='region']//*[name()='path']";
		List<WebElement> stateList = driver.findElements(By.xpath(svgXpath));
		System.out.println(stateList.size());
		
		Actions act = new Actions(driver);
		for(WebElement e: stateList) {
			//why is it not able to perform mousehover or scroll ?
			act.moveToElement(e).perform();
			
			String nameAttr = e.getAttribute("name");
			System.out.println(nameAttr);
			
			if(nameAttr.equals("California")) {
				act.click(e).perform();
				break;
			}
			Thread.sleep(1000);
		}

	}

}
