package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDemoRegister {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./selenium/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/register");
		driver.findElement(By.id("gender-female")).click();
		Thread.sleep(2000);
	    driver.findElement(By.id("FirstName")).sendKeys("Kamarthi");
		driver.findElement(By.id("LastName")).sendKeys("Yamuna");
		Thread.sleep(2000);
		driver.findElement(By.id("Email")).sendKeys("kamarthiyamuna@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.name("Password")).sendKeys("RAMANNA@2000");
		Thread.sleep(2000);
		driver.findElement(By.name("ConfirmPassword")).sendKeys("RAMANNA@2000");
		Thread.sleep(2000);
		driver.findElement(By.id("register-button")).click();
	
	

	}

}
