package assertions;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class DemonstrationOfAssertions {
	@Test
	public void demo() {
		String expectedTitle="Demo";
		String actualTitle="sample";
		
		//assertEquals(
		
		SoftAssert soft= new SoftAssert();
		soft.assertEquals(actualTitle,expectedTitle );
		System.out.println("done");
		soft.assertAll();
	}

}
