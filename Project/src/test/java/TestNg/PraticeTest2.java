package TestNg;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PraticeTest2 {

	
	

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
	public void test1()
	{
		System.out.println("This is a Test 1");
	}
	
	@Test
	public void test2 ()
	{
		System.out.println("This is a Test 2");
	}
	
	@Test
	public void test3 ()
	{
		System.out.println("This is a Test 3");
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


