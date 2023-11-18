package practies;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeLocators {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","./selenium/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/login");
		driver.findElement(By.id("Email")).sendKeys("kamarthiyamuna@gmail.com");
		driver.findElement(By.name("Password")).sendKeys("RAMANNA2000");
		driver.findElement(By.id("RememberMe")).click();
		driver.findElement(By.className("search-box-text")).sendKeys("selenium");
		//driver.findElement(By.tagName("a")).click();
		driver.findElement(By.linkText("")).click();
		
	}

}
