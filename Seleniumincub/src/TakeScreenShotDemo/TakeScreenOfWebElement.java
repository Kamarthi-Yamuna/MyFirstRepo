package TakeScreenShotDemo;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class TakeScreenOfWebElement {

	

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","./selenium/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.instagram.com/accounts/login/");
		 File photo=driver.findElement(By.name("username")).getScreenshotAs(OutputType.FILE);
         File file =new File("./errorshot/inst3.png");
		 //FileHandler.copy(photo,file);
         FileUtils.copyFile(photo,file);
		
	}

}
