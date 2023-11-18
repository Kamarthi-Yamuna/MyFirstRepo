package InterviewPreparation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script19 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","./seleniumMorning/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		//driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.partialLinkText("Reg")).click();
	}

}
