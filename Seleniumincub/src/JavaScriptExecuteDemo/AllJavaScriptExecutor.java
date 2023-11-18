package JavaScriptExecuteDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllJavaScriptExecutor {

	public static void main(String[] args)
	{
		 
		System.setProperty("webdriver.chrome.driver","./selenium/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("https://demowebshop.tricentis.com");
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("return document.location.href");
		
	}

}
