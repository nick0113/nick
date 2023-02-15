package testPack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClass {
	
	 public static void main(String[] args) {
		
		 System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32\\chromedriver.exe");   // property set or path to 
		    
	    	WebDriver driver = new ChromeDriver();
	    	
	    	driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	    	
	    	driver.get("https://www.flipkart.com/");
	}

}
