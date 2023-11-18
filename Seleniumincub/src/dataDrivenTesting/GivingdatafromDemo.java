package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GivingdatafromDemo {

	public static void main(String[] args) throws IOException {

		System.setProperty("webdriver.chrome.driver","./seleniumMorning/chromedriver.exe");
	    WebDriver driver= new ChromeDriver();
     
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	    FileInputStream fis=new FileInputStream("./testdata/datas.properties");
		Properties ppt=new Properties();
		ppt.load(fis);
		driver.get(ppt.getProperty("url"));
		driver.findElement(By.id("Email")).sendKeys(ppt.getProperty("un"));
		driver.findElement(By.id("Password")).sendKeys(ppt.getProperty("pwd"));
		driver.findElement(By.id("RememberMe")).click();
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		

	}

}
