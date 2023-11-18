package webElementMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementInsideElement 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","./selenium/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("https://demowebshop.tricentis.com");
		driver.findElement(By.xpath("//div[@class='header-menu']")).findElement(By.partialLinkText("Books")).click();

	}

}
