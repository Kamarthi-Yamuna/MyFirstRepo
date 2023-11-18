package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","./selenium/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.cssSelector("input[placeholder='Email address or phone number']")).sendKeys("kamarthiyamuna@gmail.com");
		driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys("RAMANNA2000");
		driver.findElement(By.cssSelector("button[name='login']")).click();
		//driver.findElement(By.cssSelector("input[placeholder='First name']")).sendKeys("yamuna");
		//driver.findElement(By.cssSelector("input[name='lastname']")).sendKeys("kamarthi");
		
		
		

	}

}
