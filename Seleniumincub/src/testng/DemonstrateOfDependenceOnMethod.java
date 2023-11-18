package testng;

import org.testng.annotations.Test;

public class DemonstrateOfDependenceOnMethod {
	
	@Test
	public void login (){
		System.out.println("i am login");
	}
	

	@Test(dependsOnMethods="login")
	public void home (){
		System.out.println("i am home");
	}

	@Test(dependsOnMethods="login",enabled=false)
	public void logout (){
		System.out.println("i am logout");
	}
	
	
	
}

