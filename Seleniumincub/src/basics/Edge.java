package basics;

import org.openqa.selenium.edge.EdgeDriver;

public class Edge 
{

	public static void main(String[] args) 
	{

		System.setProperty("webdriver.edge.driver","./selenium/msedgedriver.exe");
	    EdgeDriver ref=new EdgeDriver();

	}

}
