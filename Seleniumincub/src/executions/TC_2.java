package executions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC_2 {
	@Test(groups="Functional Testing")
	public void navigateToFlipKart() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","./seleniumClass/chromedriver.exe");
	    WebDriver driver= new ChromeDriver();
     
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	    driver.get("https://www.flipkart.com");
	    Thread.sleep(2000);
	    driver.quit();
		
	}

}
