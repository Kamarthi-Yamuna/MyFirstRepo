package ationsPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo_2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./seleniumMorning/chromedriver.exe");
	    WebDriver driver= new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	    driver.get("https://www.ajio.com/?gclid=Cj0KCQjwhL6pBhDjARIsAGx8D59jXTwahtyMrEUSIchQE3rnjhHPTEN2bti48v8_3x5y0rkmkwsUIg0aAkP1EALw_wcB");
	    Actions act=new Actions(driver);
	    WebElement element = driver.findElement(By.linkText("INDIE"));
	    act.moveToElement(element).perform();
	}

}
