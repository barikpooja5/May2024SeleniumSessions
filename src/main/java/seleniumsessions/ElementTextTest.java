package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementTextTest {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		By header = By.tagName("h2");
		By para = By.xpath("//*[@id=\"content\"]/div/div[1]/div/p[2]");
		By continueButton = By.linkText("Continue");
		By forgotPasswordLink = By.linkText("Forgotten Password");
		By footerHeader = By.tagName("h5");
		
		ElementUtil elUtil = new ElementUtil(driver);
		String m1 = elUtil.getElementText(header);
		String m2 = elUtil.getElementText(para);
		String m3 = elUtil.getElementText(continueButton);
		String m4 = elUtil.getElementText(forgotPasswordLink);
		String m5 = elUtil.getElementText(footerHeader);
		
		System.out.println(m1);
		System.out.println(m2);
		System.out.println(m3);
		System.out.println(m4);
		System.out.println(m5);		

	}

}
