package InterviewPreparation;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script14 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./seleniumMorning/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/");
        Point p=new Point(100, 50);
        driver.manage().window().setPosition(p);

	}

}
