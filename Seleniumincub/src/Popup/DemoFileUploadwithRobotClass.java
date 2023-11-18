package Popup;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoFileUploadwithRobotClass {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","./seleniumClass/chromedriver.exe");
	    WebDriver driver= new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	    driver.get("https://www.ilovepdf.com/word_to_pdf");
	    driver.findElement(By.xpath("//span[text()='Select WORD files']")).click();
	    Thread.sleep(2000);
	    Robot robo=new Robot();
	    robo.keyPress(KeyEvent.VK_Y);
		   
	    robo.keyRelease(KeyEvent.VK_Y);
	
	    
	    robo.keyPress(KeyEvent.VK_A);
	    robo.keyRelease(KeyEvent.VK_A);
	    
	    robo.keyPress(KeyEvent.VK_M);
	    robo.keyRelease(KeyEvent.VK_M);
	    
	    robo.keyPress(KeyEvent.VK_TAB);
	    robo.keyRelease(KeyEvent.VK_TAB);
	    
	    robo.keyPress(KeyEvent.VK_TAB);
	    robo.keyRelease(KeyEvent.VK_TAB);
	    
	    robo.keyPress(KeyEvent.VK_ENTER);
	    robo.keyRelease(KeyEvent.VK_ENTER);
	    



	}

}
