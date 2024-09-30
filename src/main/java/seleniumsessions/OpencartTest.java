package seleniumsessions;

public class OpencartTest {

	public static void main(String[] args) {
		
		BrowserUtil openCartApp = new BrowserUtil();
		openCartApp.initDriver("chrome");
		openCartApp.launchURL("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		System.out.println(openCartApp.getPageTitle());
		
		System.out.println(openCartApp.getPageURL());
		
		openCartApp.quitBrowser();

	}

}
