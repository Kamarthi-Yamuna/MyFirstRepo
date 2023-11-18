package Findelements;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAutoSuggestions {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./seleniumMorning/chromedriver.exe");
	    WebDriver driver= new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	    driver.get("https://www.google.com/");
	    driver.findElement(By.name("q")).sendKeys("selenium");
	   List<WebElement> allSuggestion = driver.findElements(By.xpath("//span[contains(text(),'selenium')]"));
	    for(WebElement suggestion:allSuggestion) {
	    	System.out.println(suggestion.getText());
	    }

	}

}
