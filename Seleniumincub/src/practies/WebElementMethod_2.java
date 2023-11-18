package practies;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementMethod_2 
{

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","./selenium/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/login");
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("Ramanna143@gmail.com");
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("Ramanna@234");
        driver.findElement(By.xpath("//input[@id='RememberMe']")).click();
        driver.findElement(By.xpath("(//input[@type='submit'])[2]")).submit();
	}

}
