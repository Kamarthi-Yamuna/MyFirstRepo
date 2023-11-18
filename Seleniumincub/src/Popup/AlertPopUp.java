package Popup;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUp {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./seleniumClass/chromedriver.exe");
	    WebDriver driver= new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	    driver.get("https://demowebshop.tricentis.com/");
	    driver.findElement(By.xpath("//input[@type='submit']")).click();
         Alert a=driver.switchTo().alert();
        // driver.findElement(By.xpath("//input[@type='submit']")).click();
         a.accept();
        
         //a.dismiss();

	}

}
