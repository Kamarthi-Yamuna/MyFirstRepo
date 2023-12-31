package executions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC_4 {
	@Test(groups="system testing")
	public void navigateToMyntra() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","./seleniumClass/chromedriver.exe");
	    WebDriver driver= new ChromeDriver();
     
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	    driver.get("https://www.myntra.com");
	    Thread.sleep(2000);
	    driver.quit();
		
	}

}
