package Popup;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoFileUploadPopUp {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./seleniumMorning/chromedriver.exe");
	    WebDriver driver= new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	    driver.get("https://the-internet.herokuapp.com/upload");
	    driver.findElement(By.id("file-upload")).sendKeys("C:\\Users\\User\\Pictures\\Saved Pictures\\basket of Red and White Roses.jpg");
        driver.findElement(By.id("file-submit")).click();

	}

}
