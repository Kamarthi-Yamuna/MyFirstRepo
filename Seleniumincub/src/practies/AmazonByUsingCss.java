package practies;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonByUsingCss
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","./selenium/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/accounts/login/?next=https%3A%2F%2Fwww.instagram.com%2Faccounts%2Fedit%2F%3F__coig_login%3D1");
        driver.findElement(By.xpath("//input[@aria-label='Phone number, username, or email']")).sendKeys("yahsbnijis267@gmail.com");
       // driver.findElement(By.cssSelector("input[placeholder='Mobile number']")).sendKeys("8978374715");
        //driver.findElement(By.cssSelector("input[id='ap_email']")).sendKeys("kamarthiyamuna@gmail.com");
       // driver.findElement(By.cssSelector("input[name='password']")).sendKeys("RAMANNA2000");
        //driver.findElement(By.cssSelector("input[id='continue']")).click();
		
	}
	

}
