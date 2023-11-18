package iframes;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IfrmeToMainWindow {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./selenium/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("https://www.tripodeal.com/hotels");
		driver.switchTo().frame(0);
		
		driver.findElement(By.name("destination")).sendKeys("Banglore");
		driver.findElement(By.xpath("//button[text()='search']")).click();
		driver.switchTo().defaultContent();
		driver.findElement(By.linkText("Kashmir")).click();
		

	}

}
