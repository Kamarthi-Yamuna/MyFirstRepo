package executions;

import static org.junit.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC_01 {
	@Test(groups="smoke testing")
	public void navigateToAmazon() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","./seleniumClass/chromedriver.exe");
		WebDriver driver= new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.amazon.com");
		Thread.sleep(2000);
		assertTrue(false);
		driver.quit();

	}

}
