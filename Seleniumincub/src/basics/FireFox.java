package basics;

import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFox 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver","./selenium/geckodriver.exe");
	    FirefoxDriver ref=new FirefoxDriver();

	}

}
