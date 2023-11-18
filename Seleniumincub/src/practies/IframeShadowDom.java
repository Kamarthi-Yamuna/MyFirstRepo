package practies;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeShadowDom {

	public static void main(String[] args)
	{
		
		System.setProperty("webdriver.chrome.driver","./selenium/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
		driver.switchTo().frame(0);
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		Object obj=jse.executeScript("return document.querySelector(\"body > iframe:nth-child(71)\")");
        WebElement element =(WebElement) obj;
        element.click();
	}

}
