package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoWebLogin 
{

	public static void main(String[] args)
	{

		System.setProperty("webdriver.chrome.driver","./selenium/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/login");
		driver.findElement(By.id("Email")).sendKeys("kamarthiyamuna@gmail.com");
		driver.findElement(By.name("Password")).sendKeys("RAMANNA@2000");
		driver.findElement(By.id("RememberMe")).click();
		driver.findElement(By.className("login-button")).click();
	}

}
