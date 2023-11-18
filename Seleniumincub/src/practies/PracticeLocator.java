package practies;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeLocator {

	public static void main(String[] args) 
	{
		 System.setProperty("webdriver.chrome.driver","./selenium/chromedriver.exe");
			WebDriver driver= new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://partners.olacabs.com/public/login");
		driver.findElement(By.cssSelector("input[id='identification']")).sendKeys("7895638328");
		//driver.findElement(By.className("btn-main")).click();
		driver.findElement(By.tagName("button")).click();
}
}