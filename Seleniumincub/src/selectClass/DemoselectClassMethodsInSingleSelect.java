package selectClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DemoselectClassMethodsInSingleSelect {

	public static void main(String[] args) throws Throwable
	{
		System.setProperty("webdriver.chrome.driver","./seleniumClass/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("file:///C:/Users/User/Documents/dropdown.html");
		WebElement dropdown = driver.findElement(By.id("single"));
        Select select=new Select(dropdown);
        select.selectByValue("3");
        Thread.sleep(2000);
        select.selectByVisibleText("sql");
        Thread.sleep(2000);
        select.selectByIndex(0);
        
	}

}
