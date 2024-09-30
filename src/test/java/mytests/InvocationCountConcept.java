package mytests;

import org.testng.annotations.Test;

public class InvocationCountConcept {
	
	@Test(invocationCount = 10, priority = 2)
	public void addToCartTest() {
		System.out.println("addToCart test");
	}
	
	@Test(invocationCount = 10, priority = 1)
	public void paymentTest() {
		System.out.println("payment test");
	}

}
