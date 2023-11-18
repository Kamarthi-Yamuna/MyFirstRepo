package JavaScriptExecuteDemo;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecuteDemo_1 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","./seleniumClass/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login/");
		Thread.sleep(2000);
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		//jse.executeScript("scrollTo(0,500);");
		jse.executeScript(" window.scrollBy(0,500)");
		jse.executeScript("scrollBy(0,200)");
		//jse.executeScript("history.go()");
	
	}

}
