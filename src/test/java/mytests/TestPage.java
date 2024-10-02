package mytests;

import org.openqa.selenium.By;

public class TestPage {
	
	By loc = By.id("test");
	By Title = By.name("TestPage");
	
	public int getPage() {
		System.out.println("test page");
		return 0;
	}

}
