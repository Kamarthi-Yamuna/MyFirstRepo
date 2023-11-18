package practies;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeLinksinAmazon {

	public static void main(String[] args)
	{
		
		System.setProperty("webdriver.chrome.driver","./seleniumMorning/chromedriver.exe");
	    WebDriver driver= new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	    driver.get("https://www.amazon.in/events/greatindianfestival?tag=googmantxtmob96-21&ascsubtag=_k_CjwKCAjw7c2pBhAZEiwA88pOF77lj90kHiQMME_fVsO5FFZJZ4TmVu7kUcCJVw1G1iAaUoZaqRXxABoCw9gQAvD_BwE_k_&gclid=CjwKCAjw7c2pBhAZEiwA88pOF77lj90kHiQMME_fVsO5FFZJZ4TmVu7kUcCJVw1G1iAaUoZaqRXxABoCw9gQAvD_BwE");
	    List<WebElement> allLinks = driver.findElements(By.tagName("a"));
	    System.out.println(allLinks.size());
	    for(WebElement links:allLinks)
	    {
	    	System.out.println(links.getText());
	    	
	    	//System.out.println(links.getAttribute("href"));
	    	
	    	
	    }
	}

}
