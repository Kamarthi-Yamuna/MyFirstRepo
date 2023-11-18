package InterviewPreparation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script18 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./seleniumMorning/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("name")).sendKeys("yamuna");
		driver.findElement(By.name("email")).sendKeys("ahndkx@234gmail.com");
		driver.findElement(By.name("password")).sendKeys("srR564@");
		driver.findElement(By.tagName("a")).click();
		

	}

}
