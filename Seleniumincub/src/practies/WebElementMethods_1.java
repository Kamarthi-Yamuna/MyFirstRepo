package practies;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementMethods_1
{
  public static void main(String[] args) 
	{
	  System.setProperty("webdriver.chrome.driver","./selenium/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/register");
		driver.findElement(By.xpath("//input[@name='Gender']")).click();
		driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("Kamarthi");
		driver.findElement(By.xpath("//input[@id='LastName']")).sendKeys("Ramanna");
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("Ramanna143@gmail.com");
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("Kamarthi234");
		driver.findElement(By.xpath("//input[@id='ConfirmPassword']")).sendKeys("Kamarthi234");
		driver.findElement(By.xpath("(//input[@type='submit'])[2]")).submit();
		
	}

}
