package Pom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestScript2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./seleniumClass/chromedriver.exe");
	    WebDriver driver= new ChromeDriver();
     
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	    driver.get("https://demowebshop.tricentis.com/");
	    LoginPage2 page= new LoginPage2(driver);
	    page.getLoginLink().click();
	   page.getEmailTB().sendKeys("yamunakamarthi@gmail.com");
	   page.getPasswordTB().sendKeys("*********");
	   page.getRemeber().click();
	   page.getLoginButton().click();

	}

}
