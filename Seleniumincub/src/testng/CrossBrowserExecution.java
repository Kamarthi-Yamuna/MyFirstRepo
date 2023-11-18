package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowserExecution {
	@Test
	@Parameters("browser")
	public void cbt(String browser) {
		if(browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver","./seleniumClass/chromedriver.exe");
		    WebDriver driver= new ChromeDriver();
		    driver.manage().window().maximize();
		    driver.get("https://demowebshop.tricentis.com/");
		}else {
			System.setProperty("webdriver.edge.driver","./seleniumMorning/msedgedriver.exe");
			EdgeDriver driver=new EdgeDriver();
		}
		
	}

}
