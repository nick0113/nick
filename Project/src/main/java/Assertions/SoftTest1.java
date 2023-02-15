package Assertions;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftTest1 {
	
	SoftAssert softAssert = new SoftAssert();
	
	@Test
	void demoTest()
	{
		softAssert.assertTrue(true); // passed
		softAssert.assertEquals("Wlecome", "Welcome");  // false / failed
		softAssert.assertEquals("Nikhil", "Nikhil");  // true-passed
		System.out.println("successfully passed");
		softAssert.assertAll();
	}

}
