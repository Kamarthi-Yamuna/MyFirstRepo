package practies;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class one_1 {

	public static void main(String[] args) 
	{
		 System.setProperty("webdriver.chrome.driver","./selenium/chromedriver.exe");
			WebDriver driver= new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://demowebshop.tricentis.com");
			//driver.findElement(By.linkText("Log in")).click();
			//driver.findElement(By.id("Email")).sendKeys("kamarthiyamuna@gmail.com");
			//driver.findElement(By.id("Password")).sendKeys("RAMANNA@2000");
			//driver.findElement(By.linkText("Forgot password?")).click();
			 WebElement element=driver.findElement(By.linkText("Log in"));
			 System.out.println(element.getText());
			 System.out.println(element.getCssValue("color"));
			 System.out.println(element.getCssValue("text-decoration"));

	}

}
