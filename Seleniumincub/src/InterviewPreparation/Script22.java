package InterviewPreparation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script22 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./seleniumMorning/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		 WebElement element = driver.findElement(By.id("small-searchterms"));
		 element.sendKeys("selenium");
		 element.clear();
		WebElement a = driver.findElement(By.xpath("//strong[text()='Do you like nopCommerce?']"));
		 System.out.println(a.getText());
		 System.out.println(a.getAttribute("textContent"));
		 System.out.println(a.getLocation());
		 System.out.println(a.getSize());
		 System.out.println(a.getRect());
		
		
		 
		 

	}

}
