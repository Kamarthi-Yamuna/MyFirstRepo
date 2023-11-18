package Popup;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DemoNotificationPopUp {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","./seleniumMorning/chromedriver.exe");
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--disable-notifications");
	    WebDriver driver= new ChromeDriver(option);

	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	    driver.get("https://www.ajio.com/");
	    //driver.findElement(By.xpath("//button[text()='Notification']")).click();
     
	}

}
