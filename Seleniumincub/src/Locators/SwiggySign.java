package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwiggySign 
{

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","./selenium/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.swiggy.com/");
		//driver.findElement(By.linkText("sign up")).click();
        //driver.findElement(By.id("mobile")).sendKeys("8978374715");
       // driver.findElement(By.name("name")).sendKeys("yamuna");
        //driver.findElement(By.id("name")).sendKeys("kamarthiyamuna@gmail.com");
        //driver.findElement(By.linkText("CONTINUE")).click();
		//driver.findElement(By.tagName("FIND FOOD")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("mobile")).sendKeys("8978374715");
		driver.findElement(By.linkText("LOGIN")).click();
		
	}
	

}
