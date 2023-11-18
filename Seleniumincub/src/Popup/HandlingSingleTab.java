package Popup;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingSingleTab {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./seleniumMorning/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		driver.findElement(By.id("newTabBtn")).click();
		Set<String> allIDs = driver.getWindowHandles();
		String parentID=driver.getWindowHandle();
		String expectedTitle=" AlertsDemo";
		for(String id:allIDs) {
			driver.switchTo().window(id);
			if(driver.getTitle().contains(expectedTitle)) {
				break;
			}
		}
		driver.manage().window().maximize();

	}

}
