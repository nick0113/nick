package Assertions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardTest2 {
	
	

	@Test
	void demotest()
	{
		Assert.assertTrue(true);  //passed
		Assert.assertEquals("Welcome", "Welcome");  
		Assert.assertEquals("nikhil", "Nikhil");   //false-failed
		System.out.println("Successfully passed");
		
	}

}
