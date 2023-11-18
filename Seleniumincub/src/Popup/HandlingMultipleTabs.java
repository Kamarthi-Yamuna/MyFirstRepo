package Popup;

import java.util.Collection;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingMultipleTabs {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./seleniumMorning/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		driver.findElement(By.id("newTabsBtn")).click();
		Set<String> allIDs = driver.getWindowHandles();
		String parentID=driver.getWindowHandle();
		allIDs.remove(parentID);
		String expectedTitle="Basic Controls";
		for(String id:allIDs) {
			driver.switchTo().window(id);
			if(driver.getTitle().contains(expectedTitle)) {
				 driver.manage().window().maximize();
				break;
			}
			
		}
       
       driver.findElement(By.id("firstName")).sendKeys("kamarthi");
	}

}
