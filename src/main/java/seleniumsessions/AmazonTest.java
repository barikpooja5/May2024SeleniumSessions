package seleniumsessions;

public class AmazonTest {

	public static void main(String[] args) {
		
		BrowserUtil brUtil = new BrowserUtil(); //seleniumsessions.BrowserUtil@4ae9cfc1
		brUtil.initDriver("Chrome");
		
		brUtil.launchURL("https://www.amazon.com");
		
		String title = brUtil.getPageTitle();
		System.out.println(title);
		
		if(title.contains("Amazon")) {
			System.out.println("Title pass");
		}
		else
			System.out.println("Title fail");
		
		System.out.println(brUtil.getPageURL());
		
		brUtil.quitBrowser();
		brUtil.getPageTitle();
	}

}
