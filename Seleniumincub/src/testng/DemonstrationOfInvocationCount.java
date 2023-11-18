package testng;

import org.testng.annotations.Test;

public class DemonstrationOfInvocationCount {
	@Test(invocationCount=10)
	public void login (){
		System.out.println("i am in login");
	}

}
