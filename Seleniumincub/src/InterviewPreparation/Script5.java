package InterviewPreparation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script5 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./seleniumMorning/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/");
        System.out.println(driver.getTitle());

	}

}
