package Popup;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DemoadvancedPopUp {

	public static void main(String[] args)
	{

		System.setProperty("webdriver.chrome.driver","./seleniumMorning/chromedriver.exe");
		ChromeOptions option=new ChromeOptions();
		//option.addArguments("--disable-notifications");
		option.addArguments("--incognito");
		option.addArguments("start-maximized");
		option.addArguments("--headless");
		
	    WebDriver driver= new ChromeDriver(option);
        System.out.println("Browser is launched");
	   // driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	    driver.get("https://demowebshop.tricentis.com/");
	    System.out.println("Browser is navigated to demowebapp");
	    driver.quit();
	    System.out.println("Broswer is closed");

	}

}
