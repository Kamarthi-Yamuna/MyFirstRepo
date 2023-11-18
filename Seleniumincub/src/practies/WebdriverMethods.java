package practies;

import org.openqa.selenium.chrome.ChromeDriver;

public class WebdriverMethods {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./selenium/chromedriver.exe");
		ChromeDriver ref=new ChromeDriver();
		ref.get("https://www.instagram.com");
		String ExpectedTitle="Instagram";
		String ActualTitle=ref.getTitle();
		if(ExpectedTitle.equals(ActualTitle))
		{
			System.out.println("the testcase is passed");
		}
		else
		{
			System.out.println("the testcase is failed");

		}
		ref.getCurrentUrl();
		ref.getPageSource();


	}

}
