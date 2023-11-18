package practies;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeXpath {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","./selenium/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/account/login?ret=/");
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("9876543210");
		driver.findElement(By.xpath("//button[text()='Request OTP']")).click();
		

	}

}
