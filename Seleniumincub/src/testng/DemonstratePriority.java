package testng;

import org.testng.annotations.Test;

public class DemonstratePriority {
    @Test
	public void login() {
		System.out.println(" i am login");
	}

    @Test
	public void home() {
		System.out.println(" i am home");
	}
    @Test
	public void logout() {
		System.out.println(" i am logout");
	}
}
