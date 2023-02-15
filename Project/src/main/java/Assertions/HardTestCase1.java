package Assertions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HardTestCase1 {
	
	@Test
	public void loginTest() throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32\\chromedriver.exe"); 
		 WebDriver driver = new ChromeDriver();
		 
		// driver.manage().window().maximize();
		 driver.get("https://phptravels.org/login");
		 
		 
		 WebElement login= driver.findElement(By.xpath("//a[text()='Log in']"));
	     login.click()	;
	     
	    
	     
	     WebElement EmailAddresstxt= driver.findElement(By.xpath("//input[@name='username']"));
	     Thread.sleep(4000);
	   //  EmailAddresstxt.sendKeys("rahulpatilrs@gmail.com");
	     
	     
	     WebElement passwordtxt= driver.findElement(By.xpath("//input[@name='password']"));
	  //   passwordtxt.sendKeys("123456");
	  
	     Assert.assertTrue(EmailAddresstxt.isDisplayed());
	     Assert.assertTrue(passwordtxt.isDisplayed());
	     
	   /*  WebElement clicklogin =  driver.findElement(By.xpath("//button[@id='login']"));
	     clicklogin .click();*/
	     
		 //Validation
		 
		 String ExpTitle = "Login - PHPTRAVELS";
		 
		 Assert.assertEquals(ExpTitle,driver.getTitle());   // compare both the titles
		 
		 driver.close();
	 	
	}

}
