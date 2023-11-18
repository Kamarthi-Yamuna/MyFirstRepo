package ationsPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver","./seleniumMorning/chromedriver.exe");
	    WebDriver driver= new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	    driver.get("https://jqueryui.com/droppable/");
	   
	   driver.switchTo().frame(0);
        WebElement source = driver.findElement(By.id("draggable"));
        WebElement destinaltion = driver.findElement(By.id("droppable"));
        Actions act=new Actions(driver);
        //act.dragAndDrop(source, destinaltion).perform();
        act.clickAndHold(source).release(destinaltion).perform();
	}

}
