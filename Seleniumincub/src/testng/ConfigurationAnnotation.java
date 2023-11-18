package testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ConfigurationAnnotation {
	@BeforeSuite
	public void beforeSuite() {
		System.out.println(" from before suite");
	}
	@BeforeTest
	public void beforeTest() {
		System.out.println(" from before class");
	}
	@BeforeClass
	public void beforeClass() {
		System.out.println(" from before suite");
	}
	@BeforeMethod
	public void beforeMethod() {
		System.out.println(" from before method");
	}
	@AfterMethod
	public void afterMethod() {
		System.out.println(" from after method");
	}
	@AfterClass
	public void afterClass() {
		System.out.println(" from after Class");
	}
	@AfterTest
	public void afterTest() {
		System.out.println(" from after test");
	}
	@AfterSuite
	public void afterSuite() {
		System.out.println(" from after suite");
	}
	@Test
	public void method1() {
		System.out.println(" from method1");
	}
	@Test
	public void method2() {
		System.out.println(" from method2");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
