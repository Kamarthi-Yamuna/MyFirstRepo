package Popup;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class DemoPromptPop {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./seleniumMorning/chromedriver.exe");
	    WebDriver driver= new ChromeDriver();

	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	    driver.get("https://demoapps.qspiders.com/alert/prompt");
	    driver.findElement(By.xpath("//button[text()='Prompt Alert Box']")).click();
         Alert a=driver.switchTo().alert();
         System.out.println(a.getText());
         a.sendKeys("yes");
         a.accept();
         

	}

}
