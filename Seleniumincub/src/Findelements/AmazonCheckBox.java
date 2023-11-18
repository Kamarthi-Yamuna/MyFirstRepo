package Findelements;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonCheckBox {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./seleniumMorning/chromedriver.exe");
	    WebDriver driver= new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	    driver.get("https://www.amazon.in/?&ext_vrnc=hi&tag=googhydrabk1-21&ref=pd_sl_8ajnwscezy_e&adgrpid=58359492705&hvpone=&hvptwo=&hvadid=676704178230&hvpos=&hvnetw=g&hvrand=1968111355907844552&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=1007768&hvtargid=kwd-298301461664&hydadcr=5625_2408766");
	    List<WebElement> checkBox = driver.findElements(By.xpath("//*[@type='text']"));
	    System.out.println(checkBox.size());
	    for(WebElement check:checkBox) {
	    	check.click();
	    }

	}

}
