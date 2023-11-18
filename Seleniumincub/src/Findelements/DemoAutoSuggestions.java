package Findelements;

import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoAutoSuggestions {

	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
	    System.out.println("enter the data:");
	    String data=scan.next();
	    System.setProperty("webdriver.chrome.driver","./seleniumMorning/chromedriver.exe");
	    WebDriver driver= new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	    driver.get("https://www.google.com/");
	    driver.findElement(By.name("q")).sendKeys(data);
	   List<WebElement> allSuggestion = driver.findElements(By.xpath("//span[contains(text(),'"+data+"')]"));
	    for(WebElement suggestion:allSuggestion) {
	    	System.out.println(suggestion.getText());
	    }


	}

}
