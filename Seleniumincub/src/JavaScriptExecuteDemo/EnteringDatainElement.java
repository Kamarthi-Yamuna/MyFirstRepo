package JavaScriptExecuteDemo;

import java.util.Scanner;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EnteringDatainElement {

	public static void main(String[] args) throws InterruptedException {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter tha data");
		String data=scan.nextLine();
		System.setProperty("webdriver.chrome.driver","./selenium/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		
		driver.get("https://demowebshop.tricentis.com");
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		
		WebElement searchStore = driver.findElement(By.id("small-searchterms"));
		WebElement searchButton = driver.findElement(By.xpath("//input[@value='Search']"));
		jse.executeScript("arguments[0].value='"+data+"'", searchStore);
		Thread.sleep(2000);
		
		jse.executeScript("arguments[0].value=''", searchStore);
		Thread.sleep(2000);
		jse.executeScript("arguments[0].click()", searchButton);
	}

}
