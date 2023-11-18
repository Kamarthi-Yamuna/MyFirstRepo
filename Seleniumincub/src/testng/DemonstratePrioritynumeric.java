package testng;

import org.testng.annotations.Test;

public class DemonstratePrioritynumeric {
    
	@Test(priority=-100)
	public void login() {
		System.out.println(" i am login");
	}

    @Test(priority=0)
	public void home() {
		System.out.println(" i am home");
	}
    @Test(priority=-20)
	public void logout() {
		System.out.println(" i am logout");
	}
}
