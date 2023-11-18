package Pom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegistrerPageTestScript {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","./seleniumClass/chromedriver.exe");
	    WebDriver driver= new ChromeDriver();
     
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	    driver.get("https://demowebshop.tricentis.com/");
	    RegisterPage page = new RegisterPage(driver);
	    page.getRegisterLink().click();
	    page.getGenderButton().click();
	    page.getFirstTB().sendKeys("kamarthi");
	    page.getLastTB().sendKeys("yamuna");
	    page.getEmailTB().sendKeys("yamunakamrthi@gmail.com");
	    page.getPasswordTB().sendKeys("kamarthi");
	    page.getConformTB().sendKeys("kamarthi");
	    page.getRegisterButton().click();
	}

}
