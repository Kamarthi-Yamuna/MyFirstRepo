package basics;

import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetPositionAndSetPosition {

	public static void main(String[] args)
	 
	{
		System.setProperty("webdriver.chrome.driver","./selenium/chromedriver.exe");
		ChromeDriver ref=new ChromeDriver();
		System.out.println("THe x coordinate is:"+ref.manage().window().getPosition().x);
		System.out.println("The y coorxinate is:"+ref.manage().window().getPosition().y);
		Point p=new Point(200,400);
		ref.manage().window().setPosition(p);
			

	}

}
