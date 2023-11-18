package Popup;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowserPopUp {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","./seleniumClass/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		driver.findElement(By.id("newWindowBtn")).click();
		Set<String> allIDs = driver.getWindowHandles();
		String parentID=driver.getWindowHandle();
		String expectedTitle=" Basic Controls";
		for(String id:allIDs) 
		{
			driver.switchTo().window(id);
			if(driver.getTitle().contains(expectedTitle)) 
			{
				
				break;
			}
			
		  driver.manage().window().maximize();
		  driver.close();
		//driver.findElement(By.id("firstName")).sendKeys("kamarthi");
		//driver.findElement(By.id("lastName")).sendKeys("yamuna");
	}
}
}
