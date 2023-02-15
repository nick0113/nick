package TestNg;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PraticeTestNg {
	
	
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("@Before Class");
	}
	
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("@Before Method");
	}
	
	
	@Test
	public void testA()
	{
		System.out.println("This is a Test A");
	}
	
	@Test
	public void testB ()
	{
		System.out.println("This is a Test B");
	}
	
	@Test
	public void testC ()
	{
		System.out.println("This is a Test C");
	}
	
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("@After Method");
	}
	
	@AfterClass
	public void afterclass()
	{
		System.out.println("@After Class");
	}
	

}
