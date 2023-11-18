package InterviewPreparation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script20 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","./seleniumMorning/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/login");
		driver.findElement(By.cssSelector("input[autofocus='autofocus']")).sendKeys("yamunakamarthi2gmailcom");
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("Ramanna@20");
		driver.findElement(By.cssSelector("input[type='checkbox']")).click();
		driver.findElement(By.cssSelector("input[value='Log in']")).click();

	}

}
