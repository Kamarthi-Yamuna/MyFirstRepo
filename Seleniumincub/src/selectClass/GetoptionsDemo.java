package selectClass;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetoptionsDemo {

	public static void main(String[] args)
	{   
		System.setProperty("webdriver.chrome.driver","./seleniumClass/chromedriver.exe");
	    WebDriver driver= new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("file:///C:/Users/User/Documents/dropdown.html");
		WebElement dropdown = driver.findElement(By.id("multiple"));
        Select select=new Select(dropdown);
        List<WebElement> allOptions = select.getOptions();
        
        for(WebElement options: allOptions) {
        	System.out.println(options.getText());
        	options.click();
        }
        	

	}

}