package JavaScriptExecuteDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DisabledElement {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./seleniumClass/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("file:///C:/Users/User/Documents/LoginPage.html");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		WebElement element=driver.findElement(By.id("username"));
		js.executeScript("arguments[0].value='yamuna'", element);
		System.out.println(js.executeScript("return document.title"));
		System.out.println(js.executeScript("return window.location.href"));
		
		

	}

}
