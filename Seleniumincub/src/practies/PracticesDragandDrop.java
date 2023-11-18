package practies;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PracticesDragandDrop 
{

	public static void main(String[] args) 
	{

		System.setProperty("webdriver.chrome.driver","./seleniumMorning/chromedriver.exe");
	    WebDriver driver= new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	    driver.get("https://demoapps.qspiders.com/dragDrop");
	   
	   
        WebElement source = driver.findElement(By.xpath("//div[text()='Mobile Cover']"));
        WebElement destination = driver.findElement(By.xpath("//div[text()='Mobile Accessories']"));
        Actions act=new Actions(driver);
        act.dragAndDrop(source, destination).perform();
    //    act.clickAndHold(source).release(destination).perform();

	}

}
