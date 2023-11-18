package ationsPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo_1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./seleniumMorning/chromedriver.exe");
	    WebDriver driver= new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	    driver.get("https://www.amazon.in/s?k=login+amazon+account&adgrpid=59671903835&ext_vrnc=hi&hvadid=590652406969&hvdev=c&hvlocphy=1007768&hvnetw=g&hvqmt=b&hvrand=10921347240527521343&hvtargid=kwd-294882733100&hydadcr=24542_2265395&tag=googinhydr1-21&ref=pd_sl_2cwzc6x246_b");
	    Actions act=new Actions(driver);
	    WebElement element = driver.findElement(By.xpath("//div[text()='EN']"));
	    act.moveToElement(element).perform();


	}

}
