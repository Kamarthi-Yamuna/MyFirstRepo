package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorDemo 
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./selenium/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/User/Documents/LoginPage.html");
		driver.findElement(By.id("username")).sendKeys("This is selenium");
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys("This is java");
		Thread.sleep(2000);
		driver.findElement(By.className("cpassword")).sendKeys("This is manual");
		//driver.findElement(By.partialLinkText("for")).click();
		//driver.findElement(By.linkText("forgot password")).click();
		driver.findElement(By.tagName("a")).click();
	}

}
