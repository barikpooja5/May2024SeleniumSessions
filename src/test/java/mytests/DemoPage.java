package mytests;

import org.openqa.selenium.By;

public class DemoPage {
	
	By loc = By.id("demo");
	By Title = By.name("DemoPage");
	
	public int getPage() {
		System.out.println("demo page");
		return 0;
	}

}
