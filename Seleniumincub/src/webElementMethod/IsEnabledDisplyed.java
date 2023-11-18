package webElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabledDisplyed {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","./selenium/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com");
		WebElement element=driver.findElement(By.xpath("//button[@type='submit']"));
		System.out.println(element.isEnabled());
		System.out.println("display status:"+element.isDisplayed());
		driver.findElement(By.name("username")).sendKeys("yamunaaaaaaaaaaaaaaaaaaa");
		driver.findElement(By.name("password")).sendKeys("@sfgjimcdhd");
		System.out.println(element.isEnabled());

	}

}
