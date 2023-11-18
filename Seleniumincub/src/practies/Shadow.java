package practies;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Shadow {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./seleniumClass/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://mvnrepository.com/");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		 Object obj=js.executeScript("return document.querySelector(\"#query\")");
         WebElement element=(WebElement)obj;
         element.sendKeys("selenium java");
	}

}
