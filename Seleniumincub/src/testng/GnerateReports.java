package testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class GnerateReports {
	@Test
	public void testCase() {
		System.setProperty("webdriver.chrome.driver","./seleniumClass/chromedriver.exe");
	    WebDriver driver= new ChromeDriver();
        Reporter.log("browser is launched",true);
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	    driver.get("https://amazon.com");
	    Reporter.log("navigate to amazon",true);
	    driver.quit();
	    Reporter.log("browser is closed",true);
	}

}
