package Assertions;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardTest1 {
	
	@Test
	void demotest()
	{
		Assert.assertTrue(true);  //passed
		//Assert.assertEquals("Welcome", "Welcome");  //true-passed
		Assert.assertEquals("Nikhil", "Nikhil");   // true-passed
		System.out.println("Successfully passed");
		
	}

}
