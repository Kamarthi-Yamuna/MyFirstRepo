package practies;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeQspiders {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","./selenium/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("http://demoapps.qspiders.com/");
		driver.findElement(By.xpath("//section[text()='Button']")).click();
		driver.findElement(By.linkText("Right Click")).click();
		

	}

}
