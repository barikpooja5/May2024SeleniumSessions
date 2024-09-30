package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedFrameHandle {

	public static void main(String[] args) throws InterruptedException {
		
		//page --> f1: yes (F)
		//f1-->f2:yes (F)
		//f2-->f3:yes (F)
		//page-->f2: no
		//page -->f3: no
		//page-->f1-->f2-->f3: yes (F)
		
		//f3-->f2: yes (PF)
		//f2 --> f1: yes (PF)
		//f1 --> page : yes (PF,DC)
		
		//f3 --> f1: no
		//f3 --> f2(PF) --> f1(PF)
		//f3---DC--> page
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://selectorshub.com/iframe-scenario/");
		Thread.sleep(3000);
		
		driver.switchTo().frame("pact1");	//f1
		driver.findElement(By.id("inp_val")).sendKeys("Testing");
		
		driver.switchTo().frame("pact2");	//f2
		driver.findElement(By.id("jex")).sendKeys("Automation");
		
		driver.switchTo().frame("pact3");	//f3
		driver.findElement(By.id("glaf")).sendKeys("Good Package");
		Thread.sleep(1000);
		
		//f3-->f2
		driver.switchTo().parentFrame();	//f2
		driver.findElement(By.id("jex")).sendKeys("Selenium");
		Thread.sleep(1000);
		
		//f2-->f1
		driver.switchTo().parentFrame();	//f1
		driver.findElement(By.id("inp_val")).sendKeys("With Passion");
		
		//f1-->main page: DC/PF
		driver.switchTo().parentFrame();	//if parent is browser then it will switch to browser page.
		//driver.switchTo().defaultContent(); //either parentFrame() or defaultContent() can be used to switch to main page
		String header = driver.findElement(By.tagName("h3")).getText();
		System.out.println(header);
		
		//page-->f2: won't work
//		driver.switchTo().frame("pact2");	//frame switch has to be sequential
//		driver.findElement(By.id("jex")).sendKeys("UI Automation");
		
		//f1->f2->f3
		Thread.sleep(1000);
		driver.switchTo().frame("pact1")
				.switchTo().frame("pact2")
						.switchTo().frame("pact3")
								.findElement(By.id("glaf"))
										.sendKeys(" And Perks");
		//f3->f2->f1->page
		Thread.sleep(1000);
		String header1 = driver.switchTo().parentFrame()
				.switchTo().parentFrame()
						.switchTo().defaultContent()
								.findElement(By.tagName("h3"))
										.getText();
		System.out.println(header1);
		
		//page->f1->f2->f3->DC->page
		Thread.sleep(1000);
		String header2 = driver.switchTo().frame("pact1")
				.switchTo().frame("pact2")
						.switchTo().frame("pact3")
								.switchTo().defaultContent()
										.findElement(By.tagName("h3"))
												.getText();
		System.out.println(header2);

	}

}
